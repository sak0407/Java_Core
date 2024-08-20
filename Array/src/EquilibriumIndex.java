import java.util.stream.IntStream;

/*You are given an array A of integers of size N.
Your task is to find the equilibrium index of the given array

The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the
 sum of elements at higher indexes.

If there are no elements that are at lower indexes or at higher indexes, then the corresponding
sum of elements is considered as 0.

Note:

Array indexing starts from 0.
If there is no equilibrium index then return -1.
If there are more than one equilibrium indexes then return the minimum index.

A = [-7, 1, 5, 2, -4, 3, 0]

* */
public class EquilibriumIndex {
    public static void main(String[] args) {
        int[] A={1,2,3,7,1,2,3};

      //-7,1,5,2,-4,3,0

        int result=findIndex(A);
        System.out.println(result);
    }

    private static int findIndex(int[] a) {

        int pfi=0;
        int pfn=0;

        for(int i=0;i<a.length;i++){
            pfn+=a[i];
        }

       for(int i=0;i<a.length;i++){
           pfi+=a[i];
           if(i != 0){
               if(pfn-pfi == pfi -a[i]){
                   return i;
               }
           }else{
               if(pfn-pfi==0){
                   return 0;
               }
           }
       }
        return -1;
    }

    private static int findIndexWithExtraSpace(int[] a) {

        int[] pf=new int[a.length];
        pf[0]=a[0];
        for(int i=1;i<a.length;i++){
            pf[i]=a[i]+pf[i-1];
        }


        for(int i=0;i<a.length;i++){
            if(i==0){ //corner case
                if(pf[a.length-1]-pf[i]==0){
                    return 0;
                }

            } else if(pf[i-1] == pf[a.length-1]-pf[i]){
                return i;
            }
        }

        return -1;
    }
}
