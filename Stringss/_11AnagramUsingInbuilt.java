package Stringss;

import java.util.Arrays;

public class _11AnagramUsingInbuilt {
    public static void main(String[] args) {
        String s1="Silent";
        String s2="Listen";

        String s3=s1.toLowerCase();
        String s4=s2.toLowerCase();

        char[] arr1=s3.toCharArray();
        char[] arr2=s4.toCharArray();

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println();
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println();
        if(Arrays.equals(arr1,arr2)){
            System.out.println("it is Anagram");
        }
        else{
            System.out.println("it is not anagram");
        }

    }
}
