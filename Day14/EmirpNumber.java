package Day14;

import java.util.Scanner;

public class EmirpNumber {

    public static int rev(int num){
        int res=0;
        while(num!=0){
            int rem=num%10;
            res=res*10+rem;
            num=num/10;
        }
        return res;

    }
    public static boolean prime(int num) {
        if(num<=1){
            return false;
        }
        for (int i = 2; i <num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void EmirpNumber(int num){
        int res=rev(num);
        if(prime(num) && prime(res) && num!=res){
            System.out.println("emirp number");
        }
        else{
            System.out.println("not");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number : ");
        int num=sc.nextInt();
        EmirpNumber(num);
    }
}