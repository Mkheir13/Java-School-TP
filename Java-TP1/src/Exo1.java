// réaliser par MEDERREG KHEIR-EDDINE

import java.lang.*;


public class Exo1 {                                                     // Exercice qui calcule la racine carré
    public static void main(String[] args) {
        System.out.println("Racine d'un nombre");
        System.out.print("Entrez une valeur positive (0 pour quitter): ");
        int digits = Utils.CheckInt();                          // je stock mon input
        if (digits == 0) {                                              // Je vérifie qu'il n'est pas égale a 0
            Utils.GoToMenu();                                        // si oui je retourne au menu sinon je continue
        } else if (digits < 0){                                         // Je verifie que l'input est positif
            System.out.println("Erreur, la valeur ne peut pas être négative");
            main(args);
        }
        double root = Math.sqrt(digits);                                // je calcule la racine carré puis je l'imprime
        System.out.println("La racine de " + digits + " est " + Math.round(root * 1000000.0) / 1000000.0);
        main(args);
    }
}
