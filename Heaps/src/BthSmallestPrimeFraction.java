import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

/*Given a sorted array of integers A which contains 1 and some number of primes.

Then, for every p < q in the list, we consider the fraction p / q.

What is the B-th smallest fraction considered?

Return your answer as an array of integers, where answer[0] = p and answer[1] = q.

 A = [1, 2, 3, 5]
 B = 3
 out = [2, 5]

 Explanation 1:
 The fractions to be considered in sorted order are:
 [1/5, 1/3, 2/5, 1/2, 3/5, 2/3]
 The third fraction is 2/5.

 A = [1, 7]
 B = 1
 out = [1, 7]

 Explanation 2:
 The fractions to be considered in sorted order are:
 [1/7]
 The first fraction is 1/7.

* */
public class BthSmallestPrimeFraction {
    public static void main(String[] args) {

        int[] A={1,2,3,5}; int B=3;

        PriorityQueue<Double> pq=new PriorityQueue<>();

        HashMap<Double,int[]> map=new HashMap<>();
        int n=A.length;
        for(int i=0;i<n-1;i++){
            double frac = 1D * A[i] /A[n-1];
            pq.add(frac);
            map.put(frac,new int[]{i,n-1});
         }



       /* pq.stream().forEach(System.out::println);
        map.entrySet().forEach( e->{
                    System.out.print(e.getKey() +" ,");
                    Arrays.stream(e.getValue()).forEach(System.out::print);
                    System.out.println();
                });*/


        while(B != 1)
        {
            int[] temp = map.remove( pq.poll() );
            if( (temp[1]-1) > temp[0])
            {
                double fraction = 1D*A[temp[0]]/A[temp[1]-1];
                pq.add(fraction);
                map.put(fraction, new int[]{temp[0], temp[1]-1});
            }
            B--;
        }

        int[] ans = map.get(pq.peek());

        Arrays.stream(new int[]{A[ans[0]],A[ans[1]]}).forEach(System.out::print);



                }

}
