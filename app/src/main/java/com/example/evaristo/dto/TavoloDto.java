package com.example.evaristo.dto;

public class TavoloDto {
    public String mId;
    public int mNumero;
    public int mCoperti;
    public String mDescrizione;
    public String mStato;

    public String getmId(){
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public int getmNumero(){
        return mNumero;
    }

    public void setmNumero(int mNumero){
        this.mNumero = mNumero;
    }

    public int getmCoperti(){
        return mCoperti;
    }

    public void setmCoperti(int mCoperti){
        this.mCoperti = mCoperti;
    }

    public String getmDescrizione(){
        return mDescrizione;
    }

    public void setmDescrizione(String mDescrizione) {
        this.mDescrizione = mDescrizione;
    }

    public String getmStato(){
        return mStato;
    }

    public void setmStato(String mStato) {
        this.mStato = mStato;
    }
}
