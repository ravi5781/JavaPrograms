package Day9;

public class Heart1 {
    public static void main(String[] args) {
        int rows=5;
        for(int i=0;i<=5;i++){
            for(int j=0;j<=6;j++){
                if((i==1 && j%3==0) || (i==0 && j%3 !=0) || (i-j==2) || (i+j==8)){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
}
