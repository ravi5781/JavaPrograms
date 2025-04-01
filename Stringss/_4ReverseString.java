package Stringss;

public class _4ReverseString
{
    public static void main(String[] args) {
        String s1="madam";
        String res="";

        for(int i=s1.length()-1;i>=0;i--){
            res=res+s1.charAt(i);
        }

        System.out.println(s1);
        System.out.println(res);

        if(s1.equals(res)){
            System.out.println("it is palindrome");
        }
        else{
            System.out.println("it is not palindrome");
        }
    }
}
