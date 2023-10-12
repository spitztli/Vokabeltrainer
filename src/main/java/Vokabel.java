public class Vokabel {

    private VokabelStatistik vokabelStatistik = new VokabelStatistik();

    //Konstruktor der Klasse Voakbel. Der Konstruktor hat denn selben Name wie die Klasse.
    public Vokabel(String vokabel_deutsch, String vokabel_english) {

        this.vokabel_deutsch = vokabel_deutsch;
        this.vokabel_english = vokabel_english;
    }
    //Methode
    public String getVokabel_deutsch() {

        return this.vokabel_deutsch;
    }
    //Methode
    public String getVokabel_english() {

        return this.vokabel_english;
    }

    //Eigenschaften
    private String vokabel_deutsch;
    private String vokabel_english;



    public void updateTrainings(boolean erfolg) {

        vokabelStatistik.updateTrainings(erfolg);
    }


    public double getErfolgsquote(){

        return vokabelStatistik.getErfolgsquote();
    }

    public VokabelStatistik getVokabelStatistik(){

        return this.vokabelStatistik;
    }
}