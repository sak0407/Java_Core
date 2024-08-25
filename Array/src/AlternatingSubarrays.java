/*You are given an integer array A of length N comprising of 0's & 1's, and an integer B.

You have to tell all the indices of array A that can act as a center of 2 * B + 1 length 0-1 alternating
 subarray.

A 0-1 alternating array is an array containing only 0's & 1's, and having no adjacent 0's or 1's. For e.g.
 arrays [0, 1, 0, 1], [1, 0] and [1] are 0-1 alternating, while [1, 1] and [0, 1, 0, 0, 1] are not.

 1 <= N <= 103
A[i] equals to 0 or 1.
0 <= B <= (N - 1) / 2

 A = [1, 0, 1, 0, 1]
 B = 1
[1, 2, 3]
 Index 1 acts as a centre of alternating sequence: [A0, A1, A2]
 Index 2 acts as a centre of alternating sequence: [A1, A2, A3]
 Index 3 acts as a centre of alternating sequence: [A2, A3, A4]

 A = [0, 0, 0, 1, 1, 0, 1]
 B = 0
 [0, 1, 2, 3, 4, 5, 6]
 Each index in the array acts as the center of alternating sequences of lengths 1
*
* */

import java.util.Arrays;

public class AlternatingSubarrays {
    public static void main(String[] args) {
        int[] A = {0, 0, 0, 1, 1, 0, 1};

        int B=0;
        //2 * B + 1
        int k= 2 * B +1 ;
        int n= A.length;
        int[] ans=new int[n];
        int m=0;
        // total subarray = n-k
        boolean flag=false;
        for(int i=0;i<=n-k;i++){

            for(int j=i+1;j<=i+k-1;j++){
                if(A[j]==A[j-1]){
                    flag=true;
                    break;
                }
            }

            if(!flag){
                ans[m]=i+B;
                m++;
            }


        }
        System.out.println(Arrays.toString(ans));


    }
}
















