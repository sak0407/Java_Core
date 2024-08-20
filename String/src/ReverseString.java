
/*
*
You are given a string A of size N.

Return the string A after reversing the string word by word.

NOTE:

A sequence of non-space characters constitutes a word.
Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
If there are multiple spaces between words, reduce them to a single space in the reversed string.
* A = "the sky is blue"
*"blue is sky the"
*
* */


public class ReverseString {


    private static String reverse(String str, int p1, int p2){

        char[] ch=str.toCharArray();

        while(p1<p2){
            char temp=ch[p1];
            ch[p1]=ch[p2];
            ch[p2]=temp;
            p1++;
            p2--;
        }
        return String.valueOf(ch);

    }

    public static String solve(String A) {


        A=reverse(A,0,A.length()-1);


        int l=0;
        int r=0;

        while (r<A.length()){
            while(r<A.length() && A.charAt(r)!=' '){
                r++;
            }
            A = reverse(A,l,r-1);
            while(r<A.length() && A.charAt(r)==' '){
                r++;
            }
            l=r;
        }



        return A.trim();



    }


    public static void main(String[] args) {
        String result = solve("The sky is  blue ");

        System.out.println(result);


    }
}
