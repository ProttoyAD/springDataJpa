package com.prottoy.springDataJpa.repository;

import com.prottoy.springDataJpa.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<user,Integer> {

}
