package com.turvo.main.core;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.bulk.UpdateRequest;
import com.mongodb.client.model.UpdateOptions;
import com.mongodb.client.result.UpdateResult;
import com.turvo.main.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.Date;

@Component
public class MongoPOC {


    public void test(){
        BasicDBObject searchQuery = new BasicDBObject();
        BasicDBObject newDocument = new BasicDBObject();
        newDocument.append("$set",
                new BasicDBObject().append("clients", Math.random()));
        UpdateOptions options = new UpdateOptions();
        options.upsert(true);
        UpdateResult updateResult = mongoClient().getDatabase("turvo").getCollection("test").updateOne(searchQuery, newDocument, options);
        System.out.println(updateResult.wasAcknowledged());
        System.out.println("Save successful to mongo " + updateResult);
    }

    public MongoClientOptions mongoClientOptions(){
        return MongoClientOptions.builder()
//                .socketTimeout(100)
                .build();
    }

    MongoClient mongoClient(){
        MongoCredential mongoCredential = MongoCredential.createCredential("nikhil.n", "admin", "r!chCamp67".toCharArray());
        MongoClient client = new MongoClient(new ServerAddress("union-mongo-01.turvo.net", 27017), Arrays.asList(mongoCredential), mongoClientOptions());
        return client;
    }

    public static void  main(String[] args){
        MongoPOC poc = new MongoPOC();
        poc.test();
    }

}
