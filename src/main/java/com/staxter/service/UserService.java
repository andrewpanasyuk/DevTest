package com.staxter.service;

import com.staxter.model.User;
import com.staxter.service.Exception.UserAlreadyExistsException;

import java.util.List;

public interface UserService {

    User createUser(User user) throws UserAlreadyExistsException;

    List<User>findAll();

}
