package com.dsa.algo.easy;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {2,4,6,8,5,10};
        int target = 6;
        int result = binarySearch(a, a.length-1, 0 ,target);
        if(result == -1){
            System.out.println("Array element not found");
        } else {
            System.out.println("The index of array element found in the index "+ result);
        }
    }

    private static int binarySearch(int[] a, int end, int start,int target) {
        Arrays.sort(a);
        int mid = (end - start)/2;
        int right = start;
        int left = end;
        while(right <= left){
            if(a[mid] == target){
                return ++mid;
            } else if(target > a[mid]) {
                right = ++mid;
            } else if(target < a[mid]){
                left = --mid;
            }
        }
        return -1;
    }

}
