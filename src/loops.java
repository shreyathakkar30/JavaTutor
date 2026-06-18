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


}}
