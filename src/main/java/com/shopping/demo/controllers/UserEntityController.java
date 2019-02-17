package com.shopping.demo.controllers;

import com.shopping.demo.data.entity.UserEntity;
import com.shopping.demo.data.repository.UserEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api/users")
public class UserEntityController {
    PageRequest page = PageRequest.of(0, 1, Sort.by(""));
    private UserEntityRepository userEntityRepository;

    @Autowired
    public UserEntityController(UserEntityRepository userEntityRepository){
        this.userEntityRepository = userEntityRepository;
    }

    @GetMapping("/")
    public List<UserEntity> allUser(){
        return userEntityRepository.findAll();
    }
}
