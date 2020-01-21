# Chapter 5 Extra strength methods (writing a program)

# Table of contents
- Developing a class
- For loops
- Enhanced for loop
- Bullet points

## Developing a Class
- Figure out what the class is supposed to do.
- List the instance variables and methods.
- Write prepcode for the methods.
- Write test code for the methods.
- Implement the class.
- Test the methods.
- Debug and reimplement as needed

## For Loops

Regular (non-enhanced) for loops

``` Java
for(int i = 0; i < 100; i++)

/* Initialization
Use this to declare and initialize a variable to use within the loop body.
*/
int i = 0;

/* Boolean Test 
This is where the conditional test goes. It is either true or false.
*/ 
i < 100;
    
/* Iteration Expression
In this part, put what you want to happen with each trip through the loop.
*/
i++;
``` 

## The enhanced for loop

``` Java
for(String name : nameArray){}

/* Iteration variable declaration 
Declare and initialize a variable to use within the loop body. 
*/ 
String name

/* The actual collection
This must be a reference to an array or other collection. 
*/
nameArray
```


## Bullet Points
- Your java program should start with a high level design.
- Typically you’ll write three things when you create a new class:
- prepcode
- testcode
- real(java) code.
- Prepcode should descibe what to do, not how to do it. Implementation comes later.
- Use the prepcode to help design the test code.
- Write test code before you implement the methods.
- Choose for loops over while loops when you know how many times you want to repeat the loop code.
- Use the pre/post increment operator to add 1 to a variable (x++)
- Use the pre/post decrement operator to subtract 1 from a variable (x–).
- Use Integer.parseInt() to get the int value of a string.
- Integer.parseInt() works only if the String represents a digit (“0″,”1”, etc).
- Use break to leave a loop early.