package com.example.evaristo.dto;

public class RistoranteDto {
    private String mId;
    private String mNome;
    private String mIndirizzo;
    private String mRagioneSociale;
    private String mPartitaIva;

    public String getmId(){
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

    public String getmIndirizzo() {
        return mIndirizzo;
    }

    public void setmIndirizzo(String mIndirizzo) {
        this.mIndirizzo = mIndirizzo;
    }

    public String getmRagioneSociale() {
        return mRagioneSociale;
    }

    public void setmRagioneSociale(String mRagioneSociale) {
        this.mRagioneSociale = mRagioneSociale;
    }

    public String getmPartitaIva() {
        return mPartitaIva;
    }

    public void setmPartitaIva(String mPartitaIva) {
        this.mPartitaIva = mPartitaIva;
    }
}
