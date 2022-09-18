// réaliser par MEDERREG KHEIR-EDDINE

public class Exo5 {

    public static void main(String[] args) {
        System.out.print("Entrez la taille du tableau (0 pour terminer) :");
        int TabLength = Utils.CheckInt(); // Je stock mon input
        if (TabLength == 0) {                 // Je vérifie qu'il n'est pas égale a 0
            Utils.GoToMenu();                // si oui je retourne au menu sinon je continue
        } else if (TabLength < 0) {            // Je verifie que l'input est positif
            System.out.print("Entrez une taille positive (0 pour terminer)");
            main(args);
        }
        Double[] tab = new Double[TabLength]; // Je déclare mon tableau
        double sum = 0;
        for (int i = 0; i <= tab.length - 1; i++) {
            System.out.print("Entrez la valeur " + (i + 1) + " :");
            tab[i] = Utils.CheckDouble();
            sum += tab[i];
        }
        System.out.println("La somme du tableau est " + sum);
        main(args);
    }
}
