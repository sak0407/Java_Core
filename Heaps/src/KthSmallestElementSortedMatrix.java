import java.util.PriorityQueue;

/*Given a sorted matrix of integers A of size N x M and an integer B.
Each of the rows and columns of matrix A is sorted in ascending order,
find the Bth smallest element in the matrix.

NOTE: Return The Bth smallest element in the sorted order,
not the Bth distinct element.

Input 1:
 A = [ [9, 11, 15],
       [10, 15, 17] ]
 B = 6

 out=17
 6th smallest element in the sorted matrix is 17.

Input 2:
 A = [  [5, 9, 11],
        [9, 11, 13],
        [10, 12, 15],
        [13, 14, 16],
        [16, 20, 21] ]
 B = 12
 out=16
 12th smallest element in the sorted matrix is 16.

* */
public class KthSmallestElementSortedMatrix {
    public static void main(String[] args) {
        int[][] A={
                   {9,11,15},
                   {10,15,17}
                  };
        int B=6;
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                pq.add(A[i][j]);
            }
        }

        pq.stream().forEach(System.out::print);
        System.out.println("===============");

        while(B>1){
            System.out.println(pq.remove());
            B--;
        }

        System.out.println(pq.peek());
    }
}
