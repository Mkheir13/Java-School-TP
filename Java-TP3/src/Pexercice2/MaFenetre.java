package Pexercice2;

import javax.swing.*;


public class MaFenetre extends JFrame {
    public MaFenetre(String title, int width, int height, JPanel panel) {
        this.setTitle(title);
        this.setSize(width, height);
        this.setContentPane(panel);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

}

