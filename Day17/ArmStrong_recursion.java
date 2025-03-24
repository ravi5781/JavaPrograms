package Day17;

public class ArmStrong_recursion {


    public static int armstrong_rec(int num,int res,int digit){
        if(num==0){
            return res;
        }
        return armstrong_rec(num/10,res+(int)Math.pow(num%10,digit),digit);
    }

    public static int rec_count_digit(int num,int digit){
        if(num==0){
            return digit;
        }
        return rec_count_digit(num/10,digit+1);
    }

    public static void main(String[] args) {
        int num=153;
        int digit=rec_count_digit(num,0);
        int arm=armstrong_rec(num,0,digit);
        System.out.println(arm);
    }
}
