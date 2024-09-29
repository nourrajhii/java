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
        myZoo1.addAnimal(lion);      // Ajoute le lion dans le premier zoo
        myZoo1.addAnimal(tiger);     // Ajoute le tigre dans le premier zoo
        myZoo2.addAnimal(elephant);  // Ajoute l'éléphant dans le deuxième zoo
        myZoo2.addAnimal(zebra);     // Ajoute le zèbre dans le deuxième zoo

        // Affichage des animaux de chaque zoo
        System.out.println("\nAnimaux dans le zoo 1 :");
        myZoo1.displayAnimals();

        System.out.println("\nAnimaux dans le zoo 2 :");
        myZoo2.displayAnimals();

        // Suppression d'un animal
        myZoo1.removeAnimal(lion); // Supprimer le lion du zoo 1

        // Comparaison des zoos
        ZOO largerZoo = ZOO.comparerZoo(myZoo1, myZoo2);
        if (largerZoo != null) {
            System.out.println("\nLe zoo avec le plus d'animaux est : " + largerZoo.name);
        }

        // Affichage des informations du zoo
        System.out.println("\nInformations sur le zoo 1 :");
        myZoo1.displayZoo();

        System.out.println("\nInformations sur le zoo 2 :");
        myZoo2.displayZoo();
    }
}
