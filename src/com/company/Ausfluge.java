package com.company;

public class Ausfluge {

    private int id;
    private String reiseziehl;
    private int preis_pro_person;
    private int max_anz_teilnehmer;
    private int anz_teilnehmer;

    public Ausfluge(int id, String reiseziehl, int preis_pro_person, int max_anz_teilnehmer, int anz_teilnehmer) {
        this.id = id;
        this.reiseziehl = reiseziehl;
        this.preis_pro_person = preis_pro_person;
        this.max_anz_teilnehmer = max_anz_teilnehmer;
        this.anz_teilnehmer = anz_teilnehmer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReiseziehl() {
        return reiseziehl;
    }

    public void setReiseziehl(String reiseziehl) {
        this.reiseziehl = reiseziehl;
    }

    public int getPreis_pro_person() {
        return preis_pro_person;
    }

    public void setPreis_pro_person(int preis_pro_person) {
        this.preis_pro_person = preis_pro_person;
    }

    public int getMax_anz_teilnehmer() {
        return max_anz_teilnehmer;
    }

    public void setMax_anz_teilnehmer(int max_anz_teilnehmer) {
        this.max_anz_teilnehmer = max_anz_teilnehmer;
    }

    public int getAnz_teilnehmer() {
        return anz_teilnehmer;
    }

    public void setAnz_teilnehmer(int anz_teilnehmer) {
        this.anz_teilnehmer = anz_teilnehmer;
    }

    @Override
    public String toString() {
        return "Ausfluge{" +
                "id=" + id +
                ", reiseziehl='" + reiseziehl + '\'' +
                ", preis_pro_person=" + preis_pro_person +
                ", max_anz_teilnehmer=" + max_anz_teilnehmer +
                ", anz_teilnehmer=" + anz_teilnehmer +
                '}';
    }
}
