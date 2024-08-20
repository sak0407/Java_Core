/*You are given a string A of lowercase English alphabets. Rearrange the characters
of the given string A such that there is no boring substring in A.

A boring substring has the following properties:

Its length is 2.
Both the characters are consecutive, for example - "ab", "cd", "dc", "zy" etc.
(If the first character is C then the next character can be either (C+1) or (C-1)).
Return 1 if it is possible to rearrange the letters of A such that there are no
boring substrings in A else, return 0.

A = "abcd"
out:1
String A can be rearranged into "cadb" or "bdac"
A = "aab"
out: 0
No arrangement of string A can make it free of boring substrings.

* */
public class BoringString {


    public static void main(String[] args) {
        String s ="aab";
        //int ans=boringString(s);
        System.out.println(check("bdac"));


    }

    public static boolean check(String s){
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)-s.charAt(i-1)==1){
                return false; //boring string present
            }
        }
        return true;
    }

    private static int boringString(String s) {
        char[] ch=s.toCharArray();

        int freq[] =new int[26];

        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }




        return 0;
    }
}
