import java.util.ArrayList;
import java.util.List;

/*
int[] A={5,-2,9};

{-2,9}

* */
public class SubsetCountwithSumK {

    public static int SubsetCount(int pos, int n, int[] A, List<Integer> temp,int sum,int k,int count){

        if(sum==k) {
            temp.stream().forEach(System.out::print);
            System.out.println();
            return count+1;
        }



        for(int j=pos;j<n;j++){
            sum=sum+A[j];
            temp.add(A[j]);
            count= SubsetCount(j+1,n,A,temp,sum,k,count);
            sum=sum-A[j];
            temp.remove(temp.size()-1);
        }

     return count;
    }
    public static void main(String[] args) {
        int[] A={5,-2,9,2,3,4};

        int sum= 7;

        int count=SubsetCount(0,A.length,A,new ArrayList<Integer>(),0,sum,0);
        System.out.print("count = ");
        System.out.println(count);


    }
}
