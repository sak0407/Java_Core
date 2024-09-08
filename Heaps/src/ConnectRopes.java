import java.util.PriorityQueue;

/*
You are given an array A of integers that represent
the lengths of ropes.

You need to connect these ropes into one rope.
The cost of joining two ropes equals the sum of their lengths.

Find and return the minimum cost to connect these ropes into one rope.

A = [1, 2, 3, 4, 5]
ans: 33
 Given array A = [1, 2, 3, 4, 5].
 Connect the ropes in the following manner:
 1 + 2 = 3
 3 + 3 = 6
 4 + 5 = 9
 6 + 9 = 15

 So, total cost  to connect the ropes into one is 3 + 6 + 9 + 15 = 33.

A = [5, 17, 100, 11]
ans: 182
 Given array A = [5, 17, 100, 11].
 Connect the ropes in the following manner:
 5 + 11 = 16
 16 + 17 = 33
 33 + 100 = 133

 So, total cost  to connect the ropes into one is 16 + 33 + 133 = 182.

* */
public class ConnectRopes {
    public static void main(String[] args) {

        //int[] A = {1, 2, 3, 4, 5};
        int[] A={1,8,4,7,3};


        //extracting minimum from array and add it
        //using

        System.out.println("=======Creating Min heap===========");

       MinHeap pq=new MinHeap();

       for(int i=0;i<A.length;i++){
           pq.insert(A[i]);
       }


       System.out.println(pq.toString());

       int y=0;
       while(pq.Size()>1){
           int a= pq.extractMin();
           int b= pq.extractMin();
           int ts=a +b;
           y=y+ts;
           pq.insert(ts);
           System.out.print(pq);
           System.out.println();


       }
       System.out.println(y);











        System.out.println("=======Using Priority Queue===========");

        PriorityQueue<Integer> pq1=new PriorityQueue<>();
        for(int i=0;i<A.length;i++){
            pq1.add(A[i]);
        }

        pq1.stream().forEach(System.out::print);
        System.out.println();


        int cost=0;

        while (pq1.size() > 1) {
            int m=pq1.poll();
            int n=pq1.poll();
            int twoSum = m + n; // first two min get added and deleted from pq Heap

            cost = cost + twoSum;
            pq1.add(twoSum); // cost of the connecting the two ropes is added in the pq Heap
            pq1.stream().forEach(System.out::print);
            System.out.println();
        }

       System.out.println("====");
       System.out.println(cost);




    }
}
