package com.example.evaristo.dto;

import com.example.evaristo.adapters.MenuAdapter;

public class PiattoDto {
    public String mId;
    public String mNome;
    public String mDescrizione;
    public float mPrezzo;
    public String mStato;
    public String mTipo;
    public boolean mVegetariano;
    public boolean mVegano;
    public boolean mAllergeni;


    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public String getmNome() {
        return mNome;
    }

    public void setmNome(String mNome) {
        this.mNome = mNome;
    }

    public String getmDescrizione() {
        return mDescrizione;
    }

    public void setmDescrizione(String mDescrizione) {
        this.mDescrizione = mDescrizione;
    }

    public float getmPrezzo() {
        return mPrezzo;
    }

    public void setmPrezzo(int mPrezzo) {
        this.mPrezzo = mPrezzo;
    }

    public String getmStato() {
        return mStato;
    }

    public void setmStato(String mStato) {
        this.mStato = mStato;
    }

    public String getmTipo() {
        return mTipo;
    }

    public void setmTipo(String mTipo) {
        this.mTipo = mTipo;
    }

    public boolean getmVegetariano() {
        return mVegetariano;
    }

    public void setmVegetariano(boolean mVegetariano) {
        this.mVegetariano = mVegetariano;
    }

    public boolean getmVegano() {
        return mVegano;
    }

    public void setmVegano(boolean mVegano) {
        this.mVegano = mVegano;
    }

    public boolean getmAllergeni() {
        return mAllergeni;
    }

    public void setmAllergeni(boolean mAllergeni) {
        this.mAllergeni = mAllergeni;
    }


    public PiattoDto(String Id, String Nome, String Descrizione, float Prezzo, String Stato, String Tipo, boolean Vegetariano, boolean Vegano, boolean Allergeni) {

        this.mId = Id;
        this.mNome = Nome;
        this.mDescrizione = Descrizione;
        this.mPrezzo = Prezzo;
        this.mStato = Stato;
        this.mTipo = Tipo;
        this.mVegetariano = Vegetariano;
        this.mVegano = Vegano;
        this.mAllergeni = Allergeni;
    }
}


