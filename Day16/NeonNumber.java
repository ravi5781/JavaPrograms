package Day16;

import java.util.Scanner;

public class NeonNumber {


    public static int check_neon(int num){
        int res=0;
        while(num!=0){
            int rem=num/10;
            res=res+rem;
            num=num/10;
        }
        return res;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n2=n*n;
        int res=check_neon(n2);
        if(res==n){
            System.out.println(n+" is not neon number");
        }
        else{
            System.out.println(n+" is a neon number");
        }
    }
}
