package Pexercice2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        MaFenetre fenetre = new MaFenetre("Box Layout", 400, 150 , new JPanel());

        MonBouton boutonSimple = new MonBouton("Bouton simple");
        boutonSimple.addActionListener(e -> JOptionPane.showMessageDialog(fenetre, "Vous avez appuyé sur : Bouton simple"));
        fenetre.add(boutonSimple);

        MonBouton boutonFantaisie = new MonBouton("Bouton Fantaisie", null);
        boutonFantaisie.setIcon(new ImageIcon("src/Pexercice2/ben.png"), 50, 50);
        boutonFantaisie.addActionListener(e -> {
            boutonFantaisie.setIcon(new ImageIcon("src/Pexercice2/pierre.png"), 50, 50);
            JOptionPane.showMessageDialog(null, "Vous avez appuyé sur : Bouton Fantaisie");
            boutonFantaisie.setIcon(new ImageIcon("src/Pexercice2/ben.png"), 50, 50);
        });
        fenetre.add(boutonFantaisie);
        fenetre.setVisible(true);
    }
}
