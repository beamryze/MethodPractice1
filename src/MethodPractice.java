/*
 *  Description: Several practice methods processing multiple integer results
 *  Name: Rick
 *  Semester: Fall 2021
 */

public class MethodPractice {

    public static void main(String[] args) {

        // Call printHellowWorld() 3 times to display.
        printHelloWorld();
        printHelloWorld();
        printHelloWorld();

        // Call printInteger() to print integer.
        printInteger(5);

        // Call addIntegers() with specified values.
        int a = addIntegers(5, 4);
        int b = addIntegers(12, 6);
        int c = addIntegers(a, b);

        // Display sum from var c.
        System.out.println(c);

        System.out.println();

        // Call printAddIntegers() with specified integers.
        printAddIntegers(10,  20);
        printAddIntegers(25, 4);

        // Call isEven() 3 times and display results.
        System.out.println(isEven(4));
        System.out.println(isEven(11));
        System.out.println(isEven(addIntegers(5, 5)));

        // Call linearFunction() 3 times and display results.
        System.out.println(linearFunction(5.0, 2.5, 0.0));
        System.out.println(linearFunction(1.0, 2.0, 3.0));
        System.out.println(linearFunction(15, 200, 5));
    }


    // Method to print text.
    public static void printHelloWorld(){

        // Display text with println()
        System.out.println("Hello World!");

    }

    // Method which prints integer based provided arg.
    public static void printInteger(int a){

        // Declare variable "count".
        int count;

        // For loop which will go based on time filled in for arg.
        for(count=0; count<10; count++){

            // Display line with number filled in as arg.
            System.out.print(a + " ");

        }
        System.out.println();
    }


    // Method to add two integer args and return sum.
    public static int addIntegers(int a, int b){

        // Declare variable "sum".
        int sum;

        // Add two arg integers together.
        sum = a + b;

        // Return added values with variable "sum".
        return sum;
    }

    // Method to call addIntegers() and printInteger() with initial args.
    public static void printAddIntegers(int e, int f){

        // Declare variable for sum of integers.
        int sumToPrint;

        // Call addIntegers() and assigne to variable.
        sumToPrint = addIntegers(e, f);

        // Call printInteger() to print integers.
        printInteger(sumToPrint);
    }

    // Method to check if integer arg is even or odd.
    public static boolean isEven(int a){

        // Declare variable for integer being even or odd.
        boolean isEvenValue;

        // Check if arg is even or odd.
        if(a%2 == 0) {
            // Assign true if arg is even.
            isEvenValue = true; }
        else
        {
            // Assign false if arg is odd.
            isEvenValue = false;
        }

        // Return variable for integer being even or odd.
        return  isEvenValue;

    }

    // Method to calculate the linear function.
    static double linearFunction(double x, double slope, double yIntercept){

        // Declare variable.
        double h;

        // Calculate args and assign to variable.
        h =  (slope*x + yIntercept);

        // Return variable.
        return h;

    }

}

