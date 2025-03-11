package Day2Method2;

public class Patt5 {
    public static void main(String[] args) {


    int k=1;
    int rows=5;
    for(int i=1;i<=rows;i++){
        for(int j=1;j<=i;j++){
            System.out.print(k%2+" ");
            k++;
        }
        System.out.println();
    }
}
}