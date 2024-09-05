import java.util.Arrays;

/*
Given an integer A, generate a square matrix filled with elements from 1 to A^2
in spiral order and return the generated square matrix.


1
==
[ [1] ]

2
[ [1, 2],
  [4, 3] ]

5

[ [1,   2,  3,  4, 5],
  [16, 17, 18, 19, 6],
  [15, 24, 25, 20, 7],
  [14, 23, 22, 21, 8],
  [13, 12, 11, 10, 9] ]

Explanation 1:
Only 1 is to be arranged.
Explanation 2:
1 --> 2
      |
      |
4<--- 3
Explanation 3:

* */
public class SpiralOrderMatrixII {
    public static void main(String[] args) {
        int n=4;
        int count=1;
        int[][] A=new int[n][n];


        int k=0;

        while(k<=n/2) {
            System.out.println("loop count "+k);

            int i=k;
            int j=k;



            System.out.println(i+"="+j+" "+n);
            while (j < n) {
                A[i][j] = count;
                j++;
                count++;
            }
            i++;
            j = j - 1;
            while (i < n) {
                A[i][j] = count;
                count++;
                i++;
            }
            i = i - 1;
            j = j - 1;
            while (j >= k) {
                A[i][j] = count;
                count++;
                j--;
            }

            j = j + 1;
            i = i - 1;
            while (i > k) {
                A[i][j] = count;
                count++;
                i--;
            }
            n=n-1;
            k++;
            if(k==n-1){
                A[k][k]=count;
            }



        }



        System.out.println(Arrays.deepToString(A));
    }

}
