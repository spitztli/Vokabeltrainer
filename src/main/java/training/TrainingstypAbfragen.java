package training;

import linguistik.Vokabel;
import java.util.Scanner;

public class TrainingstypAbfragen extends TrainingstypBasis<Vokabel> {


    protected void trainiereAusdruck(Vokabel v) {

        String loesung;

        Scanner sc = new Scanner(System.in);


        System.out.println(v.getText());
        System.out.println("Gibt die Übersetzung ein:");
        String uebersetzung = sc.next();

        Statistik vs = new Statistik();

        if (uebersetzung.equals(v.getTranslation().getText())) {
            System.out.println("Das ist richtig");
            vs.updateTrainings(true);


        } else {

            vs.updateTrainings(false);
            System.out.println("Das ist flasch");
            System.out.println("Möchten sie die lösung sehen? (ja/nein)");
            loesung = sc.next();

            if (loesung.equals("ja")) {
                System.out.println("Die lösung ist " + v.getTranslation());
            }

        }


    }
}



