package Day21;

import java.util.Arrays;

public class Rotate_clock {

    public static void rot_clock(int [] arr){
        int temp=arr[arr.length-1];

        for(int i= arr.length-2;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=temp;
    }
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10,12};
        System.out.println(Arrays.toString(arr));

        System.out.println("after rotating array");
        rot_clock(arr);
        System.out.println(Arrays.toString(arr));
    }
}
