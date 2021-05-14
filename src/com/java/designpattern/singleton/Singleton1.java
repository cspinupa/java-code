package com.java.designpattern.singleton;

public class Singleton1 {
    // public static void main(String[] args) {
    //     System.out.println("Singleton design pattern");
    // }

    private static final Singleton1 obj = new Singleton1();

    private Singleton1() {

    }

    public static Singleton1 getInstance(){
            return obj;
    }
}
