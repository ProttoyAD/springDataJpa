package com.prottoy.springDataJpa.service;

import com.prottoy.springDataJpa.entity.User;
import com.prottoy.springDataJpa.repository.UserRepository;
import com.prottoy.springDataJpa.userDTO.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<UserDTO> allUser(){
        List<User> users= userRepository.findAll();
        return users.stream().map(s->getUserDTO(s)).collect(Collectors.toList());
    }


    public UserDTO getUserDTO(User user){
        return new UserDTO(user.getUsername(),user.getId(),user.getEmail());
    }


    public void addUser(List<User> user){
        userRepository.saveAll(user);
    }

}
