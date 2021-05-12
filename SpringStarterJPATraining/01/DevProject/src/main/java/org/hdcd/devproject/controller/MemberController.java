package org.hdcd.devproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.hdcd.devproject.domain.Address;
import org.hdcd.devproject.domain.Card;
import org.hdcd.devproject.domain.Member;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
public class MemberController {

    @GetMapping("/registerAllForm")
    public String registerAllForm() {
        log.info("registerAllForm");

        return "registerAllForm";
    }

    @GetMapping("/registerForm")
    public String registerForm() {
        log.info("registerForm");

        return "registerForm";
    }

    @PostMapping("/registerMemberUserId")
    public String registerUserId(Member member) {
        log.info("registerUserId");
        log.info("member.getUserId() = " + member.getUserId());

        return "success";
    }

    @PostMapping("/registerUser")
    public String registerUser(Member member) {
        log.info("registerUser");

        log.info("member.getUserId() = " + member.getUserId());
        log.info("member.getGender() = " + member.getGender());
        log.info("member.getHobby() = " + member.getHobby());
        log.info("member.isForeigner() = " + member.isForeigner());
        log.info("member.getDeveloper() = " + member.getDeveloper());
        log.info("member.getBirthDate() = " + member.getDateOfBirth());
        log.info("member.getCars() = " + member.getCars());
        log.info("member.getIntroduction() = " + member.getIntroduction());

        String[] hobbyArray  =member.getHobbyArray();

        if (hobbyArray != null) {
            log.info("hobbyArray.length = " + hobbyArray.length);

            for (int i = 0; i < hobbyArray.length; i++) {
                log.info("hobbyArray[" + i + "] = " + hobbyArray[i]);
            }
        } else {
            log.info("hobbyArray == null");
        }

        List<String> hobbyList = member.getHobbyList();

        if (hobbyList != null) {
            log.info("hobbyList.size() = " +hobbyList.size());

            for (int i = 0; i < hobbyList.size(); i++) {
                log.info("hobbyList(" + i + ") = " + hobbyList.get(i));
            }
        } else {
            log.info("hobbyList == null");
        }

        Address address = member.getAddress();

        if (address != null) {
            log.info("address.getPostCode() = " + address.getPostCode());
            log.info("address.getLocation() = " + address.getLocation());
        } else {
            log.info("address == null");
        }

        List<Card> cardList = member.getCardList();

        if (cardList != null) {
            log.info("cardList.size() = " + cardList.size());

            for (int i = 0; i < cardList.size(); i++) {
                Card card = cardList.get(i);
                log.info("card.getNo() = " + card.getNo());
                log.info("card.getValidMonth() = " + card.getValidMonth());
            }
        } else {
            log.info("cardList == null");
        }

        String[] carArray = member.getCarArray();

        if (carArray != null) {
            log.info("carArray.length = " + carArray.length);

            for (int i = 0; i < carArray.length; i++) {
                log.info("carArray[" + i + "] = " + carArray[i]);
            }
        } else {
            log.info("carArray == null");
        }

        List<String> carList = member.getCarList();

        if (carList != null) {
            log.info("carList.size() = " + carList.size());

            for (int i = 0; i < carList.size(); i++) {
                log.info("hobbyList(" + i + ") = " + carList.get(i));
            }
        } else {
            log.info("carList == null");
        }

        return "success";
    }

    @PostMapping("/registerUserId")
    public String registerUserId(String userId) {
        log.info("registerUserId");
        log.info("userId = " + userId);

        return "success";
    }

    @PostMapping("/registerPassword")
    public String registerPassword(String password) {
        log.info("registerPassword");
        log.info("password = " + password);

        return "success";
    }

    @PostMapping("/registerTextArea")
    public String registerTextArea(String introduction) {
        log.info("registerTextArea");
        log.info("introduction = " + introduction);

        return "success";
    }

    @PostMapping("/registerRadio")
    public String registerRadio(String gender) {
        log.info("registerRadio");
        log.info("gender = " + gender);

        return "success";
    }

    @PostMapping("/registerCheckbox01")
    public String registerCheckbox01(String hobby) {
        log.info("registerCheckbox01");
        log.info("hobby = " + hobby);

        return "success";
    }

    @PostMapping("/registerCheckbox02")
    public String registerCheckbox02(String[] hobbyArray) {
        log.info("registerCheckbox02");

        if (hobbyArray != null) {
            log.info("hobbyArray.length = " + hobbyArray.length);

            for (int i = 0; i <hobbyArray.length; i++) {
                log.info("hobbyArray[" + i + "] = " + hobbyArray[i]);
            }
        } else {
            log.info("hobbyArray == null");
        }

        return "success";
    }

    @PostMapping("/registerCheckbox03")
    public String registerCheckbox03(List<String> hobbyList) {
        log.info("registerCheckbox03");

        if (hobbyList != null) {
            log.info("hobbyList.size() = " + hobbyList.size());

            for (int i = 0; i < hobbyList.size(); i++) {
                log.info("hobbyList(" + i + ") = " + hobbyList.get(i));
            }
        } else {
            log.info("hobbyList == null");
        }

        return "success";
    }

    @PostMapping("/registerCheckbox04")
    public String registerCheckbox04(String developer) {
        log.info("registerCheckbox04");
        log.info("developer = " + developer);

        return "success";
    }

    @PostMapping("/registerCheckbox05")
    public String registerCheckbox05(boolean foreigner) {
        log.info("registerCheckbox05");
        log.info("foreigner = " + foreigner);

        return "success";
    }

    @PostMapping("/registerSelect")
    public String registerSelect(String nationality) {
        log.info("registerSelect");
        log.info("nationality = " + nationality);

        return "success";
    }

    @PostMapping("/registerMultipleSelect01")
    public String registerMultipleSelect01(String cars) {
        log.info("registerMultipleSelect01");
        log.info("cars = " + cars);

        return "success";
    }

    @PostMapping("/registerMultipleSelect02")
    public String registerMultipleSelect02(String[] carArray) {
        log.info("registerMultipleSelect02");

        if (carArray != null) {
            log.info("carArray.length = " + carArray.length);

            for (int i = 0; i < carArray.length; i++) {
                log.info("carArray[" + i + "] = " + carArray[i]);
            }
        } else {
            log.info("carArray == null");
        }

        return "success";
    }

    @PostMapping("/registerMultipleSelect03")
    public String registerMultipleSelect03(ArrayList<String> carList) {
        log.info("registerMultipleSelect03");

        if (carList != null) {
            log.info("carList.size() = " + carList.size());

            for (int i = 0; i < carList.size(); i++) {
                log.info("hobbyList(" + i + ") = " + carList.get(i));
            }
        } else {
            log.info("carList == null");
        }

        return "success";
    }

    @PostMapping("/registerAddress")
    public String registerAddress(Address address) {
        log.info("registerAddress");

        if (address != null) {
            log.info("address.getPostCode() = " + address.getPostCode());
            log.info("address.getLocation() = " + address.getLocation());
        } else {
            log.info("address == null");
        }

        return "success";
    }

    @PostMapping("/registerUserAddress")
    public String registerUserAddress(Member member) {
        log.info("registerUserAddress");

        Address address = member.getAddress();

        if (address != null) {
            log.info("address.getPostCode() = " + address.getPostCode());
            log.info("address.getLocation() = " + address.getLocation());
        } else {
            log.info("address == null");
        }

        return "success";
    }

    @PostMapping("/registerUserCardList")
    public String registerUserCardList(Member member) {
        log.info("registerUserCardList");

        List<Card> cardList = member.getCardList();

        if (cardList != null) {
            log.info("cardList.size() = " + cardList.size());

            for (int i = 0; i < cardList.size(); i++) {
                Card card = cardList.get(i);
                log.info("card.getNo() = " + card.getNo());
                log.info("card.getValidMonth = " + card.getValidMonth());
            }
        } else {
            log.info("cardList == null");
        }

        return "success";
    }

    @PostMapping("/registerDate01")
    public String registerDate01(LocalDate dateOfBirth) {
        log.info("registerDate01");

        if (dateOfBirth != null) {
            log.info("dateOfBirth = " + dateOfBirth);
        } else {
            log.info("dateOfBirth == null");
        }

        return "success";
    }

    @PostMapping("/registerDate02")
    public String registerDate02(@DateTimeFormat(pattern = "yyyyMMdd") LocalDate dateOfBirth) {
        log.info("registerDate02");

        if (dateOfBirth != null) {
            log.info("dateOfBirth = " + dateOfBirth);
        } else {
            log.info("dateOfBirth == null");
        }

        return "success";
    }

}
