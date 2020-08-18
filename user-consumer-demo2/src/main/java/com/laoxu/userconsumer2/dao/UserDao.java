package com.laoxu.userconsumer2.dao;

import com.laoxu.userconsumer2.client.UserFeignClient;
import com.laoxu.userconsumer2.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDao {

    @Autowired
    private UserFeignClient userFeignClient;

    public User queryUserById(Long id){
        long begin = System.currentTimeMillis();

        User user = userFeignClient.queryUserById(id);

        long end = System.currentTimeMillis();
        System.out.println("用时:"+(begin-end));

        return user;
    }

}
