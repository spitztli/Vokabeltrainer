package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Vokabel v1 = new Vokabel("Hund", "dog");
        Vokabel v2 = new Vokabel( "Katze",  "cat");


        System.out.println("Willkommen zum Vokabeltrainer");

        System.out.println("Neue Vokabel (n), neues Training (t), Beenden (x)");

        String eingabe;



        int totale_runde = 0;



        Scanner sc = new Scanner(System.in);

        eingabe = sc.next();



        while (!eingabe.equals("x")) {

            totale_runde++;


            trainiereVokabel(v1);
            trainiereVokabel(v2);

            System.out.println("Neue Vokabel (n), neues Training (t), Beenden (x)");
            eingabe = sc.next();

        }
        System.out.println("Toll, du hast " + totale_runde + " Runde trainiert.");


    }
    private static void trainiereVokabel(Vokabel v) {

        String loesung = "nein";

        Scanner sc = new Scanner(System.in);


        v.updateAnzahlTrainings();


        System.out.println(v.getVokabel_deutsch());
        System.out.println("Gibt die Übersetzung ein:");
        String uebersetzung = sc.next();

        if(uebersetzung.equals(v.getVokabel_english())){
            System.out.println("Das ist richtig");
            v.updateAnzahlErfolgreich();

        }else {
            System.out.println("Das ist flasch");
            System.out.println("Möchten sie die lösung sehen? (ja/nein)");
            loesung = sc.next();

            if (loesung.equals("ja")) {
                System.out.println("Die lösung ist " + v.getVokabel_english());
            }

        }


    }
}