/*Give a N * N square matrix A, return an array of its anti-diagonals.
Look at the example for more details.

Only argument is a 2D array A of size N * N.

Return a 2D integer array of size (2 * N-1) * N,
representing the anti-diagonals of input array A.
The vacant spaces in the grid should be assigned to 0.

1 2 3
4 5 6
7 8 9
ans:
1 0 0
2 4 0
3 5 7
6 8 0
9 0 0

1 2
3 4
ans:
1 0
2 3
4 0


* */

import java.util.Arrays;

public class AntiDiagonals {
    public static void main(String[] args) {

        int[][] A={{1,2,3},{4,5,6},{7,8,9}};
        int N=A.length;

        //How many anti diagonals will be there => (N+M-1)

        int K=2*N -1;
        int L=N;

        int[][] result=new int[K][L];

        int a=0;
       for(int i=0;i<N-1;i++){
           calculateDiagonal(0, i,A,result,a);
           a++;
       }
       for(int i=0;i<N;i++){
           calculateDiagonal(i,N-1,A,result,a);
           a++;
       }

        System.out.println(Arrays.deepToString(result));


    }


    public static void calculateDiagonal(int si, int sj, int[][] A, int[][] result, int ri) {
        int N = A.length;
        int i = si;
        int j = sj;

        int rj=0;

        while (i < N && j >= 0) {
            result[ri][rj] = A[i][j];
            i++;
            j--;
            rj++;
        }

        while(rj<result[0].length){
            result[ri][rj]=0;
            rj++;
        }
    }


}
