package Day22_sorting;

import java.util.Arrays;

public class Bubble_Sort_Descending_order {
    public static void main(String[] args) {
        int[] arr={52,42,92,22,2,12};
        System.out.println("before sorting an array");
        System.out.println(Arrays.toString(arr));
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]<arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("After sorting an array");
        System.out.println(Arrays.toString(arr));
    }
}
