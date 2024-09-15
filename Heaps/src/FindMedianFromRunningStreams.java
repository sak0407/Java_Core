import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/*Running Stream of integers .Fnd the median of current elements after
 every element join.


* */
public class FindMedianFromRunningStreams {
    public static void main(String[] args) {

        int[] A={3,2,5,7,6,9};
        int n=A.length;
        int[] answer=new int[n];

        PriorityQueue<Integer> min=new PriorityQueue<>();
        PriorityQueue<Integer> max=new PriorityQueue<>(Collections.reverseOrder());


        for(int i=0;i<n;i++){

            if(max.isEmpty() && min.isEmpty()){
                max.add(A[i]);
            }else{

                if(A[i]<max.peek()){
                    max.add(A[i]);

                    if(max.size()-min.size()>1){
                        int a=max.poll();
                        min.add(a);
                    }
                }else{
                    min.add(A[i]);
                    if(min.size()>max.size()){
                        int b=min.poll();
                        max.add(b);
                    }
                }

            }

            if((max.size()+min.size())%2==0){
                answer[i]=(max.peek()+min.peek()) /2;
            }else{
                answer[i]=max.peek();
            }

        }

        Arrays.stream(answer).forEach(System.out::print);

    }
}
