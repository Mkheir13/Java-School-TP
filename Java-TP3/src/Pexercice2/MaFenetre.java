package Pexercice2;

import javax.swing.*;


public class MaFenetre extends JFrame {
    public MaFenetre(String title, int width, int height) {
        this.setTitle(title);
        this.setSize(width, height);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);


    }

}
