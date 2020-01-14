# Head First Java Chapter 4

# Table of contents
- Can every object of that type have different method behavior? 
- You can send things to a method
- You can get things back from a method
- You can send more than one thing to a method
- You can pass variables into a method, as long as the variable type matches the parameter type
- Encapsulation
- The difference between instance and local variables
- Comparing variables

Objects have state and behavior, represented by instance variables and methods

## Remember: a class describes what an object knows and what an object does

A class is the blueprint for an object.

When you write a class, you're describing how the JVM should make an object of that type.

## Can every object of that type have different method behavior?

kinda. Every instance of a particular class has the same methods, but the methods can behave differently based on the value of the instance variables. 

    void play() {
    	soundPlayer.playSound(title);
    }
    
    Song t2 = new Song();
    t2.setArtist("Travis");
    t2.setTitle("Sing");
    Song s3 = new Song();
    s3.setArtist("Sex Pistols");
    s3.setTitle("My Way");
    
    t2.play(); // Calling play on this instance will cause "Sing" to play. 
    s3.play(); // Calling play on this instance will cause "My Way" to play.

## You can send things to a method

Just as you would expect from any programming language, you can pass values into your methods. You might, for example, want to tell a Dog object how many times to bark by calling:

d.bark(3);

A method sues parameters. A caller passes arguments. 

Arguments are the things you pass into the methods. An argument (a value like 2 or "Foo", or a reference) lands face down into a parameter. A parameter is nothing but a local variable. 

But here is the important part. If a method takes a parameter, you must pass it something (that something must be a value of the appropriate type). 

    // Call the bark method on the Dog reference, and pass in the value 3  
    Dog d = new Dog();
    d.bark(3)
    
    
    /* 
    The bits representing the int value 3 are delivered into the bark method
    
    The bits lind in the numOfBarks parameter (an int-sized variable)
    
    Use the numOfBarks parameter as a variable in the method code
    */
    
    void bark(int numOfBarks) {
    	while(numOfBarks > 0) {
    	System.out.println("ruff");
    	numOfBarks = numOfBarks - 1;
    	}
    }

## You can get things back from a method

Methods can return values. Every method is a return type. 

A void return type means the method won't give anything back. 

    void go(){
    
    }

But you can declare a method to give a specific type of value back to the caller, such as: 

    int giveSecret(){
    	return 42;
    }

If you declare a method to return a value, you must return a value of the declared type (or a value that is compatible).

## You can send more than one thing to a method

Methods can have multiple parameters. Separate them with commas when you declare them and separate them with commas when you pass them.

Most importantly, if a method has parameters, you must pass arguments of the right type and order. 

    // Calling two-parameter method, and sending it two arguments.
    
    void go(){
    	TestStuff t = new TestStuff();
    	t.takeTwo(12, 34);
    } 
    
    /*
    The arguments you pass land in the same order you passed them. First 
    argument lands in the first parameter, second argument in the second 
    parameter, and so on....
    
    	|
    	|
    	V
    */
    
    void takeTwo(int x, int y) {
    	int z = x + y;
    	system.out.println("Total is " + z);
    }

## You can pass variables into a method, as long as the variable type matches the parameter type.

    void go() {
    int foo = 7;
    int bar = 3;
    t.takeTwo(foo, bar)
    }
    /* 
    The values of foo and bar land in the x and y parameters. So now the bits in x are
    identical to the bits in foo (the bit pattern for the integer 7) and the bits in 
    y are identical to the bits in bar.
    */
    
    void takeTwo(int x, int y){
    	int z = x + y;
    	System.out.println("Total is " + z);
    }

## Encapsulation
### "Do it or risk humiliation and ridicule"

It is very bad to just leave your data for everyone to see and touch (exposed).

Exposed means reachable with the dot operator.

 

    theCat.height = 0;
    // This is dangerous because it means that anyone can change it. 

We need to build setter methods for all the instance variables, and find a way to force that code to call the setters instead of accessing the code directly. 

    public void setHeight(int ht) {
    	if (ht > 9){
    		height = ht;
    	}
    }
    
    // put in checks to guarantee a minimum cat height.

## The difference between instance and local variables

Instance are declared inside a class but not within a method

    class Horse {
    	private double height = 15.2;
    	private String breed;
    	// rest of the code
    }

Local variables are declared in a method

    class AddThing {
    	int a;
    	int b = 12;
    	public int add(){
    		int total = a + b;
    		return total;
    	}
    }

Local variables MUST be initialized before use

    class Foo{
    	public void go() {
    		int x;
    		int z = x + 3;
    	}
    }
    
    // This won't compile. You can declare x without a value but if you try and use
    // it like that the compiler freaks out

Remember: 

Local variables do NOT get a default value. The compiler complains if you try to use a local variable before the variable is initialized. 

## Comparing variables (Primitives or references)

Use == to compare two primitives or to see if two references refer to the same object. 

Use the equals() method to see if two different objects are equal.

The == operator can be used to compare two variables of any kind, and it simply compares the bits. 

    Foo a = new Foo();
    Foo b = new Foo();
    Foo c = a;
    if (a == b) { /* false */ }
    if (a == c) { /* true */ }
    if (b == c) { /* false */ }