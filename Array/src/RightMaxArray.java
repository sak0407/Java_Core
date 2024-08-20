import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*  ==> Leader Array <==
Given an integer array A containing N distinct integers, you have to find all the
 leaders in array A. An element is a leader if it is strictly greater than all the
 elements to its right side.

 Input 1:
 A = [16, 17, 4, 3, 5, 2]
 [17, 2, 5]
 Explanation 1:
 Element 17 is strictly greater than all the elements on the right side to it.
 Element 2 is strictly greater than all the elements on the right side to it.
 Element 5 is strictly greater than all the elements on the right side to it.
 So we will return these three elements i.e [17, 2, 5], we can also return [2, 5, 17]
  or [5, 2, 17] or any other ordering.
Input 2:
 A = [5, 4]
 [5, 4]

Explanation 2:
 Element 5 is strictly greater than all the elements on the right side to it.
 Element 4 is strictly greater than all the elements on the right side to it.
 So we will return these two elements i.e [5, 4], we can also any other ordering.

 */
public class RightMaxArray {
    public static void main(String[] args) {

        int[] arr={16, 17, 4, 3, 5, 2};
        int n = arr.length;

        int[] result=new int[n];

        int rightmax=0;

        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                rightmax=arr[i];
                result[i]=rightmax;
            }else{
                if(rightmax<arr[i]){
                    rightmax=arr[i];
                    result[i]=rightmax;
                }

            }
        }


        Arrays.stream(result).boxed().filter(i->i>0).collect(Collectors.toList())
                .forEach(i-> System.out.print(" "+i));



    }
}
