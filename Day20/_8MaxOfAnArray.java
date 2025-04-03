package Day20;

public class _8MaxOfAnArray {
    public static void main(String[] args) {
        int[] arr={12,44,92,7,18,45};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
