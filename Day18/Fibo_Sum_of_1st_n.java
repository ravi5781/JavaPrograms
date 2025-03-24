package Day18;

public class Fibo_Sum_of_1st_n {
    public static void main(String[] args) {

        int num1=0;
        int num2=1;
        int n=8;
        int sum=0;
        int count=0;
        while(count<n){
            sum=sum+num1;
            int res=num1+num2;
            num1=num2;
            num2=res;
            count++;
        }
        System.out.println(sum);
    }
}
