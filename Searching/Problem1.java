package com.iamoperand.com.hackerearth.iamoperand.Searching;

import java.util.Scanner;

/**
 * Created by iamoperand on 7/7/17.
 */
public class Problem1 {

    static void mainLogic(int[] actualArray, int[] queryArray){


    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int Q = scanner.nextInt();

        int[] actualArray = new int[N];
        int[] queryArray = new int[Q];

        for(int i=0; i<actualArray.length; i++){
            actualArray[i] = scanner.nextInt();
        }

        for(int i =0; i<queryArray.length; i++){
            queryArray[i] = scanner.nextInt();
        }

        mainLogic(actualArray, queryArray);
    }
}
