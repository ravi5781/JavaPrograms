package Day14;

import java.util.Scanner;

public class ArmStrongNum1to10000 {

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
            for(int i=1;i<=10000;i++){
            int num=i;
            int res=check_armStrong(num);
            if(res==num){
                System.out.println(num);
            }

            }
        }
    }

