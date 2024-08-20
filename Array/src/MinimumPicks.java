/*You are given an array of integers A of size N.
Return the difference between the maximum among all even numbers of A
and the minimum among all odd numbers in A.

 A = [5, 17, 100, 1]
 99
 A = [0, 2, 9]
 -7
* */
public class MinimumPicks {
    public static void main(String[] args) {
        int[] A={-98,54,-52,15,23,-97,12,-64,52,85};


        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;



        for(int i=0;i<A.length;i++){
            if(A[i]%2==0 && A[i]>max){
                max=A[i];
            }else if(A[i]%2!=0 && A[i]<min){
                min=A[i];
            }
        }

        System.out.println(max-min);

    }
}
