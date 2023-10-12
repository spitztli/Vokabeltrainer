import java.util.Scanner;

public class TrainingstypAbfragen {

    public void trainiere(Vokabel[] vokabeln){

        for (int i=0; i<=vokabeln.length-1; i++) {
            trainiereVokabel(vokabeln[i]);
        }
    }

    private void trainiereVokabel(Vokabel v) {

        String loesung = "nein";

        Scanner sc = new Scanner(System.in);


        System.out.println(v.getVokabel_deutsch());
        System.out.println("Gibt die Übersetzung ein:");
        String uebersetzung = sc.next();

        VokabelStatistik vs = new VokabelStatistik();

        if(uebersetzung.equals(v.getVokabel_english())){
            System.out.println("Das ist richtig");
            vs.updateTrainings(true);



        }else {

            vs.updateTrainings(false);
            System.out.println("Das ist flasch");
            System.out.println("Möchten sie die lösung sehen? (ja/nein)");
            loesung = sc.next();

            if (loesung.equals("ja")) {
                System.out.println("Die lösung ist " + v.getVokabel_english());
            }

        }


    }
}
