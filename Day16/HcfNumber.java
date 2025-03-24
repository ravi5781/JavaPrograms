package Day16;

import java.util.Scanner;

public class HcfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int hcf=1;
        int a=sc.nextInt();
        int b=sc.nextInt();
        int small=(a<b)?a:b;
        for(int i=1;i<=small;i++){
            if(a%i==0 && b%i==0){
                hcf=i;
            }
        }
        System.out.println(hcf+" is highest common factor");
    }
}
