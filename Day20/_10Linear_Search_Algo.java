package Day20;

public class _10Linear_Search_Algo {
    public static int linear_search(int[] arr,int key){
        for(int i=0;i< arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={12,23,3,45,56,67,78,89};
        int key=56;
        System.out.printf("the key is %d present at index %d ",key,linear_search(arr,key));
    }
}
