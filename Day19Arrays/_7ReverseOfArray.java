package Day19Arrays;

import java.util.Arrays;

public class _7ReverseOfArray {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50,60,70};

        int [] res=new int[arr.length];   //7= arr.length
        int k= res.length-1;  //k= 7-1 =6

        for(int i=0;i<arr.length;i++){
            res[k]=arr[i];
            k--;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(res));
    }
}
