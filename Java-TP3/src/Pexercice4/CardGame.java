package Pexercice4;

import Pexercice2.MaFenetre;
import Pexercice2.MonBouton;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class CardGame {
    // Chemin vers le fichier de sprites contenant les images des cartes
    private static final String SPRITE_SHEET_FILENAME = "src/Pexercice4/cards.png";
    // Largeur et hauteur d'une carte dans le spritesheet
    private static final int CARD_WIDTH = 799 / 13;
    private static final int CARD_HEIGHT = 324 / 4;
    // Générateur de nombres aléatoires
    private static Random random = new Random();
    // Spritesheet contenant les images des cartes
    private static BufferedImage spriteSheet;

    public static void main(MaFenetre args) {
        // Chargement du spritesheet
        try {
            spriteSheet = ImageIO.read(new File(SPRITE_SHEET_FILENAME));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Récupération du JPanel contenant les cartes
        JPanel cardPanel = (JPanel) args.getContentPane().getComponent(1);
        // Configuration du layout et de la taille du panel
        cardPanel.setLayout(new BorderLayout());
        cardPanel.setPreferredSize(new Dimension(960, Toolkit.getDefaultToolkit().getScreenSize().height));

        // Création d'un bouton "Distribuer"
        MonBouton button = new MonBouton("Distribuer");
        // Configuration de l'apparence du bouton
        button.setBackground(Color.GRAY);
        button.MouseaddHoverEffect(Color.DARK_GRAY, Color.WHITE);
        button.setFont(new Font("Arial", Font.PLAIN, 30));

        // Création d'un panel pour afficher les cartes
        JPanel finalCardPanel = new JPanel();
        // Configuration du layout et de la couleur de fond du panel
        finalCardPanel.setLayout(new FlowLayout());
        finalCardPanel.setBackground(Color.DARK_GRAY);

        // Ajout d'un listener au bouton pour distribuer une nouvelle carte
        button.addActionListener(e -> {
            // On récupère le nombre de cartes actuellement affichées
            int numCards = finalCardPanel.getComponentCount();
            if (numCards < 52) {
                // On affiche le nombre de cartes dans la console
                System.out.println(numCards);
                // On récupère une carte aléatoire
                BufferedImage cardImage = pickRandomCard();
                // On crée un ImageIcon à partir de l'image de la carte
                ImageIcon icon = new ImageIcon(cardImage);
                // On crée un JLabel à partir de l'ImageIcon
                JLabel label = new JLabel(icon);
                // On ajoute le JLabel au panel des cartes
                finalCardPanel.add(label);
                // On met à jour l'affichage du panel
                finalCardPanel.revalidate();
                finalCardPanel.repaint();
            }
            // On vide la liste des cartes déjà distribuées
            emptyArray();

        });
        // Création d'un JLabel affichant le titre du jeu
        JLabel title = new JLabel("Card Game");
        // Configuration de l'apparence du titre
        title.setFont(new Font("Arial", Font.ITALIC, 60));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        title.setForeground(Color.GRAY);
        // Création d'un panel pour afficher le titre
        JPanel titlePanel = new JPanel();
        // Configuration du layout et de la couleur de fond du panel
        titlePanel.setLayout(new FlowLayout());
        titlePanel.setBackground(new Color(0, 0, 0, 0));
        // Ajout du titre au panel
        titlePanel.add(title);
        titlePanel.add(Box.createRigidArea(new Dimension(0, 135)));
        // Création d'un panel pour afficher le bouton
        JPanel buttonPanel = new JPanel();
        // Configuration du layout et de la couleur de fond du panel
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.setBackground(new Color(0, 0, 0, 0));
        // Ajout du bouton au panel
        buttonPanel.add(button);
        buttonPanel.add(Box.createRigidArea(new Dimension(0, 135)));
        // Ajout du titre, du panel des cartes et du panel du bouton au panel principal
        cardPanel.add(titlePanel, BorderLayout.NORTH);
        cardPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        cardPanel.add(finalCardPanel, BorderLayout.CENTER);
        cardPanel.add(buttonPanel, BorderLayout.SOUTH);
        // Configuration de l'espacement autour du panel des cartes
        finalCardPanel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
    }
    // Liste des cartes déjà distribuées
    static ArrayList<Integer> cards = new ArrayList<>();
    // Méthode pour vider la liste des cartes déjà distribuées
    public static void emptyArray(){
        cards.clear();
    }

    // Méthode pour récupérer une carte aléatoire parmi celles qui n'ont pas encore été distribuées
    private static BufferedImage pickRandomCard() {
        int index;
        do {
            index = random.nextInt(52);
            // On choisit un indice de carte aléatoire tant qu'il correspond à une carte déjà distribuée
        } while (cards.contains(index));
        // On ajoute l'indice de la carte à la liste des cartes déjà distribuées
        cards.add(index);
        // On trie la liste des cartes déjà distribuées par ordre croissant
        cards.sort(Integer::compareTo);
        // On calcule les coordonnées x et y de la carte dans le spritesheet en fonction de son indice
        int x = index % 13 * CARD_WIDTH;
        int y = index / 13 * CARD_HEIGHT;
        // On retourne la carte correspondante du spritesheet
        return spriteSheet.getSubimage(x, y, CARD_WIDTH, CARD_HEIGHT);
    }
}