package springBoot.Dto.dto.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springBoot.Dto.dto.entity.User;
import springBoot.Dto.dto.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController1 {

    @Autowired
    private UserService userService;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
//
//    @GetMapping("/{userId}")
//    public User getUser(@PathVariable int userId) {
//        return userService.getUser(userId);
//    }
}

