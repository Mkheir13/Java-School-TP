// réaliser par MEDERREG KHEIR-EDDINE

public class Exo4 {
                                                // Exercice qui permet de calculer le somme des n premiers termes de la suite
    public static void main(String[] args) {
        System.out.print("Entrez le nombre de terme de la suite à calculer n avec n > 0 (0 pour terminer) :");
        int input = Utils.CheckInt();               // Je stock mon input
        if (input == 0) {                           // Je vérifie qu'il n'est pas égale a 0 si oui
            Utils.GoToMenu();                   // je retourne au menu sinon je continue
        } else if (input < 0) {                     // Je verifie que l'input est positif
            System.out.print("Erreur, la valeur ne peut pas être négative");
            main(args);
        }
        float Un = 0;                          // Je déclare ma variable qui va contenir la somme
        for (float U1 = 1; U1 <= input; U1++) {          // Je fais une boucle qui va calculer la somme
            Un = Un + 1 / U1;
        }
        System.out.println("U2 est = " + Math.round(Un * 10000.0) / 10000.0); // Je l'imprime
        main(args);
    }
}
