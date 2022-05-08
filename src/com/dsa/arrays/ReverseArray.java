package com.dsa.arrays;

import java.util.Scanner;

public class ReverseArray {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[]args){
      int[] a = getArrayElements();
      System.out.println("Enter Array Rotation Size");
      int x = scan.nextInt();
      scan.close();
      int[] result = rotateArray(a,x);
      System.out.println("Rotated Array");
      for(int i=0; i<a.length; i++){
          System.out.print(a[i]+",");
      }
    }

    private static int[] rotateArray(int[] a, int x) {
        int[] temp = new int[a.length-x];
        System.arraycopy(a, 0, temp, 0, temp.length);
        int j =0;
        for(int i=x-1; i<a.length; i++){
            a[j] = a[i];
            j++;
        }
        j=0;
        for(int i=temp.length-1; i<a.length; i++){
            a[i] = temp[j];
            j++;
        }
        return temp;
    }

    private static int[] getArrayElements() {
        System.out.println("Enter the array size");
        int size = scan.nextInt();
        int[] a = new int[size];
        System.out.println("Enter the array elements");
        for(int i=0; i<size; i++){
            a[i] = scan.nextInt();
        }
        return a;
    }

}
