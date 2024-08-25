/*You are given an integer array A of length N.
You have to find the sum of all subarray sums of A.
More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting zero or more elements from either end of the array.
A subarray sum denotes the sum of all the elements of that subarray.

Note : Be careful of integer overflow issues while calculations. Use appropriate datatypes.
A = [1, 2, 3]
The different subarrays for the given array are: [1], [2], [3], [1, 2], [2, 3], [1, 2, 3].
Their sums are: 1 + 2 + 3 + 3 + 5 + 6 = 20

A = [2, 1, 3]
The different subarrays for the given array are: [2], [1], [3], [2, 1], [1, 3], [2, 1, 3].
Their sums are: 2 + 1 + 3 + 3 + 4 + 6 = 19
* */
public class SumOfAllSubarrays {
    public static void main(String[] args) {

        int[] A={1,2,3};
        int n=A.length;

        //Basic Approach -> Consider all subarray -> n3 solution
        //prefixSum n2
        //Contribution n
        int totalSum=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    sum=sum+A[k];
                }
            }
            totalSum +=sum;

        }
        System.out.println(totalSum);

        //Contribution

        //(i-0+1) *(n-1 -i+1) =>(i+1)*(n-i)
        int totalSum2=0;
        for(int i=0;i<n;i++){
            totalSum2 = totalSum2 + A[i]*(i+1)*(n-i);
        }
        System.out.println(totalSum2);

    }
}
