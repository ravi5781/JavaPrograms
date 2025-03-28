package Day24;

public class ArraySortedInAscOrNot {
    public static boolean check_sorted(int[] arr1){
//        if(arr1.length!=arr2.length){
//            return false;
//        }
        for(int i = 0; i < arr1.length-1; i++){
            if(arr1[i]>arr1[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr1={2,4,6,8,10};

        boolean res=check_sorted(arr1);
        System.out.println(res);

    }
}
