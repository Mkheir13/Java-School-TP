package Pexercice3;

import Pexercice2.MaFenetre;
import Pexercice2.MonBouton;

import javax.swing.*;

import java.awt.*;

import static java.awt.Component.CENTER_ALIGNMENT;

public class Main {
    public static void main(String[] args) {
        MaFenetre fenetre = new MaFenetre("Box Layout", 400, 150 , new JPanel());
        fenetre.getContentPane().setLayout(new BoxLayout(fenetre.getContentPane(), BoxLayout.Y_AXIS));

        JPanel textFields = new JPanel();
        JLabel label = new JLabel("Nom");
        TextField Nom = new TextField("", 100, 20);
        Nom.setPreferredSize(Nom.getSize());
        textFields.add(label);
        textFields.add(Nom);
        fenetre.add(textFields);

        JPanel textFields2 = new JPanel();
        JLabel label2 = new JLabel("Password");
        PasswordField Mdp = new PasswordField("", 100, 20);
        Mdp.setPreferredSize(Mdp.getSize());
        textFields2.add(label2);
        textFields2.add(Mdp);
        fenetre.add(textFields2);

        JPanel Boutons = new JPanel();
        Boutons.setLayout(new BoxLayout(Boutons, BoxLayout.X_AXIS));

        JPanel boutonOk = new JPanel();
        MonBouton bouton = new MonBouton("OK");
        boutonOk.setLayout(new FlowLayout(FlowLayout.LEFT));
        bouton.addActionListener(e -> {
            MaFenetre fenetreBtn = new MaFenetre("Message", 250, 150 , new JPanel());
            fenetreBtn.getContentPane().setLayout(new BoxLayout(fenetreBtn.getContentPane(), BoxLayout.Y_AXIS));
            JPanel boutonOk2 = new JPanel();
            boutonOk2.setLayout(new FlowLayout(FlowLayout.CENTER));
            fenetreBtn.add(new JLabel(" Vous avez appuyé sur : OK"));
            fenetreBtn.add(new JLabel(" Nom : " + Nom.getText()));
            fenetreBtn.add(new JLabel(" pwd : " + Mdp.getText()));
            MonBouton Okbouton = new MonBouton("OK");
            Okbouton.addActionListener(e1 -> fenetreBtn.dispose());
            boutonOk2.add(Okbouton);
            fenetreBtn.add(boutonOk2);
            fenetreBtn.setVisible(true);
        });
        boutonOk.add(bouton);

        JPanel boutonAnnuler = new JPanel();
        boutonAnnuler.setLayout(new FlowLayout(FlowLayout.RIGHT));
        MonBouton bouton2 = new MonBouton("Cancel");
        bouton2.setAlignmentX(CENTER_ALIGNMENT);
        bouton2.addActionListener(e -> {
            MaFenetre fenetreBtn = new MaFenetre("Message", 250, 150 , new JPanel());
            fenetreBtn.getContentPane().setLayout(new BoxLayout(fenetreBtn.getContentPane(), BoxLayout.Y_AXIS));
            JPanel boutoncCancel2 = new JPanel();
            boutoncCancel2.setLayout(new FlowLayout(FlowLayout.CENTER));
            fenetreBtn.add(new JLabel(" Vous avez appuyé sur : Cancel"));
            fenetreBtn.add(new JLabel(" Nom : " + Nom.getText()));
            fenetreBtn.add(new JLabel(" pwd : " + Mdp.getText()));
            MonBouton Okbouton = new MonBouton("OK");
            Okbouton.addActionListener(e1 -> fenetreBtn.dispose());
            boutoncCancel2.add(Okbouton);
            fenetreBtn.add(boutoncCancel2);
            fenetreBtn.setVisible(true);
        });
        boutonAnnuler.add(bouton2);

        Boutons.add(boutonOk);
        Boutons.add(boutonAnnuler);
        fenetre.add(Boutons);
        fenetre.setVisible(true);
    }
}
