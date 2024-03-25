package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.List;

public class Exercise6 {
    /**
     * Java Array Program to Remove All Occurrences of an Element in an Array
     *
     * Input: array = [ 1, 2, 1, 3, 5, 1 ] , key = 1
     * Output: [2, 3, 5]
     *
     * Explanation: all the occurrences of element 1 is removed from the array So, array becomes from
     * [ 1, 2, 1, 3, 5, 1 ]  to
     * Final result: [2, 3, 5]
     */
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 5, 1};
        int k = 1;
        List<Integer> res = removeValue(nums, k);
        System.out.println(res);

    }

    static List<Integer> removeValue(int[] numArr, int key) {
        List<Integer> result = new ArrayList<>();

        for (int num: numArr) {
            if (num != key) result.add(num);
        }
        return result;
    }
}
