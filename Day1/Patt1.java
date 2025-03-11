package Day1;

import java.sql.SQLOutput;

public class Patt1 {
    public static void main(String[] args) {
        int rows=5;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
