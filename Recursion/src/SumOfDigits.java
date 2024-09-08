public class SumOfDigits {
    public static void main(String[] args) {

        int a=4778;
        int ans=sumOfDigit(a);
        System.out.println(ans);

    }

    private static int sumOfDigit(int a) {

        if(a<10) return a;
        return a%10+sumOfDigit(a/10);
    }
}
