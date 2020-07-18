package com.demo.tyba.login.repositories;

import com.demo.tyba.login.models.Transaction;
import com.demo.tyba.login.models.User;

import java.util.List;

public interface UserRepository {
    User findByUserName(String userName);
    void saveUser(User user);
    List<Transaction> getTransactionHistory(String userName);
}
