public class SecondLargest {
    public static void main(String[] args) {
        int[] arr={13,7,16,18,14,17,18,8,10};
        //{13,7,16,18,14,17,18,8,10}
        //{11,15,19}
        //{2,1,2}
        //{2}

        int max=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondLargest=max;
                max=arr[i];
            }else if(arr[i] > secondLargest && arr[i]<max){
                secondLargest=arr[i];
            }

        }
        if(secondLargest==Integer.MIN_VALUE){
            secondLargest =-1;
        }

        System.out.println(secondLargest);

    }
}
