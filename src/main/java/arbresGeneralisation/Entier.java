package arbresGeneralisation;

public class Entier implements Sommable<Entier>{

    public Integer valeur;

    public Entier(int valeur){

        this.valeur = valeur;
    }

    public int valeur(){
        return valeur;
    }

    @Override
    public Entier sommer(Entier autre) {
        return new Entier(this.valeur + autre.valeur);
    }

    @Override
    public Entier zero() {
        return new Entier(0);
    }

}
