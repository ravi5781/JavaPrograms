package Day17;

public class Arm_recursion {


    public static int rec_arm(int num,int res,int digit){
        if(num==0){
            return res;
        }
        return rec_arm(num/10,res+(int)Math.pow(num%10,digit),digit);
    }


    public static int rec_count_digit(int num,int digit){
        if(num==0){
            return digit;
        }
        return rec_count_digit(num/10,digit+1);
    }
    public static void main(String[] args) {
        int num=37;
        int digit=rec_count_digit(num,0);
        int arm=rec_arm(num,0,digit);
        System.out.println(arm);
        if(arm==num){
            System.out.println("arm");
        }
        else{
            System.out.println("not arm");
        }
    }
}
