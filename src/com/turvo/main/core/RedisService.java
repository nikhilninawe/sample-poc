package com.turvo.main.core;

import com.arl.saahas.api.configuration.vo.LookupObject;
import com.arl.saahas.redis.RedisUserVO;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.graph.GraphBuilder;
import com.google.common.graph.MutableGraph;
import io.lettuce.core.RedisConnectionException;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.aspectj.util.FileUtil;
import org.github.jamm.MemoryMeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.RedisConnectionFailureException;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;

import javax.annotation.PostConstruct;
import java.io.File;
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
    private static final String DEFAULT_USER_VIEWABLE_GROUP_KEY = "UserViewableGroup";
    String dummyVar = "";
    String contextSnapshot = dummyVar + "";

    @PostConstruct
    public void init() throws Exception{
//        Integer[] keys = {341479, 341575, 341478, 3557986, 341133, 493903, 341132, 493594, 341131};
//        for(Integer k : Arrays.asList(keys)){
//            System.out.println(k);
//            Object object = redisTemplate.opsForValue().get("LOOKUP|" + k);
//            System.out.println(object);
//        }
        Object object = redisTemplate.opsForValue().get("LOOKUP|136032");
//        boolean delete = redisTemplate.delete("APPOINTMENT||SCHEDULING_INFO|8318|2966420");
        System.out.println(object);
//        object = redisTemplate.opsForValue().get("LOOKUP|9195|globaldata.location.ingestion");
//        System.out.println(object);

//        Object object = redisTemplate.opsForValue().get("485_delivery_location_link_full");
//        System.out.println("Old " + object);
//        redisTemplate.delete("485_delivery_location_link_full");
//        RedisUserVO redisGroupVO = (RedisUserVO) redisTemplate.opsForHash()
//                .get("UserViewableGroup" + 485, 115081L);
//        System.out.println("Viewable groups " + redisGroupVO);
//        redisTemplate.opsForHash()
//                .delete("users" + 485, 11216L);
//        redisGroupVO = (RedisUserVO) redisTemplate.opsForHash()
//                .get("users" + 485, 11216L);
//        System.out.println("Viewable groups " + redisGroupVO);
//        System.out.println("Date is " + redisTemplate.opsForHash().get("insert", "lookups"));
//        System.out.println("Value " + object.getValue());
//        MemoryMeter meter = new MemoryMeter();
//        ObjectMapper mapper = new ObjectMapper();
//        Event x = mapper.readValue(FileUtil.readAsString(new File("/Users/nikhil.n/workspace/sample-poc/src/main/resources/context.txt")), Event.class);
//        System.out.println("memory " + meter.measureDeep(x));
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
        throw new RuntimeException("test");
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
