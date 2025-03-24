package Day14;

public class EmirpNum {
    public static boolean isprime(int num){
        for(int i=2;i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static int reverse(int num){
        int res=0;
        while(num!=0){
            int rem=num%10;
            res=(res*10)+rem;
            num=num/10;
        }
        return res;
    }

    public static void main(String[] args) {
        int num=13;
        boolean prime=isprime(num);
        int reverse=reverse(num);
    }
}
