package com.j4mt.bigosamples;

import java.util.HashMap;
import java.util.Map;

public class SumSample {

    /**
     * Question - given an array of integers return the indices of of numbers that make up the sum 'X'
     *
     * sum = 9
     *
     * [2, 1, 4, 5, 6, 9, 8]
     *
     * result should be { 2,3 }
     */

    public static void main(String[] args) {

        int target = 9, target1 = 6;
        int[] list = {2, 1, 4, 5, 6, 9, 8}, list1 = {-2, 1, 4, 9, 6, 5, 8};
        int[] result = getTwoSum(list,target);
        System.out.println("Result: " + result[0] + ", " + result[1]);

        int[] result1 = getTwoSum(list1,target1);
        System.out.print("Result1: " + result1[0] + ", " + result1[1]);
    }

    public static int[] getTwoSum(int[] numlist, int target){
        Map<Integer,Integer> vistedNumbers = new HashMap<Integer, Integer>();
        for (int i = 0; i < numlist.length; i++) {
            int delta = target - numlist[i];
            if (vistedNumbers.containsKey(delta)){
                return new int[] {i, vistedNumbers.get(delta)};
            }
            vistedNumbers.put(numlist[i],i);
        }
        return new int[] {-1, -1};
    }
}
