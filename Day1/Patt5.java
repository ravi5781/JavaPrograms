package Day1;

public class Patt5 {
    public static void main(String[] args) {
        int rows=5;
        for(int i=1;i<=rows;i++){
            for(int j=rows;j>=rows+1-i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
