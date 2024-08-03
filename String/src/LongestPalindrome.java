
/*
* Given a string A of size N, find and return the longest palindromic substring in A.

Substring of string A is A[i...j] where 0 <= i <= j < len(A)

Palindrome string:
A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.

Incase of conflict, return the substring which occurs first ( with the least starting index).
intput = forgeeksskeegfor
* */

public class LongestPalindrome {

    public static String expand(String s, int p1, int p2){

        while(p1>=0 && p2<s.length() && s.charAt(p1)==s.charAt(p2)){
            p1--;
            p2++;
        }

        return s.substring(p1+1,p2);
    }

    public static String longestPalindrome(String s) {

        int maxlength = Integer.MIN_VALUE;
        String result=null;
        for(int i=0;i<s.length();i++){

            String str=expand(s,i,i);
            if(maxlength<str.length()){
                maxlength=str.length();
                result=str;
            }
        }

        for(int i=0;i<s.length()-1;i++){

            String str=expand(s,i,i+1);
            if(maxlength<str.length()){
                maxlength=str.length();
                result=str;
            }

        }

        return result;

    }


    public static void main(String[] args) {

        System.out.println(longestPalindrome("forgeeksskeegfor"));

    }
}
