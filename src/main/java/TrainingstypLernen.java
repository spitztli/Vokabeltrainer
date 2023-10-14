import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class TrainingstypLernen implements Trainingstyp {

    private Comparator<Vokabel> comparator;

    @Override
    public void setComparator(Comparator<Vokabel> c) {
        this.comparator = c;

    }

    public void trainiere(ArrayList<Vokabel> vokabeln) {

        if (this.comparator != null) {
            vokabeln.sort(this.comparator);

            Scanner sc = new Scanner(System.in);

            for (int i = 0; i <= vokabeln.size() - 1; i++) {

                Vokabel v = vokabeln.get(i);
                System.out.println(v.getVokabel_deutsch() + " - " + v.getVokabel_english());

                System.out.println("Weiter mit Enter");
                sc.nextLine();
            }
        }
    }
}