/*Given an array A of size N, find the subarray of size B with the least average.

A = [3, 7, 90, 20, 10, 50, 40]
B = 3

Ans:: 3

Subarray between indexes 3 and 5 The subarray {20, 10, 50} has the least average
among all subarrays of size 3.

A = [3, 7, 5, 20, -10, 0, 12]
B = 2

4
Subarray between [4, 5] has minimum average

* */

public class LeastAverageSubarrays {
    public static void main(String[] args) {

        int[] A = {3, 7, 5, 20, -10, 0, 12};
        int B=2;

        //Consider all subarray of length k, then add element then find out average
        // if size of subarray is k
        //then n-k subarray will be there

        //for first sunarray lets get the sum and average
        int sum=0;
        float avg=Integer.MAX_VALUE;
        int n=A.length;
        for(int i=0;i<B;i++){
            sum = sum + A[i];
            float a=(float) sum/B;
            if(avg>a){
                avg=a;
                System.out.println(i+" "+(B-1));
            }
            avg=Math.min(avg,a);
        }
        int s=1;
        int e=B;

        while(s<=n-B){
            sum= sum-A[s-1]+A[e];
            float a=(float) sum/B;
            if(avg>a){
                avg=a;
                System.out.println(s+" "+e);
            }
            s++;
            e++;
        }

        System.out.println(avg);

    }
}
