public class patterns {
    public static void main(String[] args){
    //Question: print the pattern using loops
    // solid rectangle
    //*****
    //*****
    //*****
    //*****
    //Will use Nested loops for this
    int n = 5;
    int m = 5;
    outer loop
    for (int i =1; i <=n; i++){
        //inner loop
        for(int j = 1; j<=m; j++){
            System.out.print("*");
        }
        System.out.println();
    }


    //print the pattern: Hollow Rectangle
        //*****
        //*   *
        //*   *
        //*****
        //outer loop
        for (int i = 1; i<=n; i++){
            //inner loop
            for(int j= 1; j<=m; j++){
                //cell -> (i, j)
                if(i == 1 || j == 1 || i == n || j == m){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //Question: print the pattern
        //*
        //**
        //***
        //****
    //here whatever the row number becomes the number of stars
    //if row number is 1 the number of stars will be 1, if row number is 2 the number of stars is 2, and so on
    //outer loop
        for (int i = 1; i<=n; i++){
            //inner loop
            for (int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Question: print the pattern
        //****
        //***
        //**
        //*
        //outer loop
        for (int i=n; i>=1; i--){
            //inner loop will remain same as above
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Question: print the pattern
        //      *
        //     **
        //    ***
        //   ****
//        //outer loop
        for (int i = 1; i<=n; i++){
            //inner loop
            for (int j= 1; j<=n-i; j++){
                System.out.print(" ");
            }
            //another inner loop -> star print
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //print the pattern
        //1
        //12
        //123
        //1234
        //12345
        for (int i =1; i<=n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }

        //Question: print the pattern(Inverted half pyramid with numbers)
        //12345
        //1234
        //123
        //12
        //1
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=n-i+1; j++){
                System.out.print(j);

            }

            System.out.println();
        }

        //print the pattern(FLOYD'S TRIANGLE)
        //1
        //2 3
        //4 5 6
        //7 8 9 10
        //11 12 13 14 15
    int number = 1;
        //outer loop
        for (int i = 1; i<=n; i++){
            //inner loop
            for (int j = 1; j<=i; j++){
                System.out.print(number+ " ");
                number++;// number = number +1
            }
            System.out.println();
        }



        // print the pattern
        //1
        //  12
        //   123
        //    1234
        //     12345
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=i-1; j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        //print the pattern (0-1 triangle)
        //1
        //01
        //101
        //0101
        //10101
        //outer loop
        for (int i = 1; i<=n; i++){
            //inner loop
            for (int j = 1; j <=i; j++){
                int sum = i+j;
                if (sum % 2 == 0){//even value
                    System.out.print("1 ");
                } else {//odd
                    System.out.print("0 ");
            }

        }
            System.out.println();
    }

}}