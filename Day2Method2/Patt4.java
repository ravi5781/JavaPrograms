package Day2Method2;

public class Patt4 {
    public static void main(String... args) {
        int rows = 5;
        int k=1;
        for (int i = 1; i <= rows; i++) {
              for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}
