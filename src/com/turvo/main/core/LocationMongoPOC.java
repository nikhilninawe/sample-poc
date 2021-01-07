package com.turvo.main.core;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCursor;
import org.apache.commons.io.FileUtils;
import org.bson.Document;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Component
public class LocationMongoPOC {


    public void test(){
        BasicDBObject searchQuery = new BasicDBObject();
        searchQuery.put("value.locationId", 3526401);
        FindIterable<Document> documents=  mongoClient().getDatabase("turvo")
                .getCollection("locationValues")
                .find(searchQuery)
//                .projection(projects)
                ;
        MongoCursor cursor = documents.iterator();
        ArrayList<String> ids = new ArrayList<>();
        while (cursor.hasNext()){
            Document next = (Document) cursor.next();
            System.out.println(next.get("value"));
        }

    }

    public MongoClientOptions mongoClientOptions(){
        return MongoClientOptions.builder()
//                .socketTimeout(100)
                .build();
    }

    MongoClient mongoClient(){
        MongoCredential mongoCredential = MongoCredential.createCredential("nikhil.n", "admin", "".toCharArray());
        MongoClient client = new MongoClient(new ServerAddress("production-analytics-mongo.turvo.net", 27017), Arrays.asList(mongoCredential), mongoClientOptions());
        return client;
    }

    public static void  main(String[] args){
        LocationMongoPOC poc = new LocationMongoPOC();
        poc.test();
    }

}
