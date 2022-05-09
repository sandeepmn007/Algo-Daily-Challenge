package com.dsa.arrays.longsum;

import java.util.Scanner;

public class LongSum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scan.nextInt();
        int[] a = new int[size];
        System.out.println("Enter the array elements");
        long sum = 0;
        for(int i=0; i< a.length; i++){
            a[i] = scan.nextInt();
            sum += a[i];
        }
        System.out.println("The sum of array is "+ sum);
    }

}
