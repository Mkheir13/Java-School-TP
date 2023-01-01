import Pexercice2.MaFenetre;
import Pexercice2.MonBouton;

import javax.swing.*;
import java.awt.*;

public class MenuExo {

    public MenuExo() {
        MaFenetre fenetre = new MaFenetre("Menu", Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height, new JPanel());
        fenetre.getContentPane().setBackground(Color.DARK_GRAY);
        fenetre.getContentPane().setLayout(new BoxLayout(fenetre.getContentPane(), BoxLayout.X_AXIS));

        JPanel ContainerGauche = new JPanel();
        JPanel ContainerDroite = new JPanel();

        ContainerGauche.setBackground(Color.GRAY);
        ContainerDroite.setBackground(Color.DARK_GRAY);

        ContainerGauche.setPreferredSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize().width / 4, Toolkit.getDefaultToolkit().getScreenSize().height));
        ContainerDroite.setPreferredSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize().width , Toolkit.getDefaultToolkit().getScreenSize().height));

        int containerWidth = ContainerGauche.getWidth();
        int containerHeight = ContainerGauche.getHeight();

        JPanel Titre = new JPanel();
        Titre.setBackground(new Color(0, 0, 0, 0));
        JLabel label = new JLabel("TP JAVA 3");
        label.setFont(new Font("Arial", Font.ITALIC, 50));
        label.setForeground(Color.DARK_GRAY);
        Titre.add(label);
        ContainerGauche.add(Titre);

        JPanel ContainerBoutons = new JPanel();
        ContainerBoutons.setBackground(new Color(0, 0, 0, 0));
        ContainerBoutons.setLayout(new BoxLayout(ContainerBoutons, BoxLayout.Y_AXIS));
        ContainerBoutons.add(Box.createRigidArea(new Dimension(0, 25)));

        MonBouton boutonExo1 = new MonBouton("Etudiant");
        boutonExo1.setBackground(Color.GRAY);
        boutonExo1.MouseaddHoverEffect(Color.DARK_GRAY, Color.WHITE);
        MonBouton boutonExo2 = new MonBouton("JButton");
        boutonExo2.setBackground(Color.GRAY);
        boutonExo2.MouseaddHoverEffect(Color.DARK_GRAY, Color.WHITE);
        MonBouton boutonExo3 = new MonBouton("BoxLayout");
        boutonExo3.setBackground(Color.GRAY);
        boutonExo3.MouseaddHoverEffect(Color.DARK_GRAY, Color.WHITE);
        MonBouton boutonExo4 = new MonBouton("Afficher carte");
        boutonExo4.setBackground(Color.GRAY);
        boutonExo4.MouseaddHoverEffect(Color.DARK_GRAY, Color.WHITE);


        ContainerBoutons.setSize(containerWidth, containerHeight);


        ContainerBoutons.add(boutonExo1);
        ContainerBoutons.add(Box.createRigidArea(new Dimension(0, 25)));
        ContainerBoutons.add(boutonExo2);
        ContainerBoutons.add(Box.createRigidArea(new Dimension(0, 25)));
        ContainerBoutons.add(boutonExo3);
        ContainerBoutons.add(Box.createRigidArea(new Dimension(0, 25)));
        ContainerBoutons.add(boutonExo4);
        ContainerGauche.add(ContainerBoutons);


        boutonExo1.addActionListener(e -> {
            ContainerDroite.removeAll();
            ContainerDroite.revalidate();
            ContainerDroite.repaint();
        });
        boutonExo2.addActionListener(e -> {
            ContainerDroite.removeAll();
            ContainerDroite.revalidate();
            ContainerDroite.repaint();
        });
        boutonExo3.addActionListener(e -> {
            ContainerDroite.removeAll();
            ContainerDroite.revalidate();
            ContainerDroite.repaint();
        });
        boutonExo4.addActionListener(e -> {
            ContainerDroite.removeAll();
            ContainerDroite.revalidate();
            ContainerDroite.repaint();
        });



        fenetre.add(ContainerGauche);
        fenetre.add(ContainerDroite);

        fenetre.setVisible(true);
    }

    public static void main(String[] args) {
        new MenuExo();
    }
}
