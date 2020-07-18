package com.demo.tyba.login.controllers;

import com.demo.tyba.login.models.JwtToken;
import com.demo.tyba.login.models.User;
import com.demo.tyba.login.services.UserService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import java.util.Date;

@RestController
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
        String jwtToken;
        String name = user.getUserName();
        String password = user.getPassword();
        User userData = userService.getUserByUserName(name);
        if (userData == null){
            return new ResponseEntity<>("Wrong credentials", HttpStatus.FORBIDDEN);
        }

        String pwd = userData.getPassword();
        if (!password.equals(pwd)) {
            return new ResponseEntity<>("Wrong credentials", HttpStatus.FORBIDDEN);
        }
        jwtToken = Jwts.builder().setSubject(name).claim("roles", "user").setIssuedAt(new Date()).signWith(
                SignatureAlgorithm.HS256, "secretkey").compact();

        return new ResponseEntity<>(new JwtToken(jwtToken), HttpStatus.OK);

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
