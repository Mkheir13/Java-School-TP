package Pexercice1.PEtudiant;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kheir-eddine on 20/12/2022.
 **/
public class Etudiant {
    private String nom;
    private String prenom;
    private String promotion;
    private Map<String, Map<String, Double>> notes;

    public Etudiant(String nom, String prenom, String promotion) {
        this.nom = nom;
        this.prenom = prenom;
        this.promotion = promotion;
        this.notes = new HashMap<>();
    }

    public void afficherNote() {
        for (Map.Entry<String, Map<String, Double>> entry : notes.entrySet()) {
            System.out.println("Matière : " + entry.getKey());
            for (Map.Entry<String, Double> note : entry.getValue().entrySet()) {
                System.out.println("Trimestre : " + note.getKey() + " - Note : " + note.getValue());
            }
        }
    }

    public void afficherNote(String matiere) {
        if (!notes.containsKey(matiere)) {
            System.out.println("L'étudiant n'a pas de note enregistrée pour la matière " + matiere);
            return;
        }
        Map<String, Double> notesMatiere = notes.get(matiere);
        for (Map.Entry<String, Double> note : notesMatiere.entrySet()) {
            System.out.println("Trimestre : " + note.getKey() + " - Note : " + note.getValue());
        }
    }

    public void setNote(String matiere, String trimestre, double note) {
        if (!notes.containsKey(matiere)) {
            notes.put(matiere, new HashMap<>());
        }
        notes.get(matiere).put(trimestre, note);
    }
    public void setNote(String matiere, String trimestre, int coeff, double note) {
        if (!notes.containsKey(matiere)) {
            notes.put(matiere, new HashMap<>());
        }
        notes.get(matiere).put(trimestre, note * coeff);
    }

    public double moyenne(String matiere) {
        if (!notes.containsKey(matiere)) {
            notes.put(matiere, new HashMap<>());
            notes.get(matiere).put(matiere, 1.0);
            return 0;
        }
        Map<String, Double> notesMatiere = notes.get(matiere);
        double somme = 0;
        for (Double note : notesMatiere.values()) {
            somme += note;
        }
        return somme / notesMatiere.size();
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getPromotion() {
        return promotion;
    }

    public Map<String, Map<String, Double>> getNotes() {
        return notes;
    }
}

