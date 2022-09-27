//realise par KHEIR-EDDINE MEDERREG

public class Exo6 {
    public static void main(String[] args) {
        // Program that ask the user the content of a double array and then display the array with the sum of each line and each column
        System.out.print("Entrez la taille du tableau (0 pour terminer) :");
        int TabLength = Utils.CheckInt(); // Je stock mon input
        if (TabLength == 0) {                 // Je vérifie qu'il n'est pas égale a 0
            Utils.GoToMenu();                // si oui je retourne au menu sinon je continue
        } else if (TabLength < 0) {            // Je verifie que l'input est positif
            System.out.print("Entrez une taille positive (0 pour terminer)");
            main(args);
        }
        int[][] tab = new int[TabLength][TabLength];                                    // Je déclare mon tableau
        double sum1 = 0;                                                                // Je déclare ma variable qui va contenir la moyenne des lignes
        double sum2 = 0;                                                                // Je déclare ma variable qui va contenir la moyenne des colonnes
        double sum_row = 0;                                                             // Je déclare ma variable qui va contenir la somme des lignes
        double sum_col = 0;                                                             // Je déclare ma variable qui va contenir la somme des colonnes
        double sum_total = 0;                                                           // Je déclare ma variable qui va contenir la somme totale
        for (int i = 0; i <= tab.length - 1; i++) {                                     // Je parcours mon tableau pour remplir les lignes
            for (int j = 0; j <= tab.length - 1; j++) {                                 // Je parcours mon tableau  pour remplir les colonnes
                System.out.print("Entrez la valeur [" + (i + 1) + ','+ (j + 1)+ "] :"); // Je demande a l'utilisateur de remplir le tableau
                tab[i][j] = Utils.CheckInt();    // Je stock l'input dans mon tableau
            }
        }
        for (int i = 0; i <= tab.length - 1; i++) {                                     // Je parcours mon tableau pour afficher les lignes
            for (int j = 0; j <= tab.length - 1; j++) {                                 // Je parcours mon tableau  pour afficher les colonnes
                if (tab[i][j] < 10) {                                                   // Je vérifie si la valeur est inférieur a 10
                    System.out.print(" " + tab[i][j] + "     ");                        // Si oui je rajoute un espace pour que les valeurs soient alignées
                } else {                                                                // Sinon je l'affiche normalement
                    System.out.print(tab[i][j] + "     ");
                }
                sum1 += tab[i][j];                                                      // Je calcule la somme des lignes
            }
            sum_row = sum1 / TabLength;                                                 // Je calcule la moyenne des lignes
            System.out.println("(" + sum_row + ")");                                    // J'affiche la moyenne des lignes
            sum_total += sum_row;                                                       // Je calcule la somme totale
            sum1 = 0;                                                                   // Je réinitialise ma variable
        }
        for (int i = 0; i <= tab.length - 1; i++) {                                     //la meme chose que pour les lignes mais pour les colonnes
            for (int j = 0; j <= tab.length - 1; j++) {
                sum2 += tab[j][i];
            }
            sum_col = sum2 / TabLength;
            System.out.print("(" + Math.round(sum_col * 100.0) /100.0 + ")" + " ");
            sum2 = 0;
        }
        System.out.println("(" + sum_total + ")");
        System.out.println();
        main(args);
    }
}
