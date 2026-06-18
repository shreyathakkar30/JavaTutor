import java.util.Scanner;

public class loops {
    //Loops  are used when you want to repeat some task
    //For loop, while loop, do while loops are available in java
    public static void main(String[] args){
        //for loop to print "Hello world 99 times including 0"
        //syntax: for(initialization;condition;updation){do something}
        //if the condition is not defined in that scenario the loop goes in infinite loop
        //Do avoid infinite loops in your code
        for(int counter = 0 ;counter < 100; counter++){
            System.out.println("Hello World: "+counter);
        }

        //Question1: print the numbers from 1 to 100
        for(int i = 1;i <= 100; i++){
            System.out.println(i);
        }

        //while loop in java
        //above same code using while loop
        int j = 0;
        while (j < 101){
            System.out.println("value of j using while loop is: "+j);
            j++;
        }

        //do while loop in java
        //do the work till the condition is satisfied
        //whenver you want to run code for atleast one time in  that scenario use do while loop
        int o = 0;
        do {
            System.out.println("Value of o using Do While loop: "+o);
            o++;

        }while (o<=100);

        //Question: Print the sum of First n Natural numbers.
        int n = 4;
        int sum = 0;
        for(int k = 1; k <= n; k++){
            sum = sum + k;


        }
        System.out.println("sum is: "+sum);

        //Question: Print the table of a number input by the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want to multily: ");
        int object = sc.nextInt();

        for(int p = 1; p < 11; p++){
            System.out.println("Table is "+object*p);
        }



}}
