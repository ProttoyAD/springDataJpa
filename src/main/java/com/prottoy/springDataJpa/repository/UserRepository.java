package com.prottoy.springDataJpa.repository;

import com.prottoy.springDataJpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
