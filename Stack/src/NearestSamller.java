/*
*  Nearest Smaller Element in Left

Given an array A, find the nearest smaller element G[i] for every element A[i] in the array such that
the element has an index smaller than i.

More formally,
G[i] for an element A[i] = an element A[j] such that
j is maximum possible AND
j < i AND A[j] < A[i]

Elements for which no smaller element exist, consider the next smaller element as -1.
A = [4, 5, 2, 10, 8]
[-1, 4, -1, 2, 2]
A = [1, 6, 4, 10, 2, 5]
[-1,1,1,4,1,2]


======================================================================================================


* */

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Stream;

public class NearestSamller {
    public static void main(String[] args) {
        int[] A={1, 6, 4, 10, 2, 5};
        //nearestSmallerBasic(A);
        int[] ans=nearestSmallerLeftStack(A);
        Arrays.stream(ans).forEach(System.out :: print);

    }

    private static int[] nearestSmallerLeftStack(int[] a) {
        Stack<Integer> st=new Stack<>();
        int[]  ans=new int[a.length];
        int n= a .length;

        for(int i=0;i<n;i++){

            while(!st.isEmpty() && st.peek()>a[i]){
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

    private static void nearestSmallerBasic(int[] a) {

        int n=a.length;
        System.out.print(-1+" ");
        for(int i=1;i<n;i++) {
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (a[i] > a[j]) {
                    System.out.print(a[j] + " ");
                    break;
                }
            }
            if (j == -1) {
                System.out.print(-1+" ");
            }

        }
    }
}
