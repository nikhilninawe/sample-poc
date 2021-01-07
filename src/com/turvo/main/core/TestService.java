package com.turvo.main.core;

import com.turvo.main.repository.UserRepository;
import io.lettuce.core.RedisConnectionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.RedisConnectionFailureException;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.TimeToLive;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.net.SocketException;

@Service
@Transactional
public class TestService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserListService listService;

    @Autowired
    EntityUpdater entityUpdater;

    public String test () {
        User n = new User();
        n.setFirst_name("Nikhil");
        n.setUser_name("nikhil@turvo.com");
        userRepository.save(n);
        try {
            entityUpdater.callService();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Saved");
        return "Saved";
    }
}
