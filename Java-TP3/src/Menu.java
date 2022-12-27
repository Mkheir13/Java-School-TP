import Pexercice2.MaFenetre;
import Pexercice2.MonBouton;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {
    public static void main(String[] args) {
        MaFenetre fenetre = new MaFenetre("Menu", 500, 500, new JPanel());
        MonBouton boutonExo1 = new MonBouton("Classe Étudiant");
        MonBouton boutonExo2 = new MonBouton("Bouton");
        MonBouton boutonExo3 = new MonBouton("BoxLayout");
        MonBouton boutonExo4 = new MonBouton("Cartes");


        boutonExo1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TP_Classe.main(null);
                //display a label with the text "Regardez la console"

                JLabel label = new JLabel("Regardez la console");
                fenetre.add(label);
            }
        });
        boutonExo2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pexercice2.Main.main(null);
            }
        });
        boutonExo3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pexercice3.Main.main(null);
            }
        });
        boutonExo4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pexercice4.CardGame.main(null);
            }
        });

        fenetre.add(boutonExo1);
        fenetre.add(boutonExo2);
        fenetre.add(boutonExo3);
        fenetre.add(boutonExo4);

        fenetre.setVisible(true);
    }
}
