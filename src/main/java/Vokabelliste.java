public class Vokabelliste {


    private Vokabel[] vokabeln = new Vokabel[100];
    private int index = 0;



    public void addVokabel(Vokabel v){

        if(index == vokabeln.length){

            this.resizeArray();
        }
        vokabeln[index] = v;
        this.index++;
    }

    public Vokabel[] getVokabeln(){

        Vokabel[] kopie = new Vokabel[index];

        for(int i=0; i<=index-1; i++){
            kopie[i] = vokabeln[i];
        }
        return kopie;
    }


    //Neue Methode -> Das Array wird hier vergrössert
    private void resizeArray(){

        Vokabel[] vn = new Vokabel[vokabeln.length+100];

        for(int i=0; i<=vokabeln.length; i++){

            vn[i] = vokabeln[i];
        }
        this.vokabeln = vn;
        }
    }

