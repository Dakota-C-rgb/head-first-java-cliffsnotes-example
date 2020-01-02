# A Quick Dip (Chapter 1)
-----------------------------------------------------
# Table of Contents:
    - How does Java work?
    - How should Java be structured? 
    - What is the Anatomy of a class? 
-----------------------------------------------------

# How Does Java Work???
-----------------------------------------------------
Java takes the source document and runs it through a compiler. The compiler checks for errors and 
won't let you compile until your program will run. 

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
5. public(everyone can access it) static void(return value) main(name of the method) (String[] args)(arguments to the method)
6. Opening brace for method
7. System.out.print("asdf")(standard output);(every statement must end in a semicolon)
8. Close the method with closing curly
9. Close the class with closing curly. 

  1.     2.      3.     4. 
public class MyFirstApp {
                       5.                  6. 
    public static void main(String[] args) {
                 7.     
        System.out.print("Hello World");
    8.     
    }
9.     
}

------------------------------------------------------

