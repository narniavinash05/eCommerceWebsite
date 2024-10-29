package com.eCommerceWebsite.eCommerceWebsite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public String getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @GetMapping("/filter/{id}")
    public String findUserStartsWithB(@PathVariable Long id) {
        return userService.getUserByNameStartsWithB(id);
    }
}
