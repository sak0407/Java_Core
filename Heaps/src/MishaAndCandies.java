import java.util.PriorityQueue;
/*
Misha loves eating candies. She has been given N boxes of Candies.
She decides that every time she will choose a box having the minimum
number of candies, eat half of the candies and put the remaining
candies in the other box that has the minimum number of candies.
Misha does not like a box if it has the number of candies greater
than B so she won't eat from that box. Can you find how many candies
she will eat?

NOTE 1: If a box has an odd number of candies then
Misha will eat the floor(odd / 2).

NOTE 2: The same box will not be chosen again.

Return an integer denoting the number of candies Misha will eat.

 A = [3, 2, 3]
 B = 4

 Out:2
 Explanation 1:
 1st time Misha will eat from 2nd box, i.e 1 candy she'll eat and will
 put the remaining 1 candy in the 1st box.
 2nd time she will eat from the 3rd box, i.e 1 candy she'll eat and will
 put the remaining 2 candies in the 1st box.
 She will not eat from the 3rd box as now it has candies greater than B.
 So the number of candies Misha eat is 2.

Input 2:

 A = [1, 2, 1]
 B = 2
 Out: 1
 Explanation 2:
 1st time Misha will eat from 1st box, i.e she can't eat any and will put
 the remaining 1 candy in the 3rd box.
 2nd time she will eat from the 3rd box, i.e 1 candy she'll eat and will
 put the remaining 1 candies in the 2nd box.
 She will not eat from the 2nd box as now it has candies greater than B.
 So the number of candies Misha eat is 1.

 * */
public class MishaAndCandies {
    public static void main(String[] args) {

        int[] A={1,2,1};
        int B=2;

        PriorityQueue<Integer> pq=new PriorityQueue();

        for(int i=0;i<A.length;i++){
            pq.add(A[i]);
        }

        int eat=0;

        while(pq.peek()<=B){

            int a=pq.remove();
            int b=a/2;
            eat=eat+b;
            if(!pq.isEmpty()){
                int c=pq.poll();
                pq.add(c+b);
            }else{
                break;
            }

        }

        System.out.println(eat);
    }
}
