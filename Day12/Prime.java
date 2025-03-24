package Day12;

public class Prime {

    public static int count_fact(int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String []args){
        int num=5;
        int fact=count_fact(num);
        if(fact==2){
            System.out.println(num+" is prime number");
        }
        else{
            System.out.println(num+" is not a prime number");
        }
    }
}
