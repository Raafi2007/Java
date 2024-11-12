package polymorphismExample;

public class MethodOverloadingClass {

    //Compile-Time Polymorphism in Java

    // Method Overloading same name with different data types

    // Method with 2 integer parameters
    static int Multiply(int a, int b) {
        return a * b;
    }

    // Method 2
    // With same name but with 2 double parameters
    static double Multiply(double a, double b) {
        return a * b;
    }

//--------------------------------------------------------------------------------------------------------------------//
    // Method Overloading same name with Different Numbers of Arguments

    // Method 1
    // Additional of 2 numbers
    static int Add(int a, int b) {

        return a + b;
    }

    // Method 2
    // Additional of 3 numbers
    static int Add(int a, int b, int c) {

        return a + b + c;
    }
}

