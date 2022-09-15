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
        return result;
    }
}
