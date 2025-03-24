package Day15;

public class HappyNumber {

    public static int happy(int num) {
        int res = 0;

        while (num != 0) {
            int rem = num % 10;
            res = (rem * rem)+res;
            num = num / 10;

        }
        return res;
    }

    public static void main(String[] args) {
        int num=7;
        int res=happy(num);

        while(res!=1&& res!=4){
            res=happy(res);
        }
        if(res==1){
            System.out.println(num+" is happy_num");
        }
        else{
            System.out.println(num+" is not happy_num");
        }
    }
}
