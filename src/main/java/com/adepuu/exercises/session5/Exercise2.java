package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
    /**
     * Java Array Program For Array Rotation
     * Input: arr[] = {1, 2, 3, 4, 5, 6, 7},  d = 2
     * Output:  3 4 5 6 7 1 2
     * Explanation: d=2 so 2 elements are rotated to the end of the array. So, 1 2 is rotated back
     * So, Final result: 3, 4, 5, 6, 7, 1, 2
     */
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int d = 5;
        List<Integer> res = arrayRotation(nums, d);
        System.out.println(res);
    }

    static List<Integer> arrayRotation(int[] numArr, int d) {
        List<Integer> result = new ArrayList<>();
        int k = 0;

        for (int i = d; i < numArr.length; i++) {
            result.add(k, numArr[i]);
            k++;
        }

        for (int i = 0; i < d; i++) {
            result.add(numArr[i]);
        }

        return result;
    }
}
