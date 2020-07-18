package com.demo.tyba.login.services;

import com.demo.tyba.login.models.Transaction;
import com.demo.tyba.login.models.User;
import com.demo.tyba.login.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepo;

    @Override
    public User getUserByUserName(String userName) {
        User user = null;
        try {
            user = userRepo.findByUserName(userName.toLowerCase());
        } catch (Exception e) {
            Logger.getLogger(UserServiceImpl.class.getName()).log(Level.SEVERE, "UserServiceImpl, getUserByUserName, param: " + userName);
        }
        return user;
    }


    @Override
    public User createUser(User newUser) {
        String userName = newUser.getUserName();
        userRepo.saveUser(newUser);
        return newUser;
    }

    @Override
    public List<Transaction> getTransactionsByUserName(String userName) {
        List<Transaction> transactions = null;
        try {
            transactions = userRepo.getTransactionHistory(userName.toLowerCase());
        } catch (Exception e) {
            Logger.getLogger(UserServiceImpl.class.getName()).log(Level.SEVERE, "UserServiceImpl, getTransactionsByUserName, param: " + userName);
        }
        return transactions;
    }
}
