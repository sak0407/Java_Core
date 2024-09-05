import java.util.Arrays;

/*You are given a n x n 2D matrix A representing an image.
Rotate the image by 90 degrees (clockwise).
You need to do this in place.
Note: If you end up using an additional array, you will only receive partial score.

 [
    [1, 2],
    [3, 4]
 ]
  After rotating the matrix by 90 degree:
 1 goes to 2, 2 goes to 4
 4 goes to 3, 3 goes to 1

  [
    [3, 1],
    [4, 2]
 ]
==========
 [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
 ]
 After rotating the matrix by 90 degree:
 1 goes to 3, 3 goes to 9
 2 goes to 6, 6 goes to 8
 9 goes to 7, 7 goes to 1
 8 goes to 4, 4 goes to 2

 [
    [7, 4, 1],
    [8, 5, 2],
    [9, 6, 3]
 ]

* */
public class RotateMatrix {

    public static void reverse(int i,int m,int[][] result){
        int start=0;
        int end=m;
        while(start<end){
            int temp =result[i][end];
            result[i][end]=result[i][start];
            result[i][start]=temp;
            start++;
            end--;

        }
    }
    public static void main(String[] args) {
        //A=>A^T => reverse(row)
        int[][] A={{1,2,3},{4,5,6},{7,8,9}};

        int n=A.length;
        int m=A[0].length;

        int[][] result=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                result[j][i]=A[i][j];
            }
        }

        for(int i=0;i<n;i++){
            reverse(i,m-1,result);
        }

        System.out.println(Arrays.deepToString(result));
    }
}
