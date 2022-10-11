import Exercices.Frontend.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private interface Exercice {
        public JPanel getPanel();
    }

    private static Exercice[] exercices = {
            new Exercice() {
                public JPanel getPanel() {
                    return Exercice1.getPanel();
                }
            },
            new Exercice() {
                public JPanel getPanel() {
                    return Exercice2.getPanel();
                }
            },
            new Exercice() {
                public JPanel getPanel() {
                    return Exercice3.getPanel();
                }
            },
            new Exercice() {
                public JPanel getPanel() {
                    return Exercice4.getPanel();
                }
            },
    };

    private static JFrame window = null;
    private static JPanel rootPanel = null;

    public static void main(String[] args) {
        // init ----------

        window = initWindow(860, 360, "JAVA TP2 - Mederreg & Borello");
        rootPanel = new JPanel();
        rootPanel.setLayout(new BorderLayout());
        window.setContentPane(rootPanel);


        // main ----------

        JPanel menu = initMainMenuPanel();
        JPanel mainPanel = initMainPanel();

        rootPanel.add(menu, BorderLayout.WEST);
        rootPanel.add(mainPanel, BorderLayout.CENTER);


        // display window ----------

        window.setVisible(true);
    }



    private static JFrame initWindow(int w, int h, String title) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocation(240, 120);
        window.setTitle(title);
        window.setSize(w,h);
        return window;
    }



    private static JPanel initMainMenuPanel() {
        JPanel menuPanel = new JPanel();
        menuPanel.setPreferredSize(new Dimension(180, 360));
        menuPanel.setLayout(new GridLayout(0, 1));

        JLabel label = new JLabel("Exercices :");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        menuPanel.add(label);

        String exercicesNames[] = {
                "Archimède",
                "Impots",
                "Euromillion",
                "Jeu de Nim",
        };

        int i = 0;
        for (Exercice exercice : exercices) {
            JButton button = new JButton(exercicesNames[i]);
            int finalI = i;
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    rootPanel.remove(1);
                    rootPanel.add(exercice.getPanel(), BorderLayout.CENTER);
                    rootPanel.revalidate();
                }
            });
            menuPanel.add(button);
            i++;
        }

        return menuPanel;
    }


    private static JPanel initMainPanel() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));


        JLabel tpTitle = new JLabel("JAVA TP2");
        tpTitle.setFont(new Font(tpTitle.getFont().getName(), tpTitle.getFont().getStyle(), 32));
        mainPanel.add(tpTitle);

        JLabel authors = new JLabel("Kheir-Edinne Mederreg & Benjamin Borello");
        authors.setFont(new Font(authors.getFont().getName(), authors.getFont().getStyle(), 24));
        mainPanel.add(authors);

        return mainPanel;
    }
}