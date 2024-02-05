package com.prottoy.springDataJpa.repository;

import com.prottoy.springDataJpa.entity.User;
import com.prottoy.springDataJpa.userDTO.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

    List<User> findAll();

}
