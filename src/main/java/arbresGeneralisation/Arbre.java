package arbresGeneralisation;

import java.util.Set;

public interface Arbre<T> extends Sommable<T> {
    int taille();
    boolean contient(T val);
    Set<T> valeurs();
    T somme();
    T min();
    T max();
    boolean estTrie();
}
