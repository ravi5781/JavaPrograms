package Day19Arrays;

import java.util.Arrays;

public class ReverseOfArray {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50,60,70};
        int [] res=new int[arr.length];
        int k= res.length-1;

        for(int i=0;i<arr.length;i++){
            res[k]=arr[i];
            k--;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(res));
    }
}
