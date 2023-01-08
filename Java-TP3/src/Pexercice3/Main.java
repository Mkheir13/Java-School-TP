package Pexercice3;

import Pexercice2.MaFenetre;
import Pexercice2.MonBouton;

import javax.swing.*;
import java.awt.*;

import static java.awt.Component.CENTER_ALIGNMENT;

public class Main {
    public static void main(MaFenetre args) {
        JPanel ContainerBox = (JPanel) args.getContentPane().getComponent(1);

        JPanel panelContainer = new JPanel();
        panelContainer.setLayout(new BoxLayout(panelContainer, BoxLayout.Y_AXIS));
        panelContainer.setBackground(new Color(0, 0, 0, 0));

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 0));

        JLabel TitleLabel = new JLabel("BoxLayout");
        TitleLabel.setAlignmentY(CENTER_ALIGNMENT);
        TitleLabel.setFont(new Font("Arial", Font.ITALIC, 60));
        TitleLabel.setForeground(Color.GRAY);
        TitleLabel.setAlignmentX(CENTER_ALIGNMENT);
        TitleLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 50, 0));
        panelContainer.add(Box.createRigidArea(new Dimension(0, 35)));
        panelContainer.add(TitleLabel);

        JPanel textFields = new JPanel();
        JLabel label = new JLabel("Nom");
        label.setForeground(Color.WHITE);
        TextField Nom = new TextField("", 100, 20);
        Nom.setPreferredSize(Nom.getSize());
        textFields.add(label);
        textFields.add(Nom);
        panel.add(textFields);
        ContainerBox.add(panel);

        JPanel textFields2 = new JPanel();
        JLabel label2 = new JLabel("Password");
        label2.setForeground(Color.WHITE);
        PasswordField Mdp = new PasswordField("", 100, 20);
        Mdp.setPreferredSize(Mdp.getSize());
        textFields2.add(label2);
        textFields2.add(Mdp);
        panel.add(textFields2);
        ContainerBox.add(panel);

        JPanel Boutons = new JPanel();
        Boutons.setLayout(new BoxLayout(Boutons, BoxLayout.X_AXIS));

        JPanel boutonOk = new JPanel();
        MonBouton bouton = new MonBouton("OK");
        bouton.setBackground(Color.GRAY);
        bouton.MouseaddHoverEffect(Color.DARK_GRAY, Color.WHITE);
        bouton.setPreferredSize(new Dimension(100, 50));
        bouton.setFont(new Font("Arial", Font.PLAIN, 20));
        boutonOk.setLayout(new FlowLayout(FlowLayout.LEFT));
        bouton.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Vous avez appuyé sur : OK\n" + " Nom : " + Nom.getText() + '\n' + " pwd : " + Mdp.getText());
        });
        boutonOk.add(bouton);

        JPanel boutonAnnuler = new JPanel();
        boutonAnnuler.setLayout(new FlowLayout(FlowLayout.RIGHT));
        MonBouton bouton2 = new MonBouton("Cancel");
        bouton2.setBackground(Color.GRAY);
        bouton2.MouseaddHoverEffect(Color.DARK_GRAY, Color.WHITE);
        bouton2.setPreferredSize(new Dimension(100, 50));
        bouton2.setFont(new Font("Arial", Font.PLAIN, 20));
        bouton2.setAlignmentX(CENTER_ALIGNMENT);
        bouton2.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Vous avez appuyé sur : Cancel\n" + " Nom : " + Nom.getText() + '\n' + " pwd : " + Mdp.getText());
        });
        boutonAnnuler.add(bouton2);

        panel.setBorder(BorderFactory.createEmptyBorder(100, 250, 150, 250));

        panel.setBackground(new Color(0,0,0,0));
        textFields.setBackground(new Color(0,0,0,0));
        textFields2.setBackground(new Color(0,0,0,0));
        Boutons.setBackground(new Color(0,0,0,0));
        boutonOk.setBackground(new Color(0,0,0,0));
        boutonAnnuler.setBackground(new Color(0,0,0,0));

        Boutons.add(boutonOk);
        Boutons.add(boutonAnnuler);
        panel.add(Boutons);
        panelContainer.add(panel);
        ContainerBox.add(panelContainer);
    }
}
