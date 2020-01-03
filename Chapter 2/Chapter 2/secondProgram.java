import java.util.Scanner;

// java is lowercase above. 

class SecondProgram {
    int size;
    String breed;
    String name;

    void bark() {
        System.out.println("Bark I'm a dog. No cats here oh nooooooo.");
    }
}

class SecondProgramTest {
    public static void main(String[] args) {
        SecondProgram d = new SecondProgram();
        Scanner input = new Scanner(System.in);

        System.out.print("Size in weight: ");
        Integer size = input.nextInt();
        d.size = size;

        System.out.println("Name: ");
        String name = input.next();
        d.name = name;

        System.out.println("Breed:  ");
        String breed = input.next();
        d.breed = breed;

        d.bark();

        System.out.println("Size: " + d.size);
        System.out.println("Name: " + d.name);
        System.out.println("Breed: " + d.breed);
        input.close();
    }
}
