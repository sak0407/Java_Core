import java.util.ArrayList;
import java.util.List;

/*Print N digit number can be formed {1,2}
* */
public class NdigitNumber {
    public static void main(String[] args) {
        int n=3;
        List<Integer> temp=new ArrayList<>();
        backtrack(0,n,temp);
    }

    private static void backtrack(int i, int n, List<Integer> temp) {

        if(i==n){
            temp.stream().forEach(System.out::print);
            System.out.println();
            return;
        }

        for(int j=1;j<=2;j++){
            temp.add(j);
            backtrack(i+1,n,temp);
            temp.remove(temp.size()-1);
        }

    }
}
