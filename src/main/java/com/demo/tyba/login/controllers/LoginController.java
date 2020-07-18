package com.demo.tyba.login.controllers;

import com.demo.tyba.login.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/login/")
public class LoginController {

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> controllersPostCoupon(@RequestBody User user){


    }

}
