/*
Given a binary string A. It is allowed to do at most one swap between any 0 and 1.
Find and return the length of the longest consecutive 1’s that can be achieved.

Return the length of the longest consecutive 1’s that can be achieved.
Constraints

1 <= length of string <= 1000000
A contains only characters 0 and 1.
Input 1:
    A = "111000"
    3
Input 2:
    A = "111011101"
    7


* */
public class LengthOfLongestConsecutive1 {

    private static int lengthOfLongestArray(int[] a) {
        int n=a.length;

        int maxlength=Integer.MIN_VALUE;
        int countOf1=0;
        for(int i=0;i<n;i++){
            if(a[i]==1){
                countOf1++;
            }

        }

        for(int i=0;i<n;i++){

            int lengthRight=0;
            int lengthLeft=0;

            if(a[i]==0 ){

                int j=i-1;
                while(j>=0 && a[j]==1){
                    lengthRight++;
                    j--;
                }



                int k=i+1;
                while(k<n && a[k]==1){
                    lengthLeft++;
                    k++;
                }
                int lengthTotal=0;

                if(countOf1==lengthRight + lengthLeft){
                    lengthTotal=lengthLeft +lengthRight;
                    if(lengthTotal>maxlength){
                        maxlength=lengthTotal;
                    }
                }else{
                    lengthTotal=lengthLeft +lengthRight+1;
                    if(lengthTotal>maxlength){
                        maxlength=lengthTotal;
                    }
                }





            }

        }

        return maxlength;
    }
    public static void main(String[] args) {
        //String s="111000";
       // String s="111011101";
        String s="01110110";
       // String s="111";
        //convert it to int array

        int[] A=s.chars().map(c->c-'0').toArray();
        //I need to take 1 from the array only

        int B=lengthOfLongestArray(A);
        System.out.println(B);

    }


}
