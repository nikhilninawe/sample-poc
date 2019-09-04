package com.turvo.main.core;

import com.google.gson.Gson;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class SUP5277 {

    public static void main(String[] args) throws Exception{
        OkHttpClient client = new OkHttpClient();

        Map<String, String> userPass = new HashMap<>();
        List<String> auths = new ArrayList<>();
        userPass.put("sup5277-4@gmail.com", "welcome123");
        userPass.put("sup5277-1@gmail.com", "Temp@123");
        userPass.put("sup5277-2@gmail.com", "welcome123");
        userPass.put("sup5277-3@gmail.com", "welcome123");
        userPass.put("nikhil-sup@turvo.com", "welcome123");
        userPass.put("nikhil@turvo.com", "welcome123");

        List<NameValuePair> body = new ArrayList<>();
        Gson gson = new Gson();
        for(String user : userPass.keySet()){
            body.clear();
            body.add(new BasicNameValuePair("grant_type", "password"));
            body.add(new BasicNameValuePair("client_id", "magellan-ws"));
            body.add(new BasicNameValuePair("client_secret", "secret"));
            body.add(new BasicNameValuePair("username", user));
            body.add(new BasicNameValuePair("password", userPass.get(user)));
            body.add(new BasicNameValuePair("type", "business"));
            body.add(new BasicNameValuePair("scope", "read+write"));
            Request request = new Request.Builder()
                    .url("http://localhost:8080/oauth/token?" + URLEncodedUtils.format(body, "UTF-8"))
                    .post(RequestBody.create(MediaType.parse("application/json"), gson.toJson(body)))
                    .build();
            Response response = client.newCall(request).execute();
            Map<String, Object> responseObject = gson.fromJson(response.body().string(), Map.class);
            auths.add((String) responseObject.get("access_token"));
        }

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
        GetSUP task1 = new GetSUP(auths, "1");
        GetSUP task2 = new GetSUP(auths, "2");
        GetSUP task3 = new GetSUP(auths, "3");
        GetSUP task4 = new GetSUP(auths, "4");
        executor.execute(task1);
        executor.execute(task2);
        executor.execute(task3);
        executor.execute(task4);
    }

    static class GetSUP implements Runnable {
        List<String> auths;
        String name;
        GetSUP(List<String> auths, String name){
            this.auths = auths;
            this.name = name;
        }

        public void run(){
            while (true) {
                OkHttpClient client = new OkHttpClient();
                Request request = new Request.Builder()
                        .url("http://localhost:8080/testSUP5277")
                        .get()
                        .addHeader("Content-Type", "application/json")
                        .addHeader("Authorization", "Bearer " + auths.get(new Random().nextInt(auths.size())))
                        .addHeader("cache-control", "no-cache")
                        .addHeader("Postman-Token", "26209bd0-f73f-4c8c-ae10-2b04082b9885")
                        .build();
                try {
                    Response response = client.newCall(request).execute();
                    System.out.println(this.name);
                    Thread.sleep(50);
                } catch (Exception ex) {

                }
            }
        }
    }
}
