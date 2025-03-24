package Day12;

public class FactorsOfNum {
    public static void print_fact(int num){
        for (int i=1;i<=num;i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int num=12;
        print_fact(num);
    }
}
