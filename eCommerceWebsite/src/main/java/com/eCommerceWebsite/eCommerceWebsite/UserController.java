package com.eCommerceWebsite.eCommerceWebsite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
//
//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @Autowired
//    public void SetUserService(UserService userService) {
//        this.userService = userService;
//    }
//
//    public UserService getUserService() {
//        return userService;
//    }

    @GetMapping("/{id}")
    public String getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @GetMapping("/filter/{id}")
    public String findUserStartsWithB(@PathVariable Long id) {
        return userService.getUserByNameStartsWithB(id);
    }
}
