package Stringss;

import java.util.Arrays;

public class _12AnagramWithoutUsingAnagram {

    // Method to manually convert a string to lowercase
    public static String toLowerCase(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 97 && ch <= 122) {
                res += (char) (ch - 32);
            } else {
                res += ch;
            }
        }
        return res;
    }

    // Method to manually sort a character array (Bubble Sort)
    public static void sortArray(char[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    // Method to check if two strings are anagrams
    public static boolean isAnagram(String s1, String s2) {
        s1 = toLowerCase(s1);
        s2 = toLowerCase(s2);

        if (s1.length() != s2.length()) {
            return false;
        }

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        sortArray(arr1);
        sortArray(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "Silent";
        String str2 = "Listen";

        if (isAnagram(str1, str2)) {
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not Anagram");
        }
    }
}
