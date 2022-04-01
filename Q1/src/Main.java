/*
Author: Roni A lon 315565176
Main class includes the program to run the tasks of clauses b and c in MMN 12 Q1.
 */

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        AnimalBoarding petsPlace = new AnimalBoarding();
        ArrayList<Animals> animals = petsPlace.getAnimals();
        ArrayList<Owner> owners= petsPlace.getOwners();

        System.out.println("\n\nClause B in MMN 11 Q1, displaying usage of polymorphism\n");
        AnimalBoarding.implementAnimalBoarding(animals);
        System.out.println("\n\nClause C in MMN 11 Q1, change owner of an animal using clone\n");
        AnimalBoarding.switchOwner(owners.get(0),owners.get(1));

    }
}
