package me.whiteship.demoinflearnrestapi.procurement;

import com.fasterxml.jackson.databind.ObjectMapper;
import me.whiteship.demoinflearnrestapi.common.RestDocsConfiguration;
import me.whiteship.demoinflearnrestapi.common.TestDescription;
import me.whiteship.demoinflearnrestapi.procurement.vo.ProcureRequestVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.hateoas.MediaTypes;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.restdocs.headers.HeaderDocumentation.*;
import static org.springframework.restdocs.hypermedia.HypermediaDocumentation.linkWithRel;
import static org.springframework.restdocs.hypermedia.HypermediaDocumentation.links;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.payload.PayloadDocumentation.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureRestDocs
@Import(RestDocsConfiguration.class)
public class ProcureRequestControllerTests {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    @TestDescription("구매요청목록 테스트")
    public void testCallProcureRequestList() throws Exception {
        mockMvc.perform(get("/procureRequest/callList"))
                .andDo(print())
                .andExpect(status().is2xxSuccessful());
    }

    @Test
    @TestDescription("구매요청목록 입력수정삭제")
    public void testSaveProcureRequest() throws Exception {
        ProcureRequestVO procureRequestVO = ProcureRequestVO.builder()
                .procureRequestNo("202102050001")
                .itemCd("0001")
                .itemNm("쌀")
                .unitCd("0001")
                .unitNm("KG")
                .quantity(10)
                .price(100)
                .build();

        mockMvc.perform(post("/procureRequest/save")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .accept(MediaTypes.HAL_JSON)
                        .content(objectMapper.writeValueAsString(procureRequestVO))
                )
                .andDo(print())
                .andExpect(status().isCreated())
                .andDo(document("create-event",
                        links(
                                linkWithRel("self").description("link to self"),
                                linkWithRel("query-events").description("link to query events"),
                                linkWithRel("update-events").description("link to update an existing event"),
                                linkWithRel("profile").description("link to profile an existing event")
                        ),
                        requestHeaders(
                                headerWithName(HttpHeaders.ACCEPT).description("accept header."),
                                headerWithName(HttpHeaders.CONTENT_TYPE).description("content type header")
                        ),
                        requestFields(
                                fieldWithPath("procureRequestNo").description("구매요청번호"),
                                fieldWithPath("itemCd").description("품목코드"),
                                fieldWithPath("itemNm").description("품목명"),
                                fieldWithPath("unitCd").description("단위코드"),
                                fieldWithPath("unitNm").description("단위명"),
                                fieldWithPath("quantity").description("수량"),
                                fieldWithPath("price").description("가격")
                        ),
                        responseHeaders(
                                headerWithName(HttpHeaders.CONTENT_TYPE).description("Content type")
                        ),
                        responseFields(
                                fieldWithPath("procureRequestNo").description("구매요청번호"),
                                fieldWithPath("itemCd").description("품목코드"),
                                fieldWithPath("itemNm").description("품목명"),
                                fieldWithPath("unitCd").description("단위코드"),
                                fieldWithPath("unitNm").description("단위명"),
                                fieldWithPath("quantity").description("수량"),
                                fieldWithPath("price").description("가격"),
                                fieldWithPath("_links.self.href").description("link to self"),
                                fieldWithPath("_links.query-events.href").description("link to query event list"),
                                fieldWithPath("_links.update-events.href").description("link to update existing event"),
                                fieldWithPath("_links.profile.href").description("link to profile")
                        )
                ));
    }

    @Test
    @TestDescription("구매요청목록 상세화면")
    public void testProcureRequestDetail() throws Exception {
        ProcureRequestVO procureRequestVO = ProcureRequestVO.builder()
                .procureRequestNo("202102050001")
                .itemCd("0001")
                .itemNm("쌀")
                .unitCd("0001")
                .unitNm("KG")
                .quantity(10)
                .price(100)
                .build();

        mockMvc.perform(
                        get("/procureRequest/detail")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .accept(MediaTypes.HAL_JSON)
                        .content(objectMapper.writeValueAsString(procureRequestVO))
                )
                .andDo(print())
                .andExpect(status().isOk())
                .andDo(document("create-event"));
    }

}
