package Day19Arrays;

public class AvgOfArray {
    public static void main(String[] args) {
        int sum=0;
        float avg=0;
        int []arr={12,23,34,45,56,67,78};
        for(int i=0;i< arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
        System.out.println("avg :"+sum/arr.length);
    }
}
