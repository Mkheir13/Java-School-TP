import Pexercice2.MaFenetre;
import Pexercice2.MonBouton;

import javax.swing.*;
import java.awt.*;

public class MenuExo {
    public static void main(String[] args) {
        // Crée une instance de la classe MaFenetre avec le titre "Menu", la largeur et la hauteur de l'écran, et un JPanel vide
        MaFenetre Menufenetre = new MaFenetre("Menu", Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height, new JPanel());
        // Définit la couleur de fond de la fenêtre comme sombre
        Menufenetre.getContentPane().setBackground(Color.DARK_GRAY);
        // Affiche la fenêtre en plein écran
        Menufenetre.setExtendedState(JFrame.MAXIMIZED_BOTH);
        // Définit le layout de la fenêtre comme étant un BoxLayout disposé horizontalement
        Menufenetre.getContentPane().setLayout(new BoxLayout(Menufenetre.getContentPane(), BoxLayout.X_AXIS));

        // Crée deux JPanel pour la partie gauche et la partie droite de la fenêtre
        JPanel ContainerGauche = new JPanel();
        JPanel ContainerDroite = new JPanel();

        // Définit le layout du JPanel de droite comme étant un BoxLayout disposé verticalement
        ContainerDroite.setLayout(new BoxLayout(ContainerDroite, BoxLayout.Y_AXIS));
        // Définit le layout du JPanel de gauche comme étant un BorderLayout
        ContainerGauche.setLayout(new BorderLayout());
        // Définit la couleur de fond du JPanel de gauche comme grise
        ContainerGauche.setBackground(Color.GRAY);
        // Définit la couleur de fond du JPanel de droite comme sombre
        ContainerDroite.setBackground(Color.DARK_GRAY);

        // Définit la taille préférée du JPanel de gauche comme étant un quart de la largeur de l'écran et la hauteur de l'écran
        ContainerGauche.setPreferredSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize().width / 4, Toolkit.getDefaultToolkit().getScreenSize().height));
        // Définit la taille préférée du JPanel de droite comme étant 960 pixels de large et la hauteur de l'écran
        ContainerDroite.setPreferredSize(new Dimension(960, Toolkit.getDefaultToolkit().getScreenSize().height));

        // Crée deux variables pour la largeur et la hauteur du JPanel de gauche
        int containerWidth = ContainerGauche.getWidth();
        int containerHeight = ContainerGauche.getHeight();

        // Crée un JPanel pour le titre
        JPanel Titre = new JPanel();
        // Définit la couleur de fond du JPanel du titre comme étant transparente
        Titre.setBackground(new Color(0, 0, 0, 0));
        // Crée un JLabel pour afficher le titre
        JLabel label = new JLabel("TP JAVA 3");
        // Définit la police du titre comme étant Arial en italique et de taille 60
        label.setFont(new Font("Arial", Font.ITALIC, 60));
        // Définit la couleur du titre comme étant sombre
        label.setForeground(Color.DARK_GRAY);
        // Ajoute le JLabel au JPanel du titre
        Titre.add(label);
        // Ajoute le JPanel du titre au JPanel de gauche en haut
        ContainerGauche.add(Titre, BorderLayout.NORTH);

        // Crée un JPanel pour les boutons
        JPanel ContainerBoutons = new JPanel();
        // Définit la couleur de fond du JPanel des boutons comme étant transparente
        ContainerBoutons.setBackground(new Color(0, 0, 0, 0));
        // Définit le layout du JPanel des boutons comme étant une grille de 5 lignes et 1 colonne
        ContainerBoutons.setLayout(new GridLayout(5,1));

        // Crée une police Arial de taille 30
        Font font = new Font("Arial", Font.PLAIN, 30);
        // Crée cinq boutons en utilisant la classe MonBouton, qui doit être une classe personnalisée
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
        // Définit la police de chaque bouton comme étant Arial de taille 30
        boutonExo1.setFont(font);
        boutonExo2.setFont(font);
        boutonExo3.setFont(font);
        boutonExo4.setFont(font);
        boutonExo5.setFont(font);
        // Définit la taille du JPanel des boutons comme étant la largeur et la hauteur du JPanel de gauche
        ContainerBoutons.setSize(containerWidth, containerHeight);
        // Définit une bordure autour de chaque bouton
        boutonExo1.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        boutonExo2.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        boutonExo3.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        boutonExo4.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        boutonExo5.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        // Ajoute chaque bouton au JPanel des boutons
        ContainerBoutons.add(boutonExo1);
        ContainerBoutons.add(boutonExo2);
        ContainerBoutons.add(boutonExo3);
        ContainerBoutons.add(boutonExo4);
        ContainerBoutons.add(boutonExo5);
        // Ajoute le JPanel des boutons au JPanel de gauche au centre
        ContainerGauche.add(ContainerBoutons, BorderLayout.CENTER);
        // Ajoute les JPanels de gauche et droite au content pane de la fenêtre
        Menufenetre.getContentPane().add(ContainerGauche);
        Menufenetre.getContentPane().add(ContainerDroite);

        JPanel ExoContent = new JPanel();
        ExoContent.setLayout(new BoxLayout(ExoContent, BoxLayout.X_AXIS));
        ExoContent.setBackground(new Color(0, 0, 0, 0));
        JLabel labelExo = new JLabel("Cliquer sur un bouton pour afficher l'exercice Correspondant");
        labelExo.setFont(new Font("Arial", Font.ITALIC, 30));
        labelExo.setForeground(Color.GRAY);
        ExoContent.add(labelExo);
        ContainerDroite.add(ExoContent);

        boutonExo1.addActionListener(e -> {
            ContainerDroite.removeAll();
            TP_Classe.main(Menufenetre);
            ContainerDroite.revalidate();
            ContainerDroite.repaint();
        });
        boutonExo2.addActionListener(e -> {
            ContainerDroite.removeAll();
            Pexercice2.Main.main(Menufenetre);
            ContainerDroite.revalidate();
            ContainerDroite.repaint();

        });
        boutonExo3.addActionListener(e -> {
            ContainerDroite.removeAll();
            Pexercice3.Main.main(Menufenetre);
            ContainerDroite.revalidate();
            ContainerDroite.repaint();
        });
        boutonExo4.addActionListener(e -> {
            ContainerDroite.removeAll();
            Pexercice4.CardGame.main(Menufenetre);
            ContainerDroite.revalidate();
            ContainerDroite.repaint();
        });

        // Affiche la fenêtre
        Menufenetre.setVisible(true);
    }
}
