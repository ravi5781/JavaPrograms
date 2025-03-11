package Day9;

public class HeartName2Rev {
    public static void main(String[] args) {
        int rows=5;
        int col=6;
        for(int i=0;i<=5;i++){
            for(int j=0;j<=col;j++){
                if((i==1 && j%3==0) || (i==0 && j%3 !=0) || (i-j==2) || (i+j==8)){
                    System.out.print("*"+" ");
                }
                else if(i==2 && j==2){
                    System.out.print("R"+" ");
                }
                else if(i==2 && j==3){
                    System.out.print("C"+" ");
                }
                else if(i==2 && j==4){
                    System.out.print("B"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }

        for(int i=5;i>=0;i--){
            for(int j=0;j<=col;j++){
                if((i==1 && j%3==0) || (i==0 && j%3 !=0) || (i-j==2) || (i+j==8)){
                    System.out.print("*"+" ");
                }
                else if(i==2 && j==2){
                    System.out.print("R"+" ");
                }
                else if(i==2 && j==3){
                    System.out.print("S"+" ");
                }
                else if(i==2 && j==4){
                    System.out.print("K"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }


    }
}
