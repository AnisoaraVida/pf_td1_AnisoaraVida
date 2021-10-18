package arbresGeneralisation;


import java.util.Set;

public class Feuille<T> implements Arbre<T>{
    private final T valeur;

    public Feuille(T valeur) {

        this.valeur = valeur;
    }

    @Override
    public int taille() {

        return 1;
    }

    @Override
    public boolean contient(Object val) {

        return val.equals(valeur);
    }

    @Override
    public Set valeurs() {

        return Set.of(valeur);
    }

    @Override
    public T somme() {
        return this.valeur;
    }
}
