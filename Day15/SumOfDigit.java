package Day15;

public class SumOfDigit {

    public static int sum_digit(int num){
        int res=0;
        while(num!=0){
            int rem=num%10;
            res=rem+res;
            num=num/10;
        }
        return res;
    }

    public static void main(String[] args) {
        int num=14;
        int num2=num+1;

        while(sum_digit(num)*2 != sum_digit(num2)){
            num2++;
        }
        System.out.println(num2);
    }
}
