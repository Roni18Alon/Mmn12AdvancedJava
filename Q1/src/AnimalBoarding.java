/*
Author: Roni Alon 315565176
AnimalBoarding class reflect a specific animal boarding, and display the polymorphism.
 */

import java.util.ArrayList;
import java.util.Random;

public class AnimalBoarding {

    private ArrayList<Owner> ownersList;
    private ArrayList<Animals> animalsList;

    //constructor for the boarding
    public AnimalBoarding() {
        this.ownersList = new ArrayList<>();
        this.animalsList = new ArrayList<>();
        //declare owners
        Owner roni = new Owner("Roni", 526677414);
        Owner lir = new Owner("Lir", 123459067);
        Owner noya = new Owner("Noya", 526931393);
        Owner guy = new Owner("Guy", 547939480);
        Owner ari = new Owner("Ari", 123456789);

        ownersList.add(roni);
        ownersList.add(noya);
        ownersList.add(lir);
        ownersList.add(guy);

        //declare and initiallize all objects using polymorphism
        Animals a1 = new Dog("Freddy", 7, "white", true, "shitzo", false, noya);
        Mammal m1 = new Dog("Freddy", 7, "white", true, "shitzo", false, noya);
        Mammal m2 = new Cat("Sky", 7, "gray", true, "persian", true, roni);
        Dog d1 = new Dog("Sky", 7, "gray", true, "persian", true, roni);
        Animals a2 = new Parrot("Krepssi", 1, "green", true, guy);
        Poultry p1 = new Rooster("Shalom", 10, "Red", "8 AM");
        Duck d2 = new Duck("Ducki", 6, "yellow");
        Mammal m3 = new Dog("Miki", 3, "beige", true, "shitzo", true, ari);
        Animals a3 = new Dog("Mini", 3, "beige", true, "shitzo", true, ari);
        Cat c1 = new Cat("Melech", 2, "white", true, "street", true, roni);
        Mammal m4 = new Bear("Pooh", 120, "yellow", true, "brown bear", "forest");
        Reptile r1 = new Snake("Snaki", 100, "green", 0, guy);
        Animals a4 = new Lizard("lizzi", 262722, "red", 12);
        Alligator a5 = new Alligator("timsah", 3, "green", 5, lir);

        //add to animal array list all animals
        animalsList.add(a1);
        animalsList.add(m1);
        animalsList.add(m2);
        animalsList.add(d1);
        animalsList.add(a2);
        animalsList.add(p1);
        animalsList.add(d2);
        animalsList.add(m3);
        animalsList.add(a3);
        animalsList.add(c1);
        animalsList.add(m4);
        animalsList.add(r1);
        animalsList.add(a4);
        animalsList.add(a5);

    }

    public ArrayList<Animals> getAnimals() {
        return this.animalsList;
    }

    public ArrayList<Owner> getOwners() {
        return this.ownersList;
    }

    //check for given time - num the equals of the animals - to show the Polymorphism
    public static void getEquals(ArrayList<Animals> animals, int num) {
        Random r = new Random();
        Animals a1, a2;
        int firstAnimal = r.nextInt(animals.size());
        int secondAnimal = r.nextInt(animals.size());
        int counter = 0;
        while (counter < num) {
            if (firstAnimal != secondAnimal) {
                a1 = animals.get(firstAnimal);
                a2 = animals.get(secondAnimal);
                System.out.println("first animal is :" + a1.getAnimalType());
                System.out.println("second animal is :" + a2.getAnimalType());
                System.out.println("check if both animals are equals: " + a1.equals(a2));
                counter++;
            }
            firstAnimal = r.nextInt(animals.size());
            secondAnimal = r.nextInt(animals.size());
        }
        System.out.println("~~~will be true with this Animal arraylist- two dogs~~~~~");
        System.out.println("check if both animals are equals: " + animals.get(0).equals(animals.get(1)));

    }
    //
    public static void implementAnimalBoarding(ArrayList<Animals> animals) {
        Animals tempAnimals;
        //Loop to print the Animals in the boarding - and check the common methods
        for (int i = 0; i < animals.size(); i++) {
            tempAnimals = animals.get(i);
            System.out.println(tempAnimals.toString());
            tempAnimals.makeSound();
            tempAnimals.eat();
            tempAnimals.sleep();
            tempAnimals.move();


            if (tempAnimals instanceof Snake) {
                ((Snake) tempAnimals).creep();
            }
            if (tempAnimals instanceof Lizard) {
                ((Lizard) tempAnimals).creep();
            }
            if (tempAnimals instanceof Alligator) {
                ((Alligator) tempAnimals).creep();
            }
            if (tempAnimals instanceof Parrot) {
                ((Parrot) tempAnimals).goFly();
            }
            if (tempAnimals instanceof Duck) {
                ((Duck) tempAnimals).goFly();
            }
            if (tempAnimals instanceof Rooster) {
                ((Rooster) tempAnimals).goFly();
            }

        }
        AnimalBoarding.getEquals(animals,10);
    }


    public static void switchOwner(Owner first,Owner second) throws CloneNotSupportedException {

        Dog originalDog = new Dog("Shoko", 6,"Black",true,"labrador",true, first);

        //cloning
        Dog clonedDog = (Dog)originalDog.clone();

        System.out.println("*****Printing objects before overriding cloned data:*****");
        System.out.println("Data of the original dog: "+originalDog);
        System.out.println("Data of the cloned dog: "+clonedDog);

        //Overriding cloned data
        clonedDog.setOwner(second);

        System.out.println("Does the owners of the original and cloned equal?"+originalDog.getOwner().equals(clonedDog.getOwner()));

        System.out.println("*****Printing objects after overriding cloned data:*****");
        System.out.println("Data of the original dog:"+ originalDog);
        System.out.println("Data of the cloned dog:" +clonedDog);

    }
}

