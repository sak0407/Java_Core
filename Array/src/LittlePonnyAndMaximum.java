import java.util.stream.IntStream;

/*
* Little Ponny is given an array, A, of N integers. In a particular operation, he can set any element of the
* array equal to -1.

He wants your help in finding out the minimum number of operations required such that the maximum element of
the resulting array is B. If it is not possible, then return -1.
*
 A = [2, 4, 3, 1, 5]
 B = 3
 output = 2
 A = [1, 4, 2]
 B = 3
 output = -1
* */
public class LittlePonnyAndMaximum {

    public static int littlePonny(int[] arr,int B){
        int count=0;
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>B){
                count++;
            }
            if(arr[i]==B){
                flag=true;
            }
        }
        if(!flag){
            count=-1;
        }
        return count;

    }
    public static void main(String[] args) {

        int[] arr={2,4,3,1,6};
        int B = 5;

        System.out.println(littlePonny(arr,B));

    }
}
