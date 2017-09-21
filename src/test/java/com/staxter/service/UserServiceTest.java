package com.staxter.service;

import com.staxter.model.User;
import com.staxter.repository.UserRepository;
import com.staxter.service.Exception.UserAlreadyExistsException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @Test
    public void saveUser() throws UserAlreadyExistsException {
        User user = new User();
        user.setFirstName("FirstName");
        user.setLastName("LastName");
        user.setUserName("UserName");
        userService.createUser(user);
        assertTrue(userRepository.findOne(1L).equals(user));
    }
}
