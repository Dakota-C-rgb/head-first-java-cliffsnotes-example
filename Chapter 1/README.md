# A Quick Dip (Chapter 1)
-----------------------------------------------------
# Table of Contents:
    - How does Java work?
    - How should Java be structured? 
    - What is the Anatomy of a class? 
    - While loops
-----------------------------------------------------

# How Does Java Work???
-----------------------------------------------------
Java takes the source document and runs it through a compiler. The compiler checks for errors and 
won't let you compile until your program can run error free. 

After it has been ran through the compiler it creates a new document, coded into Java by bytecode.
Any device will then be able to interprate/trandslate the file into something it csn run if the device is capable of running Java. 

Virtual Java machines (in the software) can then read and run the code.

------------------------------------------------------

# How should Java be structured?
------------------------------------------------------
Source File - Start with the source file. The source file contains class definitions. The class represents a piece of the program but a small application may just need one class. 

Class - A class has one or more methods. A method must be declared inside the class. Methods hold all the instructions for how the class should act. 

Method - Within a method write the instructions for how the method should be performed. It's basically a procedure.

------------------------------------------------------

# What is the anatomy of a class? 
------------------------------------------------------
1. Tell if the class should be public or not
2. Class 
3. Class name
4. Opening curly brace of class.
5. public(everyone can access it) static(Chapter does not go over static) void(return value) main(name of the method) (String[] args)(arguments to the method)
6. Opening brace for method
7. System.out.print("asdf")(standard output);(every statement must end in a semicolon)
8. Close the method with closing curly
9. Close the class with closing curly.
 
public class MyFirstApp { 
    public static void main(String[] args) {
        System.out.print("Hello World");
    }
}

------------------------------------------------------

# While loops
------------------------------------------------------
A while loop runs everything within its block {in curly braces} as long as the conditional is true. 

if the conditional is false the while loop won't run, and execution will move down to the code immediately after the loop. 

A while loop's syntax:
    Put a boolean test inside parentheses 

    while (boolean) {}

Example of a while loop:

public class Loopy {
    public static void main (String[] args) {
        int x = 1;
        System.out.println("Before the loop");
        while (x < 4) {
            System.out.println("In the loop");
            System.out.println("The value of x is " + x);
            x = x + 1;
        }
        System.out.println("This is after the loop.");
    }
}