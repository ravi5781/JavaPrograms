package Day14;

import java.util.Scanner;

public class Emir {

    public static int isReverse(int num){
        int res=0;

        while(num!=0){
            int rem=num%10;
            res=(res*10)+rem;
            num=num/10;
        }
        return res;
    }

    public static boolean isPrime(int num){
        if(num<1){
            return false;
        }
        for(int i=2;i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }


    public  static int emirpNum(int num){
        int res=isReverse(num);
        if(isPrime(num) && isPrime(res) ){
            System.out.println(num+" emirP number");
        }
        else{
            System.out.println(num+" not a emirP number");
        }
        return res;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        emirpNum(num);
    }
}
