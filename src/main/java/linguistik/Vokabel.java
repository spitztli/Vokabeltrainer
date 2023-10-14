package linguistik;

public class Vokabel extends Ausdruck {

    //Konstruktor der Klasse Voakbel. Der Konstruktor hat denn selben Name wie die Klasse.
    public Vokabel(String text, Sprache s, Ausdruck translation) throws TranslationLanguageException {

        super(text, s);


        if(s != translation.getSprache()) {
            this.translation = translation;
        }else {
            throw new TranslationLanguageException("Die Sprache der Übersetzung muss sich von der Sprache der Vokabel unterscheiden!");
        }
        this.translation = translation;
    }

    //Methode
    public Ausdruck getTranslation() {

        return this.translation;
    }

    private Ausdruck translation;


}