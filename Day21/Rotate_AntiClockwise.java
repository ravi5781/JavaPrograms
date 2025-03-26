package Day21;

import java.util.Arrays;

public class Rotate_AntiClockwise {
    public static void rot_anti(int [] arr){
        int temp=arr[0];
        for(int i=1;i< arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
    }

    public static void main(String[] args) {
        int[] arr={2,4,6,8,10,12,14,16,18,20};
        System.out.println(Arrays.toString(arr));

        System.out.println("after rotating array");
        rot_anti(arr);
        System.out.println(Arrays.toString(arr));
    }
}
