import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*Given an array A of size N denoting collection of numbers that might contain duplicates,
return all possible unique permutations.

NOTE: No 2 entries in the permutation sequence should be the same.
* */
public class UniquePermutaions {

    public static void main(String[] args) {

        int[] A={1,2,1};
        boolean[] visited=new boolean[A.length];
        List<Integer> temp=new ArrayList<Integer>();
        Set<Integer> result=new HashSet<>();

        generatePermutaion(0,A.length,A,temp,visited,result);

        System.out.println(result);
    }

    public static void generatePermutaion(int pos,int length,int[] A,List<Integer> temp,boolean[] visited,Set<Integer> result){

        if(pos==length){

            int integer=Integer.parseInt(new ArrayList<>(temp).stream().map(String::valueOf).reduce("",String::concat));
            result.add(integer);

            return;
        }

        for(int j=0;j<length;j++){
            if(!visited[j]){
                temp.add(A[j]);
                visited[j]=true;
                generatePermutaion(pos+1,length,A,temp,visited,result);
                temp.remove(temp.size()-1);
                visited[j]=false;
            }
        }

    }
}
