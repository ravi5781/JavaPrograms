package Day2Method2;

public class Patt2 {
    public static void main(String[] args) {
        int rows=5;
        for(int i=1;i<=rows;i++){
            int k=1;
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}
