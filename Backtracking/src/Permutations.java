import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Given an integer array A of size N denoting collection of numbers ,
return all possible permutations.

NOTE:

No two entries in the permutation sequence should be the same.
For the purpose of this problem, assume that all the numbers in the collection are unique.
Return the answer in any order

A = [1, 2, 3]

[ [1, 2, 3]
  [1, 3, 2]
  [2, 1, 3]
  [2, 3, 1]
  [3, 1, 2]
  [3, 2, 1] ]

* */
public class Permutations {

    public static void swap(int i,int j,int[] temp){

        int t=temp[i];
        temp[i]=temp[j];
        temp[j]=t;
    }
    public static void permutaion(int pos,int n,int[] temp){

        if(pos==n){
            Arrays.stream(temp).boxed().forEach(System.out::print);
            System.out.println();
            return;
        }

        for(int j=pos;j<n;j++){
            swap(pos,j,temp);
            permutaion(pos+1,n,temp);
            swap(pos,j,temp);
        }

    }






    public static void main(String[] args) {

             int[] A={1,2,1};

             permutaion(0,A.length,A);





    }
}
