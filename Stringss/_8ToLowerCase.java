package Stringss;

public class _8ToLowerCase {
    public static void main(String[] args) {
        String s="RavIKiRaN";
        String res="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch>=97 && ch<=122){
                res=res+s.charAt(i);
            }
            else{
                res=res+(char)(ch+32); // for uppercase ch-32 for lowercase ch+32
            }
        }
        System.out.println(res);
    }
}
