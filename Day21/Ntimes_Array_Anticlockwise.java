package Day21;
import java.util.Arrays;

public class Ntimes_Array_Anticlockwise {

    public static void rot_anti(int [] arr){
        int temp=arr[0];
        for(int i=1;i< arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
    }

    public static void main(String[] args) {
        int[] arr={2,4,6,8,10,12};
        System.out.println(Arrays.toString(arr));

        System.out.println("after rotating anticlockwise array");
       for(int i=0;i<2000;i++) {
            rot_anti(arr);
           System.out.println(Arrays.toString(arr));
       }

    }
}
