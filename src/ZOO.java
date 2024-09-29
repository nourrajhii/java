public class ZOO {
    private final int nbrCages = 25; // Nombre maximum d'animaux dans le zoo
    Animal[] animals;
    String name;
    String city;
    int animalCount; // Compteur pour le nombre d'animaux ajoutés

    // Constructeur
    public ZOO(String name, String city) {
        this.animals = new Animal[nbrCages]; // Zoo avec un maximum de 25 animaux
        this.name = name;
        this.city = city;
        this.animalCount = 0; // Initialiser le compteur d'animaux à 0
    }

    // Méthode pour ajouter un animal dans le zoo
    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Erreur : Le zoo est plein. Impossible d'ajouter plus d'animaux.");
            return false;
        }

        // Vérifier si l'animal existe déjà dans le zoo
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(animal.name)) {
                System.out.println("Erreur : L'animal " + animal.name + " existe déjà dans le zoo.");
                return false;
            }
        }

        // Ajouter l'animal s'il est unique et qu'il reste de la place
        animals[animalCount] = animal;
        animalCount++; // Incrémenter le compteur d'animaux
        System.out.println("L'animal " + animal.name + " a été ajouté au zoo.");
        return true;
    }

    // Méthode pour supprimer un animal du zoo
    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(animal.name)) {
                // Décaler tous les animaux suivants d'une case vers la gauche
                for (int j = i; j < animalCount - 1; j++) {
                    animals[j] = animals[j + 1];
                }
                animals[animalCount - 1] = null; // Supprimer le dernier animal
                animalCount--; // Décrémenter le compteur d'animaux
                System.out.println("L'animal " + animal.name + " a été supprimé du zoo.");
                return true;
            }
        }
        System.out.println("Erreur : L'animal " + animal.name + " n'a pas été trouvé dans le zoo.");
        return false;
    }

    // Méthode pour afficher les informations du zoo
    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Animals: " + animalCount + "/" + nbrCages);
    }

    // Méthode pour afficher les animaux du zoo
    public void displayAnimals() {
        System.out.println("Liste des animaux dans le zoo : ");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i].toString());
        }
    }

    // Méthode pour rechercher un animal par nom dans le zoo
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i; // Retourne l'indice si l'animal est trouvé
            }
        }
        return -1; // Retourne -1 si l'animal n'est pas trouvé
    }

    // Méthode pour vérifier si le zoo est plein
    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }

    // Méthode pour comparer deux zoos et renvoyer celui avec le plus d'animaux
    public static ZOO comparerZoo(ZOO z1, ZOO z2) {
        if (z1.animalCount > z2.animalCount) {
            return z1;
        } else if (z2.animalCount > z1.animalCount) {
            return z2;
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux.");
            return null; // Les zoos ont le même nombre d'animaux
        }
    }

    // Surcharge de la méthode toString
    @Override
    public String toString() {
        return "Zoo Name: " + name + "\nCity: " + city + "\nNumber of Animals: " + animalCount + "/" + nbrCages;
    }
}
