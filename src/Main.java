import java.util.*;
void main() {
    //We can use both IO.println and System.out.println for print something.
    //IO.println(String.format("Hello and welcome!"));
    //System.out.println("Hello World with Java");
    //System.out.println("Hello World with Java");
    //System.out.print("Hello World with Java\n from Shreya Thakkar\n");//only print is used cause no need of new line
    //System.out.print("Hello World with Java");//we can use \n for the new line as well

    //Question1: Print the pattern(without loops)
    //*
    //**
    //***
    //****
    //*****
    //Solution::
    System.out.println("*");
    System.out.println("**");
    System.out.println("***");
    System.out.println("****");
    System.out.println("*****");

    //Variables in java-> values can be or might get changed
    //Constant in java-> values will be fixed non changeable
    int a = 10;
    int b = 20;
    int sum = a + b;
    System.out.println("Sum of a and b is: "+sum);

    int diff = b - a;
    System.out.println("Difference between a and b is:"+diff);

    int multiply = a * b;
    System.out.println("Multiplication of a and b is: "+multiply);

    //Here int, String, double are the datatypes
    //Java is a typed language
    //java contains following 8 Primitive data types:
    //byte(1byte), short(2byte), char(1byte), boolean(1byte), int(4byte), long(8 byte), float(4byte), double(8 byte)

    //java contains following Non-Primitive data types: u can also use customized data types
    //String, Array, class, object, interface

    //To take input from the user we use scanner class in java
    //for that we have to import the package which is : import java.util.*;

    Scanner sc = new Scanner(System.in);
    //String name = sc.next();//it will take only single token
    String name = sc.nextLine();//it will take the whole token
    //nextInt(),nextFloat(), nextDouble() many available
    System.out.println("The name is: "+name);

    //Question2: Take 2 variables from user 'a' and 'b' print their sum
    Scanner SC = new Scanner(System.in);
    int num1 = SC.nextInt();
    int num2 = SC.nextInt();
    int total = num1 + num2;
    System.out.println("The sum of given numbers is: "+total);



}
