package com.demo.tyba.login.controllers;

import com.demo.tyba.login.models.User;
import com.demo.tyba.login.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;

@RestController
@RequestMapping(value = "/api/")

@CrossOrigin(origins = "*")
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> controllerGetOrders(){
        return new ResponseEntity<>("Hello World", HttpStatus.ACCEPTED);
    }
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> controllersPostCoupon(@RequestBody User user){


    }

    @RequestMapping(value = "/register/", method = RequestMethod.POST)
    public void register(@RequestBody User user) throws ServletException {
        if ( user.getPassword() != null && user.getUserName() != null) {
            try {
                userService.createUser(user);
            } catch (Exception e) {
                throw new ServletException("Invalid data while creating user");
            }
        }

    }
}
