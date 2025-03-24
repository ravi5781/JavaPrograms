package Day12;

import java.util.Scanner;

public class CountTotalNumOfFact {

    public static int print_fact(int num){
        int count=0;
        for (int i=1;i<=num;i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int num=12;
       int fact= print_fact(num);
        System.out.println(fact);
    }
}
