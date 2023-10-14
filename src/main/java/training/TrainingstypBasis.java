package training;

import linguistik.Ausdruck;
import java.util.ArrayList;
import java.util.Comparator;

public abstract class TrainingstypBasis<T extends Ausdruck> implements Trainingstyp<T> {

    protected Comparator<? super T> comparator;

    public void setComparator(Comparator<? super T> c){

        this.comparator = c;
    }

    public void trainiere(ArrayList<T> vokabeln) {

        if (this.comparator != null) {
            vokabeln.sort(this.comparator);
        }

        for (int i = 0; i <= vokabeln.size() - 1; i++) {

            T v = vokabeln.get(i);
            trainiereAusdruck(v);
        }

    }

    protected abstract void trainiereAusdruck(T v);

}

