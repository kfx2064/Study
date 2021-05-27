package org.hdcd.devproject.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(of = "groupCode")
@ToString(exclude = "codeDetails")
@Entity
public class CodeGroup {

    @Id
    private String groupCode;

    private String groupName;
    private String useYn = "Y";

    @CreationTimestamp
    private LocalDateTime regDate;
    @UpdateTimestamp
    private LocalDateTime updDate;

    @OneToMany(mappedBy = "codeGroup", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<CodeDetail> codeDetails;

    public void addCodeDetail(CodeDetail codeDetail) {
        codeDetail.setCodeGroup(this);
        this.codeDetails.add(codeDetail);
    }

}
