package com.training.springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.springbootdemo.model.User;

public interface HomeRepository extends JpaRepository<User, Integer> {

}
