import java.util.Arrays;

/*
You are given two integer matrices A(having M X N size) and B(having N X P).
You have to multiply matrix A with B and
return the resultant matrix. (i.e. return the matrix AB).

1 <= M, N, P <= 100
-100 <= A[i][j], B[i][j] <= 100

The first argument given is the 2-D integer matrix A.
The second argument given is the 2-D integer matrix B.

Return a 2D integer matrix denoting AB.

A = [[1, 2],
     [3, 4]]
B = [[5, 6],
     [7, 8]]

[[19, 22],
 [43, 50]]

A = [[1, 1]]
B = [[2],
     [3]]
[[5]]

* */
public class MatrixMultiplication {
    public static void main(String[] args) {

        int[][] A={{1,1}};
        int[][] B ={{2},{3}};

        int N=A.length;
        int M=B[0].length;


        int[][] result=new int[N][M];

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                result[i][j]=0;
                for(int k=0;k<A[0].length;k++){
                    result[i][j]+=A[i][k]*B[k][j] ;
                }

            }
        }

        System.out.println(Arrays.deepToString(result));

    }
}
