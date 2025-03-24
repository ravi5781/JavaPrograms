package Day13;

public class PalinPattern {
    public static void main(String[] args) {
        int rows=6;
        for(int i=1;i<=rows;i++){
            for(int j=i;j<=rows-i;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=rows;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
