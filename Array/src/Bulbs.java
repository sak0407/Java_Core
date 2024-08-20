/*A wire connects N light bulbs.
Each bulb has a switch associated with it; however, due to faulty wiring,

a switch also changes the state of all the bulbs to the right of the current bulb.

Given an initial state of all bulbs, find the minimum number of switches you have
to press to turn on all the bulbs.

You can press the same switch multiple times.
Note: 0 represents the bulb is off and 1 represents the bulb is on.

 A = [0, 1, 0, 1]
 4
 A = [1, 1, 1, 1]
 0

Explanation 1:
 press switch 0 : [1 0 1 0]
 press switch 1 : [1 1 0 1]
 press switch 2 : [1 1 1 0]
 press switch 3 : [1 1 1 1]
Explanation 2:
 There is no need to turn any switches as all the bulbs are already on.
* */
public class Bulbs {
    public static void main(String[] args) {
        int[] A={1,1,0,1,0,0,1};
        int n=A.length;
        int count=0;
        /*for(int i=0;i<n;i++){
            if(arr[i]==0){
                count++;
                for(int j=i;j<n;j++){
                    arr[j]=1-arr[j];
                }
            }
        }*/

        for(int i=0;i<n;i++){
            int state=A[i];
            if(count % 2==0){
                state=A[i];
            }else{
                state=1-A[i];
            }
            if(state==0){
                count++;
            }
        }
        System.out.println("count "+count);
    }
}
