package com.example.safouen.commerceparisien.javaClass;

/**
 * Created by Safouen on 10/03/2016.
 */
public class Annonce {
    /**
     * Attributs
     */
    int idAnnonce ;
    String nomAnnonce = null ;
    String titreAnnonce = null ;
    String descriptifAnnonce = null ;
    int idImageAnnonce ;
    String dateAnnonce = null;
    String adresseAnnonce = null ;
    String categorieAnnonce = null ;
    int chiffreAffire ;
    int prixAnnonce ;
    int idUtilisateur ;
    /**
     * Constructeur avec parametres
     */
    public Annonce(int idAnnonce, String nomAnnonce, String titreAnnonce, String descriptifAnnonce,
                   int idImageAnnonce, String dateAnnonce, String adresseAnnonce,
                   String categorieAnnonce, int chiffreAffire, int prixAnnonce, int idUtilisateur) {
        this.idAnnonce = idAnnonce;
        this.nomAnnonce = nomAnnonce;
        this.titreAnnonce = titreAnnonce;
        this.descriptifAnnonce = descriptifAnnonce;
        this.idImageAnnonce = idImageAnnonce;
        this.dateAnnonce = dateAnnonce;
        this.adresseAnnonce = adresseAnnonce;
        this.categorieAnnonce = categorieAnnonce;
        this.chiffreAffire = chiffreAffire;
        this.prixAnnonce = prixAnnonce;
        this.idUtilisateur = idUtilisateur;
    }

    /**
     * Constructeur par défaut
     */
    public Annonce() {
    }
    /**
     * Getters / Setters
     */
    public int getIdAnnonce() {
        return idAnnonce;
    }

    public void setIdAnnonce(int idAnnonce) {
        this.idAnnonce = idAnnonce;
    }

    public String getNomAnnonce() {
        return nomAnnonce;
    }

    public void setNomAnnonce(String nomAnnonce) {
        this.nomAnnonce = nomAnnonce;
    }

    public String getTitreAnnonce() {
        return titreAnnonce;
    }

    public void setTitreAnnonce(String titreAnnonce) {
        this.titreAnnonce = titreAnnonce;
    }

    public String getDescriptifAnnonce() {
        return descriptifAnnonce;
    }

    public void setDescriptifAnnonce(String descriptifAnnonce) {
        this.descriptifAnnonce = descriptifAnnonce;
    }

    public int getIdImageAnnonce() {
        return idImageAnnonce;
    }

    public void setIdImageAnnonce(int idImageAnnonce) {
        this.idImageAnnonce = idImageAnnonce;
    }

    public String getDateAnnonce() {
        return dateAnnonce;
    }

    public void setDateAnnonce(String dateAnnonce) {
        this.dateAnnonce = dateAnnonce;
    }

    public String getAdresseAnnonce() {
        return adresseAnnonce;
    }

    public void setAdresseAnnonce(String adresseAnnonce) {
        this.adresseAnnonce = adresseAnnonce;
    }

    public String getCategorieAnnonce() {
        return categorieAnnonce;
    }

    public void setCategorieAnnonce(String categorieAnnonce) {
        this.categorieAnnonce = categorieAnnonce;
    }

    public int getChiffreAffire() {
        return chiffreAffire;
    }

    public void setChiffreAffire(int chiffreAffire) {
        this.chiffreAffire = chiffreAffire;
    }

    public int getPrixAnnonce() {
        return prixAnnonce;
    }

    public void setPrixAnnonce(int prixAnnonce) {
        this.prixAnnonce = prixAnnonce;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }
}
