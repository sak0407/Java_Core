import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/*Given a collection of integers denoted by array A of size N that might contain duplicates,
return all possible subsets.

NOTE:

Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
The subsets must be sorted lexicographically.

Input 1:
 A = [1, 2, 2]
Input 2:
 A = [1, 1]

 Output 1:
 [
    [],
    [1],
    [1, 2],
    [1, 2, 2],
    [2],
    [2, 2]
 ]
Output 2:
 [
    [],
    [1],
    [1, 1]
 ]

* */
public class SubsetII {

    public static void subSetIIWithmap(int pos, int n, int[] A, List<Integer> temp, Map<Integer,Long> map){


        for(int j=pos;j<n;j++){


        }
    }

    private static void subSetIIApproach2(int pos, int length, int[] A, List<Integer> temp) {


        if(pos <=length)   {
            temp.stream().forEach(System.out::print);
            System.out.println();
        }


        for(int j=pos;j<length;j++){

            if(j>pos && A[j]==A[j-1]){
                continue;  //skip the value if its same as before value
            }

            temp.add(A[j]);
            subSetIIApproach2(j+1,length,A,temp); // recurssively generating starting from next index
            temp.remove(temp.size()-1);
        }


    }
    public static void main(String[] args) {

        int[] A={7,4,5,4};



        Map<Integer,Long> freqM= Arrays.stream(A).boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

       // freqM.entrySet().stream().forEach(System.out::println);

        //from int array remove duplicate then sort and pust it in int array B

        int[] B=Arrays.stream(A).distinct().sorted().toArray();

       // System.out.println(Arrays.toString(B));

       // subSetIIWithmap(0,A.length,B,new ArrayList<>(),freqM);



        //2nd Approach

        Arrays.sort(A);   //to main lexicography

        subSetIIApproach2(0,A.length,A,new ArrayList<>());


    }


}
