import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*The gray code is a binary numeral system where two successive
values differ in only one bit.

Given a non-negative integer A representing the total number of bits in
the code, print the sequence of gray code.
A gray code sequence must begin with 0.

A = 2
[0, 1, 3, 2]


A = 1
[0, 1]

* */
public class GreyCode {
    public static void main(String[] args) {

      //I need to complete bit, Then i can take it
        int n=3;
        List<Integer> anslist=
        greyCode(n);
        anslist.stream().forEach(System.out::print);
        System.out.println();

        //I can convert each integer in binary string

        anslist.stream().map(Integer::toBinaryString)
                .forEach(System.out::println);

    }

    private static ArrayList<Integer> greyCode(int A) {

        if(A==1){
            return new ArrayList<>(Arrays.asList(0,1));
        }

        ArrayList<Integer> temp=greyCode(A-1);
        // 2^N - > 1<<N
        for(int i=temp.size()-1;i>=0;i--){
            temp.add(temp.get(i)+(1<<(A-1)));
        }

       return temp;
    }
}
