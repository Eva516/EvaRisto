package com.example.evaristo.dto;

public class OrdineDto {
    public String mId;
    public String mIdTavolo;
    public String mIdCliente;
    public String mStato;
    public String mNote;
    public int mPiatti;

    public String getmId(){
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public String getmIdTavolo() {
        return mIdTavolo;
    }

    public void setmIdTavolo(String mIdTavolo) {
        this.mIdTavolo = mIdTavolo;
    }

    public String getmIdCliente(){
        return mIdCliente;
    }

    public void setmIdCliente(String mIdCliente) {
        this.mIdCliente = mIdCliente;
    }

    public String getmStato(){
        return mStato;
    }

    public String getmNote(){
        return mNote;
    }

    public void setmNote(String mNote){
       this.mNote = mNote;
    }

    public int getmPiatti() {
        return mPiatti;
    }

    public void setmPiatti(int mPiatti) {
        this.mPiatti = mPiatti;
    }
}
