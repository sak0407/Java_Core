import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*Given an integer A denoting the value of N, return all distinct solutions to the N-queens puzzle.

Each solution contains a distinct board configuration of the N-queens' placement, where 'Q' and '.'
both indicate a queen and an empty space respectively.
The final list should be generated in such a way that the indices
of the queens in each list should be in reverse lexicographical order.


A = 4
[
 [".Q..",  // Solution 1
  "...Q",
  "Q...",
  "..Q."],

 ["..Q.",  // Solution 2
  "Q...",
  "...Q",
  ".Q.."]
]


A = 1

[
 [Q]
]




* */
public class NQueens {
    public static void main(String[] args) {
        int A =4;

        ArrayList<ArrayList<Integer>> result=new ArrayList<>();

        int[][] mat=new int[A][A];
        Arrays.stream(mat).forEach(row->Arrays.fill(row,0));


        //block row
        //block diagonal
        //block antidiagonal

        boolean[] col=new  boolean[A];
        boolean[] diag=new boolean[2*A];
        boolean[] antidiag=new boolean[2*A];

        

        Nqueens(0,col,diag,antidiag,mat,A,result);

        //result.forEach(list->list.stream().forEach(System.out::print));


    }

    private static void Nqueens(int row, boolean[] col, boolean[] diag, boolean[] antidiag, int[][] result, int n, ArrayList<ArrayList<Integer>>  arrayLists) {

        if(row==n){
           // arrayLists.add(convertMattoList(result));


            ArrayList<Integer> list=convertMattoList(result);
            list.stream().forEach(System.out::print);


            System.out.println();
            
            return;
        }

        for(int j=0;j<n;j++){

            if(diag[row+j]==true || col[j]==true || antidiag[n+row-j]==true){
                continue;
            }

            result[row][j]=1;
            diag[row+j]=true;
            antidiag[n+row-j]=true;
            col[j]=true;

            Nqueens(row+1,col,diag,antidiag,result,n, arrayLists);

            result[row][j]=0;
            diag[row+j]=false;
            antidiag[n+row-j]=false;
            col[j]=false;


        }


    }

    private static ArrayList<Integer> convertMattoList(int[][] result) {
        return (ArrayList<Integer>) Arrays.stream(result)
                .flatMapToInt(IntStream::of)
                .boxed()
                .collect(Collectors.toList());
    }


}
