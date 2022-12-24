package Pexercice2;

import Pexercice1.PClasse.Classe;
import Pexercice1.PEtudiant.Etudiant;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //creation d'une Fenetre grace a la methode MaFenetre
        MaFenetre fenetre = new MaFenetre("Test des boutons", 400, 150);


        //creation d'un Bouton simple grace a la methode MonBouton
        MonBouton boutonSimple = new MonBouton("Bouton simple");
        fenetre.add(boutonSimple);

        //creation d'un Bouton avec une image grace a la methode MonBouton
        MonBouton boutonFantaisie = new MonBouton("Bouton Fantaisie", null);
        boutonFantaisie.setIcon(new ImageIcon("src/Pexercice2/ben.png"), 50, 50);
        fenetre.add(boutonFantaisie);

        // Ajout des boutons à un conteneur et définition du layout manager
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panel.add(boutonSimple);
        panel.add(boutonFantaisie);
        fenetre.add(panel);

        fenetre.setVisible(true);
    }
}
