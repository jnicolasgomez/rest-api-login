package com.demo.tyba.login.repositories;

import com.demo.tyba.login.models.Transaction;
import com.demo.tyba.login.models.User;
import org.springframework.stereotype.Service;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserRepositoryMock implements UserRepository{
    List<User> users = new ArrayList<>();

    public UserRepositoryMock() {
        User u1 = new User("123","user1");
        Transaction t1 = new Transaction(130000f, "retiro", new Date());
        Transaction t2 = new Transaction(15000f, "retiro", new Date());
        Transaction t3 = new Transaction(600000f, "consignacion", new Date());
        List<Transaction> trans = new ArrayList<>();
        trans.add(t1);
        trans.add(t2);
        trans.add(t3);
        u1.setTransactionHistory(trans);
        users.add(u1);
        User u2 = new User("123","user2");
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

    @Override
    public List<Transaction> getTransactionHistory(String userName) {
        User user = findByUserName(userName);
        return user.getTransactionHistory();
    }
}
