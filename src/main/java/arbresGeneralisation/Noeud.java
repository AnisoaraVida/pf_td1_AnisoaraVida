package arbresGeneralisation;


import java.util.Set;

public class Noeud<T> implements Arbre<T> {
    

    @Override
    public int taille() {
        return 0;
    }

    @Override
    public boolean contient(Object val) {
        return false;
    }

    @Override
    public Set valeurs() {
        return null;
    }
}
