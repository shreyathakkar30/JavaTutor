public class AdvancePatterns {
    public static void main(String[] args) {
        //Print the given butterfly pattern
        //*        *
        //**      **
        //***    ***
        //****  ****
        //**********
        //**********
        //****  ****
        //***    ***
        //**      **
        //*        *

        int n = 5;
        //Upper Half - outer loop
        for (int i = 1; i<=n; i ++){
            //outer loop
            for (int j = 1; j<=i; j++){
                System.out.print("*");

            }
            //spaces
            int spaces= 2 * (n-i);
            for (int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            //2nd part
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half
        for (int i = n; i>=1; i--){
            //outer loop
            for (int j = 1; j<=i; j++){
                System.out.print("*");

            }
            //spaces
            int spaces= 2 * (n-i);
            for (int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            //2nd part
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //print the pattern(Solid rhombus)
        //    *****
        //   *****
        //  *****
        // *****
        //*****
        //outer loop
        for (int i = 1; i<=n;i++){
            //spaces
            for (int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //print the pattern(Number pyramid)
        //     1
        //    2 2
        //   3 3 3
        //  4 4 4 4
        // 5 5 5 5 5
        for (int i=1; i<=n;i++){
            //spaces
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //numbers-> print row numbers, row no times
            for (int j = 1; j<=i;j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }


    }
}
