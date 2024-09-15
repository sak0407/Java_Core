import java.util.PriorityQueue;

/*Given an array of integers A and an integer B.
You must modify the array exactly B number of times. In a single modification,
we can replace any one array element A[i] by -A[i].

You need to perform these modifications in such a way that after
exactly B modifications, sum of the array must be maximum.

NOTE: You can perform the modification on the same element multiple times.

Problem Constraints
1 <= length of the array <= 5*105
1 <= B <= 5 * 106
-100 <= A[i] <= 100

 A = [24, -68, -29, -9, 84]
 B = 4
Operation 1: Make -29 to 29,
Operation 2: Make -9 to 9,
Operation 3: Make 9 to -9,
Operation 4: Make -68 to 68.
Thus, the final array after 4 modifications = [24, 68, 29, -9, 84]

 196
 =========

 A = [57, 3, -14, -87, 42, 38, 31, -7, -28, -61]
 B = 10
Final array after B modifications = [57, -3, 14, 87, 42, 38, 31, 7, 28, 61]
 362

* */
public class MaximumArraySumAfterBNegetions {
    public static void main(String[] args) {
        int[] A={57, 3, -14, -87, 42, 38, 31, -7, -28, -61};

        int B=10;

        PriorityQueue<Integer> pq=new PriorityQueue<>();

        int sum=0;
        for(int i=0;i<A.length;i++){
            sum=sum+A[i];
            pq.add(A[i]);
        }

        while(B>0){
            int a=pq.remove();
            sum=sum-a;
            int b=-a;
            sum=sum + b;
            pq.add(b);
            B--;
        }

        System.out.println(sum);

    }
}
