public class Fibonacci {
    public static void main(String[] args) {
        int A=5;

        int a=fibonacci(A);
        System.out.println(a);
    }

    private static int fibonacci(int a) {
        if(a==0){
            return 1;
        }
        return a * fibonacci(a-1);
    }


}
