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
        for (int i = 0; i < numArr.length - 1; i++) {
            for (int j = i + 1; j < numArr.length; j++) {
                if (numArr[i] == numArr[j]) return true;
            }
        }
//        for (int i = 0; i < numArr.length - 1; i++) {
//            if (numArr[i] == numArr[i + 1]) return true;
//        }
        return false;
    }
}
