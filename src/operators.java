public class operators {
    public static void main(String[] args){
        //OPERATORS:
        //Symbols that tell compiler to perform some operations
        //Arithmetic operators
        //Binary: +, -, *, / , %
        //Unary: ++, --
        //pre increment: here change value is performed first then The value will be used
        //post increment: here the value will be used first and increment after wards
        //example of pre increment
        int a = 10;
        int b = 0;

        b = ++a;
        System.out.println(a);
        System.out.println(b);

        //example of post increment
        int c = 10;
        int d = 0;

        d = c++;
        System.out.println(c);
        System.out.println(d);



    }
}
