import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Given a set of distinct integers A, return all possible subsets.
NOTE:
Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
Also, the subsets should be sorted in ascending (lexicographic ) order.
The initial list is not necessarily sorted.

A = [1]
A = [1, 2, 3]
=============
[
    []
    [1]
]
=============
[
 []
 [1]
 [1, 2]
 [1, 2, 3]
 [1, 3]
 [2]
 [2, 3]
 [3]
]
==============
* */
public class Subset {




    public static void main(String[] args) {

        int[] A={7,4,5,4};
        Arrays.sort(A);
        List<List<Integer>> result=new ArrayList<>() ;
        List<Integer> temp=new ArrayList<>();
        int n=A.length;
        subset(0,n,temp,result,A);
        result.stream().forEach(System.out::print);

    }

    private static void subset(int pos, int n, List<Integer> temp, List<List<Integer>> result, int[] A) {
        result.add(new ArrayList<>(temp));

        for(int j=pos;j<n;j++){
            temp.add(A[j]);
            subset(j+1,n,temp,result,A);
            temp.remove(temp.size()-1);
        }

    }
}
