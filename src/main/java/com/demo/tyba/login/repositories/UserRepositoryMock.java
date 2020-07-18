package com.demo.tyba.login.repositories;

import com.demo.tyba.login.models.User;
import org.springframework.stereotype.Service;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserRepositoryMock implements UserRepository{
    List<User> users = new ArrayList<>();

    public UserRepositoryMock() {
        User u1 = new User("123","user1");
        User u2 = new User("123","user2");
        users.add(u1);
        users.add(u2);
    }

    @Override
    public User findByUserName(String userName) {
        for (User user : users){
            if (user.getUserName().equals(userName)){
                return user;
            }
        }
        return null;
    }

    @Override
    public void saveUser(User user) {
        users.add(user);
        System.out.println(users.toString());
    }
}
