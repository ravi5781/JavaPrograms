package Day20;

public class MaxOfAnArrayNegative {
    public static void main(String[] args) {
        int[] arr={-7,-2,-4,-6,-9};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
