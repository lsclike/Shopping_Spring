package com.shopping.demo.data.repository;

import com.shopping.demo.data.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserEntityRepository extends JpaRepository<UserEntity, Integer> {
    UserEntity findByUserEntityEmail(String userEntityEmail);
    UserEntity findByUserEntityName(String userEntityName);
}
