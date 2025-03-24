package Day14;

import java.util.Scanner;

public class Count_Digit {

    public static int count_digits(int num){
        int digit=0;
        while(num!=0){
            num=num/10;
            digit++;
        }
        return digit;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int num=sc.nextInt();
        int digit=count_digits(num);
        System.out.println(digit);
    }
}
