package util;

import linguistik.Ausdruck;

import java.util.Comparator;


public class ComparatorText implements Comparator<Ausdruck> {

    @Override
    public int compare(Ausdruck a1, Ausdruck a2) {

        if(a1.getText().compareTo(a2.getText())>0){
            return 1;
        }

        if(a1.getText().compareTo(a2.getText())<0){
            return -1;
        }

        return 0;
    }
}
