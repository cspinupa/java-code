package com.java.java8;

import java.util.Arrays;

/*
This class is used for understanding and practicing java8 features
*/
public class Main8 {
    public Main8() {

    }
    //streams
    public void parseArr(){
        int[] arr= {12,3,5,32,45,6,7,82,34,67,22,11,467,78};
        System.out.println("\n Array in consideration is :"); 

        Arrays.stream(arr)
        .forEach(i -> System.out.print(" "+i));

        System.out.println(" \n Sum of values in the array ->"+Arrays.stream(arr).sum());

        System.out.println(" \n Values which are less than 10 in the array ->");
        Arrays.stream(arr)
        .filter(num -> num < 10)
        .forEach( i -> System.out.print(" "+i));
        
    }
}
