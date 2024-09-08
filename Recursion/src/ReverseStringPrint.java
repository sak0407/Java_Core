/*Write a recursive function that takes a string, S,
as input and prints the characters of S in reverse order.
* */
public class ReverseStringPrint {
    public static void main(String[] args) {

        String A="SelimAktarKhan";



        String ans=reverseString(A,A.length()-1);
        System.out.println(ans);

    }

    private static String reverseString(String s,  int i) {

        if(i<0){

            return "";
        }

        return s.charAt(i)+reverseString(s,i-1);

    }
}
