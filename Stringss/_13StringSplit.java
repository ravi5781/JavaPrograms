package Stringss;

import java.util.Arrays;

public class _13StringSplit {

    public static String first_conv_upper(String s){
        String res="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(i==0 ){
                res=res+(char)(ch-32);
            }
            else{
                res=res+ch;
            }
        }
        return res;
    }
    public static String first_last_conv_upper(String s){
        String res="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(i==0 || i==s.length()-1){
                res=res+(char)(ch-32);
            }
            else{
                res=res+ch;
            }
        }
        return res;
    }

    public static String rev(String s){
        String res="";
        for(int i=s.length()-1;i>=0;i--){
            res=res+s.charAt(i);
        }
        return res;
    }


    public static void main(String[] args) {
        String s="ee sala cup namde";
        String [] arr=s.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println(s);

        for(int i=0;i< arr.length;i++){
            System.out.print(rev(arr[i]+" "));
        }
        System.out.println();

        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println();
        System.out.println(rev(s));

        for(int i=0;i< arr.length;i++){
            System.out.print(first_conv_upper(arr[i])+" ");
        }
        System.out.println();
        System.out.println();
        for(int i=0;i< arr.length;i++){
            System.out.print(first_last_conv_upper(arr[i])+" ");
        }
    }
}


//output
// ee sala cup namde
// ee alas puc edman
// namde cup sala ee
// edman puc alas ee
// Ee Sala Cup Namde
// EE SalA CuP NamdE