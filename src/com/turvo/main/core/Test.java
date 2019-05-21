package com.turvo.main.core;

import org.hibernate.Session;

public class Test {
    public static void main(String[] args){
        Object x = null;
        if ( x instanceof Session){
            System.out.println("y");
        }else {
            System.out.println("x");
        }
    }

}
