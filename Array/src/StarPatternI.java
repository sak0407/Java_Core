import java.util.Scanner;

/*

n=4

********
***  ***
**    **
*      *
*      *
**    **
***  ***
********

n=6
************
*****  *****
****    ****
***      ***
**        **
*          *
*          *
**        **
***      ***
****    ****
*****  *****
************


====================
n=2

   *
  ***
*******
 *****
 *****
*******
  ***
   *

 n=3
     *
    ***
   *****
***********
 *********
  *******
  *******
 *********
***********
   *****
    ***
     *
===============

* */
public class StarPatternI {

    public static void secondPattern(int n){

        for (int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }

            for (int j=n-i-1;j<n;j++){
                System.out.print("*");
            }
            for (int j=0;j<i;j++){
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for (int j=i;j<2*n-1;j++){
                System.out.print("*");
            }
            //System.out.print("*");
            for (int j=0;j<2*n-i;j++){
                System.out.print("*");
            }
            for(int j=i;j<i;j++){
                System.out.print(" ");
            }

            System.out.println();

        }

        for(int i=0;i<n;i++){

            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            for (int j=n-i-1;j<2*n-1;j++){
                System.out.print("*");
            }
            System.out.print("*");

            for (int j=n-i-1;j<2*n-1;j++){
                System.out.print("*");
            }




            System.out.println();

        }



        for (int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                System.out.print(" ");
            }
            for(int j=n-i-1;j<n;j++){
                System.out.print(" ");
            }
            for(int j=i;j<n;j++){
                System.out.print("*");
            }

            for(int j=i;j<n-1;j++){
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public static void firstPattern(int n){

        for (int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");

            }

            for (int j=0;j<i;j++){
                System.out.print("  ");
            }
            for(int j=i;j<n;j++){

                System.out.print("*");

            }

            System.out.println();

        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int j=i+1;j<n;j++){
                System.out.print(" ");
            }


            for (int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for (int j=n-i-1;j<n;j++){
                System.out.print("*");
            }

            System.out.println();
        }


    }


    public static void main(String[] args) {

        //Scanner sc=new Scanner(System.in);

        //int n=sc.nextInt();

        int n=10;
        firstPattern(n);
        secondPattern(n);





    }
}
