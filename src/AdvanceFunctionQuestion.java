import java.util.Scanner;

public class AdvanceFunctionQuestion {
//    # Functions in Java
//
//This file contains solutions to basic Java Function practice questions:
//
//1. Average of 3 numbers
//2. Sum of odd numbers from 1 to n
//3. Greater of two numbers
//4. Circumference of a circle
//5. Voting eligibility checker
//6. Infinite loop using do-while
//7. Count positive, negative and zero numbers
//8. Calculate xⁿ
//9. Find GCD of two numbers
//10. Fibonacci series
//
//Concepts Used:
//- Functions (Methods)
//- Loops
//- Conditional Statements
//- User Input using Scanner
//- Return Types


    // Question 1
    public static double calculateAverage(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    // Question 2
    public static int sumOfOddNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Question 3
    public static int findGreater(int a, int b) {
        return (a > b) ? a : b;
    }

    // Question 4
    public static double circumference(double radius) {
        return 2 * Math.PI * radius;
    }

    // Question 5
    public static boolean isEligibleToVote(int age) {
        return age > 18;
    }

    // Question 6
    public static void infiniteLoop() {
        do {
            System.out.println("Running...");
        } while (true);
    }

    // Question 7
    public static void countNumbers() {
        Scanner sc = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int zero = 0;

        int choice;

        do {
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            if (num > 0)
                positive++;
            else if (num < 0)
                negative++;
            else
                zero++;

            System.out.print("Press 1 to continue, 0 to stop: ");
            choice = sc.nextInt();

        } while (choice == 1);

        System.out.println("Positive = " + positive);
        System.out.println("Negative = " + negative);
        System.out.println("Zero = " + zero);
    }

    // Question 8
    public static int power(int x, int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= x;
        }

        return result;
    }

    // Question 9
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Question 10
    public static void fibonacci(int n) {
        int first = 0;
        int second = 1;

        System.out.print(first + " " + second + " ");

        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(next + " ");

            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===== Question 1 =====
        System.out.println("Enter 3 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Average = " + calculateAverage(a, b, c));

        // Uncomment and test other questions one by one

    /*
        System.out.println(sumOfOddNumbers(10));

        System.out.println(findGreater(20, 50));

        System.out.println(circumference(7));

        System.out.println(isEligibleToVote(21));

        countNumbers();

        System.out.println(power(2, 5));

        System.out.println(gcd(12, 18));

        fibonacci(10);
        */


    }
}

