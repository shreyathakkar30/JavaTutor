import java.util.*;

public class Conditions {
    public static void main(String[] args) {
        //Lecture 3: If else Condition
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not Adult");
        }
        //Question: Check the number given by user is even or odd
        int x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

//        //else if statements in java
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Equal");
        } else if (a > b) {
            System.out.println("a is greater");
        } else {
            System.out.println("a is lesser");
        }


        int button = sc.nextInt();

        if(button == 1){
            System.out.println("Hello");
        } else if (button == 2) {
            System.out.println("Namaste");
        } else if (button == 3) {
            System.out.println("Bonjour");
        }else{
            System.out.println("Invalid button");
        }

        //Switch case in java
        switch (button){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid button");
        }
    }
}
