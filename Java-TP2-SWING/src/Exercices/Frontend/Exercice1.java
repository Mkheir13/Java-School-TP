package Exercices.Frontend;

import Exercices.Backend.Exo1;
import Exercices.Backend.Utils;
import jdk.jshell.execution.Util;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercice1 {
    public static JPanel getPanel() {
        JPanel panel = new JPanel();

        JLabel title = new JLabel("Exercice 1 : Méthode d'Archimède ");
        title.setFont(new Font(title.getFont().getName(), title.getFont().getStyle(), 32));
        panel.add(title);
        panel.add(cnPanel());
        panel.add(lnPanel());
        panel.add(anPanel());

        return panel;
    }

    private static JPanel anPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        panel.add(new JLabel("An : "));

        panel.add(new JLabel("N (int >= 0) : "));
        JTextField nTextField = new JTextField();
        nTextField.setPreferredSize(new Dimension(65, 28));
        panel.add(nTextField);

        JButton calculate = new JButton("Calculer");
        panel.add(calculate);
        panel.add(new JLabel());


        calculate.addActionListener(e -> {
            int n = Utils.StringToInt(nTextField.getText());
            double[] result = Exo1.Archimede.An(n);

            JLabel resultLabel = panel.getComponent(panel.getComponents().length - 1) instanceof JLabel ? (JLabel) panel.getComponent(panel.getComponents().length - 1) : new JLabel();

            resultLabel.setText(" = " + result[0] + " & " + result[1]);
        });

        return panel;
    }

    private static JPanel lnPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        panel.add(new JLabel("ln : "));

        panel.add(new JLabel("X (double >= 0) : "));
        JTextField xTextField = new JTextField();
        xTextField.setPreferredSize(new Dimension(65, 28));
        panel.add(xTextField);

        panel.add(new JLabel("Y (double >= 0) : "));
        JTextField yTextField = new JTextField();
        yTextField.setPreferredSize(new Dimension(65, 28));
        panel.add(yTextField);

        JButton calculate = new JButton("Calculer");
        panel.add(calculate);
        panel.add(new JLabel());


        calculate.addActionListener(e -> {
            double x = Utils.StringToDouble(xTextField.getText());
            double y = Utils.StringToDouble(yTextField.getText());
            double result = Exo1.Archimede.ln(x, y);

            JLabel resultLabel = panel.getComponent(panel.getComponents().length - 1) instanceof JLabel ? (JLabel) panel.getComponent(panel.getComponents().length - 1) : new JLabel();

            resultLabel.setText(" = " + result);
        });

        return panel;
    }

    private static JPanel cnPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        panel.add(new JLabel("Cn : "));

        panel.add(new JLabel("X (double >= 0) : "));
        JTextField xTextField = new JTextField();
        xTextField.setPreferredSize(new Dimension(65, 28));
        panel.add(xTextField);

        panel.add(new JLabel("Y (double >= 0) : "));
        JTextField yTextField = new JTextField();
        yTextField.setPreferredSize(new Dimension(65, 28));
        panel.add(yTextField);

        JButton calculate = new JButton("Calculer");
        panel.add(calculate);
        panel.add(new JLabel());


        calculate.addActionListener(e -> {
            double x = Utils.StringToDouble(xTextField.getText());
            double y = Utils.StringToDouble(yTextField.getText());
            double result = Exo1.Archimede.Cn(x, y);

            JLabel resultLabel = panel.getComponent(panel.getComponents().length - 1) instanceof JLabel ? (JLabel) panel.getComponent(panel.getComponents().length - 1) : new JLabel();

            resultLabel.setText(" = " + result);
        });

        return panel;
    }
}
