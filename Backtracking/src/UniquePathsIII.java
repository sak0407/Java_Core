import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Given a matrix of integers A of size N x M .
There are 4 types of squares in it:

1. 1 represents the starting square.  There is exactly one starting square.
2. 2 represents the ending square.  There is exactly one ending square.
3. 0 represents empty squares we can walk over.
4. -1 represents obstacles that we cannot walk over.

Find and return the number of 4-directional walks from the starting square to
the ending square, that walk over every non-obstacle square exactly once.

Note: Rows are numbered from top to bottom and columns are numbered
from left to right.

Input 1:

A = [   [1, 0, 0, 0]
        [0, 0, 0, 0]
        [0, 0, 2, -1]   ]

out: 2
We have the following two paths:
1. (0,0),(0,1),(0,2),(0,3),(1,3),(1,2),(1,1),(1,0),(2,0),(2,1),(2,2)
2. (0,0),(1,0),(2,0),(2,1),(1,1),(0,1),(0,2),(0,3),(1,3),(1,2),(2,2)

* */
public class UniquePathsIII {
    static int p=0;
    public static void main(String[] args) {



        int[][] A={{1, 0, 0, 0},{0, 0, 0, 0},{0, 0, 2, -1} };

        int n= A.length;
        int m=A[0].length;

        int result=0;

        int is=0;
        int ie=0;
        int count=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(A[i][j]==0){
                    count++;
                }
                if(A[i][j]==1){
                    is=i;
                    ie=j;
                }
            }
        }


        List<int[]> path=new ArrayList<>();

        check(A,n,m,is,ie,0,count+1,path);
        System.out.println(p);



    }

    private static void check(int[][] A, int n, int m, int i, int j,int count, int ans,List<int[]> path) {



        if(i<0 || i>= n || j<0 ||j>=m) {
            return  ;
        }
        if(A[i][j]==-1 || A[i][j] == 3){
            return ;
        }

        if(A[i][j]==2){
            if(ans==count){

                path.add(new int[]{i,j});
                // List<int[]>  to List<List<Integer>>
                path.stream().map(arr-> Arrays.stream(arr).boxed().collect(Collectors.toList())).
                        forEach(System.out::println);
                System.out.println("==");
                p++;
            }
            return ;
        }

        A[i][j]=3;

        path.add(new int[]{i,j});

        check(A,n,m,i,j-1,count+1,ans,path) ;
        check(A,n,m,i,j+1,count+1,ans,path) ;
        check(A,n,m,i+1,j,count+1,ans,path) ;
        check(A,n,m,i-1,j,count+1,ans,path) ;


        path.remove(path.size()-1);
        A[i][j]=0;


    }
}
