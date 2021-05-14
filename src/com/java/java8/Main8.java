package com.java.java8;

import java.util.Arrays;

/*
This class is used for understanding and practicing java8 features
https://mkyong.com/tutorials/java-8-tutorials/
*/
public class Main8 {
    public Main8() {

    }
    /*
    streams examples
        https://www.geeksforgeeks.org/streams-arrays-java-8/


    */
    public void parseArr(){
        int[] arr= {12,3,5,32,45,6,7,82,34,67,22,11,467,78};
        System.out.println("\n Array in consideration is :"); 

        Arrays.stream(arr)
        .forEach(i -> System.out.print(" "+i));

        System.out.println(" \n Sum of values in the array ->"+Arrays.stream(arr).sum());

        System.out.print(" \n Values which are less than 10 in the array ->");
        Arrays.stream(arr)
        .filter(num -> num < 10)
        .forEach( i -> System.out.print(" "+i));
        System.out.println("");
        
    }

    /**
     * Functional interfaces: https://www.journaldev.com/2763/java-8-functional-interfaces
     */
}
