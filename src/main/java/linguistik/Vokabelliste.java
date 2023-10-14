package linguistik;


import java.util.ArrayList;

public class Vokabelliste {

    private Sprache quellsprache;
    private Sprache zielsprache;

    public Vokabelliste(Sprache a, Sprache z){

        this.quellsprache = a;
        this.zielsprache = z;
    }

    private ArrayList<Vokabel> list = new ArrayList();

    public void addVokabel(Vokabel v) throws SourceLannguageException, TargetLanguageException {

        if(v.getSprache() != this.quellsprache){
            throw new SourceLannguageException("Die Sprache der Vokabel stimmt nicht mit der Quellsprache der Vokabelliste überein");
        }

        if(v.getTranslation().getSprache() != this.zielsprache){
            throw new TargetLanguageException("Die Sprache der Übersetzung der Vokabel stimmt nicht mit der Zielsprache der Vokabelliste überein");
        }

        this.list.add(v);
    }

    public  ArrayList<Vokabel> getList(){
        return this.list;
    }
}
