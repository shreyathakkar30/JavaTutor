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
    //outer loop
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


}
}