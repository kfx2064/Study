package org.hdcd.devproject;

import net.bytebuddy.agent.builder.AgentBuilder;
import org.hdcd.devproject.domain.CodeDetail;
import org.hdcd.devproject.domain.CodeGroup;
import org.hdcd.devproject.repository.CodeDetailRepository;
import org.hdcd.devproject.repository.CodeGroupRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Commit
@SpringBootTest
public class CodeGroupTests {

    @Autowired
    CodeGroupRepository codeGroupRepository;

    @Autowired
    CodeDetailRepository codeDetailRepository;

    @Test
    public void testRegister() {
        CodeGroup codeGroup = new CodeGroup();
        codeGroup.setGroupCode("A01");
        codeGroup.setGroupName("job");

        codeGroupRepository.save(codeGroup);
    }

    @Test
    public void testList() {
        Iterable<CodeGroup> codeGroupList = codeGroupRepository.findAll();

        for (CodeGroup codeGroup : codeGroupList) {
            System.out.println(codeGroup);
        }
    }

    @Test
    public void testRead() {
        Optional<CodeGroup> codeGroupOptional = codeGroupRepository.findById("A01");

        if (codeGroupOptional.isPresent()) {
            CodeGroup codeGroup = codeGroupOptional.get();

            System.out.println(codeGroup);
        }
    }

    @Test
    public void testModify() {
        Optional<CodeGroup> codeGroupOptional = codeGroupRepository.findById("A01");

        if (codeGroupOptional.isPresent()) {
            CodeGroup codeGroup = codeGroupOptional.get();

            System.out.println("codeGroup : " + codeGroup);

            codeGroup.setGroupName("hobby");

            codeGroupRepository.save(codeGroup);
        }
    }

    @Test
    public void testRemove_X() {
        codeGroupRepository.deleteById("A01");
    }

    @Transactional
    @Test
    public void testRemoveWithAllCodeDetailByQueryAtTransactional() {
        String groupCode = "A01";

        int count = codeGroupRepository.deleteAllCodeDetail(groupCode);

        System.out.println("after removed. count : " + count);

        codeGroupRepository.deleteById(groupCode);
    }

    @Test
    public void testRegisterWithCodeDetail() {
        CodeGroup codeGroup = new CodeGroup();
        codeGroup.setGroupCode("A01");
        codeGroup.setGroupName("job");

        codeGroupRepository.save(codeGroup);

        CodeDetail codeDetail1 = new CodeDetail();
        codeDetail1.setCodeValue("00");
        codeDetail1.setCodeName("Developer");
        codeDetail1.setCodeGroup(codeGroup);

        codeDetailRepository.save(codeDetail1);

        CodeDetail codeDetail2 = new CodeDetail();
        codeDetail2.setCodeValue("01");
        codeDetail2.setCodeName("Designer");
        codeDetail2.setCodeGroup(codeGroup);

        codeDetailRepository.save(codeDetail2);
    }

}
