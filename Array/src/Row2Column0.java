import java.util.Arrays;

/*You are given a 2D integer matrix A, make all the elements in a row or column zero if the A[i][j] = 0.
Specifically, make entire ith row and jth column zero.

[1,2,3,4]
[5,6,7,0]
[9,2,0,4]
===========
[1,2,0,0]
[0,0,0,0]
[0,0,0,0]

Explanation 1:
A[2][4] = A[3][3] = 0, so make 2nd row, 3rd row, 3rd column and 4th column zero.
* */
public class Row2Column0 {
    public static void main(String[] args) {

        int[][] A= {{1,2,3,4},{5,6,7,0},{9,2,0,4}};

        int n= A.length;
        int m=A[0].length;


        for(int i=0;i<n;i++){
            boolean flg=false;
            for(int j=0;j<m;j++){
                if(A[i][j]==0){
                    flg=true;
                }
            }
            if(flg){
                for(int j=0;j<m;j++){
                    if(A[i][j] != 0){
                        A[i][j]=-1;
                    }
                }
            }
        }

        for(int j=0;j<m;j++){
            boolean flg=false;
            for(int i=0;i<n;i++){
                if(A[i][j]==0){
                    flg=true;
                }
            }
            if(flg){
                for(int i=0;i<n;i++){
                    if(A[i][j] != 0){
                        A[i][j]=-1;
                    }

                }
            }
        }



        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                if (A[i][j] == -1) {
                    A[i][j] = 0;
                }
            }
        }
       System.out.println(Arrays.deepToString(A));
    }
}
