package me.whiteship.demospringmvc.user;

import org.springframework.web.bind.annotation.*;

/**
 * RestController를 사용할 때는 @ResponseBody를 사용하지 않아도 됨.
 */
@RestController
public class UserController {

    @GetMapping("/helloUser")
    public String hello() {
        return "helloUser";
    }

    @PostMapping("/users/create")
    public User create(@RequestBody User user) {
        return user;
    }

}
