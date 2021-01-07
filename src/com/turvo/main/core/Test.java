package com.turvo.main.core;

import org.hibernate.Session;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception{
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String busId = "2020-04-24";
        System.out.println(formatter.parse(busId));
    }

}
