package com.user.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.demo.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{

	

}
