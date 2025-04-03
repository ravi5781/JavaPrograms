package practice;

public class Binary_searchhh {
    public static void main(String[] args) {
        int []arr={34,56,78,98,99,102,432};
        int key=102;
        System.out.println(b_search(arr,key));
    }

    public static int b_search(int []arr,int key){
        int low=0;
        int high= arr.length-1;


        while(low<=high){
            int mid=(low+high)/2;
            if(key==arr[mid]){
                return mid;
            } else if (key>arr[mid]) {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}
