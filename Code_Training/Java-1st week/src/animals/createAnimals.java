package animals;

import java.util.Scanner;

public class createAnimals {
    Scanner myScanner = new Scanner(System.in);

    private  void getAnimalType() {
        System.out.println("What animal would you like to create?");
        String animal = myScanner.nextLine();

        if (animal.equalsIgnoreCase("dog")) {
            createDog();
        } else if (animal.equalsIgnoreCase("cat")) {
            createCat();
        } else {
            System.out.println(animal + " is not on the list of animals currently create, please try again");
        }
    }

    private void createDog() {
        System.out.println("What is the dogs name?");
        String name = myScanner.nextLine();
        System.out.println("How big is the dog?");
        String size = myScanner.nextLine();
        System.out.println("How old is the dog?");
        int age = Integer.parseInt(myScanner.nextLine());
        System.out.println("what breed is the dog?");
        String breed = myScanner.nextLine();
        dog myDog = new dog(name, size, age, breed);

        myDog.bark(size);
        myDog.play(breed);
        myDog.beHuman(name, age, breed);

        System.out.println(myDog.bark(size));
    }
    private void createCat() {
    }

    public static void main(String[] args) {
        createAnimals c = new createAnimals();
        c.createDog();

    }
}
