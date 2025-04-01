package Kanini;

public class Kanini1 {

    public static void main(String[] args){
        int [] arr={12,23,-20,-20,56,6,0,0};
        int count=0;

        for(int i=0;i< arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
            }
        }
        System.out.println("consecutive sequence is "+count);
    }
}
