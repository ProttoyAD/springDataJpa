package com.prottoy.springDataJpa.controller;


import com.prottoy.springDataJpa.entity.User;
import com.prottoy.springDataJpa.service.UserService;
import com.prottoy.springDataJpa.userDTO.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping(name = "UserController",value = "/api")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "get-all")
    public List<UserDTO> getAll(){
        return userService.allUser();
    }


    @GetMapping("add-all")
    public void addAll(){
        User user=new User();
        user.setUsername("prottoy");
        user.setEmail("protoyadhusher@gmail.com");

        User user2=new User();
        user2.setUsername("dhusher");
        user2.setEmail("dhusher@gmail.com");

        User user3=new User();
        user3.setUsername("prottoy001");
        user3.setEmail("protoyadhusher@gmail.com");

        User user4=new User();
        user4.setUsername("dhusher001");
        user4.setEmail("dhusher@gmail.com");


        userService.addUser(List.of(user,user2,user3,user4));
    }
}
