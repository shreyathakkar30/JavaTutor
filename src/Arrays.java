import java.util.Scanner;

public class Arrays {
    public static void main(String args[]) {
        //Arrays is a type of nonprimitive data type
        //Arrays are common concept of java and C
        //It stores list of the items of the same type
        //Jab bhi hume same datatype k boht sare variables ko store karana hota hai to hum usse list ki form me store kra dete hai using Array
        //Syntax:
        //type[] arrayName = new type[size];
        //we can also declare array like : int marks[] = new int [3]
        //both are correct way to define the array
        int[] marks = new int[3];
        marks[0] = 97;//phy
        marks[1] = 90;//chem
        marks[2] = 80;//eng
//        System.out.println("Marks of physics"+marks[0]);
//        System.out.println("Marks of chemistry"+marks[1]);
//        System.out.println("Marks of English"+marks[2]);
        //We can also use loops for print
        for (int i=0; i<3; i++){
            System.out.println(marks[i]);
        }
        //also if you know the size of your array you can define your array like this:
        //type [] arrayName = {1,2,3,4,5};
        //for the above scenario we can write like this:
        //int marks[] = new int {97, 90, 80};
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int numbers[] = new int[size];
//        //input
//        for (int i = 0; i<size; i++){
//            numbers[i] = sc.nextInt();
//        }
//        for (int i=0; i<=size; i++){
//            //it will show number of 0's as the array size not defined
//            //Its just declared not initialized
//            System.out.println(numbers[i]);
//        }
        //Question: Take an array input from the user. Search for a given number x and print the index at which it occurs
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        //input
        for (int i = 0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        //output
        for (int i=0; i<=numbers.length; i++){
            if (numbers[i] == x){
                System.out.println("x found at index: "+i);
            }
        }

    }
}
