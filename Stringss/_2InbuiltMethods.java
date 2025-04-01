package Stringss;

import java.util.Arrays;

public class _2InbuiltMethods {
    public static void main(String[] args) {
        String s="RaViKIran";
        System.out.println("Character At Position "+s.charAt(6));
        char[] arr=s.toCharArray();
        System.out.println(Arrays.toString(arr));
        System.out.println("lower case "+s.toLowerCase());
        System.out.println("UPPER CASE "+s.toUpperCase());
    }
}
