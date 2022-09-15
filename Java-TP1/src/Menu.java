// réaliser par MEDERREG KHEIR-EDDINE

import java.io.File;

public class Menu {                                     // Menu en Java
    public static void main(String[] args) {

        File directory = new File(".");        // Je commence par déterminer le dossier que je veux choisir
        int fileCount = (directory.list().length - 1);  // ensuite je compte combien j'ai de fichiers dans mon dossier
                                                        // Je fais -1 pour qu'il ne prennent pas en compte le Menu
        System.out.println("Menu");
        for (int i = 1; i < fileCount; i++) {           // Grace a cette boucle j'afficher le nombre d'exos grace
            System.out.println(i + "- Exercice " + i);  // en utilisant le nombre de fichiers
        }
        System.out.println("0- Quitter");
        String exo = Utils.checkString();               // Enfin je récupere l'input pour l'utiliser dans mon switch

        switch (exo) {
            case "1" -> Exo1.main(args);
            /*case "2" -> Exo2.main(args);
            case "3" -> Exo3.main(args);
            case "4" -> Exo4.main(args);
            case "5" -> Exo5.main(args);
            case "6" -> Exo6.main(args);*/
            case "0" -> {
                System.exit(0);
            }
            default -> {
                System.out.println("Choix invalide");
                main(args);
            }
        }
    }
}
