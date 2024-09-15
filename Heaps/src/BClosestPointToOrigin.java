import java.util.*;

/*
You are developing a feature for Zomato that
helps users find the nearest restaurants to their current location.
It uses GPS to determine the user's location and has access to a
database of restaurants, each with its own set of coordinates in
a two-dimensional space representing their geographical location
on a map. The goal is to identify the "B" closest restaurants to
the user, providing a quick and convenient way to choose where to eat.

Given a list of restaurant locations, denoted by A (each represented by its
x and y coordinates on a map), and an integer B representing the number of closest
restaurants to the user. The user's current location is assumed to be at the origin (0, 0).
Here, the distance between two points on a plane is the Euclidean distance.

You may return the answer in any order. The answer is guaranteed to be unique
(except for the order that it is in.)

NOTE: Euclidean distance between two points P1(x1, y1) and P2(x2, y2)
is sqrt( (x1-x2)2 + (y1-y2)2).

Example Input
Input 1:

 A = [
       [1, 3],
       [-2, 2]
     ]
 B = 1
Input 2:

 A = [
       [1, -1],
       [2, -1]
     ]
 B = 1


Example Output
Output 1:

 [ [-2, 2] ]
Output 2:

 [ [1, -1] ]


Example Explanation
Explanation 1:

 The Euclidean distance will be sqrt(10) for point [1,3] and sqrt(8) for point [-2,2].
 So one closest point will be [-2,2].
Explanation 2:

 The Euclidean distance will be sqrt(2) for point [1,-1] and sqrt(5) for point [2,-1].
 So one closest point will be [1,-1].




* */
public class BClosestPointToOrigin {

    public static int sqrt(int a,int x){

        if(x==0){
            return 1;
        }

        int half= sqrt(a,x/2);

        if(x%2==0){
            return half * half;
        }else{
            return a*half*half;
        }
    }

    public static void main(String[] args) {

        int[][] A=/*{{1,3},{-2,2}};*/

        {
            {50, 35}, {6, 4}, {1, 26}, {35, 30}, {21, 14}, {16, 11}, {50, 35},
            {22, 37}, {26, 3}, {96, 74}, {78, 63}, {82, 106}, {91, 107}, {62, 107},
            {85, 82}, {74, 69}, {66, 105}, {109, 73}, {76, 108}, {63, 64},
            {81, 104}, {91, 106}, {68, 60}, {69, 65}, {86, 67}
        };

               /* {{26,41},{40,47},{47,7},{50,34},{18,28}};*/

        int B=9;
        int[][] answer=new int[B][2];




        PriorityQueue<Pair> pq=new PriorityQueue<>(new distComparator());


        for(int i=0;i<A.length;i++){

            double dist=A[i][0] * A[i][0]+A[i][1]*A[i][1];
            Pair p=new Pair(A[i][0],A[i][1],dist);
            pq.add(p);
        }



        int i=0;
        while(B>0){
            Pair p=pq.remove();
            answer[i][0]=p.x;
            answer[i][1]=p.y;
            i++;
            B--;

        }



        Arrays.stream(answer).forEach(
                e->{
                    System.out.println(Arrays.toString(e));
                }
        );








    }




}

class Pair{
    int x;
    int y;
    double dist;
    Pair(int x,int y,double dist){
        this.x=x;
        this.y=y;
        this.dist=dist;
    }
}
class distComparator implements Comparator<Pair>{
    @Override
    public int compare(Pair o1, Pair o2) {
        if(o1.dist<o2.dist){
            return -1;
        }else{
            return 1;
        }
    }
}
