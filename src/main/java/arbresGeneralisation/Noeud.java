package arbresGeneralisation;


import java.util.Set;

public class Noeud implements Arbre {

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
