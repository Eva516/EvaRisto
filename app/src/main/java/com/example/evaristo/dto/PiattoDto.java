package com.example.evaristo.dto;

public class PiattoDto {
    public String mId;
    public String mNome;
    public String mDescrizione;
    public String mPrezzo;
    public String mStato;
    public String mTipo;
    public String mVegetariano;
    public String mVegano;
    public String mAllergeni;

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

    public String getmVegetariano() {
        return mVegetariano;
    }

    public void setmVegetariano(String mVegetariano) {
        this.mVegetariano = mVegetariano;
    }

    public String getmVegano() {
        return mVegano;
    }

    public void setmVegano(String mVegano) {
        this.mVegano = mVegano;
    }

    public String getmAllergeni() {
        return mAllergeni;
    }

    public void setmAllergeni(String mAllergeni) {
        this.mAllergeni = mAllergeni;
    }


    public PiattoDto(String Id, String Nome, String Descrizione, String Prezzo, String Stato, String Tipo, String Vegetariano, String Vegano, String Allergeni) {

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


