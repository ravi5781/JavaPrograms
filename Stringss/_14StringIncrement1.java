package Stringss;

public class _14StringIncrement1 {
    public static String rev(String s){
        String res="";
        for(int i=s.length()-1;i>=0;i--){
            res=res+s.charAt(i);
        }
        return res;
    }
    public static void main(String[] args) {
        String s="ABDEF";
        String temp=rev(s);
        String ans="";

       for(int i=0;i<temp.length();i++){
           ans+=(char)(temp.charAt(i)+1);
       }
        System.out.println(ans);
    }
}
/*
public static void rev(String s){
String res="";
for(int i=s.length()-1;i>=0;i++){
    res=res+(char)(s.charAt(i)+1;
}
return res;
}

public static void main(String[] args){
String s="ABDEF";
System.out.println(rev(s));
}
 */