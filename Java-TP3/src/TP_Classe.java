import Pexercice1.PClasse.Classe;
import Pexercice1.PEtudiant.Etudiant;
import Pexercice2.MaFenetre;

import javax.swing.*;
import java.awt.*;

public class TP_Classe {

    public static void main(MaFenetre args) {
        Classe classe = new Classe("B2");

        Etudiant etudiant1 = new Etudiant("Mederreg", "Kheir", "2022");
        etudiant1.setNote("Mathématiques", "Trimestre 1", 8.5);
        etudiant1.setNote("Mathématiques", "Trimestre 2", 9.0);
        etudiant1.setNote("Français", "Trimestre 1", 10.0);
        etudiant1.setNote("Français", "Trimestre 2", 12.0);
        classe.setEtudiant(etudiant1);

        Etudiant etudiant2 = new Etudiant("Borello", "Benjamin", "2023");
        etudiant2.setNote("Mathématiques", "Trimestre 1", 7.0);
        etudiant2.setNote("Mathématiques", "Trimestre 2", 8.0);
        etudiant2.setNote("Français", "Trimestre 1", 12.0);
        etudiant2.setNote("Français", "Trimestre 2", 13.0);
        classe.setEtudiant(etudiant2);

        Etudiant etudiant3 = new Etudiant("Laurie", "Jeham", "2024");
        etudiant3.setNote("Mathématiques", "Trimestre 1", 10.0);
        etudiant3.setNote("Mathématiques", "Trimestre 2", 11.0);
        etudiant3.setNote("Anglais", "Trimestre 1", 2, 20.0);
        etudiant3.setNote("Anglais", "Trimestre 2", 1, 20.0);
        classe.setEtudiant(etudiant3);


        JPanel labelPanel = new JPanel();
        labelPanel.setLayout(new BoxLayout(labelPanel, BoxLayout.Y_AXIS));
        labelPanel.setBackground(Color.DARK_GRAY);

        JLabel label = new JLabel();
        label.setForeground(Color.WHITE);
        label.setText("<html><h1><center><u>Classe " + classe.getNom() + "</u></center></h1>" +
                "<center><p>Moyenne de la classe en mathématiques : " + classe.moyenneClasse("Mathématiques") + "</p>" +
                "<p>Moyenne de la classe en français : " + classe.moyenneClasse("Français") + "</p>" +
                "<p>Moyenne de Kheir en mathématiques : " + classe.getEtudiant("2022").moyenne("Mathématiques") + "</p>" +
                "<p>Moyenne de Benjamin en français : " + classe.getEtudiant("2023").moyenne("Français") + "</p>" +
                "<p>Moyenne de Laurie en français : " + classe.getEtudiant("2024").moyenne("Français") + "</p></center></html>");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, 20));


        JPanel ContainerDroite = (JPanel) args.getContentPane().getComponent(1);
        ContainerDroite.setLayout(new GridLayout(1, 1));
        ContainerDroite.add(labelPanel);
        labelPanel.setLayout(new BorderLayout());
        labelPanel.add(label, BorderLayout.CENTER);
        labelPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        classe.sauvegarderEtudiants("etudiants.txt");
        classe.chargerEtudiants("etudiants.txt");
    }

}
