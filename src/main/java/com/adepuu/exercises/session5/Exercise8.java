package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.List;

public class Exercise8 {
    /**
     * Java String Program to Find all Duplicates on Array
     *
     * Example 1:
     * Input: nums = [4,3,2,7,8,2,3,1]
     * Output: [2,3]
     *
     * Example 2:
     * Input: nums = [1,1,2]
     * Output: [1]
     *
     * Example 3:
     * Input: nums = [1]
     * Output: []
     */
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3};
        List<Integer> res = findDuplicate(nums);
        System.out.println(res);
    }

    static List<Integer> findDuplicate(int[] numArr) {
        List<Integer> result = new ArrayList<>();
        sortNum(numArr);

        for (int i = 0; i < numArr.length - 1; i++) {
            if (numArr[i] == numArr[i + 1]) {
                result.add(numArr[i]);
            }
        }
        return result;
    }

    static void sortNum(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
