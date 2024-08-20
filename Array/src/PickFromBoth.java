/*You are given an integer array A of size N.
You have to perform B operations. In one operation, you can remove either the leftmost or
the rightmost element of the array A.
Find and return the maximum possible sum of the B elements that were removed after the B operations.
NOTE: Suppose B = 3, and array A contains 10 elements, then you can:

Remove 3 elements from front and 0 elements from the back, OR
Remove 2 elements from front and 1 element from the back, OR
Remove 1 element from front and 2 elements from the back, OR
Remove 0 elements from front and 3 elements from the back.

A = [ 2, 3, -1, 4, 2, 1 ]
B = 4

Remove the first element and the last 3 elements. So we get 2 + 4 + 2 + 1 = 9

* */

public class PickFromBoth {
    public static void main(String[] args) {
        int[] arr=
        {-533,-666,-500,169,724,478,358,-38,-536,705,-855,281,-173,961,-509,-5,942,-173,436,
                -609,-396,902,-847,-708,-618,421,-284,718,895,447,726,-229,538,869,912,667,
                -701,35,894,-297,811,322,-667,673,-336,141,711,-747,-132,547,644,-338,-243,
                -963,-141,-277,741,529,-222,-684,35};
        //{2,3,-1,4,3,1,9};
        int B=48;
        int size=pickFromBothSide(arr,B);
        System.out.println(size);
    }

    private static int  pickFromBothSide(int[] A, int B) {

        System.out.println(A.length);

        int maxSum=0;

        int i=0;
        int sum=0;
        while(i<B){
            sum=sum + A[i];
            i++;
        }

        i=i-1;
        maxSum=sum;
        int j=A.length-1;
        while(i>=0){
            sum=sum-A[i]+A[j];
            maxSum = Math.max(maxSum,sum);
            i--;
            j--;

        }

        return maxSum;

    }
}
