package Day9;

public class HPatt3 {
    public static void main(String[] args) {
        int rows=7;
        for(int i=1;i<=rows;i++) {
            for (int j = 1; j <= rows; j++) {
                if ((i == 1) || (i == rows) || (j == 1) || (j == rows)||(i==j) ||(i+j==rows+1)) {
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
