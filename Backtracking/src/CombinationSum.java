import java.util.*;

/*Given an array of candidate numbers A and a target number B, find all unique combinations in A where the
 candidate numbers sums to B.

The same repeated number may be chosen from A unlimited number of times.

Note:

1) All numbers (including target) will be positive integers.
2) Elements in a combination (a1, a2, … , ak)
       must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
3) The combinations themselves must be sorted in ascending order.
4) CombinationA > CombinationB iff (a1 > b1) OR (a1 = b1 AND a2 > b2)
       OR ... (a1 = b1 AND a2 = b2 AND ... ai = bi AND ai+1 > bi+1)
5) The solution set must not contain duplicate combinations.


A = [2, 3]   B = 2
[ [2] ]
All possible combinations are listed.


A = [2, 3, 6, 7]
B = 7
[ [2, 2, 3] , [7] ]
All possible combinations are listed.


* */
public class CombinationSum {
    public static void main(String[] args) {

        int[] A = {2, 3,2,3,6, 7};
        int B=7;
        List<Integer> temp=new ArrayList<>();
        Set<Integer> result=new HashSet<>();

        Arrays.sort(A);
        Arrays.stream(A).distinct();

        combinationSum(0,A.length,A,0,temp,result,B);

        result.stream().forEach(System.out::println);
    }

    private static void combinationSum(int index, int length, int[] A, int sum, List<Integer> temp, Set<Integer> result,int B) {

        if(sum>B){
            return;
        }
        if( sum==B){

            int i = Integer.parseInt(temp.stream().map(String::valueOf)
                            .reduce("",String::concat));

            result.add(i);
            System.out.println();


        }


        for(int j=index;j<A.length;j++){
            sum=sum+ A[j];
            temp.add(A[j]);
            combinationSum(j,length,A,sum,temp,result,B);
            sum=sum-A[j];
            temp.remove(temp.size()-1);
        }

    }


}
