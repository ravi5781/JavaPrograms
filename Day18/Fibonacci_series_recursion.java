package Day18;

public class Fibonacci_series_recursion {
    public static void main(String[] args) {
        int num1=0;
        int num2=1;
        int n=8;
        int count=0;
        while(count<n){
            System.out.println(num1);
            int res=num1+num2;
            num1=num2;
            num2=res;
            count++;
        }
    }
}
