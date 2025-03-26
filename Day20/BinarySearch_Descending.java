package Day20;

public class BinarySearch_Descending {

    public static int binary_search_desc(int[] arr, int key){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==key){
                return mid;
            }
            else if(key>arr[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr={99,93,45,18,16,12,8,6};
        int key=6;
        System.out.println(binary_search_desc(arr,key));
    }
}
