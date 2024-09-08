/*
On the first row, we write a 0. Now in every subsequent row,
we look at the previous row and replace each occurrence of 0 with 01,
and each occurrence of 1 with 10.

Given row number A and index B, return the Bth indexed symbol in row A.
(The values of B are 1-indexed.).

Problem Constraints
1 <= A <= 20
1 <= B <= 2A - 1

First argument is an integer A.
Second argument is an integer B.
Return an integer denoting the Bth indexed symbol in row A.
 A = 2
 B = 1
 out=0
 Row 1: 0
 Row 2: 01
 25

 A = 2
 B = 2
 out=>1
 Row 1: 0
 Row 2: 01


* */
public class KthSymbol {

    public static int powerOf2(int base,int power){

        if(power==0){
            return 1;
        }
        int res=powerOf2(base,power/2);

        if(power%2==0){
            return res * res;
        }else{
            return base * res * res;
        }

    }

    static int number=0;
    public static int func(int c, int b) {
        if(c==0 || b==0){
            return number;
        }
        if(b>c/2) {
            number++;
            b=b-c/2;
        }

      func(c/2,b);
        return number;
    }
    public static void main(String[] args) {

        int A= 5;
        int B=14;
        int ans;

        int c=powerOf2(2,A-1);

        int p=func(c,B);

        if(p % 2==0) {
            ans=0;
        }else {
            ans=1;
        }
        System.out.println(ans);

        System.out.println("=========");

        System.out.println(kthSym(A,B));


       // System.out.println(generateNumbers(2,B));

    }


    public static int kthSym(int N,int K){

        if(N==0 || K==0) return 0;

        int P=kthSym(N-1,K/2);

        if(K%2==0){
            return P;
        }else{
            return 1-P;
        }
    }



}
