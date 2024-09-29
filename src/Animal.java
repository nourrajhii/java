public class Animal {
    String name;
    String family;
    int age;
    boolean isMammal;

    // Constructeur paramétré de la classe Animal
    public Animal(String name, String family, int age, boolean isMammal) {
        this.name = name;
        this.family = family;
        this.age = age;
        this.isMammal = isMammal;
    }

    // Surcharge de la méthode toString pour afficher les informations de l'animal
    @Override
    public String toString() {
        return "Animal Name: " + name + "\nFamily: " + family + "\nAge: " + age + "\nIs Mammal: " + isMammal;
    }
}
