package training;

public class Statistik {
    //Eigenschaften
    private int anzahl_trainigs = 0;
    private int anzahl_erfolgreich = 0;

    public Statistik() {
    }

    public void updateTrainings(boolean erfolg) {

        if (erfolg) {
            this.anzahl_erfolgreich++;
        }

        this.anzahl_trainigs++;
    }

    public double getErfolgsquote() {

        if (this.anzahl_trainigs == 0) {
            return 0.0;
        }

        return (double) this.anzahl_erfolgreich / (double) this.anzahl_trainigs;
    }
}