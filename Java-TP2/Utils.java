// réaliser par MEDERREG KHEIR-EDDINE et BENJAMIN BORELLO

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
        while (!digit.hasNextInt() || !digit.hasNextFloat()) {               // boucle qui me permet de déterminé si je recois un entier ou non
            System.out.println("Veuillez entrer un entier positif");
            digit.next();                           // Cela me permet de passer a l'input suivant
        }
        int result = digit.nextInt();
        if (result < 0) {                           // Je check si l'input est positif ou non
            System.out.println("Erreur, la valeur ne peut pas être négative");
            return CheckInt();                      // Si non je relance la fonction
        } else if (result > 2147483647) {
            System.out.println("Erreur, la valeur est trop grande");
            return CheckInt();
        }
        return result;                              // Si oui je renvoie l'input
    }
    public static Double CheckDouble() {          // Fonction qui permet de savoir si l'input est un entier ou non
        Scanner digit = new Scanner(System.in);
        while (!digit.hasNextDouble()) {               // boucle qui me permet de déterminé si je recois un entier ou non
            System.out.println("Veuillez entrer un nombre positif");
            digit.next();                           // Cela me permet de passer a l'input suivant
        }
        Double result = digit.nextDouble();
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
    public static void CheckBinary() {
        System.out.print("Entrez un nombre binaire :");
        String binary = checkString();
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) != '1' && binary.charAt(i) != '0') {
                System.out.println("Erreur, le nombre n'est pas binaire");
                CheckBinary();
            }
        }
        System.out.println("Le nombre en décimal est : " + Integer.parseInt(binary, 2));
    }
    public static void CheckDecimal() {
        System.out.print("Entrez un nombre decimal : ");
        int decimal = Utils.CheckInt();
        System.out.println("Le nombre binaire est: " + Integer.toBinaryString(decimal));
    }

    public static long CheckLong() {
        Scanner digit = new Scanner(System.in);
        while (!digit.hasNextLong()) {               // boucle qui me permet de déterminé si je recois un entier ou non
            System.out.println("Veuillez entrer un entier positif");
            digit.next();                           // Cela me permet de passer a l'input suivant
        }
        long result = digit.nextLong();
        if (result < 0) {                           // Je check si l'input est positif ou non
            System.out.println("Erreur, la valeur ne peut pas être négative");
            return CheckLong();                      // Si non je relance la fonction
        } else if (result > 9223372036854775807L) {
            System.out.println("Erreur, la valeur est trop grande");
            return CheckLong();
        }
        return result;                              // Si oui je renvoie l'input
    }

    public static boolean CheckBoolean() {
        Scanner digit = new Scanner(System.in);
        if (!digit.hasNextBoolean()) {               // boucle qui me permet de déterminé si je recois un entier ou non
            System.out.println("Veuillez entrer un entier positif");
            digit.next();                           // Cela me permet de passer a l'input suivant
        }
        boolean result = digit.nextBoolean();
        return result;                              // Si oui je renvoie l'input
    }
}
