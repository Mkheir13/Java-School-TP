package Pexercice4;

import Pexercice2.MonBouton;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class CardGame extends JFrame {
    private static final long serialVersionUID = 1L;

    private static final String SPRITE_SHEET_FILENAME = "src/Pexercice4/cards.png";
    private static final int CARD_WIDTH = 799 / 13;
    private static final int CARD_HEIGHT = 324/4;
    private static final int MAX_CARDS_PER_LINE = 20;

    private Random random = new Random();
    private BufferedImage spriteSheet;
    private JPanel cardPanel;

    public CardGame() {
        setTitle("Card Game");
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            spriteSheet = ImageIO.read(new File(SPRITE_SHEET_FILENAME));
        } catch (IOException e) {
            e.printStackTrace();
        }

        MonBouton button = new MonBouton("Distribuer");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numCards = cardPanel.getComponentCount();
                if (numCards < 52) {
                    BufferedImage cardImage = pickRandomCard();
                    ImageIcon icon = new ImageIcon(cardImage);
                    JLabel label = new JLabel(icon);
                    cardPanel.add(label);
                    int numLines = numCards / MAX_CARDS_PER_LINE + 1;
                    int width = MAX_CARDS_PER_LINE * CARD_WIDTH;
                    int height = numLines * CARD_HEIGHT;
                    cardPanel.setPreferredSize(new Dimension(width, height));
                    cardPanel.revalidate();
                    cardPanel.repaint();
                }
            }
        });

        cardPanel = new JPanel(new FlowLayout());
        add(button, BorderLayout.SOUTH);
        add(cardPanel, BorderLayout.CENTER);
    }
    ArrayList<Integer> cards = new ArrayList<>();

    private BufferedImage pickRandomCard() {
        int index;
        do {
            index = random.nextInt(52);
        } while (cards.contains(index));
        cards.add(index);
        cards.sort(Integer::compareTo);
        int x = index % 13 * CARD_WIDTH;
        int y = index / 13 * CARD_HEIGHT;
        return spriteSheet.getSubimage(x, y, CARD_WIDTH, CARD_HEIGHT);
    }

    public static void main(String[] args) {
        CardGame game = new CardGame();
        game.setVisible(true);
    }
}