package com.example.tp1_singleactivityapp;

import java.util.Date;

public class Client {

    private String nom;
    private String prenom;
    private String villeNaiss;
    private Date date;
    private String departement;
    private String numero;

    public Client(){}

    public Client(String nom,String prenom,String villeNaiss,Date date,String departement, String num){
        this.date=date;
        this.departement=departement;
        this.nom=nom;
        this.prenom=prenom;
        this.villeNaiss=villeNaiss;
        this.numero=num;
    }

    public String getNumero() { return numero; }

    public void setNumero(String numero) { this.numero = numero; }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getVilleNaiss() {
        return villeNaiss;
    }

    public Date getDate() {
        return date;
    }

    public String getDepartement() {
        return departement;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setVilleNaiss(String villeNaiss) {
        this.villeNaiss = villeNaiss;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }
}
