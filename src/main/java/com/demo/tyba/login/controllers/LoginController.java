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
    @RequestMapping(value = "/login/", method = RequestMethod.POST)
    public ResponseEntity<?> login(@RequestBody User user) throws ServletException {
        //TODO: implement jwt token
        String jwtToken = "";
        String name = user.getUserName();
        String password = user.getPassword();
        User userData = userService.getUserByUserName(name);
        if (userData == null){
            return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
        }

        String pwd = userData.getPassword();
        if (!password.equals(pwd)) {
            throw new ServletException("Invalid login. Please check your name and password.");
        }
        return new ResponseEntity<>(jwtToken, HttpStatus.OK);

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
