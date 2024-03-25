package com.adepuu.exercises.session5;

import java.util.HashSet;

public class Exercise3 {
    /**
     * Write a Java Program to Check if Array Contain Duplicates
     *
     * Example 1:
     * Input: nums = [1,2,3,1]
     * Output: true
     *
     * Example 2:
     * Input: nums = [1,2,3,4]
     * Output: false
     *
     * Example 3:
     * Input: nums = [1,1,1,3,3,4,3,2,4,2]
     * Output: true
     */
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        boolean res = checkDuplicate(nums);
        System.out.println(res);
    }

    static boolean checkDuplicate(int[] numArr) {
        HashSet<Integer> numSet = new HashSet<>();

        for (int num: numArr) {
            if (numSet.contains(num)) return true;
            numSet.add(num);
        }
        return false;
    }
}
