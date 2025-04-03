package Day19Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _2Array2user_input {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of the array");
        int n = sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("array elements are ");
        System.out.println(Arrays.toString(arr));

    }
}
