import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int number1 = sc.nextInt();
        System.out.println("Enter the operator");
        char operator = sc.next().charAt(0);
        System.out.println("Enter the Second number");
        int number2 = sc.nextInt();

        switch (operator){
            case '+':
                int sum = number1 + number2;
                System.out.println("Sum is: "+sum);
                break;
            case '-':
                int diff = number2 - number1;
                System.out.println("Difference is: "+diff);
                break;
            case '*':
                int mul = number1 * number2;
                System.out.println("Multiplication is: "+mul);
                break;
            case '/':
                int div = number1 / number2;
                System.out.println("Division is: "+div);
                break;
            default:
                System.out.println("Invalid operator");

        }

    }
}
