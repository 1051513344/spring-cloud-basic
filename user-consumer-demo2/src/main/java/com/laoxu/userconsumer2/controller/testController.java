package com.laoxu.userconsumer2.controller;

import com.laoxu.userconsumer2.dao.UserDao;
import com.laoxu.userconsumer2.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/test")
    public User test(){
        return userDao.queryUserById(1L);
    }


}
