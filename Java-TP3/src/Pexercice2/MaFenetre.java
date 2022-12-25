package Pexercice2;

import javax.swing.*;


public class MaFenetre extends JFrame {
    public MaFenetre(String title, int width, int height, JPanel panel) {
        this.setTitle(title);
        this.setSize(width, height);
        this.setContentPane(panel);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

}

