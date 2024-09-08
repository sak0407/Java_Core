import java.util.ArrayList;
import java.util.Collections;

public class MinHeap {

    final ArrayList<Integer> heap;
    public MinHeap(){
       heap=new ArrayList<>();
    }

    //add in Heap
    public ArrayList<Integer> insert(int val){

        heap.add(val);

        int i=heap.size()-1;

        while(i!=0){

            int p=(i-1) /2 ;

            if(heap.get(p)>heap.get(i)){
                swap(p,i);
                i=p;
            }else{
                break;
            }
        }
        return heap;

    }

    //Extract Minimum, Remove Minimum , Correct the heap
    public Integer extractMin(){
        Integer min=heap.get(0);
        int n=heap.size();
        swap(0,n-1);
        heap.remove(n-1);
        heapify(0);
        return min;
    }

    public void heapify(int i){
        int n= heap.size();
        int x;

       while(((2 * i) +1)<n){

           int curr=heap.get(i);
           int lchild=heap.get((2 * i)+1);

           if(((2*i)+2)<n) {
               int rchild = heap.get((2 * i) + 2);


               int min = Math.min(Math.min(curr, lchild), rchild);

               if (min == curr) {
                   break;
               } else if (min == lchild) {
                   swap(i, 2 * i + 1);
                   i = 2 * i + 1;
               } else {
                   swap(i, 2 * i + 2);
                   i = 2 * i + 2;
               }
           }else{
               x = Math.min(curr, lchild);
               if (x == curr) break;
               else {
                   swap(i, (2 * i) + 1);
                   i = (2 * i) + 1;
               }
           }
       }


    }



    private void swap(int i,int j){
        int temp=heap.get(i);
        heap.set(i,heap.get(j));
        heap.set(j,temp);

    }

    public Integer getMin(){
        return heap.get(0);
    }

    public int Size(){
        return  heap.size();
    }

    public boolean isEmpty(){
        return heap.isEmpty();
    }

    @Override
    public String toString() {
        return "MinHeap{" +
                "heap=" + heap +
                '}';
    }
}
