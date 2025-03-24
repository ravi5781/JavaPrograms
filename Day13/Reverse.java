package Day13;

public class Reverse {
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
        int num=456;
        int rev=reverse(num);
        System.out.println("reverse of a num is "+rev);
    }
}
