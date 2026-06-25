import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args){
    //2D Array
    //   0 1 2 3 4 5
    //0|-------------|
    //1|             |
    //2| 5*5 matrix  |
    //3|             |
    //4|             |
    //5|-------------|
    //syntax: or Declaration:
    //type[][] arrayName = new type[rows][columns];
    //int [][] numbers= new int [][];
//        Scanner sc = new Scanner(System.in);
//        int rows= sc.nextInt();
//        int columns= sc.nextInt();
//
//        int [][] numbers = new int[rows][columns];
//
//        //input
//        //outer loop will handle row
//        for (int i = 0; i< rows; i++){
//            //inner loop will handle columns
//            for (int j = 0;j<columns; j++){
//                numbers[i][j] = sc.nextInt();
//            }
//        }
//    //output
//        for (int i=0; i<rows; i++){
//            for (int j =0; j<columns; j++){
//                System.out.print(numbers[i][j] + " ");
//            }
//            System.out.println();
//        }

        //question: Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs
        Scanner sc = new Scanner(System.in);
        int rows= sc.nextInt();
        int columns= sc.nextInt();

        int [][] numbers = new int[rows][columns];

        //input
        //outer loop will handle row
        for (int i = 0; i< rows; i++){
            //inner loop will handle columns
            for (int j = 0;j<columns; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();
        for (int i=0; i< rows; i++){
            for (int j = 0; j<columns; j++){
                //compare
                if (numbers[i][j] == x){
                    System.out.println("Number found at locations ("+ i + "," + j + ")");
                //here if you write 1 in all the matrix it will return all the locations
                }

            }
        }


    }


}
