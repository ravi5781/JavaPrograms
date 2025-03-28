package Day24;

import java.util.Arrays;

public class MaxSumOfSubArray {

    public static int sum_of_subarray(int[] arr){
        int max=arr[0];
        int start=0, end=0;
        for(int i = 0; i < arr.length; i++){
            for(int j= i; j < arr.length; j++){
                int sum=0;
                for(int k= i;k <= j; k++){
                    sum=sum+arr[k];
                }
                if(sum > max){
                    max=sum;
                    start=i;
                    end=j;
                }
            }
        }
        for(int i=start; i<=end;i++){
            System.out.print(arr[i]+" ,");

        }
        System.out.println();
        return max;
    }

    public static void main(String[] args) {
        int[] arr={-6,5,-4,7,-3};
        int max=sum_of_subarray(arr);
        System.out.println("Maximum sum of subarray "+max);
    }
}
