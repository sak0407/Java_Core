/*Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element
 from these indices makes the sum of even-indexed and odd-indexed array elements equal.

 A= 4 1 5 3 7 10
* */

import java.util.stream.IntStream;

public class SpecialIndex {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,6,-2};
        int count=specialIndex(arr);
        System.out.println(count);
    }

    private static int specialIndex(int[] A) {
        int n=A.length;
        int[] pfeven=new int[n];
        int[] pfodd=new int[n];

        for(int i=0;i<n;i++){
            if(i==0){
                pfeven[0]=A[0];
                pfodd[0]=0;
            }else if(i%2==0){
                pfeven[i]=pfeven[i-1]+A[i];
                pfodd[i]=pfodd[i-1];
            }else{
                pfeven[i]=pfeven[i-1];
                pfodd[i]=pfodd[i-1]+A[i];
            }
        }

  //IntStream.of(pfeven).forEach(i->System.out.print(" "+i));System.out.println();
  //IntStream.of(pfodd).forEach(i->System.out.print(" "+i));System.out.println();

        int EvenSum=0;
        int OddSum=0;
        int count=0;

        for(int i=0;i<n;i++){
            if(i==0){
                EvenSum=pfodd[n-1]-pfodd[0];
                OddSum=pfeven[n-1]-pfeven[0];

            }else {
                EvenSum = pfeven[i-1]+ pfodd[n-1]-pfodd[i];//sumeven(0->i-1 )+ sumodd(i+1->n)
                OddSum = pfodd[i-1]+pfeven[n-1]-pfeven[i];

            }
            if(EvenSum == OddSum){
                count++;
            }

        }

        return count;
    }
}
