package Day28_Substring;

public class _1Substring {
    public static void main(String[] args) {
        String s="hello";
        for(int i=0; i<s.length();i++){
            String res="";
            for(int j=i;j<s.length();j++){
                res=res+s.charAt(j);
                System.out.println((res));
               // System.out.println(s.substring(i,j+1));     inbuilt  method
            }
            System.out.println();
        }
    }
}
