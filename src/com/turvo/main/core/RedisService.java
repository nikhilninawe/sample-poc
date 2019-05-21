package com.turvo.main.core;

import com.arl.saahas.api.configuration.vo.LookupObject;
import com.google.common.graph.GraphBuilder;
import com.google.common.graph.MutableGraph;
import io.lettuce.core.RedisConnectionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.RedisConnectionFailureException;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.net.SocketException;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@Service
//@Transactional(noRollbackFor = {RedisConnectionFailureException.class})
public class RedisService {

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    RedisCacheManager cacheManager;

    @PostConstruct
    public void init(){
        Object object = redisTemplate.opsForValue().get("LOOKUP|BY_KEY|33300");
        System.out.println("Old " + object);
//        redisTemplate.opsForHash().put("insert", "lookups", new Date());
//        object = redisTemplate.opsForHash().get("insert", "lookups");
//        System.out.println("New " + object);
//        System.out.println("Size " + keys.size());

//        int[] keys = {100161, 100160, 100163, 100162, 100165, 131590, 100164, 131591, 100167, 100166, 100169, 100168, 131592, 100173, 103085, 100172, 103084, 142741, 124574};
//        MutableGraph<String> mutableStatusKeysTopologicalGraph = GraphBuilder.directed().build();
//        for(int i=0; i<keys.length; i++) {
////            System.out.println(keys[i]);
//            System.out.println(((LookupObject)redisTemplate.opsForValue().get("LOOKUP|" + keys[i])));
//            mutableStatusKeysTopologicalGraph.addNode(((LookupObject)redisTemplate.opsForValue().get("LOOKUP|" + keys[i])).getKey());
//        }
//        Set<String> statusNodes = mutableStatusKeysTopologicalGraph.nodes();


//        statusLookups.remove(116038L);
//        statusLookups.remove(120697L);
//        statusLookups.remove(120699L);
//        statusLookups.remove(120698L);
//        statusLookups.remove(100533L);
//        redisTemplate.opsForValue().set("LOOKUP|BY_TYPE|ShipmentStatus", statusLookups);
//        System.out.println(statusLookups);
    }

    public void save(){
//        redisTemplate.opsForValue().set("test:cardFieldsCache:getCardFields:[2],58,details", "Howdy " + System.currentTimeMillis());
    }

    @Cacheable(value = "cardFieldsCache", keyGenerator = "toStringCacheKeyGenerator", cacheManager = "redisCacheManager")
    public HashMap<String, Object> getCardFields(List<Long> busFormIds,
                                                 long appId, String card) {
//        System.out.println("Going inside");
//        HashMap<String, Object> result = new HashMap<>();
//        result.put("Time", System.currentTimeMillis());
        return null;
    }
}
