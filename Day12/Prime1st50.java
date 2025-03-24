package Day12;

public class Prime1st50 {
    public static int print_num(int num){
        int count=0;
        if(num<2){
            return 0;
        }
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int total_count=0;
        for(int k=1;k<=10;k++){
            int num=k;
            int count=print_num(num);
            if(count==2){
                System.out.println(num);
                total_count++;
            }
            if(total_count==50){
                break;
            }
        }
    }
}
