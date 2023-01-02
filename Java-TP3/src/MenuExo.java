import Pexercice2.MaFenetre;
import Pexercice2.MonBouton;

import javax.swing.*;
import java.awt.*;

public class MenuExo {
    public static void main(String[] args) {
        MaFenetre Menufenetre = new MaFenetre("Menu", Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height, new JPanel());
        Menufenetre.getContentPane().setBackground(Color.DARK_GRAY);
        Menufenetre.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Menufenetre.getContentPane().setLayout(new BoxLayout(Menufenetre.getContentPane(), BoxLayout.X_AXIS));

        JPanel ContainerGauche = new JPanel();
        JPanel ContainerDroite = new JPanel();

        ContainerDroite.setLayout(new BoxLayout(ContainerDroite, BoxLayout.Y_AXIS));
        ContainerGauche.setLayout(new BorderLayout());
        ContainerGauche.setBackground(Color.GRAY);
        ContainerDroite.setBackground(Color.DARK_GRAY);

        ContainerGauche.setPreferredSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize().width / 4, Toolkit.getDefaultToolkit().getScreenSize().height));
        ContainerDroite.setPreferredSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize().width , Toolkit.getDefaultToolkit().getScreenSize().height));

        int containerWidth = ContainerGauche.getWidth();
        int containerHeight = ContainerGauche.getHeight();

        JPanel Titre = new JPanel();
        Titre.setBackground(new Color(0, 0, 0, 0));
        JLabel label = new JLabel("TP JAVA 3");
        label.setFont(new Font("Arial", Font.ITALIC, 60));
        label.setForeground(Color.DARK_GRAY);
        Titre.add(label);
        ContainerGauche.add(Titre, BorderLayout.NORTH);

        JPanel ContainerBoutons = new JPanel();
        ContainerBoutons.setBackground(new Color(0, 0, 0, 0));
        ContainerBoutons.setLayout(new GridLayout(5,1));

        Font font = new Font("Arial", Font.PLAIN, 30);
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
        MonBouton boutonExo5 = new MonBouton("JTable");
        boutonExo5.setBackground(Color.GRAY);
        boutonExo5.MouseaddHoverEffect(Color.DARK_GRAY, Color.WHITE);
        boutonExo1.setFont(font);
        boutonExo2.setFont(font);
        boutonExo3.setFont(font);
        boutonExo4.setFont(font);
        boutonExo5.setFont(font);
        ContainerBoutons.setSize(containerWidth, containerHeight);
        boutonExo1.setBorder(BorderFactory.createLineBorder(Color.BLUE, 5));


        ContainerBoutons.add(boutonExo1);
        ContainerBoutons.add(boutonExo2);
        ContainerBoutons.add(boutonExo3);
        ContainerBoutons.add(boutonExo4);
        ContainerBoutons.add(boutonExo5);
        ContainerGauche.add(ContainerBoutons, BorderLayout.CENTER);

        JPanel ExoContent = new JPanel();
        ExoContent.setLayout(new BoxLayout(ExoContent, BoxLayout.X_AXIS));
        ExoContent.setBackground(new Color(0, 0, 0, 0));
        JLabel labelExo = new JLabel("Cliquer sur un bouton pour afficher l'exercice Correspondant");
        labelExo.setFont(new Font("Arial", Font.ITALIC, 30));
        labelExo.setForeground(Color.GRAY);
        ExoContent.add(labelExo);
        ContainerDroite.add(ExoContent);

        boutonExo1.addActionListener(e -> {
            labelExo.setText("Exercice 1");
            ContainerDroite.removeAll();
            ContainerDroite.add(ExoContent);
            ContainerDroite.revalidate();
            ContainerDroite.repaint();
        });
        boutonExo2.addActionListener(e -> {
            labelExo.setText("Exercice 2");
            ContainerDroite.removeAll();
            ContainerDroite.add(ExoContent);
            ContainerDroite.revalidate();
            ContainerDroite.repaint();
        });
        boutonExo3.addActionListener(e -> {
            labelExo.setText("Exercice 3");
            ContainerDroite.removeAll();
            ContainerDroite.add(ExoContent);
            ContainerDroite.revalidate();
            ContainerDroite.repaint();
        });
        boutonExo4.addActionListener(e -> {
            labelExo.setText("Exercice 4");
            ContainerDroite.removeAll();
            ContainerDroite.add(ExoContent);
            ContainerDroite.revalidate();
            ContainerDroite.repaint();
        });



        Menufenetre.add(ContainerGauche);
        Menufenetre.add(ContainerDroite);

        Menufenetre.setVisible(true);
    }
}
