package com.staxter.repository;

import com.staxter.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsUserByUserName(String userName);
}
