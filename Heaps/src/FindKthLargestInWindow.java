import java.util.Arrays;
import java.util.PriorityQueue;

public class FindKthLargestInWindow {
    public static void main(String[] args) {
        int[] A={10,8,7,5,16,19,3};
        int[] ans=new int[A.length];
        int K=3;  //find 3rd largest in a window(0->i),where (i>=k-1)
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for(int i=0;i<K;i++){
            pq.add(A[i]);
        }
        int k=0;
        for(int i=K;i<A.length;i++){
            if(pq.peek()>= A[i]){
                ans[k]= pq.element();
                k++;
            }else{
                pq.poll();
                pq.add(A[i]);

            }
            ans[k]=pq.element();
            k++;

        }


        Arrays.stream(ans).forEach(System.out::print);
    }
}
