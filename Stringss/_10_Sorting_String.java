package Stringss;

import java.util.Arrays;

public class _10_Sorting_String {
    public static void bubble_sort(char[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    char temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        String s="ravikiran";
        char[] arr=s.toCharArray();
        System.out.println("Before sorting the character ");
        System.out.println(Arrays.toString(arr));
        bubble_sort(arr);
        System.out.println("After sorting the character ");
        System.out.println(Arrays.toString(arr));
    }
}
