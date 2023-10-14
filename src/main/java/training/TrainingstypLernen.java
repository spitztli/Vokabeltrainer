package training;

import linguistik.Vokabel;
import java.util.Scanner;

public class TrainingstypLernen extends TrainingstypBasis<Vokabel> {

    protected void trainiereAusdruck(Vokabel v) {

        Scanner sc = new Scanner(System.in);

        System.out.println(v.getText() + " - " + v.getTranslation().getText());

        System.out.println("Weiter mit Enter");
        sc.nextLine();
    }
}