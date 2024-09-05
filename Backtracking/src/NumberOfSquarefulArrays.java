import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Given an array of integers A, the array is squareful if for every pair
 of adjacent elements, their sum is a perfect square.

Find and return the number of permutations of A that are squareful.
Two permutations A1 and A2 differ if and only if there is some
index i such that A1[i] != A2[i].

Input 1:
 A = [2, 2, 2]
Input 2:
 A = [1, 17, 8]

 Output 1:
 1
Output 2:
 2

Explanation 1:
Only permutation is [2, 2, 2], the sum of adjacent element is 4 and 4 and
both are perfect square.
Explanation 2:
Permutation are [1, 8, 17] and [17, 8, 1].

* */
public class NumberOfSquarefulArrays {
    public static void main(String[] args) {
       // int[] A={1,17,8};
        int[] A={8,9,7};

        //finding all permutaions


        List<Integer> result=new ArrayList<>();
        boolean visited[]=new boolean[A.length];
        generatePermutaions(0,A.length,A,new ArrayList<Integer>(),result,visited);
        result.stream().forEach(System.out::println);


    }

    private static void generatePermutaions(int pos, int length, int[] A, ArrayList<Integer> temp,List<Integer> res,boolean[] visited) {

        if(pos==length){

            for(int j=1;j<temp.size();j++){
                int a=temp.get(j-1);
                int b=temp.get(j);

                if(!perfectSquare(a+b)){
                    return;
                }
            }

            int I=Integer.parseInt(temp.stream().map(String::valueOf)
                    .reduce("",String::concat));

           // System.out.println(I);
            res.add(I);
            return;
        }

        for(int j=0;j<length;j++){
            if(!visited[j]) {
                temp.add(A[j]);
                visited[j] = true;
                generatePermutaions(pos + 1, length, A, temp, res, visited);
                temp.remove(temp.size() - 1);
                visited[j] = false;
            }

        }
    }

    private static boolean perfectSquare(int n) {

        if(n <= 1){
            return true;
        }

        int l=1;int r=n;

        while(l<=r){

            int mid= (l+r)/2;
            int square= mid * mid;
            if(square== n){
                return true;
            }
            else if(square>n){
                r=mid-1;
            }else{
                l=mid+1;
            }

        }

        return false;

    }


}
