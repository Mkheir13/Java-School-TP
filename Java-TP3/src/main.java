import java.io.*;

public class main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Exo1.Etudiant etudiant = new Exo1.Etudiant();
        etudiant.afficherNote();
        etudiant.afficherNote("Java");
        etudiant.etudiant("Mederreg", "Kheir-eddine", "Math");
        etudiant.moyenne("physique");
        etudiant.setNote("Java", "Allali", 15.0);
        etudiant.setNote("Java", "Mederreg", 2, 15.0);
        System.out.println("//////////////////////////////////////////////////");
        Exo1.Classe classe = new Exo1().new Classe("B2");
        classe.afficher();
        classe.getEtudiant("Mederreg");
        classe.moyenneClasse("Java");
        classe.setEtudiant(etudiant);
        System.out.println("//////////////////////////////////////////////////");
        Exo1.serialize(Exo1.class, "Exo1.ser");
        Exo1.deserialize("Exo1.ser");
    }
}
