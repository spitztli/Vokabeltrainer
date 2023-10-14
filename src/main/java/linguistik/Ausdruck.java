package linguistik;

import training.Statistik;

import java.util.ArrayList;

public class Ausdruck {

    //Eigenschaften
    protected String text;
    private Sprache sprache;
    private Statistik statistik = new Statistik();
    private ArrayList<Ausdruck> synonyme = new ArrayList();


    public Ausdruck(String text, Sprache s){

        this.sprache = s;
        this.text = text;
    }


    public void addSynonyme(ArrayList<? extends Ausdruck> s){

        synonyme.addAll(s);
    }

    //Methode
    public String getText() {

        return this.text;
    }

    public Statistik getStatistik() {

        return this.statistik;
    }

    public void setSprache(Sprache s) {
        this.sprache = sprache;
    }

    public Sprache getSprache() {

        return this.sprache;
    }
}
