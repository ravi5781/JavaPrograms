package Stringss;

import java.util.Arrays;

public class _6ToCharArray {

    public static char[] con_arr(String s){
        char[] arr=new char[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=s.charAt(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        String s="Ravikiran";
        char[] arr=con_arr(s);
        System.out.println(Arrays.toString(arr));
    }
}
