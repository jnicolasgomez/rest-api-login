package com.demo.tyba.login.services;

import com.demo.tyba.login.models.User;

public interface UserService {

    User getUserByUserName(String userName);

    User createUser(User newUser);
}
