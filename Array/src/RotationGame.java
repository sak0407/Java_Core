/*Given an integer array A of size N and an integer B,
* you have to print the same array after rotating it B
* times towards the right.
*
* 1 2 3 4
* 2
*
* 3 4 1 2
*
* */

import java.util.stream.IntStream;

public class RotationGame {

    public static void reverse(int[] arr, int i, int j){

        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

    }

    public static void rotationArray(int[] arr,int n){

        reverse(arr,0,arr.length-1);
        reverse(arr,0,n-1);
        reverse (arr,n,arr.length-1);

    }

    public static void main(String[] args) {

        int[] array={1,2,3,4};
        int n=2;
        rotationArray(array,2);
        IntStream.of(array).forEach(System.out::print);

    }
}
