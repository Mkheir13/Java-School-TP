// réaliser par MEDERREG KHEIR-EDDINE

public class Exo3 {
    public static void main(String args[]) {
        System.out.println("Nombre binaire"); // Exercice qui calcule la moyenne
        System.out.println("Voulez-vous convertir: ");
        System.out.println("  1- un nombre décimal en binaire");
        System.out.println("  2- un nombre binaire en décimal");
        System.out.println("");
        System.out.print("Rentrer votre choix: ");
        int choice = Utils.CheckInt();                  // Je stock mon input
        switch (choice) {
            case 1 -> {
                System.out.print("Entrez un nombre décimal: ");
                int decimal = Utils.CheckInt();         // Je stock mon input
                System.out.println("Le nombre binaire est: " + Integer.toBinaryString(decimal));
                String restart = String.valueOf(Utils.Restart());  // Je stock mon input
                if ("1".equals(restart)) main(args);
                else Utils.GoToMenu();
            }
            case 2 -> {
                System.out.print("Entrez un nombre binaire: ");
                String binary = Utils.checkString();    // Je stock mon input
                System.out.println("Le nombre décimal est: " + Integer.parseInt(binary, 2));
                System.out.println("Voulez-vous recommencer? (O/N)");
                String restart = Utils.checkString();  // Je stock mon input
                if ("1".equals(restart)) main(args);
                else Utils.GoToMenu();
            }
            default -> {
                System.out.println("Choix invalide");
                main(args);
            }
        }
    }
}
