package com.example.safouen.commerceparisien.javaClass;

/**
 * Created by Safouen on 10/03/2016.
 */
public class Utilisateur {
    /**
     * Attributs
     */
    int idUtilisateur ;
    String prenomUtilisateur = null ;
    String nomUtilisateur = null ;
    String mdp_utilisateur = null;
    String numTelUtilsateur = null;
    String mailUtilisateur = null ;
    /**
     * Constructeur avec parametres
     */
    public Utilisateur(int idUtilisateur, String prenomUtilisateur, String nomUtilisateur,
                       String mdp_utilisateur, String numTelUtilsateur, String mailUtilisateur) {
        this.idUtilisateur = idUtilisateur;
        this.prenomUtilisateur = prenomUtilisateur;
        this.nomUtilisateur = nomUtilisateur;
        this.mdp_utilisateur = mdp_utilisateur;
        this.numTelUtilsateur = numTelUtilsateur;
        this.mailUtilisateur = mailUtilisateur;
    }
    /**
     * Constructeur par défaut
     */
    public Utilisateur() {
    }
    /**
     * Getters / Setters
     */
    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getPrenomUtilisateur() {
        return prenomUtilisateur;
    }

    public void setPrenomUtilisateur(String prenomUtilisateur) {
        this.prenomUtilisateur = prenomUtilisateur;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getMdp_utilisateur() {
        return mdp_utilisateur;
    }

    public void setMdp_utilisateur(String mdp_utilisateur) {
        this.mdp_utilisateur = mdp_utilisateur;
    }

    public String getNumTelUtilsateur() {
        return numTelUtilsateur;
    }

    public void setNumTelUtilsateur(String numTelUtilsateur) {
        this.numTelUtilsateur = numTelUtilsateur;
    }

    public String getMailUtilisateur() {
        return mailUtilisateur;
    }

    public void setMailUtilisateur(String mailUtilisateur) {
        this.mailUtilisateur = mailUtilisateur;
    }
}
