package Day28_Substring;

public class _2Palindromic_Substring {
    public static String rev(String s){
        String res="";
        for(int i=s.length()-1;i>=0;i--){
            res=res+s.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        String s="malayalam";
        for(int i=0; i<s.length();i++){
            String res="";
            for(int j=i;j<s.length();j++){
                res=res+s.charAt(j);
                if(res.equals(rev(res))){
                    System.out.println((res));
                }
            }
//            System.out.println();
        }
    }
}
