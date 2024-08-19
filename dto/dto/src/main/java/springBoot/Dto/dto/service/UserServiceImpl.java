package springBoot.Dto.dto.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springBoot.Dto.dto.dto.UserDto;
import springBoot.Dto.dto.entity.User;
import springBoot.Dto.dto.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;
//update with model mapper
    @Autowired
    private ModelMapper modelMapper;


    @Override
    public User createUser(User user) {
        User userSavedToDB = this.userRepository.save(user);
        return userSavedToDB;
    }

    // update it with UserDto
    @Override
    public UserDto getUser(int userId) {
        User user = this.userRepository.findById(userId).get();
        UserDto userDto = this.modelMapper.map(user, UserDto.class);
        return userDto;
    }
    }


