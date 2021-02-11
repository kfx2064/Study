package me.whiteship.demoinflearnrestapi.procurement.vo;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 구매요청VO
 * @auth 정태현
 * @date 2021.02.05.금.
 */
@Getter @Setter @ToString @Builder
@NoArgsConstructor @AllArgsConstructor
@Entity
public class ProcureRequestVO {

    @Id
    private String procureRequestNo;        // 구매요청번호
    private String itemCd;                  // 품목코드
    private String itemNm;                  // 품목명
    private String unitCd;                  // 단위코드
    private String unitNm;                  // 단위명
    private int quantity;                   // 수량
    private int price;                      // 가격

}
