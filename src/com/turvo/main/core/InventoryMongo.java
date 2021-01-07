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
import java.util.List;

@Component
public class InventoryMongo {


    public void get_inventory(){
        BasicDBObject searchQuery = new BasicDBObject();
        BasicDBList conditions = new BasicDBList();
        BasicDBObject customerCondition = new BasicDBObject();
        customerCondition.put("indexed_attributes.busId", 8318);
        customerCondition.put("indexed_attributes.key", "customer.id");
        customerCondition.put("indexed_attributes.value", 2966403);
        conditions.add(customerCondition);

        BasicDBObject locationCondition = new BasicDBObject();
        locationCondition.put("indexed_attributes.busId", 8318);
        locationCondition.put("indexed_attributes.key", "location.id");
        locationCondition.put("indexed_attributes.value", 2212989);
        conditions.add(locationCondition);

        searchQuery.put("$and", conditions);
        BasicDBObject projects = new BasicDBObject();
        projects.put("inventory_id", 1);
        FindIterable<Document> documents=  mongoClient().getDatabase("turvo")
                .getCollection("inventoryFormFieldData")
                .find(searchQuery)
                .projection(projects)
                ;
        MongoCursor cursor = documents.iterator();
        ArrayList<String> ids = new ArrayList<>();
        while (cursor.hasNext()){
            Document next = (Document) cursor.next();
            ids.add(("\"" + next.get("inventory_id").toString() + "\""));
        }
        File f = new File("inventory_ids.txt");
        try {
            FileUtils.writeStringToFile(f, ids.toString());
        }catch (Exception ex){

        }
    }

    public void get_inventory_summary_ids(){
        BasicDBObject searchQuery = new BasicDBObject();
        BasicDBList conditions = new BasicDBList();
        BasicDBObject customerCondition = new BasicDBObject();
        customerCondition.put("indexed_attributes.busId", 8318);
        customerCondition.put("indexed_attributes.key", "customer.id");
        customerCondition.put("indexed_attributes.value", 2966403);
        conditions.add(customerCondition);

        BasicDBObject locationCondition = new BasicDBObject();
        locationCondition.put("indexed_attributes.busId", 8318);
        locationCondition.put("indexed_attributes.key", "location.id");
        locationCondition.put("indexed_attributes.value", 2212989);
        conditions.add(locationCondition);

        searchQuery.put("$and", conditions);
        BasicDBObject projects = new BasicDBObject();
        projects.put("inventory_summary_id", 1);
        FindIterable<Document> documents=  mongoClient().getDatabase("turvo")
                .getCollection("inventorySummaryFormFieldData")
                .find(searchQuery)
                .projection(projects)
                ;
        MongoCursor cursor = documents.iterator();
        ArrayList<String> ids = new ArrayList<>();
        while (cursor.hasNext()){
            Document next = (Document) cursor.next();
            ids.add(("\"" + next.get("inventory_summary_id").toString() + "\""));
        }
        File f = new File("inventory_summary_ids.txt");
        try {
            FileUtils.writeStringToFile(f, ids.toString());
        }catch (Exception ex){

        }
    }

    public MongoClientOptions mongoClientOptions(){
        return MongoClientOptions.builder()
                .build();
    }

    MongoClient mongoClient(){
        MongoCredential mongoCredential = MongoCredential.createCredential("nikhil.n", "admin", "".toCharArray());
        MongoClient client = new MongoClient(new ServerAddress("production-analytics-mongo.turvo.net", 27017), Arrays.asList(mongoCredential), mongoClientOptions());
        return client;
    }

    public static void  main(String[] args){
        InventoryMongo poc = new InventoryMongo();
        poc.get_inventory();
        poc.get_inventory_summary_ids();
    }

}
