package com.demo.tyba.login.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/restaurant/")
public class RestaurantController {
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> controllersPostRestaurant(){
        return null;
    }
}
