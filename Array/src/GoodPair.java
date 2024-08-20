import java.util.stream.IntStream;

/*Given an array A and an integer B. A pair(i, j) in the array is a good pair
 if i != j and (A[i] + A[j] == B).
 Check if any good pair exist or not.

 A = [1,2,3,4]
 B = 7
 (i,j) = (3,4)

 A = [1,2,4]
 B = 4

 A = [1,2,2]
 B = 4

* */
public class GoodPair {

    public static int[] goodPair(int[] arr, int b){

        int[] result=new int[2];
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==b){
                    result[0]=arr[i];
                    result[1]=arr[j];
                }
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {

        int[] arr={2,7,3,14,6,1,0,10,14};
        int B=20;

        IntStream.of(goodPair(arr,B)).forEach(i->System.out.print(" "+i));


    }
}
