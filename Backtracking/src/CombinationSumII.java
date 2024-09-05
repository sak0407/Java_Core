import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Given an array of size N of candidate numbers A and a target number B.
Return all unique combinations in A where the candidate numbers sums to B.

Each number in A may only be used once in the combination.
Note:

All numbers (including target) will be positive integers.
Elements in a combination (a1, a2, … ,ak) must be in non-descending order.
(ie, a1 ≤ a2 ≤ … ≤ ak).
The solution set must not contain duplicate combinations.
Warning:
DO NOT USE LIBRARY FUNCTION FOR GENERATING COMBINATIONS.
Example : itertools.combinations in python. If you do, we will disqualify your
submission and give you penalty points.

 A = [10, 1, 2, 7, 6, 1, 5]
 B = 8

 [
  [1, 1, 6 ],
  [1, 2, 5 ],
  [1, 7 ],
  [2, 6 ]
 ]

  A = [2, 1, 3]
  B = 3

 [
  [1, 2 ],
  [3 ]
 ]

* */
public class CombinationSumII {
    public static void main(String[] args) {
        int[] A={10, 1, 2, 7, 6, 1, 5};

        int B=8;
        Arrays.sort(A);
        List<Integer> temp=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        combinationSum2(0,A,A.length,temp,result,B,0);
//        result.forEach(innerList-> System.out.println(innerList.stream()
//                 .map(String::valueOf).collect(Collectors.joining(","))));

        List<List<Integer>> resultList=new ArrayList<>();
        //result.stream().forEach(System.out::println);

        result.stream().filter(list-> !resultList.contains(list)).forEach(resultList::add);
        resultList.stream().forEach(System.out::println);

    }

    private static void combinationSum2(int index, int[] A, int length, List<Integer> temp, List<List<Integer>> result, int B, int sum) {

        if(sum>B){
            return;
        }
        if(sum==B){


             // convert list with , separator
           /* Integer s = Integer.parseInt(temp.stream().map(String::valueOf)
                    .collect(Collectors.joining(",")));*/

            result.add(new ArrayList<>(temp));
        }

        for(int j=index;j<A.length;j++){
            sum=sum+A[j];
            temp.add(A[j]);
            combinationSum2(j+1,A,length,temp,result,B,sum);
            sum=sum-A[j];
            temp.remove(temp.size()-1);

        }

    }
}
