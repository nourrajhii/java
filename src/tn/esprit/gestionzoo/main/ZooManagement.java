package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.ZOO;

public class ZooManagement {
    public static void main(String[] args) {
        // Création de quelques animaux
        Animal lion = new Animal("Lion", "Felidae", 2, true);
        Animal tiger = new Animal("Tiger", "Felidae", 3, true);
        Animal elephant = new Animal("Elephant", "Elephantidae", 5, true);
        Animal zebra = new Animal("Zebra", "Equidae", 4, true);

        // Création de deux zoos
        ZOO myZoo1 = new ZOO("Safari Zoo", "Tunis");
        ZOO myZoo2 = new ZOO("Wild Park", "Sousse");

        // Ajout des animaux dans les zoos
        myZoo1.addAnimal(lion);
        myZoo1.addAnimal(tiger);
        myZoo2.addAnimal(elephant);
        myZoo2.addAnimal(zebra);

        // Affichage des animaux de chaque zoo
        System.out.println("\nAnimaux dans le zoo 1 :");
        myZoo1.displayAnimals();

        System.out.println("\nAnimaux dans le zoo 2 :");
        myZoo2.displayAnimals();

        // Suppression d'un animal
        myZoo1.removeAnimal(lion);

        // Comparaison des zoos
        ZOO largerZoo = ZOO.comparerZoo(myZoo1, myZoo2);
        if (largerZoo != null) {
            System.out.println("\nLe zoo avec le plus d'animaux est : " + largerZoo.getName());
        }

        // Affichage des informations du zoo
        System.out.println("\nInformations sur le zoo 1 :");
        myZoo1.displayZoo();

        System.out.println("\nInformations sur le zoo 2 :");
        myZoo2.displayZoo();
    }
}
