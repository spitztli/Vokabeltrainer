import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class TrainingstypAbfragen implements Trainingstyp {

    private Comparator<Vokabel> comparator;

    public void setComparator(Comparator<Vokabel> c){

        this.comparator = c;
    }

    public void trainiere(ArrayList<Vokabel> vokabeln){

        if (this.comparator != null){
            vokabeln.sort(this.comparator);
        }

        for (int i=0; i<=vokabeln.size() -1; i++) {
            trainiereVokabel(vokabeln.get(i));
        }
    }

    private void trainiereVokabel(Vokabel v) {

        String loesung;

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
