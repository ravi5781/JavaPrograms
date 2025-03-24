package Day14;

import java.util.Scanner;

public class ArmStrongNum {

    public static int count_digits(int num){
        int digit=0;
        while(num!=0){
            num=num/10;
            digit++;
        }
        return digit;
    }


    public static int check_armStrong(int num){
        int digit=count_digits(num);
        int res=0;
        while(num!=0){
            int rem=num%10;
            res=(int) Math.pow(rem,digit)+res;
            num=num/10;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int num=sc.nextInt();
        int res=check_armStrong(num);
        if(res==num){
            System.out.println(num+" is a armstrong number");
        }
        else{
            System.out.println(num+" is not a armstrong number");
        }

    }
}
