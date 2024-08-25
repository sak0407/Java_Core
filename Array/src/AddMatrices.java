import java.util.Arrays;

/*
You are given two matrices A & B of same size,
you have to return another matrix which is the sum of A and B.

Matrices are of same size means the number of rows and number of columns
of both matrices are equal.

The Following will give you an idea of matrix addition:
A = [[1, 2, 3],
     [4, 5, 6],
     [7, 8, 9]]
B = [[9, 8, 7],
     [6, 5, 4],
     [3, 2, 1]]

Ans : [[10, 10, 10],
       [10, 10, 10],
       [10, 10, 10]]

A = [[1, 2, 3],
     [4, 1, 2],
     [7, 8, 9]]
B = [[9, 9, 7],
     [1, 2, 4],
     [4, 6, 3]]

ans= [[10, 11, 10],
      [5,   3,  6],
      [11, 14, 12]]

* */
public class AddMatrices {


    public static void main(String[] args) {

    int[][] arr1={{1, 2, 3, 4},
    			 {5, 6, 7, 8},
    			 {9, 10, 11, 12},
    			 {5, 3, 12, 13}};

	int [][] arr2={{11, 12, 13, 14},
			       {15, 16, 17, 18},
			       {9, 1, 1, 2},
			       {5, 3, 2, 3}};

	 int n= arr1.length;
	 int m=arr1[0].length;

	 int[][] ans=new int[n][m];

	 for(int i=0;i<n;i++){
		 for(int j=0;j<m;j++){
			 ans[i][j]=arr1[i][j]+arr2[i][j];
		 }
	 }

		//System.out.print(Arrays.deepToString(ans));

	  Arrays.stream(ans).map(Arrays::toString)
			  .forEach(System.out::print);

    }
}
