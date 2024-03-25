package com.adepuu.exercises.session5;

import java.util.Arrays;

public class Exercise9 {
    /**
     * Java Program to get the number of days you have to wait after the i-th day to get a warmer temperature
     *
     * Example 1:
     * Input: temperatures = [73,74,75,71,69,72,76,73]
     * Output: [1,1,4,2,1,1,0,0]
     *
     * Example 2:
     * Input: temperatures = [30,40,50,60]
     * Output: [1,1,1,0]
     *
     * Example 3:
     * Input: temperatures = [30,60,90]
     * Output: [1,1,0]
     */
    public static void main(String[] args) {
        int[] temperature = {30,30,60,90};
        int[] res = calcDay(temperature);
        System.out.println(Arrays.toString(res));
    }

    static int[] calcDay(int[] temperature) {
        int[] result = new int[temperature.length];

        for (int i = 0; i < temperature.length; i++) {
            int days = 0;
            for (int j = i + 1; j < temperature.length; j++){
                days++;
                if (temperature[j] > temperature[i]) {
                    result[i] = days;
                    break;
                }
            }
        }
        return result;
    }
}
