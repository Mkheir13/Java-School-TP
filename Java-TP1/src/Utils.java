// réaliser par MEDERREG KHEIR-EDDINE

import java.util.Scanner;


public class Utils {
    public static String checkString() {            // Cette fonction me sert pour récuperer l'input de l'utilisateur
        Scanner string = new Scanner(System.in);    // je Crée la variable qui va acceuillir cet input
        System.out.print("> ");
        String choice = string.nextLine();          // Je la stock autre part
        return choice;                              // Et je la renvoie
    }

    public static int CheckInt() {          // Fonction qui permet de savoir si l'input est un entier ou non
        Scanner digit = new Scanner(System.in);
        while (!digit.hasNextInt()) {               // boucle qui me permet de déterminé si je recois un entier ou non
            System.out.println("Veuillez entrer un entier positif");
            digit.next();                           // Cela me permet de passer a l'input suivant
        }
        int result = digit.nextInt();
        //check if input is positive or not and return the result
        if (result < 0) {                           // Je check si l'input est positif ou non
            System.out.println("Erreur, la valeur ne peut pas être négative");
            return CheckInt();                      // Si non je relance la fonction
        }
        return result;                              // Si oui je renvoie l'input
    }
    public static int Restart() {               // Fonction qui permet de savoir si l'utilisateur veut continuer ou non
        System.out.println("Voulez vous continuer ? (O/N)");
        String restart = checkString();         // Je stock l'input
        if (restart.equals("O") || restart.equals("o")) {              // Je check si l'input est égale a O
            return 1;                           // Si oui je renvoie 1
        } else if (restart.equals("N") || restart.equals("n")) {       // Je check si l'input est égale a N
            return 0;                           // Si oui je renvoie 0
        } else {                                // Si non je relance la fonction
            System.out.println("Erreur, veuillez entrer O ou N");
            return Restart();
        }
    }
    public static void Close() {
        System.out.println("Merci a bientot");
        System.exit(0);
    }

    public static void GoToMenu() {
        System.out.println("Voulez vous retourner au menu ? (O/N)");
        String restart = checkString();         // Je stock l'input
        if (restart.equals("O") || restart.equals("o")) {              // Je check si l'input est égale a O
            Menu.main(null);                           // Si oui je renvoie au menu
        } else if (restart.equals("N") || restart.equals("n")) {       // Je check si l'input est égale a N
            Close();                           // Si oui je ferme le programme
        } else {                                // Si non je relance la fonction
            System.out.println("Erreur, veuillez entrer O ou N");
            GoToMenu();
        }
    }

    public static void Clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
