package Day10;

public class Patt2BasicRecursion {
    public static void print_num(int num){
        if(num==0){
            System.out.println(num);
            return;
        }
        System.out.println(num);
        print_num(num-1);
    }
    public static void main(String...args){
        int num=5;
        print_num(num);
    }
}
