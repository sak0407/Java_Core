import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

/*
Given an integer array A of size N.
You have to find the product of the three largest integers in array A from
range 1 to i, where i goes from 1 to N.
Return an array B where B[i] is the product of the largest 3 integers in
range 1 to i in array A. If i < 3, then the integer at index i in B should be -1.

1 <= N <= 105
0 <= A[i] <= 103

Output Format
Return an integer array B. B[i] denotes the product of the largest 3 integers
in range 1 to i in array A.

Input 1:
 A = [1, 2, 3, 4, 5]
Output 1:
 [-1, -1, 6, 24, 60]

 For i = 1, ans = -1
 For i = 2, ans = -1
 For i = 3, ans = 1 * 2 * 3 = 6
 For i = 4, ans = 2 * 3 * 4 = 24
 For i = 5, ans = 3 * 4 * 5 = 60

 So, the output is [-1, -1, 6, 24, 60].

Input 2:
 A = [10, 2, 13, 4]
Output 2:
 [-1, -1, 260, 520]

 For i = 1, ans = -1
 For i = 2, ans = -1
 For i = 3, ans = 10 * 2 * 13 = 260
 For i = 4, ans = 10 * 13 * 4 = 520

 So, the output is [-1, -1, 260, 520].


* */
public class Productof3 {
    public static void main(String[] args) {

        int[] A={10,2,13,4};

        int n=3; //as we need 3rd highest
        ArrayList<Integer> ans=new ArrayList<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int product=1;
        for(int i=0;i<3;i++){
            pq.add(A[i]);

            product=product*A[i];
            if(i==2){
                ans.add(product);

            }else{
                ans.add(-1);
            }

        }


         //System.out.println(product);
        // pq.stream().forEach(i->System.out.println(i));


        for(int i=n;i<A.length;i++){
           // product=1;
            if(A[i]> pq.peek()){
                product =product / pq.element();
                product=product *  A[i];
                ans.add(product);
                pq.poll();
                pq.add(A[i]);
            }else{

                ans.add(product);

            }
 
        }


        int[] a=ans.stream().mapToInt(Integer::intValue).toArray();

        Arrays.stream(a).forEach(System.out::print);

    }
}
