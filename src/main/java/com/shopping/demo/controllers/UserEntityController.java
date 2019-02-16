package com.shopping.demo.controllers;

import com.shopping.demo.data.entity.UserEntity;
import com.shopping.demo.data.repository.UserEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserEntityController {
    private UserEntityRepository userEntityRepository;

    @Autowired
    public UserEntityController(UserEntityRepository userEntityRepository){
        this.userEntityRepository = userEntityRepository;
    }

    @GetMapping("/")
    public @ResponseBody List<UserEntity> allUser(){
        return userEntityRepository.findAll();
    }
}
