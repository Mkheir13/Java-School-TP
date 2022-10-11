//réaliser par MEDERREG KHEIR-EDDINE et BENJAMIN BORELLO

import java.util.Arrays;

public class Exo1 {
public static void main(String[] args) {
        System.out.println("Méthode Archiméde");                                    //Affichage du titre
        System.out.print("Veuillez entrer X : ");                                   //Affichage de la demande de saisie
        double x = Utils.CheckDouble();                                             //Saisie de la valeur de x
        System.out.print("Veuillez entrer Y : ");                                   //Affichage de la demande de saisie
        double y = Utils.CheckDouble();                                             //Saisie de la valeur de y
        System.out.print("Veuillez entrer N : ");                                   //Affichage de la demande de saisie
        int n = Utils.CheckInt();                                                   //Saisie de la valeur de n
        double array[] = Archimede.An(n);                                           //Création d'un tableau de double
        System.out.println("Méthode Archiméde Cn = " + Archimede.Cn(x, y));         //Affichage du résultat de la méthode Archiméde Cn
        System.out.println("Méthode Archiméde ln = " + Archimede.ln(x, y));         //Affichage du résultat de la méthode Archiméde ln
        System.out.println("Méthode Archiméde An = " + Arrays.toString(array));     //Affichage du résultat de la méthode Archiméde An
        if (Utils.Restart() == 1) {                                                 //Vérification de la réponse de l'utilisateur
            main(args);
        } else {
            Utils.Close();
        }

    }
    public static class Archimede {                                                 //Création de la classe Archiméde
        public static double Cn(double x, double y) {
            return 2 * x * y/(x + y);
        }   //Création de la méthode Cn
        public static double ln(double x, double y) {
            return Math.sqrt(x*y);
        }      //Création de la méthode ln
        public static double[] An(int n) {                                          //Création de la méthode An
            double X = 4;
            double Y = 2*Math.sqrt(2);
            for (int i = 0; i < n; i++) {
                X = Archimede.Cn(X, Y);                                             //Appel de la méthode Cn
                Y = Archimede.ln(X, Y);                                             //Appel de la méthode ln
            }
            return new double[]{X, Y};
        }
    }
}
