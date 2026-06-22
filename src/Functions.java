import java.util.Scanner;

public class Functions {
//    public static void printMyName(String name){
//        System.out.println(name);
//        return;
//
//    }


    //Question: Make a function to add 2 numbers and return the
//    public static int calculateSum(int a, int b){
//        int sum = a + b;
//        return sum;
//    }
    //Question: Make a function to multiply 2 numbers and return the product
//    public static int calculateMultiplication(int a, int b){
//        int mul = a * b;
//        return mul;
//    }

    //find the factorial of a number
    //example: 5! :- 5*4*3*2*1

    public static void printFactorial(int n){
        int factorial =  1;
        if (n<=0){
            System.out.println("Invalid Input");
        }
        //loop
        for (int i = n; i>=1; i--){
            factorial = factorial * i;
        }

        System.out.println(factorial);
        return;
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter your name: ");
//        //String name = sc.next();
//        System.out.println("Enter first number");
//        int a = sc.nextInt();
//        System.out.println("Enter second number");
//        int b = sc.nextInt();
        System.out.println("Enter the number you want to get factorial of: ");
        int n= sc.nextInt();


        //int sum = calculateSum(a, b);
        //System.out.println("The sum of given two numbers is: "+sum);
        //int mul = calculateMultiplication(a, b);
        //System.out.println("The product of given two numbers is: "+mul);

        //printMyName("Your name is: " + name);//function is called here
        System.out.println("Factorial of given number is: ");
        printFactorial(n);

    }
}
