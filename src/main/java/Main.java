import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Vokabel v1 = new Vokabel("Hund", "dog");
        Vokabel v2 = new Vokabel( "Katze",  "cat");

        Vokabelliste vl =new Vokabelliste();
        vl.addVokabel(v1);
        vl.addVokabel(v2);




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

                Vokabel[] vokabeln = vl.getVokabeln();


                if(modus == 1){

                    sc.nextLine();

                    TrainingstypLernen t = new TrainingstypLernen();
                    t.trainiere(vokabeln);

                }


                if(modus == 2) {

                    TrainingstypAbfragen t = new TrainingstypAbfragen();
                    t.trainiere(vokabeln);

                }

                if(modus == 3){

                    TraingstypBuchstaben t = new TraingstypBuchstaben();
                    t.trainiere(vokabeln);
                }

            }
            // Neue Vokabel hinzufügen
            if (eingabe.equals("n")){
                totale_runde++;

                System.out.println("Vokabel deutsch:");
                String vd = sc.next();

                System.out.println("Vokabel englisch:");
                String ve = sc.next();

                Vokabel v = new Vokabel(vd, ve);
                vl.addVokabel(v);

            }


            System.out.println("Neue Vokabel (n), neues Training (t), Beenden (x)");
            eingabe = sc.next();

        }
        System.out.println("Toll, du hast " + totale_runde + " Runde trainiert.");

    }

}