package Day11;

import java.util.Scanner;

public class EvenNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
//            if(i%2 !=0) {
//                System.out.print(i+"  ");
//            }
//
//            else{
//                System.out.print(i);
//                System.out.println();
//            }

            //or


//          if(i%2==1){
//               System.out.print(i+" ");
//                System.out.println(i+1);
//           }
//
//
//            //or
//
            if(i%2==1){
                System.out.println(i+" "+(i+1));
            }
        }
    }
}
