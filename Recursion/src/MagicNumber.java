/*Given a number A, check if it is a magic number or not.

A number is said to be a magic number if the sum of its digits is calculated
till a single digit recursively by adding the sum of the digits after every
addition.

If the single digit comes out to be 1, then the number is a magic number.


 A = 83557

 Sum of digits of (83557) = 28
 Sum of digits of (28) = 10
 Sum of digits of (10) = 1.
 Single digit is 1, so it's a magic number. Return 1.
 1
 A = 1291

 Sum of digits of (1291) = 13
 Sum of digits of (13) = 4
* */
public class MagicNumber {
    public static void main(String[] args) {
        String A= "1291";
        int a=Integer.parseInt(A);


        int ans=magicNumber(a);
        System.out.println(ans);

    }

    private static int magicNumber(int a) {

        if(a<10){
            return a;
        }

        return magicNumber(sumOfDigit(a));

    }

    private static int sumOfDigit(int a) {

        if(a<10){
            return a;
        }

        int b=a%10;
        int c=a/10;

        return b+magicNumber(c);
    }
}
