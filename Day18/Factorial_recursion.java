package Day18;

public class Factorial_recursion {
    public static int find_factorial_rec(int num){
        if(num==1){
            return 1;
        }
        return find_factorial_rec(num-1)*num;
    }

    public static void main(String[] args) {
        int num=6;
        int res=find_factorial_rec(num);
        System.out.println(res);
    }
}


//normal method
//int res=1;
//        for(int i=num;i>=1;i--){
//            res=res*i;
//        }
//        return res;