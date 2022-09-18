// réaliser par MEDERREG KHEIR-EDDINE
public class Exo2 {
    public static void main(String[] args) {
                                                        // Exercice qui permet de dessiner un arbre de noel
        System.out.print("Hauteur de l'arbre: ");
        int height = Utils.CheckInt();                  // je stock mon input
        if (height == 0) {                              // Je vérifie qu'il n'est pas égale a 0 si oui
            Utils.GoToMenu();                            // je retourne au menu sinon je continue
        }
        for (int leaves = 1; leaves <= height; leaves++) {
            System.out.println("=".repeat(height - leaves + 3) + "*".repeat(leaves * 2 - 1) + "=".repeat(height - leaves + 3));
        }                                               // Je dessine les feuilles de l'arbre
        for (int trunc = 1; trunc <= 2; trunc++) {
            System.out.println("=".repeat(height - trunc + 3) + "*".repeat(trunc *  2 - 1) + "=".repeat(height - trunc + 3));
        }                                               // Je dessine le tronc de l'arbre
        Utils.GoToMenu();
    }
}

