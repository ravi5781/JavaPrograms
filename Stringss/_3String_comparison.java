package Stringss;

public class _3String_comparison {
    public static void main(String[] args) {
        String s1="hello";
        String s2="";
        String s3="hello";

        for(int i=0;i< s1.length();i++){
            s2=s2 + s1.charAt(i);
        }

        System.out.println(s2);
        System.out.println();

        //String Address Comparison
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s3==s1);

        System.out.println();
        //String Content Comparison
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s1));

    }
}
