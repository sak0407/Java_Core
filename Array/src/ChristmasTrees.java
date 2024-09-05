import java.util.Arrays;
import java.util.Scanner;

/*You are given an array A consisting of heights of Christmas trees and an
array B of the same size consisting of the cost of each of the trees
(Bi is the cost of tree Ai, where 1 ≤ i ≤ size(A)), and you are supposed
to choose 3 trees (let's say, indices p, q, and r), such that Ap < Aq < Ar,
where p < q < r.
The cost of these trees is Bp + Bq + Br.

You are to choose 3 trees such that their total cost is minimum. Return that cost.
If it is not possible to choose 3 such trees return -1.

Input 1:
 A = [1, 3, 5]
 B = [1, 2, 3]
Input 2:
 A = [1, 6, 4, 2, 6, 9]
 B = [2, 5, 7, 3, 2, 7]

Output 1:
 6
Output 2:
 7

Explanation 1:
 We can choose the trees with indices 1, 2 and 3, and the cost is 1 + 2 + 3 = 6.
Explanation 2:
 We can choose the trees with indices 1, 4 and 5, and the cost is 2 + 3 + 2 = 7.
 This is the minimum cost that we can get.



* */
public class  ChristmasTrees {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       /* String input=sc.nextLine();
        String[] inputArray=input.split(" ");
        int[] A= Arrays.stream(inputArray).mapToInt(Integer::parseInt).toArray();

        String input2=sc.nextLine();
        String[] inputArray2=input2.split(" ");
        int[] B= Arrays.stream(inputArray2).mapToInt(Integer::parseInt).toArray();
        */

       int[] A = {1, 6, 4, 2, 6, 9};
       int[] B = {2, 5, 7, 3, 2, 7};


        System.out.println(minimunCost(A,B));



    }

    private static int minimunCost(int[] a, int[] b) {
        int n=a.length;



        int min=Integer.MAX_VALUE;


        //As first and last value can not be middle element
        for(int i=1;i<n-1;i++){


            int right_min=Integer.MAX_VALUE;

            for(int j=0;j<=i-1;j++){
                if(a[i]>a[j]){
                    if(right_min>b[j]){
                        right_min=b[j];
                    }
                }

            }

            int left_min=Integer.MAX_VALUE;

            for(int k=i+1;k<n;k++){
                if(a[i]<a[k]){
                    if(left_min>b[k]){
                        left_min=b[k];
                    }

                }
            }

            int ans=b[i]+right_min+left_min;

            if(ans<min){
                min=ans;
            }


        }

        if(min != Integer.MIN_VALUE){
            return min;
        }
      return -1;
    }
}
