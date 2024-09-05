import java.util.ArrayList;

/*Given an array of integers A, of size N.
Return the maximum size subarray of A having only non-negative elements.
If there are more than one such subarray, return the one having the smallest
starting index in A.
NOTE: It is guaranteed that an answer always exists.

Input 1:
 A = [5, 6, -1, 7, 8]
Input 2:
 A = [1, 2, 3, 4, 5, 6]

Output 1:
 [5, 6]
Output 2:
 [1, 2, 3, 4, 5, 6]

Explanation 1:
 There are two subarrays of size 2 having only non-negative elements.
 1. [5, 6]  starting point  = 0
 2. [7, 8]  starting point  = 3
 As starting point of 1 is smaller, return [5, 6]

Explanation 2:
 There is only one subarray of size 6 having only non-negative elements:
 [1, 2, 3, 4, 5, 6]
* */
public class MaximumPositivity {
    public static void main(String[] args) {
        int[] A={-6, 6, 7,9,4,-1, 7, 8,0,7,4,8,4};

        int[][] result=new int[6][6];

        int start=0;
        int end=0;

        int max=Integer.MIN_VALUE;

        ArrayList<Integer> arr=new ArrayList<>();


        for(int i=0;i<A.length;i++){

            if(A[i] < 0) {

                int j=i-1; int length=0;
                while(j>=0 && A[j]>=0){
                    length++;
                    j--;
                }
                if(max<length){
                    max=length;
                    start = j+1;
                    end = i-1;

                }

                int k=i+1; length=0;

                while(k<A.length && A[k]>=0){
                    length++;
                    k++;
                }

                if(max<length){
                    max=length;
                    start = i+1;
                    end = k-1;
                }


            }


        }
        for(int m=start;m<=end;m++){
            System.out.print(A[m]);
        }



    }

}
