package Day7;

public class Patt1 {
    public static void main(String[] args) {
        int rows=5;
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=rows-i;j++){
                System.out.print(" "+" ");
            }

            for(int j=rows+1-i;j<=rows;j++){
                System.out.print(j+" ");
            }
            for(int j=rows-1;j>=rows+1-i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i=rows-1;i>=1;i--)
        {
            for(int j=1;j<=rows-i;j++){
                System.out.print(" "+" ");
            }
            for(int j=rows+1-i;j<=rows;j++){
                System.out.print(j+" ");
            }
            for(int j=rows-1;j>=rows+1-i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
