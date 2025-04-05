package Day28_Substring;

public class _3Longest_Palindromic_Substr {


    public static String rev(String s){
        String res="";
        for(int i=s.length()-1;i>=0;i--){
            res=res+s.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        String s="malayalam";
        String l_str="";
        int len_str=0;
        for(int i=0; i<s.length();i++){
            String res="";
            for(int j=i;j<s.length();j++){
                res=res+s.charAt(j);
                if(res.equals(rev(res))){
                    if(res.length()>len_str){
                        l_str=res;
                        len_str=res.length();
                    }
                }
            }
        }
        System.out.println(l_str);
        System.out.println(len_str);
    }
}
