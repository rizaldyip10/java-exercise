package com.adepuu.exercises.session5;

public class Exercise1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int result = largestInt(nums);
        System.out.println(result);
    }

    static int largestInt(int[] numArr) {
        int max = numArr[0];

        for (int num : numArr) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }
}
