package Day18;

public class Fact_2nd_method {
    public static int find_factorial_rec(int num,int res){
        if(num==1){
            return res;
        }
        return find_factorial_rec(num-1,(res*num));
    }

    public static void main(String[] args) {
        int num=5;
        int res=find_factorial_rec(num,1);
        System.out.println(res);
    }
}
