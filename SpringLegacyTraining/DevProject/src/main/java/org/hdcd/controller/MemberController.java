package org.hdcd.controller;

import org.hdcd.controller.domain.Address;
import org.hdcd.controller.domain.Card;
import org.hdcd.controller.domain.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping(value = "/register/{userId}", method = RequestMethod.GET)
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

    @RequestMapping(value = "/register01", method = RequestMethod.POST)
    public String register01(Member member) {
        logger.info("register01");

        logger.info("member.getUserId() = " + member.getUserId());

        logger.info("member.getPassword() = " + member.getPassword());

        logger.info("member.getCoin() = " + member.getCoin());

        return "success";
    }

    @RequestMapping(value = "/register02", method = RequestMethod.POST)
    public String register02(Member member, int coin) {
        logger.info("register02");

        logger.info("member.getUserId() = " + member.getUserId());

        logger.info("member.getPassword() = " + member.getPassword());

        logger.info("member.getCoin() = " + member.getCoin());

        logger.info("coin = " + coin);

        return "success";
    }

    @RequestMapping(value = "/register03", method = RequestMethod.POST)
    public String register03(int uid, Member member) {
        logger.info("register03");

        logger.info("uid = " + uid);

        logger.info("member.getUserId() = " + member.getUserId());

        logger.info("member.getPassword() = " + member.getPassword());

        logger.info("member.getCoin() = " + member.getCoin());

        return "success";
    }

    @RequestMapping(value = "/register04", method = RequestMethod.POST)
    public String register04(String userId, String password, String coin) {
        logger.info("register04");

        logger.info("userId = " + userId);

        logger.info("password = " + password);

        logger.info("coin = " + coin);

        return "success";
    }

    @RequestMapping(value = "/register05", method = RequestMethod.POST)
    public String register05(String userId, String password, int coin) {
        logger.info("register05");

        logger.info("userId = " + userId);

        logger.info("password = " + password);

        logger.info("coin = " + coin);

        return "success";
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

}