package Exercices.Frontend;//réaliser par MEDERREG KHEIR-EDDINE et BENJAMIN BORELLO

import javax.swing.*;
import java.awt.*;

public class Exercice4 {
    private static JPanel mainPanel = new JPanel();
    private static String playerName = "Player";
    private static JLabel stateLabel = new JLabel();
    private static int n = 0;
    public static JPanel getPanel() {
        mainPanel = new JPanel();   
        stateLabel = new JLabel();
        playerName = "Player";

        JLabel title = new JLabel("Exercice 4 : Jeu de Nim\n");
        title.setFont(new Font(title.getFont().getName(), title.getFont().getStyle(), 32));

        mainPanel.add(title);
        mainPanel.add(mainPanel());

        return mainPanel;
    }


    public static void updateGamePanel(JPanel panel) {
        panel.remove(panel.getComponents().length - 1);
        panel.add(gamePanel());
        panel.revalidate();
        panel.repaint();
    }


    public static JPanel mainPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

        panel.add(new JLabel("Nom du joueur : "));
        JTextField nameTextField = new JTextField("player", 10);
        panel.add(nameTextField);

        panel.add(new JLabel("Choisir le nombre d'allumette de départ ( > 15) : "));
        JTextField nTextField = new JTextField("16", 4);
        panel.add(nTextField);


        JButton playBt = new JButton("Jouer");
        panel.add(playBt);

        playBt.addActionListener(e -> {
            playerName = nameTextField.getText();
            n = Integer.parseInt(nTextField.getText());

            panel.setVisible(false);
            panel.getParent().add(gamePanel());
            panel.getParent().revalidate();
            panel.getParent().repaint();

            System.out.println("playerName = " + playerName);
            System.out.println("n = " + n);
        });

        return panel;
    }

    private static JPanel gamePanel() {
        JPanel panel = new JPanel(null);
        panel.setLayout(new FlowLayout());

        for (int i = 0; i < n; i++) {
            JPanel allumettesPanel = new JPanel();
            allumettesPanel.setPreferredSize(new Dimension(4, 16));
            allumettesPanel.setBackground(Color.red);
            allumettesPanel.setBounds(0, 0, 4, 16);
            panel.add(allumettesPanel);
        }

        panel.add(stateLabel);
        panel.add(new JLabel("retirer : "));

        if (n >= 1) {
            JButton button = new JButton("1");
            button.addActionListener(e -> play((JPanel) panel.getParent(),true, 1));
            panel.add(button);
        }
        if (n >= 2) {
            JButton button = new JButton("2");
            button.addActionListener(e -> play((JPanel) panel.getParent(),true, 2));
            panel.add(button);
        }
        if (n >= 3) {
            JButton button = new JButton("3");
            button.addActionListener(e -> play((JPanel) panel.getParent(),true, 3));
            panel.add(button);
        }

        return panel;
    }

    public static void play(JPanel panel, boolean player, int nb) {
        n -= nb;

        if (n <= 0) {
            if (player) {
                endGame("computer", playerName);
            }
            else {
                endGame(playerName, "computer");
            }

            return;
        }

        updateGamePanel(panel);

        if (player) {
            stateLabel.setText(playerName + " enlève " + nb + ", reste " + n);
            int allumettes = (int) (Math.random() * 3) + 1;
            if (allumettes > n) {
                allumettes = n;
            }
            play(panel, false, allumettes);

        } else {
            stateLabel.setText("L'ordinateur enlève " + nb + ", reste " + n);
        }
    }

    public static void endGame(String winner, String looser) {
        System.out.println(winner + " win");
        System.out.println(looser + " loose");

        mainPanel.remove(mainPanel.getComponents().length - 1);
        mainPanel.add(new JLabel(winner + " a gagné et " + looser + " a perdu !"));
        mainPanel.revalidate();
        mainPanel.repaint();
    }
}