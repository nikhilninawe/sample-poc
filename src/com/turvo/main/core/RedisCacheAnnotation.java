package com.turvo.main.core;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class RedisCacheAnnotation {

    @Cacheable(condition = "#hashTagMap.get('name').equals('total_shipments_mongo')", value = "total_shipments_mongo", key = "#parameters.get('busId').toString() + '-' + #parameters.get('shipment_groups')")
    public String getValue(HashMap<String, Object> hashTagMap, Map<String, Object> parameters){
        System.out.println("Inside");
        return "text";
    }
}
