package arbresGeneralisation;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Noeud<T extends Arbre> implements Arbre<T>, Sommable<T>{
    private final List<T> fils;

    public Noeud(final List<T> fils) {
        this.fils = fils;
    }

    @Override
    public int taille() {
        int rtr = 0;
        for (final Arbre<T> a : fils) {
            rtr += a.taille();
        }
        return rtr;
    }

    @Override
    public boolean contient(T val) {
        boolean rtr = false;
        for (final Arbre<T> a : fils) {
            if (a.contient(val)){
                return true;
            }
        }
        return rtr;
    }

    @Override
    public Set<T> valeurs() {
        Set<T> rtr = new HashSet<>();
        for (final Arbre<T> a : fils) {
            rtr.addAll(a.valeurs());
        }
        return rtr;
    }

    @Override
    public T somme() {
        if (fils == null || fils.size() == 0) {
            return null;
        }
        T rtr = (T) fils.get(0).somme();
        for (int i = 1; i< fils.size(); i++) {
            rtr = (T) rtr.sommer(fils.get(i).somme());
        }
        return rtr;
    }

    @Override
    public T min() {
        return null;
    }

    @Override
    public T max() {
        return null;
    }

    @Override
    public boolean estTrie() {
        return false;
    }


    @Override
    public T sommer(T autre) {
        return null;
    }
    
}
