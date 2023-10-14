import java.util.Comparator;

public class ComparatorErfolgsquote implements Comparator<Vokabel> {

    @Override
    public int compare(Vokabel v1, Vokabel v2) {

        if(v1.getVokabelStatistik().getErfolgsquote() < v2.getVokabelStatistik().getErfolgsquote()){
            return -1;
        }

        if(v1.getVokabelStatistik().getErfolgsquote() > v2.getVokabelStatistik().getErfolgsquote()){
            return 1;
        }


        return 0;
    }
}
