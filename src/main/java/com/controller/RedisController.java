package com.controller;

import com.pojo.IMoocJSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private StringRedisTemplate strRedis;

    @RequestMapping("/redisSave")
    public IMoocJSONResult setRedisValue(){
        strRedis.opsForValue().set("mycache","我的第一个reis-cache");
        return IMoocJSONResult.ok("Redis--save--");

    }
}
