package com.adepuu.exercises.session5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exercise4 {
    /**
     * Java Array Program to Remove Duplicate Elements From an Array
     *
     * Input: [ 1, 2, 2, 3, 3, 3, 4, 5 ]
     * Output: [ 1, 2, 3, 4, 5 ]
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 5, 1};
        int[] res1 = removeDuplicate(nums);
        int[] res2 = removeDuplicateHash(nums);
        System.out.println(Arrays.toString(res1));
        System.out.println(Arrays.toString(res2));
    }

    static int[] removeDuplicate(int[] numArr) {
        int uniqueCount = 0;

        for (int i = 0; i < numArr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (numArr[i] == numArr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueCount++;
            }
        }

        int[] result = new int[uniqueCount];
        int index = 0;

        for (int i = 0; i < numArr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (numArr[i] == numArr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                result[index++] = numArr[i];
            }
        }

        return result;
    }

    static int[] removeDuplicateHash (int[] numArr) {
        Set<Integer> uniqueValue = new HashSet<>();

        for (int num: numArr) {
            uniqueValue.add(num);
        }

        int[] result = new int[uniqueValue.size()];
        int i = 0;

        for (int value: uniqueValue) {
            result[i++] = value;
        }

        return result;
    }
}
