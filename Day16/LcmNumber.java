package Day16;

import java.util.Scanner;

public class LcmNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int grt=(a>b)?a:b;
        for(int i=grt;i<=(a*b);i++){
            if(i%a==0 && i%b==0){
                System.out.println(i);
                break;
            }
        }
    }
}
