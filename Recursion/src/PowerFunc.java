public class PowerFunc {
    public static void main(String[] args) {
        double ans =powerFunc2(1.00000,-2147483648);
        System.out.println(ans);

        //edge case

        // negetive -n
        // highest negetive integer
    }

    private static double powerFunc2(double x, int n) {
        if(n==0){
            return 1;
        }

        if(n<0){
            if(n==Integer.MIN_VALUE){
                double half=powerFunc2(x,n/2);
                return half * half;
            }

            return 1 /  powerFunc2(x,-n);
        }

        double res=powerFunc2(x,n/2);

        if(n % 2 == 0){
            return res * res;
        }else{
            return x * res * res;
        }



    }

    private static float powerFunc(int x, int n) {

        if(n==0){
            return 1;
        }
        if(n<0){

            return 1 /  powerFunc(x,-n);
        }

        return x * powerFunc(x,n-1);

    }
}
