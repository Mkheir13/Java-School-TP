package Exercices.Backend;

import java.util.Random;

// réalisé par MEDERREG KHEIR-EDDINE et BENJAMIN BORELLO
public class Exo4 {

    public static void main(String[] args) {
        System.out.println("Jeux de Nim");
        System.out.println("Entrez votre nom: ");
        String name = Utils.checkString();
        System.out.println("Choisir le nombre d'allumette de départ ( > 15) : ");
        int nbAllumette = Utils.CheckInt();
        while (nbAllumette < 15) {
            System.out.println("Choisir le nombre d'allumette de départ ( > 15) : ");
            nbAllumette = Utils.CheckInt();
        }
        Nim(nbAllumette, name);
        if (Utils.Restart() == 1) main(args);
        else Utils.Close();
    }

    public static void Nim(int nbAllumette, String name) {

        boolean Player_One = isPlayer_one(name);
        while (nbAllumette > 0) {
            if (Player_One) {
                int nbAllumetteEnlever = 0;
                System.out.print(" |".repeat(nbAllumette - nbAllumetteEnlever));
                System.out.print(" " + name + " enleve : ");
                nbAllumetteEnlever = Utils.CheckInt();
                while (nbAllumetteEnlever < 1 || nbAllumetteEnlever > 3) {
                    System.out.println("Vous devez enlever entre 1 et 3 allumettes");
                    nbAllumetteEnlever = Utils.CheckInt();
                }
                nbAllumette -= nbAllumetteEnlever;
                Player_One = false;
            } else {
                int nb_ia = (3 - nbAllumette % 3);
                System.out.print(" |".repeat(nbAllumette));
                System.out.println(" L’ordinateur enlève : " + nb_ia );
                nbAllumette -= (3 - nbAllumette % 3);
                Player_One = true;
            }
            WhoWin(nbAllumette, name, Player_One);
        }
    }

    private static void WhoWin(int nbAllumette, String name, boolean Player_One) {
        if (nbAllumette == 0) {
            if (Player_One) {
                System.out.println("L’ordinateur a gagné :-)");
                System.out.println(name + " a perdu :-(");
            } else {
                System.out.println(name + " a gagné");
                System.out.println("L’ordinateur a perdu :-(");
            }
        }
    }

    private static boolean isPlayer_one(String name) {
        boolean Player_One = true;
        Random random = new Random();
        int random_int = random.nextInt(3);
        if (random_int == 1) {
            Player_One = false;
            System.out.println("L’ordinateur commence");
        } else System.out.println(name + " commence");
        return Player_One;
    }
}
