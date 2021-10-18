package arbresGeneralisation;

public class Chaine implements Sommable<Chaine>{
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
    public Chaine zero() {
        return new Chaine("");
    }
}
