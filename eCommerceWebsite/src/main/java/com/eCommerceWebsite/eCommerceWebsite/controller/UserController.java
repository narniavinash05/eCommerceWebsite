package com.eCommerceWebsite.eCommerceWebsite.controller;
import com.eCommerceWebsite.eCommerceWebsite.service.UserService;
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
//
//    @PostMapping("/users")
//    public User createUser(@RequestBody User user) {
//        return userService.saveUser(user);
//    }
//    @PutMapping("/users/{id}")
//    public User updateUser(@PathVariable Long id, @RequestBody User user) {
//        return userService.updateUser(id, user);
//    }
}
