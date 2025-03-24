package Day14;
import java.util.Scanner;
public class AllPerfectNumbers {
    public static int isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum=sum+i;

            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a num ");
        for (int k = 1; k <= 10000; k++) {
            int num = k;
            int perfect = isPerfect(num);
            if (perfect == num) {
                System.out.println(num);

            }
        }
    }
}
