package Day13;

public class AllPalinBtw1To10000 {
    public static int palindrome(int num){
        int res=0;
        while(num!=0){
            int rem=num%10;
            res=(res*10)+rem;
            num=num/10;
        }
        return res;
    }

    public static void main(String[] args) {
        for(int i=1;i<=10000;i++){
            int num=i;
            int reverse=palindrome(num);
            if(num==reverse){
                System.out.println(num);
            }
        }
    }
}
