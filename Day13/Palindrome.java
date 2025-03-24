package Day13;

public class Palindrome {
    public static int palin(int num) {
        int res = 0;
        while (num != 0) {
            int rem = num % 10;
            res = (res * 10) + rem;
            num = num / 10;
        }
        return res;
    }

    public static void main(String[] args) {
        int num = 454;
        int rev = palin(num);
        if (num == rev) {
            System.out.println("it is palindrome");

        } else {
            System.out.println("it is not a palindrome");
        }
    }
}
