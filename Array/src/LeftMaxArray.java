import java.lang.reflect.Array;
import java.util.Arrays;

public class LeftMaxArray {
    public static void main(String[] args) {

        int[] A={-3,6,2,4,5,2,8,-9,3,1};

        int n = A.length;

        int[] result=new int[n];

        for(int i=0;i<n;i++){
            if(i==0){
             result[i]=A[i];
            }else{
                result[i]=Math.max(A[i],result[i-1]);
            }
        }

        Arrays.stream(result).distinct().forEach(i->System.out.print(" "+i));




    }
}
