package Day2;

public class Patt1 {
    public static void main(String[] args) {
        int rows=5;
        for(int i=1;i<=rows;i++){
            for(int j=rows;j>=rows+1-i;j--){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}
