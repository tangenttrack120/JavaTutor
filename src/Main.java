
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

        // Java String manipulation
        String StrManipulation = "Hello World";
        System.out.println(StrManipulation.length()); // return String Length: 11
        System.out.println(StrManipulation.toUpperCase()); // Uppercase String: HELLO WORLD
        System.out.println(StrManipulation.toLowerCase()); // Lowercase String: hello world
        System.out.println(StrManipulation.indexOf("World")); // return index of first occurrence of specified string: 6
        System.out.println(StrManipulation.charAt(6)); // return character at specified index: W
        System.out.println(StrManipulation.equals("Hello World")); // check if a string is the same as the other one: true
        System.out.println(StrManipulation.trim()); // remove whitespace in the beginning and the end of the string
        // adding special character in string
        // \' : single quote, \" : double quote, \\ : backslash
        // \n : new line, \t : tab, \b : backspace, \r : carriage return, \f : form feed
        // Java Math
        int a = -10, b = 5, c = 15;
        int max = Math.max(a, b); // return the biggest value
        int min = Math.min(a, b); // return the lowest value
        double root = Math.sqrt(c); // return the square root
        int absoluteX = Math.abs(a); // return the absolute value
        double power = Math.pow(c, b); // return b power of c
        System.out.println(a + " " + b + " " + c + " " + max + " " + min + " " + root + " " + absoluteX + " " + power);
        // rounding method
        double d = 19.4;
        long round = Math.round(d);  // round to the nearest integer: 19
        double ceil = Math.ceil(d);   // rounds up (returns the smallest integer greater than or equal to x): 20
        double floor = Math.floor(d);  // rounds down (returns the largest integer less than or equal to x): 4.0
        // random number
        double random = Math.random();
        // getting from 0 to 100
        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        // conditioning
        int weather = 2; // 1 = raining, 2 = sunny, 3 = cloudy

        if (weather == 1) {
            boolean bringUmbrella = true;
            if (bringUmbrella) {
                System.out.println("you're good");
            } else {
                System.out.println("Bring an umbrella.");
            }
        } else if (weather == 2) {
            boolean bringSunGlasses = true;
            if (bringSunGlasses) {
                System.out.println("Wear sunglasses.");
            } else {
                System.out.println("Don't forget to bring sun glasses.");
            }
        } else {
            System.out.println("Just go outside normally.");
        } // Outputs "Wear sunglasses."
        // short hand if else
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
        // Nested ternary (useful if you handle more than 2 possible outcome
        String message = (time < 12) ? "Good morning."
                : (time < 18) ? "Good afternoon."
                : "Good evening.";
        System.out.println(message);
        int day = 4;
        // switch case
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Where the fuck do you live?");
        } // Outputs "Thursday" (day 4)
        // while loop
        int countdown = 3;

        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }
        System.out.println("Happy New Year!!");
        // do/while loop
        int i = 10;

        do {
            System.out.println("i is " + i);
            i++;
        } while (i < 5);
        // for loop
        for (i = 5; i > 0; i--) {
            System.out.println(i);
        }
        // nested loop
        for (i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
        // for each loop = loop for array (kind of)
        String[] cars = new String[4]; // new sting for max length of array
        cars[0] = "Bugatti";
        cars[1] = "koenigsegg";
        cars[2] = "Pagani";
        cars[3] = "Rolls Royce";

        for (String car : cars) {
            System.out.println(car);
        }
        // break and continue usage the same as c#

        int[] numbers = {1, 2, 3, 4};
        String[] motor = new String[] {"Yamaha", "Honda", "Kawasaki"};
        for (i = 0; i < motor.length; i++) {
            System.out.println(motor[i]);
        }
        // 2d array
        int[][] myNumbers = { {1, 4, 2}, {3, 6, 8} };
        // 3d array
        int [][][] arr3d = {
                {{1,2,3}, {4,5,6}, {7,8,9}},
                {{10,11,12}, {13,14,15}, {16,17,18}},
                {{19,20,21}, {22,23,24}, {25,26,27}}
        };

        // accessing elements
        System.out.println(myNumbers[1][2]); // 2nd row 3rd column: 8
        for (int row = 0; row < myNumbers.length; row++) {
            for (int col = 0; col < myNumbers[row].length; col++) {
                System.out.println("myNumbers[" + row + "][" + col + "] = " + myNumbers[row][col]);
            }
        }
        System.out.println(arr3d[0][1][2]); // 1st layer 2nd row 3rd column: 6
        for (int lyr = 0; lyr < arr3d.length; lyr++) {
            for (int row = 0; row < arr3d[lyr][0].length; row++) {
                for (int col = 0; col < arr3d[lyr][row].length; col++) {
                    System.out.print(arr3d[lyr][row][col] + " ");
                }
            }
        }
    }
}