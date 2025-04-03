package Day19Arrays;

public class _6AdditionofOddNumbers {
    public static void main(String[] args) {
        int count=0;
        float sum=0;
        int [] arr={12,23,34,45,56,67,78};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 != 0) {
                sum = sum + arr[i];
                count++;
            }
        }
        System.out.println("Addition of odd numbers in a given array "+sum/count);
    }
}
