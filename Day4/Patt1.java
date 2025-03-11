package Day4;

public class Patt1 {
    public static void main(String[] args) {


        int sum = 0;
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            sum = sum + i;
            int temp = sum;
            for (int j = 1; j <= i; j++) {
                System.out.print(temp + " ");
                temp--;
            }
            System.out.println();
        }
    }
}
