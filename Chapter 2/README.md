Table of contents
--------------------------
- Things an object knows about itself 
- Things an object can do
- What's the difference between a class and an object? 
- Steps to making your first object 
- What is the dot operator? 
- Two uses of main()

# Things an object knows about itself 

An object knows instance variables. Instance variables represent an object's state (data), and have unique values for each object of that type. Instance is like another way to say object. 

# Things an object can do

The things an object can do are called methods. Methods work with the data to perform different actions. These actions could read or write to the values of an object. 

Example: 
A song has the instance variables title and song. The song has the methods setTitle(), setArtist(), and play(). 
The song only knows its song and title but can change the title and artist. The method play() will read the song to see what it is. 

# What's the difference between a class and an object? 

A class is NOT an object (but it's used to construct them). 

A class is a blueprint for an object. 

Each object made from that class can have its own value for the instance variables for that class. 

Example: 
You might use the button class for dozens of buttons but each button might have its own color, shape, size, label, etc. 

# Steps to making your first object
You need two classes. One class for the type of object you want to use and one to test your first one. The tester class is where you put the main() method. The tester class only has one job: try out the methods and variables of your new object class type. 
```java
// 1. Write your class
class Dog {
	int size;
	String breed;
	String name;
	
	void bark(){
		System.out.println("Bark")
     }
}

/*2. Write a tester class and inside that tester class make an object and access the objects variables and methods. 
*/
class TestDogCase {
	public static void main(String[] args){
	     Dog d = new Dog();
	     d.size = 20;
	     d.bark();
     }
}
```
# What is the dot operator? 

The dot operator gives you access to an objects state and behavior (instance variables and methods).
```java
// make a new dog object 
Dog d = new Dog();
// make it bark by using the dot operator on the variable d to call bark()
d.bark();
```

## Inheritance
Inheritance is a process of defining a new class based on an existing class by extending its common data members and methods. Inheritance allows us to reuse of code, it improves reusability in your java application.

``` Java
class Bicycle  
{ 
    // the Bicycle class has two fields 
    public int gear; 
    public int speed; 
          
    // the Bicycle class has one constructor 
    public Bicycle(int gear, int speed) 
    { 
        this.gear = gear; 
        this.speed = speed; 
    } 
          
    // the Bicycle class has three methods 
    public void applyBrake(int decrement) 
    { 
        speed -= decrement; 
    } 
          
    public void speedUp(int increment) 
    { 
        speed += increment; 
    } 
      
    // toString() method to print info of Bicycle 
    public String toString()  
    { 
        return("No of gears are "+gear 
                +"\n"
                + "speed of bicycle is "+speed); 
    }  
} 
  
// derived class 
class MountainBike extends Bicycle  
{ 
      
    // the MountainBike subclass adds one more field 
    public int seatHeight; 
  
    // the MountainBike subclass has one constructor 
    public MountainBike(int gear,int speed, 
                        int startHeight) 
    { 
        // invoking base-class(Bicycle) constructor 
        super(gear, speed); 
        seatHeight = startHeight; 
    }  
          
    // the MountainBike subclass adds one more method 
    public void setHeight(int newValue) 
    { 
        seatHeight = newValue; 
    }  
      
    // overriding toString() method 
    // of Bicycle to print more info 
    @Override
    public String toString() 
    { 
        return (super.toString()+ 
                "\nseat height is "+seatHeight); 
    } 
      
} 
  
// driver class 
public class Test  
{ 
    public static void main(String args[])  
    { 
          
        MountainBike mb = new MountainBike(3, 100, 25); 
        System.out.println(mb.toString()); 
              
    } 
} 
```

## Method overriding

The main advantage of method overriding is that the class can give its own specific implementation to a inherited method without even modifying the parent class code.

This is helpful when a class has several child classes, so if a child class needs to use the parent class method, it can use it and the other classes that want to have different implementation can use overriding feature to make changes without touching the parent class code.

``` java
class Human{
   //Overridden method
   public void eat()
   {
      System.out.println("Human is eating");
   }
}
class Boy extends Human{
   //Overriding method
   public void eat(){
      System.out.println("Boy is eating");
   }
   public static void main( String args[]) {
      Boy obj = new Boy();
      //This will call the child class version of eat()
      obj.eat();
   }
}
```

# Two uses of main() 

1. To test your real class

2. To launch/start your Java application