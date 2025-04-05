package Day22_sorting;

import java.util.Arrays;

public class Merge_Sort {

    public static int[] merge(int[] arr1, int[] arr2, int[] res){
        int i=0;
        int j=0;
        int k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                res[k]=arr1[i];
                i++;
                k++;
            }
            else{
                res[k]=arr2[j];
                j++;
                k++;
            }
        }

        while(i<arr1.length){
            res[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            res[k]=arr2[j];
            j++;
            k++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr1={2,4,8};
        int[] arr2={1,5,9,11,13};
        int[] res=new int[arr1.length+arr2.length];
        System.out.println("before merging two arrays");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println("after merging two array");
        int[] merged=merge(arr1,arr2,res);
        System.out.println(Arrays.toString(merged));

    }
}
