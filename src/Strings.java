import java.util.Scanner;

public class Strings {
    public static void main(String[] args){
        //String Declaration
//        String name = "Shreya";
//        String fullName = "Shreya Thakkar";
//        String sentence = "Hello! my name is Shreya Thakkar!!";
        //if you want to take string from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String Uname = sc.nextLine();
        //if you want to take whole string Use nextline() instead of next()
        System.out.println("Your name is: "+Uname);
        //Concatenation
        String firstName  = "str";
        String lastName = "abc";
        String fullName = firstName + "@" + lastName;
        System.out.println("Full name is: "+fullName);
        //length() is used to print the length of the String
        System.out.println(fullName.length());


    }
}
