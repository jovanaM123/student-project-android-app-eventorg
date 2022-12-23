package com.example.student;


public class Mecevi {
    private String mec;
    private String datum;
    private String vreme;
    private String sala;

    public Mecevi(String mec, String datum,  String sala,String vreme) {
        this.vreme = vreme;
        this.mec = mec;
        this.sala = sala;
        this.datum = datum;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getMec() {
        return mec;
    }

    public void setMec(String mec) {
        this.mec = mec;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getVreme() {
        return vreme;
    }

    public void setVreme(String vreme) {
        this.vreme = vreme;
    }
}