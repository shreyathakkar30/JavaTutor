public class patterns {
    public static void main(String[] args){
    //Question: print the pattern using loops
    // solid rectangle
    //*****
    //*****
    //*****
    //*****
    //Will use Nested loops for this
    int n = 4;
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





}
}