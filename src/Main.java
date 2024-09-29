import java.util.Scanner;

public class Main {

 public static void main(String[] args) {
  int nbrCages;
  String zooName;

  // Scanner pour obtenir l'entrée de l'utilisateur
  Scanner scanner = new Scanner(System.in);

  // Demande à l'utilisateur d'entrer le nom du zoo
  System.out.println("Entrer le nom du Zoo : ");
  zooName = scanner.nextLine();

  // Demande à l'utilisateur d'entrer le nombre de cages
  System.out.println("Entrer le nombre de cages : ");
  nbrCages = scanner.nextInt();

  // Affichage du résultat
  System.out.println(zooName + " comporte " + nbrCages + " cages");

  // Fermeture du scanner pour éviter les fuites de ressources
  scanner.close();
 }
}
