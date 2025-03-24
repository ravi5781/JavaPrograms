package Day13;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Prime {
    public static boolean isPrime(int n){
        if(n==1 || n==0){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num");
        int n=sc.nextInt();
        System.out.println(isPrime(n));

    }
}
