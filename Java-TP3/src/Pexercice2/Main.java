package Pexercice2;

import Pexercice1.PClasse.Classe;
import Pexercice1.PEtudiant.Etudiant;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //creation d'une Fenetre grace a la methode MaFenetre
        MaFenetre fenetre = new MaFenetre("Test des boutons", 400, 150 , new JPanel());


        //creation d'un Bouton simple grace a la methode MonBouton
        MonBouton boutonSimple = new MonBouton("Bouton simple");
        boutonSimple.addActionListener(e -> {
            MaFenetre fenetreBtnSimple = new MaFenetre("Message", 300, 150 , new JPanel());
            fenetreBtnSimple.add(new JLabel(" Vous avez appuyé sur : Bouton simple"));
            MonBouton OkboutonSimple = new MonBouton("OK");
            OkboutonSimple.addActionListener(e1 -> fenetreBtnSimple.dispose());
            fenetreBtnSimple.add(OkboutonSimple);
            fenetreBtnSimple.setVisible(true);
        });
        fenetre.add(boutonSimple);

        //creation d'un Bouton avec une image grace a la methode MonBouton
        MonBouton boutonFantaisie = new MonBouton("Bouton Fantaisie", null);
        boutonFantaisie.setIcon(new ImageIcon("src/Pexercice2/ben.png"), 50, 50);
        boutonFantaisie.addActionListener(e -> {
            MaFenetre fenetreBtnFantaisie = new MaFenetre("Message", 300, 150 , new JPanel());
            fenetreBtnFantaisie.add(new JLabel(" Vous avez appuyé sur : Bouton Fantaisie"));
            MonBouton OkboutonFantaisie = new MonBouton("OK");
            OkboutonFantaisie.addActionListener(e1 ->  {fenetreBtnFantaisie.dispose();
                boutonFantaisie.setIcon(new ImageIcon("src/Pexercice2/ben.png"), 50, 50);
            });
            fenetreBtnFantaisie.add(OkboutonFantaisie);
            fenetreBtnFantaisie.setVisible(true);
            boutonFantaisie.setIcon(new ImageIcon("src/Pexercice2/pierre.png"), 50, 50);
        });
        fenetre.add(boutonFantaisie);

        fenetre.setVisible(true);
    }
}
