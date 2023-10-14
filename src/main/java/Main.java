import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Vokabel v1 = new Vokabel("Hund", "dog");
        Vokabel v2 = new Vokabel( "Katze",  "cat");

        ArrayList<Vokabel> vl = new ArrayList();
        vl.add(v1);
        vl.add(v2);




        System.out.println("Willkommen zum Vokabeltrainer");

        System.out.println("Neue Vokabel (n), neues Training (t), Beenden (x)");

        String eingabe;



        int totale_runde = 0;



        Scanner sc = new Scanner(System.in);

        eingabe = sc.next();



        while (!eingabe.equals("x")) {

            //Neue Runde
            if (eingabe.equals("t")) {

                System.out.println("Trainingsmodus: Einträgen (1), Abfragen (2)");
                int modus = Integer.parseInt(sc.next());

                Comparator<Vokabel> comparator = new ComparatorErfolgsquote();

                Trainingstyp t = new  TrainingstypAbfragen();

                if(modus == 1){

                    sc.nextLine();

                    t = new TrainingstypLernen();

                }


                if(modus == 2) {

                    t = new TrainingstypAbfragen();

                }

                if(modus == 3){

                    t = new TraingstypBuchstaben();

                }

                t.setComparator(comparator);
                trainiere(t, vl);


            }
            // Neue Vokabel hinzufügen
            if (eingabe.equals("n")){
                totale_runde++;

                System.out.println("Vokabel deutsch:");
                String vd = sc.next();

                System.out.println("Vokabel englisch:");
                String ve = sc.next();

                Vokabel v = new Vokabel(vd, ve);
                vl.add(v);

            }


            System.out.println("Neue Vokabel (n), neues Training (t), Beenden (x)");
            eingabe = sc.next();

        }
        System.out.println("Toll, du hast " + totale_runde + " Runde trainiert.");

    }

    private static void trainiere(Trainingstyp t, ArrayList<Vokabel> vl) {

        long start = System.currentTimeMillis();
        t.trainiere(vl);
        long ende = System.currentTimeMillis();
        long dauer = ende - start;
        System.out.println("Du hast " + dauer + "ms Benötigt!");
    }

}