/*You are given an integer array A.
Decide whether it is possible to divide the array into one or more subarrays
of even length such that the first and last element of all subarrays will be even.
Return "YES" if it is possible; otherwise, return "NO" (without quotes).

A = [2, 4, 8, 6]
YES
We can divide A into [2, 4] and [8, 6].
A = [2, 4, 8, 7, 6]
NO
There is no way to divide the array into even length subarrays.

* */
public class EvenSubarrays {
    public static void main(String[] args) {

        int[] A={2,5,8,6};
        int n=A.length;

        //A subarray will be even subarray -->
           // if size is even
           //subarray length cant be one
           //
        for(int i=0;i<n-1;i++){
           if(n % 2 ==0 && A[0]%2==0 && A[n-1]%2==0){
               System.out.println("This is Even Subarray");
           }else{
               System.out.println("This is odd Subarray");
           }
        }

    }
}
