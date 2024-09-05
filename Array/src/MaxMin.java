import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {

        int[] arr={-2,8,7,2,1,0,9,20};

        int max= Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;


        for(int i=0;i<arr.length;i++){
            if(max<=arr[i]){
                max=arr[i];
            }
            if(min>=arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Max "+max +"::"+" Min "+min);
    }
}
