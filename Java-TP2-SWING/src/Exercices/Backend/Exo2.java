package Exercices.Backend;

//Réalisé par MEDERREG KHEIR-EDDINE et BENJAMIN BORELLO
public class Exo2 {
    public static void main(String[] args) {
        System.out.println("Simulateur Impots");
        System.out.print("Veuillez entrer votre revenu : ");
        double salaire = Utils.CheckDouble();     //Saisie du salaire
        System.out.print("Etes vous marié ? (true pour oui, false pour non) : "); //Affichage de la demande de saisie
        boolean isMarried = Utils.CheckBoolean(); //Saisie de la valeur de isMarried
        System.out.print("Veuillez entrer votre nombre d'enfants : "); //Affichage de la demande de saisie
        double MoneySucker = Utils.CheckDouble(); //Saisie de la réponse de l'utilisateur
        System.out.printf("Votre impot brut est de : %.2f €%n", MesImpots(salaire, isMarried, MoneySucker)); //Affichage du résultat de la méthode MesImpots
        if (Utils.Restart() == 1) main(args);
        else Utils.Close();
    }

    public static double MesImpots(double gains, boolean isFucking, double MoneySuckers) {         //Création de la méthode MesImpots
        double[] tranches = {0, 10225, 26070, 74545, 160336};      //Création d'un tableau de double pour les tranches
        double[] taux = {0, 0.11, 0.3, 0.41, 0.45};
        double impots = gains * taux[0];//Création d'une variable double pour les impots
        double diviseur = 1;

        if (isFucking) {//On vérifie si l'utilisateur est marié
            diviseur += 1;
        }
        else if (MoneySuckers > 0) {                        //On vérifie si l'utilisateur a des enfants             //On divise le salaire par le nombre d'enfants
            diviseur += 0.5;                                //On ajoute 0.5 au diviseur
        }
        diviseur += (MoneySuckers / 2);
        gains /= diviseur;                                  //On divise le salaire par le diviseur

        for (int i = 0; i < tranches.length; i++) {       //Création d'une boucle for pour parcourir les tranches
            if (i == 4 && gains > tranches[4]) {
                impots += (gains - tranches[4]) * taux[4];
                continue;
            }
            if (gains > tranches[i])
                impots += (Math.min(gains, tranches[i + 1]) - tranches[i]) * taux[i];   //Calcul des impots
        }
        return impots;                          //Retourne la valeur des impots
    }
}
