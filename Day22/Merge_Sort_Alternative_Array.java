package Day22;

import java.util.Arrays;

public class Merge_Sort_Alternative_Array {
    public static int[] merge(int[] arr1, int[] arr2, int[] res){
        int i=0;
        int j=0;
        int k=0;
        while(i<arr1.length && j<arr2.length){
                res[k]=arr1[i];
                i++;
                k++;

                res[k]=arr2[j];
                j++;
                k++;
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
        int[] arr1={2,4,6,8};
        int[] arr2={10,20,30,40,50,60};
        int[] res=new int[arr1.length+arr2.length];
        System.out.println("before merging two arrays");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println("after merging two array");
        int[] merged=merge(arr1,arr2,res);
        System.out.println(Arrays.toString(merged));

    }
}
