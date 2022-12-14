package Pexercice1.PClasse;

import Pexercice1.PEtudiant.Etudiant;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kheir-eddine on 20/12/2022.
 **/

public class Classe {
    private final String nom;
    private final List<Etudiant> etudiants;

    public Classe(String nom) {
        this.nom = nom;
        this.etudiants = new ArrayList<>();
    }

    public void afficher() {
        System.out.println("Classe : " + nom);
        for (Etudiant etudiant : etudiants) {
            System.out.println("Etudiant : " + etudiant.getPrenom() + " " + etudiant.getNom());
        }
    }

    public void setEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
    }

    public Etudiant getEtudiant(String promotion) {
        for (Etudiant etudiant : etudiants) {
            if (etudiant.getPromotion().equals(promotion)) {
                return etudiant;
            }
        }
        return null;
    }

    public float moyenneClasse(String matiere) {
        float somme = 0;
        int nbEtudiants = 0;
        for (Etudiant etudiant : etudiants) {
            double moyenneEtudiant = etudiant.moyenne(matiere);
            if (moyenneEtudiant > 0) {
                somme += moyenneEtudiant;
                nbEtudiants++;
            }
        }
        if (nbEtudiants == 0) {
            return 0;
        }
        return somme / nbEtudiants;
    }

    public void sauvegarderEtudiants(String nomFichier) {
        try (PrintWriter writer = new PrintWriter(nomFichier)) {
            for (Etudiant etudiant : etudiants) {
                writer.println(etudiant.getNom() + "," + etudiant.getPrenom() + "," + etudiant.getPromotion());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Erreur lors de la sauvegarde des étudiants dans le fichier " + nomFichier);
            e.printStackTrace();
        }
    }

    public void chargerEtudiants(String nomFichier) {
        etudiants.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(nomFichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                String[] elements = ligne.split(",");
                etudiants.add(new Etudiant(elements[0], elements[1], elements[2]));
            }
        } catch (IOException e) {
            System.out.println("Erreur lors du chargement des étudiants depuis le fichier " + nomFichier);
            e.printStackTrace();
        }
    }

    public String getNom() {
        return nom;
    }
}
