package Day20;

public class BinarySearch {
    public static int binary_search(int []arr,int key){
        int low=0;
        int high= arr.length-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if (key>arr[mid]) {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int key=23;
        int [] arr={6,8,12,16,18,45,93,99};
        System.out.printf("key %d is present at index of %d ",key,binary_search(arr,key));
    }
}
