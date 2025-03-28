package Day23;

import java.util.Arrays;

public class Merge_sort1 {

    public static int[] merge(int[] arr1,int[] arr2, int[] res){
        int i=0;
        int j=0;
        int k=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                res[k]=arr1[i];
                i++;
            }
            else{
                res[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<arr1.length){
            res[k]= arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length) {
            res[k] = arr2[j];
            j++;
            k++;
        }
        return res;
    }


    public static int[] divide(int[] arr){
        if(arr.length==1){
            return arr;
        }

        int mid=arr.length/2;
        int[] left=new int[mid];
        int[] right=new int[arr.length-mid]; // if array length is odd


        //left array after dividing a array
        for(int i=0;i<mid;i++){
            left[i]=arr[i];
        }

        //right array after dividing a array
        for(int j=mid;j< arr.length;j++){
            right[j-mid]=arr[j];
        }

        left=divide(left);
        right=divide(right);

        return merge(left,right,arr);
    }

    public static void main(String[] args) {
        int[] arr={18,8,26,13,35,1,17,77};
        System.out.println("before sorting a array");
        System.out.println(Arrays.toString(arr));
        System.out.println();
        int[] res=divide(arr);
        System.out.println("after sorting using merge sort");
        System.out.println(Arrays.toString(res));
    }
}
