package com.example.tp1_singleactivityapp;

import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import java.util.Date;

public class ClientViewModel extends BaseObservable {
    private Client model = new Client("","","Paris", new Date(), "", "");

    @Bindable
    public String getName(){
         return this.model.getNom();
    }

    @Bindable
    public void setName(String s){
        this.model.setNom(s);
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getPrenom(){
        return this.model.getPrenom();
    }

    @Bindable
    public void setPrenom(String s){
        this.model.setPrenom(s);
        notifyPropertyChanged(BR.prenom);
    }

    @Bindable
    public Date getDate(){
        return this.model.getDate();
    }

    @Bindable
    public void setDate(Date d){
        this.model.setDate(d);
        notifyPropertyChanged(BR.date);
    }

    @Bindable
    public String getDepartement(){
        return this.model.getDepartement();
    }

    @Bindable
    public void setDepartement(String s){
        this.model.setDepartement(s);
        notifyPropertyChanged(BR.departement);
    }

    @Bindable
    public String getVilleNaiss(){
        return this.model.getVilleNaiss();
    }

    @Bindable
    public void setVilleNaiss(String s){

        Log.i("VM","ville naissance");

        this.model.setVilleNaiss(s);
        notifyPropertyChanged(BR.villeNaiss);
    }

    @Bindable
    public String getNumero(){
        return this.model.getNumero();
    }

    @Bindable
    public void setNumero(String s){
        this.model.setNumero(s);
        notifyPropertyChanged(BR.numero);
    }

}