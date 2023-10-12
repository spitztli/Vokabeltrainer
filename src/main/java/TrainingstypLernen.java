import java.util.Scanner;

public class TrainingstypLernen {

    public void trainiere(Vokabel[] vokabeln){

        Scanner sc = new Scanner(System.in);

        for (int i=0; i<=vokabeln.length-1; i++){

            Vokabel v = vokabeln[i];
            System.out.println(v.getVokabel_deutsch() + " - " + v.getVokabel_english());

            System.out.println("Weiter mit Enter");
            sc.nextLine();
        }
    }
}
