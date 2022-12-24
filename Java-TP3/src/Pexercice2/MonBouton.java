package Pexercice2;

import javax.swing.*;
import java.awt.*;

public class MonBouton extends JButton {

    public MonBouton(String text) {
        super(text);
        this.addActionListener(e -> System.out.println(text + " cliqué"));
    }

    public MonBouton(String text, ImageIcon imageIcon) {
        super(text, imageIcon);
        this.addActionListener(e -> System.out.println(text + " cliqué"));
    }
    public void setIcon(ImageIcon imageIcon, int width, int height) {
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(width, height,  java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);
        this.setIcon(imageIcon);
    }
}
