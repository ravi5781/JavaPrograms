package Day21;

import java.util.Arrays;

public class ReverseArrayWithoutExtraArray {
    public static void main(String[] args) {
        int [] arr={2,4,6,8,10,12,14,16,18,20};
        System.out.println(Arrays.toString(arr));
        int left=0;
        int temp=0;
        int right=arr.length-1;
        while(left<=right){
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
