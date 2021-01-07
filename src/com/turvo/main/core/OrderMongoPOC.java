package com.turvo.main.core;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.bulk.UpdateRequest;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.UpdateOptions;
import com.mongodb.client.result.UpdateResult;
import com.turvo.main.domain.Person;
import org.apache.commons.io.FileUtils;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.print.Doc;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Component
public class OrderMongoPOC {


    public void test(){
        BasicDBObject searchQuery = new BasicDBObject();
        BasicDBObject tenant_list = new BasicDBObject();
        List<Integer> tenants = new ArrayList<>();
        tenants.add(8318);
        tenant_list.put("$in", tenants);
        searchQuery.put("tenant_id", tenant_list);
        BasicDBObject list = new BasicDBObject();
        ArrayList<Integer> x = new ArrayList<>();
        x.add(2902181);
        x.add(2902182);
        x.add(2902183);
        list.put("$in", x);
        BasicDBObject destination = new BasicDBObject("destination.location.id", 1477518 );
        BasicDBObject origin = new BasicDBObject("origin.location.id", 1477518);
        BasicDBList or = new BasicDBList();
        or.add(origin);
        or.add(destination);
        searchQuery.put("phase.id", list);
        searchQuery.put("$or", or);
        searchQuery.put("groups", new BasicDBObject("$ne", 92440 ));
        searchQuery.put("date", new BasicDBObject("$lte", new Date()));
        searchQuery.put("active", true);
        searchQuery.put("deleted", false);
        BasicDBObject projects = new BasicDBObject();
        projects.put("order_id", 1);
        FindIterable<Document> documents=  mongoClient().getDatabase("turvo")
                .getCollection("orderFormFieldData")
                .find(searchQuery)
                .projection(projects)
                ;
        MongoCursor cursor = documents.iterator();
        ArrayList<String> ids = new ArrayList<>();
        while (cursor.hasNext()){
            Document next = (Document) cursor.next();
            ids.add(("\"" + next.get("order_id").toString() + "\""));
        }
        File f = new File("test.txt");
        try {
            FileUtils.writeStringToFile(f, ids.toString());
        }catch (Exception ex){

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
        OrderMongoPOC poc = new OrderMongoPOC();
        poc.test();
    }

}
