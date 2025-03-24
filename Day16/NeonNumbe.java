package Day16;

public class NeonNumbe {

public static int add_digit(int num){
    int res=0;
    while(num!=0){
        int rem=num%10;
        res=res+rem;
        num /=10;
    }
    return res;
}


    public static void main(String[] args) {
        int num=12;
        int sq=(num*num);
        int res=add_digit(sq);
        if(num==res){
            System.out.println("it is neon");
        }
        else{
            System.out.println("it is not neon");
        }
    }
}
