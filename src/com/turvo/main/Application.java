package com.turvo.main;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.turvo.main.core.Receiver;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCacheWriter;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

@SpringBootApplication(scanBasePackages = "com.turvo.main")
@EnableWebMvc
@EnableCaching
@EnableAspectJAutoProxy
public class Application {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Application.class);

    @Bean
    RedisMessageListenerContainer container(RedisConnectionFactory connectionFactory,
                                            MessageListenerAdapter listenerAdapter) {

        RedisMessageListenerContainer container = new RedisMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);
        container.addMessageListener(listenerAdapter, new PatternTopic("chat"));

        return container;
    }

    @Bean
    MessageListenerAdapter listenerAdapter(Receiver receiver) {
        return new MessageListenerAdapter(receiver, "receiveMessage");
    }

    @Bean
    Receiver receiver(CountDownLatch latch) {
        return new Receiver(latch);
    }

    @Bean
    CountDownLatch latch() {
        return new CountDownLatch(1);
    }


    @Bean
    RedisTemplate<String, String> template() {
        RedisTemplate x =  new RedisTemplate();
        x.setConnectionFactory(jedisConnectionFactory());
        return x;
    }

    @Bean
    RedisConnectionFactory jedisConnectionFactory() {
        JedisConnectionFactory jedisConFactory
                = new JedisConnectionFactory();
//        jedisConFactory.setHostName("dev-turvo-sandbox-db.turvo.net");
//        jedisConFactory.setHostName("production-cache-02.os5iek.ng.0001.usw2.cache.amazonaws.com");
//        jedisConFactory.setHostName("rehearsal-cache-01-001.os5iek.0001.usw2.cache.amazonaws.com");
//        jedisConFactory.setPort(6379);
//        jedisConFactory.setHostName("union-platform-cache.turvo.net");
        jedisConFactory.setHostName("union-cache-01-001.os5iek.0001.usw2.cache.amazonaws.com");
        return jedisConFactory;
    }

    @Bean
    RedisCacheManager redisCacheManager(){
        RedisCacheConfiguration configuration = RedisCacheConfiguration.defaultCacheConfig().entryTtl(Duration.ofSeconds(10));
        RedisCacheManager manager = new RedisCacheManager(RedisCacheWriter.nonLockingRedisCacheWriter(jedisConnectionFactory()),
                configuration);
        return manager;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
//        template.opsForValue().set("test", "howdy");
    }

    @Bean
    public MongoClientOptions mongoClientOptions(){
       return MongoClientOptions.builder()
               .socketTimeout(100)
               .build();
    }

    @Bean
    MongoClient mongoClient(){
        MongoCredential mongoCredential = MongoCredential.createCredential("nikhil.n", "admin", "r!chCamp67".toCharArray());
        MongoClient client = new MongoClient(new ServerAddress("production-analytics-mongo.turvo.net", 27017), Arrays.asList(mongoCredential), mongoClientOptions());
        return client;
    }
}
