/*
Write a recursive function that checks whether string A is a palindrome
or Not.

Return 1 if the string A is a palindrome, else return 0.

Note: A palindrome is a string that's the same when read forward
and backward.

A = "naman"
A = "strings"
1
0


* */
public class CheckPalindrome {
    public static void main(String[] args) {

        String s="naman";

        int i=0;
        int j=s.length()-1;

        boolean b=checkPalindrome(0,s.length()-1,s);
        System.out.println(b);

    }

    //recursive

    private static boolean checkPalindrome(int i, int j, String s) {

        if(i>j){
            return true;
        }

        if(s.charAt(i)==s.charAt(j)){
            i++;
            j--;
            return checkPalindrome(i,j,s);
        }else{
            return false;
        }

    }

    //non-recursive

   /* private static boolean checkPalindrome(int i, int j, String s) {



        while(i<=j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            }else {
                return false;
            }
        }

        return true;
    }*/
}
