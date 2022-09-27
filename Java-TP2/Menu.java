// réaliser par MEDERREG KHEIR-EDDINE

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

public class Menu {
    public static void main(String[] args) {
        System.out.println("Menu");
        File folder = new File(Objects.requireNonNull(Menu.class.getClassLoader().getResource("")).getPath());
        int count = 0;
        for (File file : Objects.requireNonNull(folder.listFiles())) {
            if (file.getName().contains("Exo")) {
                count++;
            }
        }
        for (int i = 1; i <= count; i++) {
            System.out.println("  " + i + "- Exercice " + i);
        }
        System.out.println("0- Quitter");
        String exo = Utils.checkString();

        switch (exo) {
            /*
            case "1" -> Exo1.main(args);
            case "2" -> Exo2.main(args);
            case "3" -> Exo3.main(args);
            case "4" -> Exo4.main(args);
            case "5" -> Exo5.main(args);
            case "6" -> Exo6.main(args);
            case "0" -> {
                Utils.Close();
            }
             */
            default -> {
                System.out.println("Choix invalide");
                main(args);
            }
        }
    }
}
