package com.example.userService.service;

import com.example.userService.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService{

    List<User> list =List.of(
            new User(1211L,"Mahesh","7030355040"),
             new User(1311L,"Sai","9284905884"),
            new User(1411L,"KK","8975056434")
    );
    @Override
    public User getuser(Long Id) {
        return this.list.stream().filter(user -> user.getUserId().equals(Id)).findAny().orElse(null);
    }
}
