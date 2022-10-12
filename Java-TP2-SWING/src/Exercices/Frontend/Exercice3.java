package Exercices.Frontend;//réaliser par MEDERREG KHEIR-EDDINE et BENJAMIN BORELLO

import Exercices.Backend.Exo3;
import Exercices.Backend.Utils;

import javax.swing.*;
import java.awt.*;

public class Exercice3 {
    public static JPanel getPanel() {
        JPanel panel = new JPanel();

        JLabel title = new JLabel("Exercice 3 : Chance Euromillions");
        title.setFont(new Font(title.getFont().getName(), title.getFont().getStyle(), 32));
        panel.add(title);
        panel.add(new JLabel("Cnp(50,5) * Cnp(11.,2) = " + (Exo3.Cnp(50, 5).multiply(Exo3.Cnp(11, 2))) + " soit 1 chance sur " + Exo3.Cnp(50, 5).multiply(Exo3.Cnp(11, 2))));
        panel.add(mainPanel());

        return panel;
    }

    public static JPanel mainPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

        panel.add(new JLabel("N (int > 0) : "));
        JTextField nTextField = new JTextField(4);
        panel.add(nTextField);

        panel.add(new JLabel("P (int > 0) : "));
        JTextField pTextField = new JTextField(4);
        panel.add(pTextField);

        JButton calculate = new JButton("Calculer");
        panel.add(calculate);
        panel.add(new JLabel());



        calculate.addActionListener(e -> {
            int n = Utils.StringToInt(nTextField.getText());
            int p = Utils.StringToInt(pTextField.getText());
            double result = Exo3.Cnp(n, p).doubleValue();


            // do some shit here

            JLabel resultLabel = panel.getComponent(panel.getComponents().length - 1) instanceof JLabel ? (JLabel) panel.getComponent(panel.getComponents().length - 1) : new JLabel();
            resultLabel.setText(" Cnp  = " + result + ";");

        });



        return panel;
    }
}
