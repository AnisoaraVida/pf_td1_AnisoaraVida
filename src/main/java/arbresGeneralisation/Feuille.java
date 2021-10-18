package arbresGeneralisation;


import java.util.Set;

public class Feuille<T> implements Arbre<T>, Sommable<T>, Comparable<T>{
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

    @Override
    public T min() {
        return valeur;
    }

    @Override
    public T max() {
        return valeur;
    }

    /**
     * une feuille est toujours triée.
     */
    @Override
    public boolean estTrie() {
        return true;
    }

    @Override
    public T sommer(T autre) {
        return null;
    }

    @Override
    public int compareTo(T t) {
        return 0;
    }
}
