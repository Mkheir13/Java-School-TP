// réaliser par MEDERREG KHEIR-EDDINE

public class Exo3 {
    public static void main(String args[]) {
        System.out.println("Voulez-vous convertir: ");
        System.out.println("  1- un nombre décimal en binaire");
        System.out.println("  2- un nombre binaire en décimal");
        System.out.println("");
        System.out.print("Rentrer votre choix: ");
        int choice = Utils.CheckInt();                  // Je stock mon input
        switch (choice) {
            case 1 -> {
                Utils.CheckDecimal();
                String restart = String.valueOf(Utils.Restart());  // Je stock mon input
                if ("1".equals(restart)) main(args);
                else Utils.GoToMenu();
            }
            case 2 -> {
                Utils.CheckBinary();
                String restart = String.valueOf(Utils.Restart()); //je stock mon input
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
