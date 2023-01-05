package Pexercice2;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(MaFenetre args) {

        JPanel ContainerBoutons = (JPanel) args.getContentPane().getComponent(1);

        MonBouton boutonSimple = new MonBouton("Bouton simple");
        boutonSimple.addActionListener(e -> JOptionPane.showMessageDialog(ContainerBoutons, "Vous avez appuyé sur : Bouton simple"));
        boutonSimple.MouseaddHoverEffect(Color.DARK_GRAY, Color.WHITE);
        boutonSimple.setBackground(Color.GRAY);

        MonBouton boutonFantaisie = new MonBouton("Bouton Fantaisie", null);
        boutonFantaisie.setIcon(new ImageIcon("src/Pexercice2/ben.png"), 50, 50);
        boutonFantaisie.addActionListener(e -> {
            boutonFantaisie.setIcon(new ImageIcon("src/Pexercice2/pierre.png"), 50, 50);
            JOptionPane.showMessageDialog(ContainerBoutons, "Vous avez appuyé sur : Bouton Fantaisie");
            boutonFantaisie.setIcon(new ImageIcon("src/Pexercice2/ben.png"), 50, 50);
        });
        boutonFantaisie.MouseaddHoverEffect(Color.DARK_GRAY, Color.WHITE);
        boutonFantaisie.setBackground(Color.GRAY);
        boutonFantaisie.setBorderPainted(false);
        boutonFantaisie.setFocusPainted(false);

        boutonSimple.setPreferredSize(boutonFantaisie.getPreferredSize());
        boutonSimple.setFont(new Font("Arial", Font.PLAIN, 20));

        boutonFantaisie.setFont(new Font("Arial", Font.PLAIN, 20));


        JLabel TitleLabel = new JLabel("Boutons");
        TitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        TitleLabel.setFont(new Font("Arial", Font.ITALIC, 60));
        TitleLabel.setForeground(Color.GRAY);

        JLabel SubTitleLabel = new JLabel("Cliquez sur un bouton pour voir son effet");
        SubTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        SubTitleLabel.setFont(new Font("Arial", Font.ITALIC, 30));
        SubTitleLabel.setForeground(Color.WHITE);


        JPanel panel = new JPanel();
        JPanel panelBoutons = new JPanel();

        panelBoutons.setBackground(new Color(0, 0, 0, 0));
        panel.setLayout(new GridLayout(5, 0));
        panel.setBackground(new Color(0, 0, 0, 0));

        JSeparator separator = new JSeparator();
        separator.setBackground(new Color(0, 0, 0, 0));
        separator.setForeground(new Color(0, 0, 0, 0));
        separator.setPreferredSize(new Dimension(100, 10));

        panel.add(TitleLabel);
        panel.add(SubTitleLabel);
        panelBoutons.add(boutonSimple);
        panelBoutons.add(separator);
        panelBoutons.add(boutonFantaisie);
        panel.add(panelBoutons);
        ContainerBoutons.add(panel);
    }
}
