Table of contents
--------------------------
- What are things an object knows about itself? 
- What are things an object can do called? 
- What's the difference between a class and an object? 
- What are the steps in making your first object? 
- What is the dot operator? 
- What are the two uses of main()?

What are things an object knows about itself? 
-------------------------------------------------
An object knows instance variables. Instance variables represent an object's state (data), and have unique values for each object of that type. 

What are the things an object can do called? 
-------------------------------------------------
The things an object can do are called methods. Methods work with the data to perform different actions.

What's the difference between a class and an object? 
-------------------------------------------------
A class is NOT an object (but it's used to construct them). 

A class is a blueprint for an object. 

Each object made from that class can have its own value for the instance variables for that class. 

Example: 

You might use the button class for dozens of buttons but each button might have its own color, shape, size, label, etc. 
-------------------------------------------------
What are the steps in making your first object? 
-------------------------------------------------
1. Write your class
class Dog {
	int size;
	String breed;
	String name;
	
	void bark(){
		System.out.println("Bark")
     }
}

2. Write a tester class and inside that tester class make an object and access the objects variables and methods. 

class TestDogCase {
	public static void main(String[] args){
	     Dog d = new Dog();
	     d.size = 20;
	     d.bark();
     }
}

What is the dot operator? 
-------------------------------------------------
The dot operator gives you access to an objects state and behavior (instance variables and methods).

// make a new dog object 
Dog d = new Dog();
// make it bark by using the dot operator on the variable d to call bark()
d.bark();

What are the two uses of main? 
--------------------------------------------------
- To test your real class
- To launch/start your Java application