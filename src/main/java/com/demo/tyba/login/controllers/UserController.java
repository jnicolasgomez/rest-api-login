package com.demo.tyba.login.controllers;

import com.demo.tyba.login.models.Transaction;
import com.demo.tyba.login.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/api/user/")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/history/", method = RequestMethod.GET)
    public ResponseEntity<?> controllerGetTransactionHistory(){
        //TODO: implemente jwt token filter
        List<Transaction> transactions = userService.getTransactionsByUserName("user1");
        return new ResponseEntity<>(transactions, HttpStatus.ACCEPTED);
    }
}
