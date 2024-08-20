/*You are given a string S, and you have to find all the amazing substrings of S.
An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).

ABEC
6

Explanation
    Amazing substrings of given string are :
    1. A
    2. AB
    3. ABE
    4. ABEC
    5. E
    6. EC
    here number of substrings are 6 and 6 % 10003 = 6.
* */
public class AmazingSubarrays {
    public static void main(String[] args) {
        String str="ABEC";
        str.toUpperCase();
        int count=0;
        /*for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='A'|| str.charAt(i)=='E'||
                    str.charAt(i)=='I'|| str.charAt(i)=='O'||
                    str.charAt(i)=='U') {
                for (int j=i;j<str.length();j++){

                    count++;
                }

            }
        }*/

        //We have to do it in o(n)
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='A'|| str.charAt(i)=='E'||
                    str.charAt(i)=='I'|| str.charAt(i)=='O'||
                    str.charAt(i)=='U'){
                count =count + str.length()-i;
            }
        }

        System.out.println(count);

    }
}
