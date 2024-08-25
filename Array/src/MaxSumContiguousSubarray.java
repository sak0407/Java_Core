/*Find the maximum sum of contiguous non-empty subarray within an array A of length N.
 A = [1, 2, 3, 4, -10]
The subarray [1, 2, 3, 4] has the maximum possible sum of 10.

 A = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
The subarray [4,-1,2,1] has the maximum possible sum of 6.

*
* */

public class MaxSumContiguousSubarray {
    public static void main(String[] args) {

        int[] A={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        //int[] A={-500};

        int totalSum=0;
        for(int i=0;i<A.length;i++){
            for(int j=i;j<A.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum = sum + A[k];
                }
                if(sum>totalSum){
                    totalSum=sum;
                    System.out.println(i+ " "+j+" => "+totalSum);
                }

            }


        }

        System.out.println("Above solun is o(n^3) .");
        System.out.println("We are doing sum again again that we can reduce using pfsum");

        int[] pfsum=new int[A.length];

        for(int i=0;i<A.length;i++){
            if(i==0){
                pfsum[i]=0;
            }else{
                pfsum[i]=A[i]+pfsum[i-1];
            }
        }

        int totalSum2=0;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                int sum2=0;
                if(i==0){
                    sum2=pfsum[j];
                }else{
                    sum2=pfsum[j]-pfsum[i-1];
                }

                if(sum2>totalSum2){
                    totalSum2=sum2;
                    System.out.println(i+" "+j+"=>"+totalSum2);
                }

            }
        }

        System.out.println("Above solun is o(n^2) .");
        System.out.println("To inprove it we can use Kadane Algo");

        // 1 2 3 4 -10
        //-2, 1, -3, 4, -1, 2, 1, -5, 4
        //-500

        int sum3=0;
        int totalSum3=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            sum3 = sum3 +A[i];
            if(sum3>totalSum3){
                totalSum3=sum3;
            }
            if(sum3<0){
                sum3=0;
            }


        }
        System.out.println(totalSum3);




    }

}
