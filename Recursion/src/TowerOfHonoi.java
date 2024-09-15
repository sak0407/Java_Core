import java.util.ArrayList;

/*
In the classic problem of the Towers of Hanoi, you have 3 towers numbered
from 1 to 3 (left to right) and A disks numbered from 1 to A (top to bottom)
of different sizes which can slide onto any tower.

The puzzle starts with disks sorted in ascending order of size from
top to bottom (i.e., each disk
lsits on top of an even larger one).

You have the following constraints:

Only one disk can be moved at a time.
A disk is slid off the top of one tower onto another tower.
A disk cannot be placed on top of a smaller disk.
You have to find the solution to the Tower of Hanoi problem.

You have to return a 2D array of dimensions M x 3, where M is the minimum
number of moves needed to solve the problem.
In each row, there should be 3 integers (disk, start, end), where:

disk - number of the disk being moved
start - number of the tower from which the disk is being moved
end - number of the tower to which the disk is being moved

A = 2
[1 1 2 ] [2 1 3 ] [1 2 3 ]

We shift the first disk to the middle tower.
We shift the second disk to the last tower.
We, finally, shift the first disk from the middle tower to the last tower.

A = 3
[1 1 3 ] [2 1 2 ] [1 3 2 ] [3 1 3 ] [1 2 1 ] [2 2 3 ] [1 1 3 ]

We can see that this was the only unique path with minimal moves to move all
disks from the first to the third tower.


* */
public class TowerOfHonoi {
    public static void movement(int n, int src, int dest, int temp,
                                    ArrayList<ArrayList<Integer>> list){

        if(n==0){
            return;
        }
        movement(n-1,src,temp,dest,list);
        ArrayList l=new ArrayList<>();
        l.add(n);
        l.add(src);
        l.add(dest);
        list.add(l);
        movement(n-1,temp,dest,src,list);

    }
    public static void main(String[] args) {
      ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
      movement(3,1,3,2,arr);

      arr.stream().forEach(System.out::print);
    }
}
