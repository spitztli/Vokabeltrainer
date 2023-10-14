public class ArrayListe<T> {


    private T[] elemente = (T[]) new Object[100];
    private int index = 0;



    public void add(T v){

        if(index == elemente.length){

            this.resizeArray();
        }
        elemente[index] = v;
        this.index++;
    }

    public T[] get(){

        T[] kopie = (T[]) new Object[index];

        for(int i=0; i<=index-1; i++){
            kopie[i] = elemente[i];
        }
        return kopie;
    }


    //Neue Methode -> Das Array wird hier vergrössert
    private void resizeArray(){

        T[] vn = (T[]) new Object[elemente.length+100];

        for(int i = 0; i<= elemente.length; i++){

            vn[i] = elemente[i];
        }
        this.elemente = vn;
        }
    }

