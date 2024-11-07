
//////////////////METHODE 1 ////////////

/*public class ZooManagement {
   private int nbrCages = 20;
    private String zooName = "my zoo";

    public static void main(String[] args) {
        ZooManagement zoo = new ZooManagement();
        zoo.afficherDetailsZoo();
    }

    public void afficherDetailsZoo() {
        System.out.println(zooName + " comporte " + nbrCages + " cages");
    }
}*/
//////////METHODE 2 //////////////
import java.util.Scanner;

public class ZooManagement {
    private int nbrCages;
    private String zooName;

    public static void main(String[] args) {
        ZooManagement zoo = new ZooManagement();
        zoo.saisirDetailsZoo();
        zoo.afficherDetailsZoo();
    }
    public void saisirDetailsZoo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nom du zoo : ");
        zooName = scanner.nextLine();
        System.out.print("Entrez le nombre de cages : ");
        nbrCages = scanner.nextInt();

    }
    public void afficherDetailsZoo() {
        System.out.println(zooName + " comporte " + nbrCages + " cages");
    }
}


