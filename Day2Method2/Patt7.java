package Day2Method2;

public class Patt7 {
    public static void main(String[] args) {
        int k=0;
        int rows=5;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k%5+" ");
                k++;
            }
            System.out.println();
        }
    }
}
