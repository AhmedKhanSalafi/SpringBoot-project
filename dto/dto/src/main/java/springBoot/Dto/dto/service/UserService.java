package springBoot.Dto.dto.service;

import springBoot.Dto.dto.dto.UserDto;
import springBoot.Dto.dto.entity.User;

public interface UserService {

    public User createUser(User user);


    // updated it with UserDto

    public UserDto getUser(int userId);
}
