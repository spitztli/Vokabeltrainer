import java.util.ArrayList;
import java.util.Comparator;

public interface Trainingstyp {

    void setComparator(Comparator<Vokabel> c);

    void trainiere(ArrayList<Vokabel> vl);
}
