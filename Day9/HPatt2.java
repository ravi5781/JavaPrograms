package Day9;

public class HPatt2 {
    public static void main(String[] args) {
        int rows=7;
        for(int i=1;i<=rows;i++) {
            for (int j = 1; j <= rows; j++) {
                if ((i == 1) || (i == rows) || (j == 1) || (j == rows)||(i==j)) {
                    System.out.print("*" + " ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
}
