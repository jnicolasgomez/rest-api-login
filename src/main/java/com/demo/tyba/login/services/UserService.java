package com.demo.tyba.login.services;

import com.demo.tyba.login.models.Transaction;
import com.demo.tyba.login.models.User;

import java.util.List;

public interface UserService {

    User getUserByUserName(String userName);

    User createUser(User newUser);
    List<Transaction> getTransactionsByUserName(String userName);
}
