package Pexercice2;

import javax.swing.*;
import java.awt.*;

public class MonBouton extends JButton {

    public MonBouton(String text) {
        super(text);
        this.addActionListener(e -> System.out.println(text + " cliqué"));
        setFocusPainted(false);
        setBorderPainted(false);
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

    public void MouseaddHoverEffect(Color colorOne, Color colorTwo) {
        this.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setForeground(colorTwo);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                setForeground(colorOne);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                setForeground(colorTwo);
            }
        });
    }
}
