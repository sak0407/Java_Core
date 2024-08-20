import java.util.Arrays;
import java.util.Stack;

/*
* Nearest Greater in Right

Given an array A, find the next greater element G[i] for every element A[i] in the array.
The next greater element for an element A[i] is the first greater element on the right side of A[i] in the array, A.

More formally:

G[i] for an element A[i] = an element A[j] such that
    j is minimum possible AND
    j > i AND
    A[j] > A[i]

 A = [4, 5, 2, 10]
     [5,10,10,-1]
 A = [4, 5, 2, 10, 8]
     [5, 10, 10, -1, -1]
 A = [1, 6, 4, 10, 2, 5]
     [6,10,10,-1,5,-1]
 *
* */
public class NearestGreater {

    public static void main(String[] args) {
        int[] A={1, 6, 4, 10, 2, 5};
        int[] ans=nearestGreaterStack(A);
        Arrays.stream(ans).forEach(System.out::print);
    }

    private static int[] nearestGreaterStack(int[] a) {
        Stack<Integer> st=new Stack();
        int[] ans=new int[a.length];
        for(int i=a.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<a[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=-1;
            }else{
                ans[i]=st.peek();
            }

            st.push(a[i]);


        }

        return ans;
    }
}
