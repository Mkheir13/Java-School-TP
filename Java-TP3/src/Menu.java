import Pexercice2.MaFenetre;
import Pexercice2.MonBouton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {

    public class MonLabel extends javax.swing.JLabel {
        public MonLabel(String text) {
            super(text);
            setBounds(0, 0, 100, 100);
        }
    }
    public static void main(String[] args) {
        MaFenetre fenetre = new MaFenetre("Menu", 500, 200, new JPanel());
        MonBouton boutonExo1 = new MonBouton("Classe Étudiant");
        MonBouton boutonExo2 = new MonBouton("Bouton");
        MonBouton boutonExo3 = new MonBouton("BoxLayout");
        MonBouton boutonExo4 = new MonBouton("Cartes");

        boutonExo1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TP_Classe.main(null);
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

        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(Box.createRigidArea(new Dimension(0, 25)));
        panel2.setLayout(new GridLayout(2, 2));
        MonLabel label = new Menu().new MonLabel(" TP JAVA 3");
        panel2.add(panel);
        fenetre.add(panel);

        fenetre.setVisible(true);
    }
}
