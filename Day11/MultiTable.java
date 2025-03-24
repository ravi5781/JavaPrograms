package Day11;

import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value");
        int n= sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+ " * " + i + " = " +(n*i));
        }
    }

}
