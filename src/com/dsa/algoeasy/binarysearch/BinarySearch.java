package com.dsa.algoeasy.binarysearch;

public class BinarySearch {
    public static void main(String[] args){
        int[] a = {2,4,6,8,9,10,12};
        int target = 9;
        int result = binarySearch(a,target);
        if(result == -1){
            System.out.println("The Element not found in the array");
        }else {
            System.out.println("The Element found in "+result+" Index and the target Element is "+ a[result-1]);
        }
    }

    private static int binarySearch(int[] a, int target) {
        int right = 0;
        int left = a.length-1;
        int mid = right + (left-right)/2;
        while(right <= left) {
            if(a[mid] == target){
                return mid+1;
            }else if(a[mid] > target){
                left = --mid;
            } else if(a[mid] < target){
                right = ++mid;
            }
        }
        return -1;
    }

}
