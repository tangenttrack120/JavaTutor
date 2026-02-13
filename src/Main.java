
/*
    every Java code always started with:
    public class FileName {}
    the class name should be capitalized
    explanation in notion
 */

public class Main {
    /*
        after this you should type public static void main(String[] args)
        this is the entry point for any standalone Java program
        explanation in notion
     */
    public static void main(String[] args){
        System.out.println("Hello World");
        /*
            System.out is a standard mechanism to output data to the standard output stream
            System is a final class built-in java.lang package
            out is an instance of the java.io.PrintStream class
            It represents the standard output destination, which is open and ready to accept data as soon as the program runs.
            print is used to print the data passed to it as an argument to the standard output stream
            ln is making a new line after the data being printed
            more explanation in notion
            you can also use print to print without a new line
         */
        System.out.print("My name is Richard. ");
        System.out.println("This line will appear after My name.");
        // Printing number will be the same as any other programming language
        // you can also do math with the same method as any other programming language
        System.out.println(3 + 5 - 2);
        /*
            Java have primitive data types like: byte, short, int, long, float, double, char, and boolean
            Java non-primitive data types are: String, Arrays, and Classes
            string in Java is Capitalized : String
            to declare a variable you hav to use: dataType varName = value;
            you can also declare multiple variable with the same data type
            once a variable declared the data type cannot be changed
         */
        int x = 5, z = 10;
        float y = 2.5F; // yes float use F/f at the very end, long use L/l, and double use D/d
        System.out.println(x * z / y);
        // you can also combine strings
        String firstName = "Richard"; // String use double quote
        String lastName = "Victor";
        char nameInitial = 'R'; // char use single quote
        String fullName = firstName + " " + lastName;
        // you can also concatenate strings using: part1.concat(part2)
        System.out.println("My name is ".concat(fullName));
        // var keyword is introduced in Java 10 and automatically detect data type based on the value assigned
        // be careful when using it because there are app out there that still use Java version Java 10
        var unknown = 90L; // it recognized as long
        // you can use final as constant in any other language
        final int MINUTES_PER_HOUR = 60;
        final int SECONDS_PER_MINUTE = 60;
        // Java type casting
        /*
           implicit (widening) type casting: byte->short->char->int->long->float->double
           explicit (narrowing) type casting: double->float->long->int->char->short->byte
         */
        // arithmetics, assignment, comparison, and logical operator is the same as any other languages
        // operator precedence (hierarchy): ( () ) -> )*, /, %) -> (+, -) -> (>, <, >=, <=) -> (==, !=) -> (&&) -> (||) -> (=)

    }
}