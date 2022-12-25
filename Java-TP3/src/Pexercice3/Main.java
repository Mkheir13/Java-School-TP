package Pexercice3;

import Pexercice2.MaFenetre;
import Pexercice2.MonBouton;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        MaFenetre fenetre = new MaFenetre("Box Layout", 400, 200 , new JPanel());
        fenetre.setVisible(true);

        JLabel label = new JLabel("Nom");
        TextField Nom = new TextField("", 100, 20);
        Nom.setPreferredSize(Nom.getSize());
        fenetre.add(label);
        fenetre.add(Nom);

        JLabel label2 = new JLabel("Password");
        PasswordField Mdp = new PasswordField("", 100, 20);
        Mdp.setPreferredSize(Mdp.getSize());
        fenetre.add(label2);
        fenetre.add(Mdp);

        MonBouton bouton = new MonBouton("OK");
        bouton.addActionListener(e -> {
            MaFenetre fenetreBtn = new MaFenetre("Message", 300, 150 , new JPanel());
            fenetreBtn.add(new JLabel(" Vous avez appuyé sur : Valider"));
            fenetreBtn.add(new JLabel(" Nom : " + Nom.getText()));
            fenetreBtn.add(new JLabel(" pwd : " + Mdp.getText()));
            MonBouton Okbouton = new MonBouton("OK");
            Okbouton.addActionListener(e1 -> fenetreBtn.dispose());
            fenetreBtn.add(Okbouton);
            fenetreBtn.setVisible(true);
        });
        fenetre.add(bouton);

        MonBouton bouton2 = new MonBouton("Cancel");
        bouton2.addActionListener(e -> {
            MaFenetre fenetreBtn = new MaFenetre("Message", 300, 150 , new JPanel());
            fenetreBtn.add(new JLabel(" Vous avez appuyé sur : Cancel"));
            fenetreBtn.add(new JLabel(" Nom : " + Nom.getText()));
            fenetreBtn.add(new JLabel(" pwd : " + Mdp.getText()));
            MonBouton Okbouton = new MonBouton("OK");
            Okbouton.addActionListener(e1 -> fenetreBtn.dispose());
            fenetreBtn.add(Okbouton);
            fenetreBtn.setVisible(true);
        });
        fenetre.add(bouton2);
        fenetre.pack();
    }
}
