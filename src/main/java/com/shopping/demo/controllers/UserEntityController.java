package com.shopping.demo.controllers;

import com.shopping.demo.data.entity.UserEntity;
import com.shopping.demo.data.repository.UserEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/users")
public class UserEntityController {
//    PageRequest page = PageRequest.of(0, 1, Sort.by(""));
    private UserEntityRepository userEntityRepository;

    @Autowired
    public UserEntityController(UserEntityRepository userEntityRepository){
        this.userEntityRepository = userEntityRepository;
    }

    //testing api end point
    //get all users information
    @GetMapping("/")
    public List<UserEntity> allUser(){
        return userEntityRepository.findAll();
    }

    //api for getting user by email using pathVariable
    @GetMapping("/{email}")
    public UserEntity findUserEntityByEmail(@PathVariable String email){
        return userEntityRepository.findByUserEntityEmail(email);
    }

    //api for getting userEntity by name by using RequestParam
    @GetMapping
    public UserEntity findUserEntityByName(@RequestParam(value="name") String name){
        return userEntityRepository.findByUserEntityName(name);
    }

    //creating user
    @PostMapping
    public String createNewUserEntity(
                                    @RequestParam(value="email") String email,
                                    @RequestParam(value="name") String name) {
        UserEntity newUserEntity = new UserEntity(name, email);
        userEntityRepository.save(newUserEntity);
        return "Looks good please check data at database";
    }


}
