import java.util.stream.IntStream;

/*You are given an integer array A of length N.
You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.
A = [1, 2, 3, 4, 5]
B = [[0, 3], [1, 2]]

[10, 5]

The sum of all elements of A[0 ... 3] = 1 + 2 + 3 + 4 = 10.
The sum of all elements of A[1 ... 2] = 2 + 3 = 5.

A = [2, 2, 2]
B = [[0, 0], [1, 2]]

The sum of all elements of A[0 ... 0] = 2 = 2.
The sum of all elements of A[1 ... 2] = 2 + 2 = 4.

[2, 4]

* */
public class RangeSumQuery {
    public static void main(String[] args) {
        int[] arr={2, 2, 2};
        int[][] B ={{0,0},{1,2}};
        int[] result=new int[B.length];

       int[] pf=new int[arr.length];

       for(int i=0;i<arr.length;i++){
           if(i==0){
               pf[i]=arr[0];
           }else{
               pf[i]=arr[i]+pf[i-1];
           }
       }

       for(int i=0;i<B.length;i++){
           int start=B[i][0];
           int end=B[i][1];
           if(start ==0){
               result[i]=pf[end];
           }else{
               result[i]=pf[end]-pf[start-1];
           }


       }

        IntStream.of(result).forEach(System.out::print);

    }
}
