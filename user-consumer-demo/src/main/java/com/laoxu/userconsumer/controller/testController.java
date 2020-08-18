package com.laoxu.userconsumer.controller;

import com.laoxu.userconsumer.dao.UserDao;
import com.laoxu.userconsumer.entity.User;
import com.laoxu.userconsumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class testController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public User test(){
        return userDao.queryUserById(1L);
    }

    @GetMapping("/test2")
    public List<User> test2(@RequestParam("ids") List<Long> ids){
        return userService.queryUserByIds(ids);
    }
}
