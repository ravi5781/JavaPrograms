package Stringss;

public class _1StringPrint {
    public static void main(String[] args) {
        String s="Ravikiran";
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i));
        }
        System.out.println();
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
    }
}
