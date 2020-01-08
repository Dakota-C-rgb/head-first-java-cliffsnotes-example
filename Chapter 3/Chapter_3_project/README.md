#  Chapter 3 Primitives and references

## Table of contents

- Local variables
- Return types
- Primitives
- Declaration rules
- Variables
- What can you use as a name?
- Controlling your object
- Arrays are objects too

## Local variables

local variables are variables declared within a method

## Return type

Return types are values sent back to the caller of the method. 

## Primitives

Primitives hold fundamental values (think simple bit patterns) including integers, booleans, and floating point numbers. 

## Declaration rules

1. Variables must have a type
2. Variables must have a name. 

    int count;
    // the int is the type and count is the name. 

## Variables

A variable is just a container. 

When you declare a variable in Java, you must declare it with a specific type

The four integer primitives in Java (at least this far in the book)  are:

- long - 64 bits
- int - 32 bits
- short - 16 bits
- byte - 8 bits

Every primitive has a fixed number of bits.

 

## What can you use as names?

The rules are pretty simple

1. It must start with a letter, underscore, or dollar sign. You can't start a name with a number. 
2. After the first you can use a number. It just can't start with a number.
3. It can be whatever you want it to be as long it follows the rules and isn't a word reserved by Java. 

Reserved words are key words that the compiler recognizes. If you really want to confuse a compiler use a key word as a name.  

    int p0001234;
    // This is right. 
    
    int 1poghfjhdkfwdh;
    // This is not. 
    
    String int;
    // Just try it. 

## Controlling your object

- There is actually no such thing as an object variable.
- There's only an object reference variable
- An object reference variable holds bits that represent a way to access an object
- It doesn't hold the object itself, but it holds something like a pointer. Or an address. In Java we don't really know what is inside of the reference variable. We do know that whatever it is, it represents one and only one object. The JVM knows how to use the reference to get to the object.

## The three steps of object declaration, creation, and assignment

1. Declare a reference variable

    Dog myDog = new Dog();
    // myDog is the reference variable

Tells the JVM to allocate space for a reference variable, and names that variable myDog. The reference variable is always going to be the type Dog. 

2. Create an object

    Dog myDog = new Dog();
    // new Dog() creates the object 

Tells the JVM to allocate space for a new Dog object on the heap (book doesn't really explain heap)

3. Link the object and the reference

    Dog myDog = new Dog();
    // Equal sign is the link

Assigns the new Dog to the reference variable myDog.

## Arrays are objects too

Every element in an array is just a variable.

Arrays are always objects, whether they're declared to hold primitives or object references. 

An array object can have elements which are primitives, but the array itself is never primitive. 

  

## Java cares about type

Once you've declared an array, you can't put anything in it except things that are of the declared array type. For example, you can't put a Cat in a Dog array.  

You can put a byte into an int array, because a byte will always fit into an int-sized cup. This is known as an implicit widening.