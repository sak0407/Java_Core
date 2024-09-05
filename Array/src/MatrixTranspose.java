import java.util.Arrays;

/*Given a 2D integer array A, return the transpose of A.
The transpose of a matrix is the matrix flipped over its
main diagonal, switching the matrix's row and column indices.

A = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
[[1, 4, 7], [2, 5, 8], [3, 6, 9]]
Clearly after converting rows to column and columns to rows of [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
 we will get [[1, 4, 7], [2, 5, 8], [3, 6, 9]].

A = [[1, 2],[1, 2],[1, 2]]
[[1, 1, 1], [2, 2, 2]]
After transposing the matrix, A becomes [[1, 1, 1], [2, 2, 2]]

* */
public class MatrixTranspose {
    //transpose means row become col
    public static void main(String[] args) {
        //int[][] A= {{1,2,3},{4,5,6},{7,8,9}};
        int[][] A={{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18}};
        int n=A.length;
        int m=A[0].length;
        System.out.println(n);
        System.out.println(m);
        int[][] result=new int[m][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                result[j][i]=A[i][j];
            }
        }

        System.out.println(Arrays.deepToString(result));
    }

}
