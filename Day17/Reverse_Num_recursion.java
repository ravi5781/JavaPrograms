package Day17;

public class Reverse_Num_recursion {

    public static int rev_rec(int num,int res){
        if(num==0){
            return res;
        }
        return rev_rec(num/10, (res*10)+(num%10));
    }

    public static void main(String[] args) {
        int num=251;
        int res=0;
        int reverse=rev_rec(num,res);
        System.out.println(reverse);
    }

}
