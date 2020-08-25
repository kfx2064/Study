package org.hdcd.controller;

import org.hdcd.controller.domain.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class MemberController {

    private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerByParameter(String userId, String password) {
        logger.info("registerByParameter");

        logger.info("userId = " + userId);

        logger.info("password = " + password);

        return "success";
    }

    @RequestMapping(value = "/registerByPath/{userId}", method = RequestMethod.GET)
    public String registerByPath(String userId) {
        logger.info("registerByPath");

        logger.info("userId = " + userId);

        return "success";
    }

    @RequestMapping(value = "/register/{userId}/{coin}", method = RequestMethod.GET)
    public String registerByPath(@PathVariable("userId") String userId, @PathVariable("coin") int coin) {
        logger.info("registerByPath");

        logger.info("userId = " + userId);

        logger.info("coin = " + coin);

        return "success";
    }

    @RequestMapping(value = "/register/{userId}", method = RequestMethod.GET)
    public ResponseEntity<String> register01(@PathVariable("userId") String userId) {
        logger.info("register01");

        logger.info("userId = " + userId);

        ResponseEntity<String> entity = new ResponseEntity<>("SUCCESS", HttpStatus.OK);

        return entity;
    }

    @RequestMapping(value = "/register/{userId}/{password}", method = RequestMethod.POST)
    public ResponseEntity<String> register02(@PathVariable("userId") String userId
            , @PathVariable("password") String password) {
        logger.info("register02");

        logger.info("userId = " + userId);
        logger.info("password = " + password);

        ResponseEntity<String> entity = new ResponseEntity<>("SUCCESS", HttpStatus.OK);

        return entity;
    }

    @RequestMapping(value = "/register03", method = RequestMethod.POST)
    public ResponseEntity<String> register03(@RequestBody Member member) {
        logger.info("register03");

        logger.info("userId = " + member.getUserId());
        logger.info("password = " + member.getPassword());

        ResponseEntity<String> entity = new ResponseEntity<>("SUCCESS", HttpStatus.OK);

        return entity;
    }

    @RequestMapping(value = "/register04", method = RequestMethod.POST)
    public ResponseEntity<String> register04(String userId) {
        logger.info("register04");

        logger.info("userId = " + userId);

        ResponseEntity<String> entity = new ResponseEntity<>("SUCCESS", HttpStatus.OK);

        return entity;
    }

    @RequestMapping(value = "/register05", method = RequestMethod.POST)
    public ResponseEntity<String> register05(String userId, String password) {
        logger.info("register05");

        logger.info("userId = " + userId);

        logger.info("password = " + password);

        ResponseEntity<String> entity = new ResponseEntity<>("SUCCESS", HttpStatus.OK);

        return entity;
    }

    @RequestMapping(value = "/register/{userId}", method = RequestMethod.POST)
    public ResponseEntity<String> register06(@PathVariable("userId") String userId, @RequestBody Member member) {
        logger.info("register06");

        logger.info("userId = " + userId);

        logger.info("member.getUserId() = " + member.getUserId());
        logger.info("member.getPassword() = " + member.getPassword());

        ResponseEntity<String> entity = new ResponseEntity<>("SUCCESS", HttpStatus.OK);

        return entity;
    }

    @RequestMapping(value = "/register07", method = RequestMethod.POST)
    public ResponseEntity<String> register07(@RequestBody List<Member> memberList) {
        logger.info("register07");

        for (Member member : memberList) {
            logger.info("userId = " + member.getUserId());
            logger.info("password = " + member.getPassword());
        }

        ResponseEntity<String> entity = new ResponseEntity<>("SUCCESS", HttpStatus.OK);

        return entity;
    }

    @RequestMapping(value = "/register08", method = RequestMethod.POST)
    public ResponseEntity<String> register08(@RequestBody Member member) {
        logger.info("register08");

        logger.info("userId = " + member.getUserId());
        logger.info("password = " + member.getPassword());

        Address address = member.getAddress();

        if (address != null) {
            logger.info("address.getPostCode() = " + address.getPostCode());
            logger.info("address.getLocation() = " + address.getLocation());
        } else {
            logger.info("address == null");
        }

        ResponseEntity<String> entity = new ResponseEntity<>("SUCCESS", HttpStatus.OK);

        return entity;
    }

    @RequestMapping(value = "/register09", method = RequestMethod.POST)
    public ResponseEntity<String> register09(@RequestBody Member member) {
        logger.info("register09");

        logger.info("userId = " + member.getUserId());
        logger.info("password = " + member.getPassword());

        List<Card> cardList = member.getCardList();

        if (cardList != null) {
            logger.info("cardList.size() = " + cardList.size());

            for (int i = 0; i < cardList.size(); i++) {
                Card card = cardList.get(i);
                logger.info("card.getNo() = " + card.getNo());
                logger.info("card.getValidMonth() = " + card.getValidMonth());
            }
        } else {
            logger.info("cardList == null");
        }

        ResponseEntity<String> entity = new ResponseEntity<>("SUCCESS", HttpStatus.OK);

        return entity;
    }

    @RequestMapping(value = "/register0201", method = RequestMethod.POST)
    public String register0201(String username) {
        logger.info("register0201");

        logger.info("userId = " + username);

        return "success";
    }

    @RequestMapping(value = "/register0202", method = RequestMethod.POST)
    public String register0202(@RequestParam("userId") String username) {
        logger.info("register0202");

        logger.info("userId = " + username);

        return "success";
    }

    @RequestMapping(value = "/register0301", method = RequestMethod.POST)
    public String register0301(String memberId) {
        logger.info("register0301");

        logger.info("userId = " + memberId);

        return "success";
    }

    @RequestMapping(value = "/register0302", method = RequestMethod.POST)
    public String register0302(@RequestParam("userId") String memberId) {
        logger.info("register0302");

        logger.info("userId = " + memberId);

        return "success";
    }

    @RequestMapping(value = "/registerByGet01", method = RequestMethod.GET)
    public String registerByGet01(String userId, @DateTimeFormat(pattern = "yyyyMMdd") Date dateOfBirth) {
        logger.info("registerByGet01");

        logger.info("userId = " +   userId);

        logger.info("dateOfBirth = " + dateOfBirth);

        return "success";
    }

    @RequestMapping(value = "/registerByGet02", method = RequestMethod.GET)
    public String registerByGet02(Member member) {
        logger.info("registerByGet02");

        logger.info("member.getUserId() = " + member.getUserId());

        logger.info("member.getDateOfBirth() = " + member.getDateOfBirth());

        return "success";
    }

    @RequestMapping(value = "/registerAllForm", method = RequestMethod.GET)
    public String registerAllForm() {
        logger.info("registerAllForm");

        return "registerAllForm";
    }

    @RequestMapping(value = "/registerForm", method = RequestMethod.GET)
    public String registerForm() {
        logger.info("registerForm");

        return "registerForm";
    }

    @RequestMapping(value = "/registerMemberUserId", method = RequestMethod.POST)
    public String registerUserId(Member member) {
        logger.info("registerUserId");
        logger.info("member.getUserId() = " + member.getUserId());

        return "success";
    }

    @RequestMapping(value = "/registerUser", method = RequestMethod.POST)
    public String registerUser(Member member) {
        logger.info("registerUser");
        logger.info("member.getUserId() = "         + member.getUserId());
        logger.info("member.getGender() = "         + member.getGender());
        logger.info("member.getHobby() = "          + member.getHobby());
        logger.info("member.isForeigner() = "       + member.isForeigner());
        logger.info("member.getDeveloper() = "      + member.getDeveloper());
        logger.info("member.getBirthDate() = "      + member.getDateOfBirth());
        logger.info("member.getCars() = "           + member.getCars());
        logger.info("member.getIntroduction() = "   + member.getIntroduction());

        String[] hobbyArray = member.getHobbyArray();

        if (hobbyArray != null) {
            logger.info("hobbyArray.length = " + hobbyArray.length);

            for (int i = 0; i < hobbyArray.length; i++) {
                logger.info("hobbyArray[" + i + "] = " + hobbyArray[i]);
            }
        } else {
            logger.info("hobbyArray == null");
        }

        List<String> hobbyList = member.getHobbyList();

        if (hobbyList != null) {
            logger.info("hobbyList.size() = " + hobbyList.size());

            for (int i = 0; i < hobbyList.size(); i++) {
                logger.info("hobbyList(" + i + ") = " + hobbyList.get(i));
            }
        } else {
            logger.info("hobbyList == null");
        }

        Address address = member.getAddress();

        if (address != null) {
            logger.info("address.getPostCode() = " + address.getPostCode());
            logger.info("address.getLocation() = " + address.getLocation());
        } else {
            logger.info("address == null");
        }

        List<Card> cardList = member.getCardList();

        if (cardList != null) {
            logger.info("cardList.size() = " + cardList.size());

            for (int i = 0; i < cardList.size(); i++) {
                Card card = cardList.get(i);
                logger.info("card.getNo() = " + card.getNo());
                logger.info("card.getValidMonth() = " + card.getValidMonth());
            }
        } else {
            logger.info("cardList == null");
        }

        String[] carArray = member.getCarArray();

        if (carArray != null) {
            logger.info("carArray.length = " + carArray.length);

            for (int i = 0; i < carArray.length; i++) {
                logger.info("carArray[" + i + "] = " + carArray[i]);
            }
        } else {
            logger.info("carArray == null");
        }

        List<String> carList = member.getCarList();

        if (carList != null) {
            logger.info("carList.size() = " + carList.size());

            for (int i = 0; i < carList.size(); i++) {
                logger.info("hobbyList(" + i + ") = " + carList.get(i));
            }
        } else {
            logger.info("carList == null");
        }

        return "success";
    }

    @RequestMapping(value = "/registerUserId", method = RequestMethod.POST)
    public String registerUserId(String userId) {
        logger.info("registerUserId");
        logger.info("userId = " + userId);

        return "success";
    }

    @RequestMapping(value = "/registerPassword", method = RequestMethod.POST)
    public String registerPassword(String password) {
        logger.info("registerPassword");
        logger.info("password = " + password);

        return "success";
    }

    @RequestMapping(value = "/registerTextArea", method = RequestMethod.POST)
    public String registerTextArea(String introduction) {
        logger.info("registerTextArea");
        logger.info("introduction = " + introduction);

        return "success";
    }

    @RequestMapping(value = "/registerRadio", method = RequestMethod.POST)
    public String registerRadio(String gender) {
        logger.info("registerRadio");
        logger.info("gender = " + gender);

        return "success";
    }

    @RequestMapping(value = "/registerCheckbox01", method = RequestMethod.POST)
    public String registerCheckbox01(String hobby) {
        logger.info("registerCheckbox01");
        logger.info("hobby = " + hobby);

        return "success";
    }

    @RequestMapping(value = "/registerCheckbox02", method = RequestMethod.POST)
    public String registerCheckbox02(String[] hobbyArray) {
        logger.info("registerCheckbox02");

        if (hobbyArray != null) {
            logger.info("hobbyArray.length = " + hobbyArray.length);

            for (int i = 0; i < hobbyArray.length; i++) {
                logger.info("hobbyArray[" + i + "] = " + hobbyArray[i]);
            }
        } else {
            logger.info("hobbyArray == null");
        }

        return "success";
    }

    @RequestMapping(value = "/registerCheckbox03", method = RequestMethod.POST)
    public String registerCheckbox03(List<String> hobbyList) {
        logger.info("registerCheckbox03");

        if (hobbyList != null) {
            logger.info("hobbyList.size() = " + hobbyList.size());

            for (int i = 0; i < hobbyList.size(); i++) {
                logger.info("hobbyList(" + i + ") = " + hobbyList.get(i));
            }
        } else {
            logger.info("hobbyList == null");
        }

        return "success";
    }

    @RequestMapping(value = "/registerCheckbox04", method = RequestMethod.POST)
    public String registerCheckbox04(String developer) {
        logger.info("registerCheckbox04");
        logger.info("developer = " + developer);

        return "success";
    }

    @RequestMapping(value = "/registerCheckbox05", method = RequestMethod.POST)
    public String registerCheckbox05(boolean foreigner) {
        logger.info("registerCheckbox05");
        logger.info("foreigner = " + foreigner);

        return "success";
    }

    @RequestMapping(value = "/registerSelect", method = RequestMethod.POST)
    public String registerSelect(String nationality) {
        logger.info("registerSelect");
        logger.info("nationality = " + nationality);

        return "success";
    }

    @RequestMapping(value = "/registerMultipleSelect01", method = RequestMethod.POST)
    public String registerMultipleSelect01(String cars) {
        logger.info("registerMultipleSelect01");
        logger.info("cars = " + cars);

        return "success";
    }

    @RequestMapping(value = "/registerMultipleSelect02", method = RequestMethod.POST)
    public String registerMultipleSelect02(String[] carArray) {
        logger.info("registerMultipleSelect02");

        if (carArray != null) {
            logger.info("carArray.length = " + carArray.length);

            for (int i = 0; i < carArray.length; i++) {
                logger.info("carArray[" + i + "] = " + carArray[i]);
            }
        } else {
            logger.info("carArray == null");
        }

        return "success";
    }

    @RequestMapping(value = "/registerMultipleSelect03", method = RequestMethod.POST)
    public String registerMultipleSelect03(ArrayList<String> carList) {
        logger.info("registerMultipleSelect03");

        if (carList != null) {
            logger.info("carList.size() = " + carList.size());

            for (int i = 0; i < carList.size(); i++) {
                logger.info("hobbyList(" + i + ") = " + carList.get(i));
            }
        } else {
            logger.info("carList == null");
        }

        return "success";
    }

    @RequestMapping(value = "/registerAddress", method = RequestMethod.POST)
    public String registerAddress(Address address) {
        logger.info("registerAddress");

        if (address != null) {
            logger.info("address.getPostCode() = " + address.getPostCode());
            logger.info("address.getLocation() = " + address.getLocation());
        } else {
            logger.info("address == null");
        }

        return "success";
    }

    @RequestMapping(value = "/registerUserAddress", method = RequestMethod.POST)
    public String registerUserAddress(Member member) {
        logger.info("registerUserAddress");

        Address address = member.getAddress();

        if (address != null) {
            logger.info("address.getPostCode() = " + address.getPostCode());
            logger.info("address.getLocation() = " + address.getLocation());
        } else {
            logger.info("address == null");
        }

        return "success";
    }

    @RequestMapping(value = "/registerUserCardList", method = RequestMethod.POST)
    public String registerUserCardList(Member member) {
        logger.info("registerUserCardList");

        List<Card> cardList = member.getCardList();

        if (cardList != null) {
            logger.info("cardList.size() = " + cardList.size());

            for (int i = 0; i < cardList.size(); i++) {
                Card card = cardList.get(i);
                logger.info("card.getNo() = " + card.getNo());
                logger.info("card.getValidMonth() = " + card.getValidMonth());
            }
        } else {
            logger.info("cardList == null");
        }

        return "success";
    }

    @RequestMapping(value = "/registerDate01", method = RequestMethod.POST)
    public String registerDate01(Date dateOfBirth) {
        logger.info("registerDate01");

        if (dateOfBirth != null) {
            logger.info("dateOfBirth = " + dateOfBirth);
        } else {
            logger.info("dateOfBirth == null");
        }

        return "success";
    }

    @RequestMapping(value = "/registerDate02", method = RequestMethod.POST)
    public String registerDate02(@DateTimeFormat(pattern = "yyyyMMDd") Date dateOfBirth) {
        logger.info("registerDate02");

        if (dateOfBirth != null) {
            logger.info("dateOfBirth = " + dateOfBirth);
        } else {
            logger.info("dateOfBirth == null");
        }

        return "success";
    }

    @RequestMapping(value = "/registerForm2", method = RequestMethod.GET)
    public String registerForm2() {
        logger.info("MemberController, registerForm2.");

        return "registerForm2";
    }

    @RequestMapping(value = "/registerFile01", method = RequestMethod.POST)
    public String registerFile01(MultipartFile picture) throws Exception {
        logger.info("registerFile01");

        logger.info("originalName: " + picture.getOriginalFilename());
        logger.info("size: " + picture.getSize());
        logger.info("contentType: " + picture.getContentType());

        return "success";
    }

    @RequestMapping(value = "/registerFile02", method = RequestMethod.POST)
    public String registerFile02(String userId, String password, MultipartFile picture) throws Exception {
        logger.info("registerFile02");

        logger.info("userId = " + userId);
        logger.info("password = " + password);

        logger.info("originalName : " + picture.getOriginalFilename());
        logger.info("size: ");
        logger.info("contentType: " + picture.getContentType());

        return "success";
    }

    @RequestMapping(value = "/registerFile03", method = RequestMethod.POST)
    public String registerFile03(Member member, MultipartFile picture) throws Exception {
        logger.info("registerFile03");

        logger.info("userId = " + member.getUserId());
        logger.info("password = " + member.getPassword());

        logger.info("originalName: " + picture.getOriginalFilename());
        logger.info("size: " + picture.getSize());
        logger.info("contentType: " + picture.getContentType());

        return "success";
    }

    @RequestMapping(value = "/registerFile04", method = RequestMethod.POST)
    public String registerFile04(FileMember fileMember) throws Exception {
        logger.info("registerFile04");

        logger.info("userId = " + fileMember.getUserId());
        logger.info("password = " + fileMember.getPassword());

        MultipartFile picture = fileMember.getPicture();

        logger.info("originalName: " + picture.getOriginalFilename());
        logger.info("size: " + picture.getSize());
        logger.info("contentType: " + picture.getContentType());

        return "success";
    }

    @RequestMapping(value = "/registerFile05", method = RequestMethod.POST)
    public String registerFile05(MultipartFile picture, MultipartFile picture2) throws Exception {
        logger.info("registerFile05");

        logger.info("picture originalName: " + picture.getOriginalFilename());
        logger.info("picture size: " + picture.getSize());
        logger.info("picture contentType: " + picture.getContentType());

        logger.info("picture2 originalName: " + picture2.getOriginalFilename());
        logger.info("picture2 size: " + picture2.getSize());
        logger.info("picture2 contentType: " + picture2.getContentType());

        return "success";
    }

    @RequestMapping(value = "/registerFile06", method = RequestMethod.POST)
    public String registerFile06(List<MultipartFile> pictureList) throws Exception {
        logger.info("registerFile06");

        logger.info("registerFile06 pictureList.size() = " + pictureList.size());

        for (MultipartFile picture : pictureList) {
            logger.info("picture originalName: " + picture.getOriginalFilename());
            logger.info("picture size: " + picture.getSize());
            logger.info("picture contentType: " + picture.getContentType());
        }

        return "success";
    }

    @RequestMapping(value = "/registerFile07", method = RequestMethod.POST)
    public String registerFile07(MultiFileMember multiFileMember) throws Exception {
        logger.info("registerFile07");

        List<MultipartFile> pictureList = multiFileMember.getPictureList();

        logger.info("registerFile07 pictureList.size() = " + pictureList.size());

        for (MultipartFile picture : pictureList) {
            logger.info("picture originalName: " + picture.getOriginalFilename());
            logger.info("picture size: " + picture.getSize());
            logger.info("picutre contentType: " + picture.getContentType());
        }

        return "success";
    }

    @RequestMapping(value = "/registerFile08", method = RequestMethod.POST)
    public String registerFile08(MultipartFile[] pictureList) throws Exception {
        logger.info("registerFile08");

        logger.info("registerFile08 pictureList.length = " + pictureList.length);

        for (MultipartFile picture : pictureList) {
            logger.info("picture originalName: " + picture.getOriginalFilename());
            logger.info("picture size: " + picture.getSize());
            logger.info("picture contentType: " + picture.getContentType());
        }

        return "success";
    }

    @RequestMapping(value = "/uploadAjax", method = RequestMethod.POST, produces = "text/plain;charset=utf-8")
    public ResponseEntity<String> uploadAjax(MultipartFile file) throws Exception {
        String originalFilename = file.getOriginalFilename();

        logger.info("originalName: " + originalFilename);

        ResponseEntity<String> entity = new ResponseEntity<>("UPLOAD SUCCESS " + originalFilename, HttpStatus.OK);

        return entity;
    }

}