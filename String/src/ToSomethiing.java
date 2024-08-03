public class ToSomethiing {


    int to_Alpha(char[] A) {
        int size=A.length;
        boolean flag=false;
        for(int i=0;i<size;i++){
            if((A[i]>=97 && A[i]<=122 )||(A[i]>=65 && A[i]<=90 ) ){
                flag=true;
            }else{
                return 0;
            }
        }
        if(flag){
            return 1;
        }
        else{
            return 0;
        }
    }

    char[] to_char(char[] A){
        int n=A.length;

        for(int i=0;i<n;i++ ){

            if(A[i]>=65 && A[i]<=90){

                A[i]=(char) (A[i]+ 'a' - 'A');
            }
        }

        return A;
    }

    public static void main(String[] args) {
        char[] A = {'S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y'};
    }
}
