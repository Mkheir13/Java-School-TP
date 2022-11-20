import java.io.*;

public class Exo1 {
    static class Etudiant implements Serializable {
        private double note = 20.0;

        void afficherNote() {
            System.out.println("Note: " + note);
        }

        void afficherNote(String filiere) {
            System.out.println("La note de la filiere " + filiere + ": " + note);
        }

        void etudiant(String nom, String prenom, String filiere) {
            System.out.println("Les informations de l'etudiant: " + nom + " " + prenom + " " + filiere);
        }

        void moyenne(String filiere) {
            System.out.println("Moyenne de l'étudiant en " + filiere + ": " + note);
        }

        void setNote(String filiere, String nom, double value) {
            this.note = value;
            System.out.println("La note de la filiere " + filiere + "de " + nom + " est: " + value);
        }

        void setNote(String filiere, String nom, int coef, double value) {
            this.note = value;
            System.out.println("La note de la filiere " + filiere + "de " + nom + " est: " + value + " avec un coefficient de " + coef);
        }



    }
    class Classe  implements Serializable {

        private String nom = "Classe B2 Informatique";
        void afficher() {
            System.out.println(nom);
        }
        Classe(String nom) {
            System.out.println("La classe est: " + nom);
        }
        Etudiant getEtudiant(String nom) {
            return new Etudiant();
        }
        float moyenneClasse(String filiere) {
            return 0;
        }

        void setEtudiant(Etudiant etudiant) {
            System.out.println("L'étudiant est: " + etudiant);
        }
    }
    public static void serialize(Object obj, String filename) throws IOException {
        FileOutputStream file = new FileOutputStream(filename);
        ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(obj);
        out.close();
        file.close();
    }
    public static Object deserialize(String filename) throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream(filename);
        ObjectInputStream in = new ObjectInputStream(file);
        Object obj = in.readObject();
        in.close();
        file.close();
        return obj;
    }
}
