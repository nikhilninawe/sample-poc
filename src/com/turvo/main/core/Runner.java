package com.turvo.main.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Runner {

    @Autowired
    TestService testService;

    @PostConstruct
    public void init(){
    }
}
