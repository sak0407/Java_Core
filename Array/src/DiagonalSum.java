/*You are given a N X N integer matrix. You have to find
 the sum of all the minor diagonal elements of A.

Minor diagonal of a M X M matrix A is a collection of elements A[i, j]
such that i + j = M + 1 (where i, j are 1-based).

A = [[1, -2, -3],
     [-4, 5, -6],
     [-7, -8, 9]]  ans = -5
A = [[3, 2],
     [2, 3]]   ans = 4




* */
public class DiagonalSum {
    public static void main(String[] args) {

        int[][] A={{1,-2,-3},{-4,5,-6},{-7,-8,9}};

        int N=A.length;
        int M=A[0].length;
        int sum=0;
        int i=0;
        int j=M-1;

        while(i<N && j>=0){
            sum = sum + A[i][j];
            i++;
            j--;
        }
        System.out.println(sum);

    }
}
