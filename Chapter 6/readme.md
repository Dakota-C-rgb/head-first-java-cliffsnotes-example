# Using the Java Library (get to know the Java API)

## Chapter 06
----------------------------------------------------------------------------------------------------
## ArrayList

```Java
// make an ArrayList
ArrayList<Egg> myList = new ArrayList<Egg>();

// Put something in it.	
Egg s = new Egg();
myList.add(s);

// Put another thing in it.
Egg b = new Egg();
myList.add(b);

// Find out how many things are i
int theSize = myList.size();

// Find out if it contains something.
boolean isIn = myList.contain(s);

// Find out where something is (i.e. its index)
boolean idx = myList.indexOf(b);

// Find out if it’s empty
boolean empty = myList.isEmpty();

// Remove something from it.	
myList.remove(s);
```

## ArrayList Vs Array
A plain old array has to know its size at the time it’s created.
To put an object in a regular array, you must assign it to a specific location.
Arrays use array syntax that’s not used anywhere else in java.
ArrayList in Java 5.0 are parameterized.

## Boolean Expressions
* ‘And’ and ‘Or’ Operators (&&, ||)
```java
    if(price >= 300 && price < 400) {
        camera = "x";
    }

    if(brand.equals("A") || brand.equals("B")) {
        // Do stuff for only brand A or B
    }
```
* Not equals (!= and !)
``` java 
    if(model != 2000) {
        System.out.print("The model is not 2000!");
    }

    if(!brand.equals("x")) {
        System.out.print("Brand is not x!");
    }
```
* Short Circuit Operators (&&, ||)
``` java
    if(refVar != null && refVar.isValidType()) {
        // Do 'got a valid type' stuff
    }
```
* In case of && if the JVM sees that the left side of a && expression is false,
it stops right there. Similarly with || the expression will be true if either side is true. 

## Using the Library (The Java API)

In the Java API, classes are grouped into packages. 

Every class in the Java library belongs to a package. The package has a name, like java.swing

You have to know the full name of the class you want to use in your code. Like ArrayList is not the full
name of ArrayList. The full name is java.util.ArrayList.


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

## Bullet Points
- ArrayList is a class in the Java Api.
- To Put something into an ArrayList, use add().
- To remove something from an ArrayList use remove().
- To find out where something is in an ArrayList, use indexOf().
- To find out if an ArrayList is empty, use isEmpty().
- To get the size in an ArrayList, use the size() method.
- To get the length in a regular old array, you have to use the length variable.
- An ArrayList resizes dynamically to what-ever size is needed. It grows when objects are added, and it shrinks when objects are removed.
- You declare the type of the array using a type parameter, which is a type name in angle brackets.
- Although an ArrayList holds objects and not primitives, the compiler will automatically wrap a primitive into an object.
- Classes are grouped into packages.
- A class has a full name, which is a combination of the package name and the class name.
- To use class in a package other that java.lang, you must tell Java the full name of the class.
- You use either an import statement at the top of your source code, or you can type the full name every place you use the class in your code.