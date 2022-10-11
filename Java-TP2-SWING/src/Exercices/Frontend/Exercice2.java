package Exercices.Frontend;

import Exercices.Backend.Utils;

import javax.swing.*;
import java.awt.*;

public class Exercice2 {
    public static JPanel getPanel() {
        JPanel panel = new JPanel();

        JLabel title = new JLabel("Exercice 2 : Impots");
        title.setFont(new Font(title.getFont().getName(), title.getFont().getStyle(), 32));
        panel.add(title);
        panel.add(mainPanel());

        return panel;
    }

    public static JPanel mainPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));


        panel.add(new JLabel("Revenue annuel (€) : "));
        JTextField rTextField = new JTextField(7);
        rTextField.setHorizontalAlignment(JTextField.LEFT);
        panel.add(rTextField);

        panel.add(new JLabel(" Marié : "));
        JCheckBox marriedCB = new JCheckBox();
        panel.add(marriedCB);

        panel.add(new JLabel(" Enfant(s) à charge : "));
        JTextField eTextField = new JTextField("0", 2);
        eTextField.setPreferredSize(new Dimension(16, 28));
        eTextField.setHorizontalAlignment(JTextField.CENTER);
        panel.add(eTextField);

        JButton calculate = new JButton("Calculer");
        panel.add(calculate);
        panel.add(new JLabel());


        calculate.addActionListener(e -> {
            double result = 0.0;

            result = Exercices.Backend.Exo2.MesImpots(
                    Utils.StringToDouble(rTextField.getText()),
                    marriedCB.isSelected(),
                    Utils.StringToDouble(eTextField.getText())
            );

            JLabel resultLabel = panel.getComponent(panel.getComponents().length - 1) instanceof JLabel ? (JLabel) panel.getComponent(panel.getComponents().length - 1) : new JLabel();
            resultLabel.setText(" = " + result + " €");
        });


        return panel;
    }
}
