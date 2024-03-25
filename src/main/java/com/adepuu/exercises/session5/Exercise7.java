package com.adepuu.exercises.session5;

public class Exercise7 {
    /**
     * Java String Program to Check Anagram
     *
     * Example 1:
     * Input: s = "anagram", t = "nagaram"
     * Output: true
     *
     * Example 2:
     * Input: s = "rat", t = "car"
     * Output: false
     */
    public static void main(String[] args) {
        String s = "car";
        String t = "rat";
        boolean result = checkAnagram(s, t);
        System.out.println(result);
    }

    static boolean checkAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();

        sortChar(str1);
        sortChar(str2);

        for (int i = 0; i < s.length(); i++) {
            if (str1[i] != str2[i]) return false;
        }

        return true;
    }

    static void sortChar(char[] charArr) {
        for (int i = 0; i < charArr.length - 1; i++) {
            for (int j = 0; j < charArr.length - i - 1; j++) {
                if (charArr[j] > charArr[j + 1]) {
                    char temp = charArr[j];
                    charArr[j] = charArr[j + 1];
                    charArr[j + 1] = temp;
                }
            }
        }
    }
}
