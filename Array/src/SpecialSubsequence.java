/*You have given a string A having Uppercase English letters.
You have to find how many times subsequence "AG" is there in the given string.

NOTE: Return the answer modulo 109 + 7 as the answer can be very large.
A = "ABCGAG"
3
Subsequence "AG" is 3 times in given string
A = "GAB"
0
There is no subsequence "AG" in the given string.
* */
public class SpecialSubsequence {
    public static void main(String[] args) {
        String A="BCAGGAAG";
        int count=0;

        /*for(int i=0;i<A.length();i++){
            char ch=A.charAt(i);
            if(ch=='A') {
                for (int j = i + 1; j < A.length(); j++) {
                    if(A.charAt(j)=='G'){
                        count++;
                    }
                }
            }
        }*/
        int totalCount=0;
        for(int j=A.length()-1;j>=0;j--){
            if(A.charAt(j)=='G'){
                count++;
            }
            if(A.charAt(j)=='A'){
                totalCount +=count;
            }
        }

        System.out.println(totalCount);

    }
}
