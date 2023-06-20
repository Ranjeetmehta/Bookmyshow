package com.example.bookmyshow.Services;


import com.example.bookmyshow.Dtos.RequestDto.AddUserDto;
import com.example.bookmyshow.Dtos.ResponseDtos.UserResponseDto;
import com.example.bookmyshow.Exception.NoUserFoundException;
import com.example.bookmyshow.Models.User;
import com.example.bookmyshow.Repository.UserRepository;

import java.util.List;

@Service
public class UserServices {

    @Autowired
    UserRepository userRepository;
public String addUser(AddUserDto userDto){
User user =userTranformer.convertDtoToEntity(userDto);

userRepository.save(user);
return "User has been added sucessfull";
}
public UserResponseDto getOldestUser()throws NoUserFoundException {
    List<User> users=userRepository.findAll();
    int maxAge=0;
    User userAns=null;
    for(User user:users){
        if(user.getAge()>maxAge){
        maxAge=user.getAge();
        userAns=user;

        }
    }

if(userAns==null){
    throws new NoUserFoundException("No user found ");
}

    userResponseDto userRespoTransformer.convertEntitytoDto(userAns);
    return userResponseDto;
}
public List<User> getAllUserGreaterThan(Integer age){
 List<User> users =userRepository.findUserWithAgeGreater(age);
 return users;

}
}
