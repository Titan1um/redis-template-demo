package com.jun.redisdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {
    @Autowired
    private RedisUtil2 redisUtil2;

    @GetMapping("set")
    public String set(String key, String value) {
        redisUtil2.set(key, value);
        return "success";
    }

    @GetMapping("get")
    public String get(String key) {
        return (String) redisUtil2.get(key);
    }

    @GetMapping("set-user")
    public String setUser(String name, String id, int age) {
        User user = new User(name, id, age);
        redisUtil2.set(name, user);
        return "success";
    }

    @GetMapping("get-user")
    public Object getUser(String name) {
        User user = (User) redisUtil2.get(name);
        return user;
    }
}