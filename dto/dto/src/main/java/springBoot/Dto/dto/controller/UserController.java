package springBoot.Dto.dto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springBoot.Dto.dto.dto.UserDto;
import springBoot.Dto.dto.entity.User;
import springBoot.Dto.dto.service.UserService;
import springBoot.Dto.dto.service.UserServiceImpl;


@RestController
@RequestMapping("/api/user")
public class UserController {


    @Autowired
    private UserServiceImpl userServiceImpl;

    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody User user){
        User userCreated = this.userServiceImpl.createUser(user);
        return new ResponseEntity<User>(userCreated, HttpStatus.CREATED);
    }

    // update it with UserDto
    @GetMapping("/get/{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable("id") int userId){
        UserDto userDto = this.userServiceImpl.getUser(userId);
        return new ResponseEntity<UserDto>(userDto, HttpStatus.OK);
    }
}
