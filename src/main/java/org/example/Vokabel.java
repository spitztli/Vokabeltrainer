package org.example;

public class Vokabel {

    //Konstruktor der Klasse Voakbel. Der Konstruktor hat denn selben Name wie die Klasse.
    public Vokabel(String vokabel_deutsch, String vokabel_english) {

        this.vokabel_deutsch = vokabel_deutsch;
        this.vokabel_english = vokabel_english;
    }

    public String getVokabel_deutsch() {

        return this.vokabel_deutsch;
    }

    public String getVokabel_english() {

        return this.vokabel_english;
    }

    public void updateAnzahlTrainings() {
        this.anzahl_trainigs++;
    }

    public void updateAnzahlErfolgreich() {
        this.anzahl_erfolgreich++;
    }

    public double getErfolgsquote(){

        return (double) this.anzahl_erfolgreich / (double) this.anzahl_trainigs;
    }

    private String vokabel_deutsch;
    private String vokabel_english;
    private int anzahl_trainigs = 0;
    private int anzahl_erfolgreich = 0;








}