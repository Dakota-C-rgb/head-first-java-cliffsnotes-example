Table of contents
--------------------------
- What are things an object knows about itself? 
- What are things an object can do called? 
- What's the difference between a class and an object? 
- What are the steps in making your first object? 
- What is the dot operator? 
- What are the two uses of main()?

# What are things an object knows about itself? 
-------------------------------------------------
An object knows instance variables. Instance variables represent an object's state (data), and have unique values for each object of that type. Instance is like another way to say object. 

# What are the things an object can do called? 
-------------------------------------------------
The things an object can do are called methods. Methods work with the data to perform different actions. These actions could read or write to the values of an object. 

Example: 
A song has the instance variables title and song. The song has the methods setTitle(), setArtist(), and play(). 
The song only knows its song and title but can change the title and artist. The method play() will read the song to see what it is. 

# What's the difference between a class and an object? 
-------------------------------------------------
A class is NOT an object (but it's used to construct them). 

A class is a blueprint for an object. 

Each object made from that class can have its own value for the instance variables for that class. 

Example: 
You might use the button class for dozens of buttons but each button might have its own color, shape, size, label, etc. 
-------------------------------------------------
# What are the steps in making your first object? 
-------------------------------------------------
You need two classes. One class for the type of object you want to use and one to test your first one. The tester class is where you put the main() method. The tester class only has one job: try out the methods and variables of your new object class type. 

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

# What is the dot operator? 
-------------------------------------------------
The dot operator gives you access to an objects state and behavior (instance variables and methods).

// make a new dog object 
Dog d = new Dog();
// make it bark by using the dot operator on the variable d to call bark()
d.bark();

# What are the two uses of main()? 
--------------------------------------------------
1. To test your real class

2. To launch/start your Java application