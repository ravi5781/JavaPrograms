

package Kanini;
public class Candy {
    public static void main(String[] args) {
        int[] arr={1,2,4,1,2};
        int min_candy=1;
        int sum=0;
        for(int i=0;i<arr.length;i++){

                if(i==0){
                    sum+=min_candy;
                } else if (arr[i]>arr[i-1]) {
                    min_candy++;
                    sum+=min_candy;
                }
                else{
                    min_candy=1;
                    sum+=min_candy;
                }
            }
        System.out.println(sum);
        }
    }

