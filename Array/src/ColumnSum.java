import java.util.Arrays;

/*You are given a 2D integer matrix A,
return a 1D integer array containing column-wise sums of original matrix.

[1,2,3,4]
[5,6,7,8]
[9,2,3,4]

{15,10,13,16}

Column 1 = 1+5+9 = 15
Column 2 = 2+6+2 = 10
Column 3 = 3+7+3 = 13
Column 4 = 4+8+4 = 16

* */
public class ColumnSum {
    public static void main(String[] args) {

        int[][] A = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 2, 3, 4}};

        int N = A.length;
        int M = A[0].length;

        int[][] colSum = new int[1][M];
        int[][] rowSum = new int[1][N];
        int ck=0;int cl=0;
        //colsum
        for (int j = 0; j < M; j++) {
            int sum=0;
            for(int i=0;i<N;i++){
                sum=sum+A[i][j];
                colSum[ck][cl]=sum;

            }
            cl++;
        }
        System.out.println(Arrays.deepToString(colSum));

        //rowsum
        int rk=0;int rl=0;
        for(int i=0;i<N;i++){
            int sum=0;
           for(int j=0;j<M;j++){
               sum+=A[i][j];
               rowSum[rk][rl]=sum;
           }
           rl++;
        }
        System.out.println(Arrays.deepToString(rowSum));
    }

}
