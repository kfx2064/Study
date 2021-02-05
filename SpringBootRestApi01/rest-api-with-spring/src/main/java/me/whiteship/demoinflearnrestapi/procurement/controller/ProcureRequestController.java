package me.whiteship.demoinflearnrestapi.procurement.controller;

import lombok.extern.slf4j.Slf4j;
import me.whiteship.demoinflearnrestapi.procurement.vo.ProcureRequestResource;
import me.whiteship.demoinflearnrestapi.procurement.vo.ProcureRequestVO;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.net.URI;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

/**
 * 구매요청
 * @auth 정태현
 * @date 2021.02.05.금.
 */
@Slf4j
@Controller
public class ProcureRequestController {

    /**
     * 구매요청 메인 페이지
     * @auth 정태현
     * @date 2021.02.05.금.
     * @return
     * @throws Exception
     */
    @GetMapping("/procure/mainPage")
    public String callProcureRequestMainPage() throws Exception {
        log.info("ProcureRequestController, callProcureRequestMainPage.");
        return "procure/mainPage";
    }

    /**
     * 구매요청 목록 조회
     * @auth 정태현
     * @date 2021.02.05.금
     * @return
     * @throws Exception
     */
    @GetMapping("/procureRequest/callList")
    @ResponseBody
    public ResponseEntity<String> callProcureRequestList() throws Exception {
        log.info("ProcureRequestController, callProcureRequestList.");

        ResponseEntity<String> entity = null;

        try {
            entity = new ResponseEntity<String>("callProcureRequestList", HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return entity;
    }

    /**
     * 구매요청 입력수정삭제
     * @auth 정태현
     * @date 2021.02.05.금.
     * @return
     * @throws Exception
     */
    @PostMapping("/procureRequest/save")
    @ResponseBody
    public ResponseEntity<ProcureRequestResource> saveProcureRequest(
            @RequestBody ProcureRequestVO procureRequestVO
            , HttpServletRequest request)
            throws Exception {
        log.info("ProcureRequestController, saveProcureRequest.");

        ResponseEntity<Integer> entity = null;
        URI createUri = null;
        ProcureRequestResource procureRequestResource = null;
        URI strURI = null;

        try {

            /**
             * 원래는 입력수정삭제 후 돌아온 리턴값이 들어가야 하지만
             * 가상의 리턴값이라 하여 VO를 만들어 주고 resource 객체에 담아 리턴한다.
             */
            procureRequestVO = ProcureRequestVO.builder()
                    .procureRequestNo("202102050001")
                    .itemCd("0001")
                    .itemNm("쌀")
                    .unitCd("0001")
                    .unitNm("KG")
                    .quantity(10)
                    .price(100)
                    .build();

            ControllerLinkBuilder selfLinkBuilder =
                    linkTo(ProcureRequestController.class).slash(procureRequestVO.getProcureRequestNo());

            createUri = selfLinkBuilder.toUri();

            StringBuffer requestURL = request.getRequestURL();
            String strRequestURL = requestURL.toString();
            strURI = new URI(strRequestURL);

            System.out.println("strURI");
            System.out.println(strURI);

            procureRequestResource = new ProcureRequestResource(procureRequestVO);
            procureRequestResource.add(linkTo(ProcureRequestController.class).withRel("query-events"));
            procureRequestResource.add(selfLinkBuilder.withRel("update-events"));
            procureRequestResource.add(
                    new Link("/procure/procureRequest.html#resources-procureRequest").withRel("profile")
            );

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.created(strURI).body(procureRequestResource);
    }

    @GetMapping("/procureRequest/detail")
    @ResponseBody
    public ResponseEntity<ProcureRequestVO> procureRequestDetail(
            @RequestBody ProcureRequestVO procureRequestVO
            ) throws Exception {
        log.info("ProcureRequestController, procureRequestDetail.");

        ResponseEntity<ProcureRequestVO> entity = null;
        ProcureRequestVO paramVO = null;

        try {

            paramVO = new ProcureRequestVO();
            paramVO.setProcureRequestNo("202102050001");
            paramVO.setItemCd("0001");
            paramVO.setItemNm("나무젓가락");
            paramVO.setUnitCd("001");
            paramVO.setUnitNm("개");
            paramVO.setQuantity(10);
            paramVO.setPrice(1000);

            entity = new ResponseEntity<ProcureRequestVO>(paramVO, HttpStatus.OK);

        } catch (Exception e) {
            e.printStackTrace();
            paramVO = new ProcureRequestVO();
            entity = new ResponseEntity<ProcureRequestVO>(paramVO, HttpStatus.BAD_REQUEST);
        }

        return entity;
    }

}
