package com.dsa.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args){
        int[] a = {2,4,6,8,10};
        int target = 14;
        int[] result = twoSum(a, target);
        Arrays.sort(result);
        System.out.println(result[0]+" "+ result[1]);
    }

    private static int[] twoSum(int[] a, int target) {
        Map<Integer, Integer> b = new HashMap<>();
        for(int i=0; i< a.length; i++){
           int delta = target - a[i];
           if(b.containsKey(delta)) {
               return new int[]{i, b.get(delta)};
           }
           b.put(a[i] , i);
        }
        return new int[] {-1, -1};
    }
}
