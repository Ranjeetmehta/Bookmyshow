package com.example.bookmyshow.Controllers;


import com.example.bookmyshow.Dtos.RequestDto.AddUserDto;
import com.example.bookmyshow.Dtos.ResponseDtos.UserResponseDto;
import com.example.bookmyshow.Services.UserServices;

@RestController
@RequestMapping("/user")

public class UserController {

    @Autowired
    UserServices userServices;

    @PostMapping("/add")
    public String addUser(@RequestBody AddUserDto user) {
        try {
            String result = userServices.addUser(user);
            return result;
        } catch (Exception e) {
            return e.getMessage();
        }

    }

    //get oldest user object by age
    @GetMapping("/getOlderUser")
    public UserResponseDto getOldestuser() {
        try {
            UserResponseDto userResponseDto = userServices.getOldestUser();
            userResponseDto.setStatusCode("200");
            userResponseDto.setStatusMessage("Sucess");
            return userResponseDto;
        } catch (Exception e) {
            userResponseDto responseDto = new UserResponseDto();
            ResponseDto.setStatusCode("500");
            ResponseDto.setStatusMessage("FAILURE");
            return responseDto;
        }
    }
    @GetMapping("/findUsersGreaterThanAge")
    public List<User> getAllUsers(@RequestParam("age")Integer age){
        return userServices.getAllUserGreaterThan(age);
    }
}