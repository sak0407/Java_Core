public class Factorial {
    public static void main(String[] args) {
        int A=7;
        int a= factorial(A);
        System.out.println(a);
    }

    private static int factorial(int a) {
        if(a==1) return 1;
        if (a==0) return 0;

        return factorial(a-1)+factorial(a-2);
    }
}
