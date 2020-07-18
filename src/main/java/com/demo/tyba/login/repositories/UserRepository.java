package com.demo.tyba.login.repositories;

import com.demo.tyba.login.models.User;

public interface UserRepository {
    User findByUserName(String userName);
    void saveUser(User user);
}
