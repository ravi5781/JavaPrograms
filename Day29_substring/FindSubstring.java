package Day29_substring;

public class FindSubstring {
    public static void find_substr(String s, String res){
        if(s.length()==0){
            System.out.println("'"+res+"'");
            return;
        }
        find_substr(s.substring(1),res+s.charAt(0));
        find_substr(s.substring(1),res);
    }

    public static void main(String[] args) {
        String s="abc";
        find_substr(s,"");
    }
}
