package com.spring.mysqldemo;

import org.springframework.data.repository.CrudRepository;

import com.spring.mysqldemo.User;

public interface UserRepository extends CrudRepository<User, Integer> {
}
