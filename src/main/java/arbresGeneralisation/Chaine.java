package arbresGeneralisation;

public class Chaine implements Sommable<Chaine>, Comparable<Chaine>{
    public String valeur;

    public Chaine(String valeur){

        this.valeur = valeur;
    }

    public String valeur(){
        return valeur;
    }


    @Override
    public Chaine sommer(Chaine autre) {
        return new Chaine(this.valeur + autre.valeur);
    }

    @Override
    public int compareTo(Chaine chaine) {
        return 0;
    }
}
