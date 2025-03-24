package Day13;

public class PalindromePattern {
    public static int patternPalin(int num) {
        int res=0;
        while(num!=0){
            int rem=num%10;
            res=res*10+rem;
            num=num/10;
        }
        return res;
    }

    public static void main(String[] args) {
        int num=1;
        int rows=5;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                while(num!=patternPalin(num)){
                    num++;
                }
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
