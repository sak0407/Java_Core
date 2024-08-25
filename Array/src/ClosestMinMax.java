import java.util.stream.IntStream;

/*Given an array A, find the size of the smallest subarray such that it contains
 at least one occurrence of the maximum value of the array
and at least one occurrence of the minimum value of the array.

A = [1, 3, 2]
2
A = [2, 6, 1, 6, 9]
3
A= [1,2,3,1,3,4,6,4,6,3]
4

* */
public class ClosestMinMax {
    public static void main(String[] args) {

        //int[] A={1,2,3,1,3,4,6,4,6,3};
        int[] A={7,2,3,3,1,6,7,1,3,4,1};

        //find min
        int min= IntStream.of(A).min().getAsInt();
        //find max
        int max=IntStream.of(A).max().getAsInt();

        System.out.println(min+" "+max);

        int close_min=-1;
        int close_max=-1;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++){
            if(A[i]==min ){
                close_min=i;
                if(close_max !=-1){
                    int len=i-close_max+1;
                    if(ans>len){
                        ans=len;
                        System.out.println(close_max+":"+i);
                    }
                }


            }else if(A[i]==max){
                close_max=i;
                if(close_min != -1){
                    int len=i-close_min+1;
                    if(ans>len){
                        ans=len;
                        System.out.println(close_min+":"+i);

                    }
                }


            }
        }

        System.out.println(ans);


    }
}
