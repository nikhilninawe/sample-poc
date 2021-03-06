package com.turvo.main.core;

import com.mongodb.BasicDBObject;
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
public class MongoPOC {


    public void test(){
        BasicDBObject searchQuery = new BasicDBObject();
        BasicDBObject tenant_list = new BasicDBObject();
        List<Integer> tenants = new ArrayList<>();
        tenants.add(7338);
        tenants.add(8318);
        tenant_list.put("$in", tenants);
        searchQuery.put("tenant_id", tenant_list);
        BasicDBObject list = new BasicDBObject();
//        ArrayList<Integer> x = new ArrayList<>();
//        x.add(391831);
//        x.add(395599);
//        x.add(395582);
//        x.add(537802);
//        x.add(537803);
//        list.put("$in", x);
        searchQuery.put("name", new BasicDBObject("$exists", false));
//        searchQuery.put("packages", new BasicDBObject("$exists", false));
//        searchQuery.put("active", false);
//        searchQuery.put("deleted", true);
        BasicDBObject projects = new BasicDBObject();
        projects.put("item_id", 1);
        FindIterable<Document> documents=  mongoClient().getDatabase("turvo")
                .getCollection("itemFormFieldData")
                .find(searchQuery)
                .projection(projects)
                ;
        MongoCursor cursor = documents.iterator();
        ArrayList<String> ids = new ArrayList<>();
        while (cursor.hasNext()){
            Document next = (Document) cursor.next();
            ids.add(("\"" + next.get("item_id").toString() + "\""));
        }
        File f = new File("test.txt");
        try {
            FileUtils.writeStringToFile(f, ids.toString());
        }catch (Exception ex){

        }
    }

    public void test2(){
        BasicDBObject searchQuery = new BasicDBObject();
        BasicDBObject tenant_list = new BasicDBObject();
        List<Integer> tenants = new ArrayList<>();
        tenants.add(8318);
//        tenants.add(22710);
//        tenants.add(29);
        tenant_list.put("$in", tenants);
        searchQuery.put("tenant_id", tenant_list);
        BasicDBObject list = new BasicDBObject();
        ArrayList<Integer> x = new ArrayList<>();
        x.add(391831);
//        x.add(395599);
//        x.add(395582);
//        x.add(537802);
//        x.add(537803);
//        list.put("$in", x);
        searchQuery.put("customer.values.value.id", list);
        searchQuery.put("active", false);
        searchQuery.put("deleted", true);
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
        File f = new File("test2.txt");
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
        MongoPOC poc = new MongoPOC();
//        poc.test();
        poc.test2();
    }

}
