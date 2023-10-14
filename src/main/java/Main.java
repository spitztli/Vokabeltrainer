import linguistik.*;
import training.Trainingstyp;
import training.TrainingstypAbfragen;
import training.TrainingstypBuchstaben;
import training.TrainingstypLernen;
import util.ComparatorText;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        starteTrainer();

    }

    private static void starteTrainer() {
    /*
    Ausdruck a1 = new Ausdruck("ausruhen");
    a1.setSprache(Sprache.DE);

    Ausdruck s1 = new Ausdruck("erholen");
    Vokabel s2 = new Vokabel("Fisch", "fish");

    ArrayList<Ausdruck> synonyme = new ArrayList();
    synonyme.add(s1);
    synonyme.add(s2);
    a1.addSynonyme(synonyme);


    /************************************************************************/
        try {
            Vokabel v1= new Vokabel("Hund", Sprache.DE,new Ausdruck("dog", Sprache.EN));
            Vokabel v2 = new Vokabel( "Katze", Sprache.DE, new Ausdruck("cat", Sprache.EN));


            Vokabelliste vl = new Vokabelliste(Sprache.DE, Sprache.EN);
            vl.addVokabel(v1);
            vl.addVokabel(v2);

            System.out.println("Willkommen zum Vokabeltrainer");

            System.out.println("Neue linguistik.Vokabel (n), neues Training (t), Beenden (x)");

            String eingabe;

            int totale_runde = 0;

            Scanner sc = new Scanner(System.in);

            eingabe = sc.next();



            while (!eingabe.equals("x")) {

                //Neue Runde
                if (eingabe.equals("t")) {

                    System.out.println("Trainingsmodus: Einträgen (1), Abfragen (2)");
                    int modus = Integer.parseInt(sc.next());

                    //Comparator<linguistik.Vokabel> comparator = new util.ComparatorErfolgsquote();
                    Comparator<Ausdruck> comparator = new ComparatorText();

                    Trainingstyp<Vokabel> t = new TrainingstypAbfragen();

                    if (modus == 1) {

                        sc.nextLine();

                        t = new TrainingstypLernen();

                    }


                    if (modus == 2) {

                        t = new TrainingstypAbfragen();

                    }

                    if (modus == 3) {

                        t = new TrainingstypBuchstaben();

                    }

                    t.setComparator(comparator);
                    trainiere(t, vl.getList());


                }
                // Neue linguistik.Vokabel hinzufügen
                if (eingabe.equals("n")) {
                    totale_runde++;

                    System.out.println("linguistik.Vokabel deutsch:");
                    String vd = sc.next();

                    System.out.println("linguistik.Vokabel englisch:");
                    String ve = sc.next();

                    Vokabel v = new Vokabel(vd, Sprache.DE, new Ausdruck(ve, Sprache.EN));
                    vl.addVokabel(v);

                }


                System.out.println("Neue linguistik.Vokabel (n), neues Training (t), Beenden (x)");
                eingabe = sc.next();

            }

            System.out.println("Toll, du hast " + totale_runde + " Runde trainiert.");

        } catch (TranslationLanguageException e) {
        System.out.print(e.getMessage());
        //throw new RuntimeException(e);
        }catch (SourceLannguageException e){
            System.out.print(e.getMessage());
        }catch (TargetLanguageException e){
            System.out.print(e.getMessage());

        }
    }

    private static void trainiere(Trainingstyp<Vokabel> t, ArrayList<Vokabel> vl) {

        long start = System.currentTimeMillis();
        t.trainiere(vl);
        long ende = System.currentTimeMillis();
        long dauer = ende - start;
        System.out.println("Du hast " + dauer + "ms Benötigt!");
    }

}