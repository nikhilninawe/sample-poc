package com.turvo.main.controller;

import com.turvo.connect.service.IReconciliator;
import com.turvo.main.core.RedisCacheAnnotation;
import com.turvo.main.core.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

@RestController
public class MainController {

    @Autowired
    RedisService redisService;

    @Autowired
    RedisCacheAnnotation redisCacheAnnotation;

    @Autowired
    IReconciliator iReconciliator;

    @RequestMapping("/test")
    public void call(){
        List<Long> busFormIds = new ArrayList<>();
        busFormIds.add(3l);
        System.out.println(redisService.getCardFields(busFormIds,58,"details"));
    }

    @RequestMapping(("/cache"))
    public String getCache(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "delivery-count-v2");

        HashMap<String, Object> parameters = new HashMap<>();
        parameters.put("busId", 100);
        List<Long> groups = new ArrayList<>();
        groups.add(1l);
        groups.add(23l);
        parameters.put("shipment_groups", groups);
//        return redisCacheAnnotation.getValue(map, parameters);
        return redisCacheAnnotation.getValueMySQL(map, parameters);
    }

    @RequestMapping("/aop")
    public String testAOP(){
        iReconciliator.reconciliateRequest(null);
        return "OK";
    }
}
