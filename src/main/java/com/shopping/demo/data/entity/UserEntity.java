package com.shopping.demo.data.entity;

import javax.persistence.*;

@Entity
@Table(name="USER_ENTITY")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_entity_id")
    private Integer userEntityId;

    @Column(name = "user_entity_name", nullable = false, length = 20)
    private String userEntityName;

    @Column(name = "user_entity_email", nullable = false, length = 50)
    private String userEntityEmail;

    public UserEntity(){}

    public UserEntity(String name, String email) {
        this.userEntityName = name;
        this.userEntityEmail = email;
    }

    public Integer getUserEntityId() {
        return userEntityId;
    }

    public String getUserEntityName() {
        return userEntityName;
    }

    public String getUserEntityEmail() {
        return userEntityEmail;
    }
}