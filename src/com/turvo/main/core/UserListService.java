package com.turvo.main.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.RedisConnectionFailureException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(noRollbackFor = {RedisConnectionFailureException.class})
public class UserListService {

    @Autowired
    RedisService redisService;

    public void users(){
        redisService.save();
    }

}
