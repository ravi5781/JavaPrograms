package Day14;
import java.util.Scanner;
public class PerfectNumber {
    public static int isPerfect(int num){
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num ");
        int num=sc.nextInt();
        int perfect=isPerfect(num);
        if(perfect==num){
            System.out.println(num+" is perfect number");
        }
        else {
            System.out.println(num+" is not a perfect number");
        }
    }
}
