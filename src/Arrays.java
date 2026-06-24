public class Arrays {
    public static void main(String[] args){
        //Arrays is a type of nonprimitive data type
        //Arrays are common concept of java and C
        //It stores list of the items of the same type
        //Jab bhi hume same datatype k boht sare variables ko store karana hota hai to hum usse list ki form me store kra dete hai using Array
        //Syntax:
        //type[] arrayName = new type[size];
        int[] marks = new int[3];
        marks[0] = 97;//phy
        marks[1] = 90;//chem
        marks[2] = 80;//eng
        System.out.println("Marks of physics"+marks[0]);
        System.out.println("Marks of chemistry"+marks[1]);
        System.out.println("Marks of English"+marks[2]);


    }
}
