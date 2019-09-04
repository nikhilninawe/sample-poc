package com.turvo.main.core;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.turvo.*;

@Component
public class RedisCacheAnnotation {

    public static String[] hashtags = {"delivery-count-v2"};

    @Cacheable(condition = "#hashTagMap.get('name').equals('total_shipments_mongo')", value = "total_shipments_mongo", key = "#parameters.get('busId').toString() + '-' + #parameters.get('shipment_groups')")
    public String getValue(HashMap<String, Object> hashTagMap, Map<String, Object> parameters){
        System.out.println("Inside");
        return "text";
    }

    @Cacheable(condition = "@redisCacheAnnotation.hashtags.contains(#hashTagMap.get('name'))", value = "total_shipments_mongo", key = "#parameters.get('busId').toString() + '-' + #parameters.get('shipment_groups')")
    public String getValueMySQL(HashMap<String, Object> hashTagMap, Map<String, Object> parameters){
        System.out.println("Inside");
        return "text";
    }


}
