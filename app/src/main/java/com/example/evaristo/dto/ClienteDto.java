package com.example.evaristo.dto;

public class ClienteDto {
    private int mId;
    private String mNome;
    private String mCognome;
    private String mSesso;
    private String mTelefono;
    private String pIva;
    private String mRagioneSociale;

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmNome() {
        return mNome;
    }

    public void setmNome(String mNome) {
        this.mNome = mNome;
    }

    public String getmCognome() {
        return mCognome;
    }

    public void setmCognome(String mCognome) {
        this.mCognome = mCognome;
    }

    public String getmSesso() {
        return mSesso;
    }

    public void setmSesso(String mSesso) {
        this.mSesso = mSesso;
    }

    public String getmTelefono() {
        return mTelefono;
    }

    public void setmTelefono(String mTelefono) {
        this.mTelefono = mTelefono;
    }

    public String getpIva() {
        return pIva;
    }

    public void setpIva(String pIva) {
        this.pIva = pIva;
    }

    public String getmRagioneSociale() {
        return mRagioneSociale;
    }

    public void setmRagioneSociale(String mRagioneSociale) {
        this.mRagioneSociale = mRagioneSociale;
    }
}
