package paire;

public class Paire<A,B> {
    private A fst;
    private B snd;

    public Paire( A fst1, B snd1){
        fst = fst1;
        snd = snd1;
    }
    public A fst(){
        return fst;
    }
    public B snd(){
        return  snd;
    }

    @Override
    public String toString(){
        return String.format("(%s, %s) :: Paire [%s, %s]",
                fst, snd, fst.getClass().getSimpleName(), snd.getClass().getSimpleName());
    }

    public <C> Paire<C, B> changeFst( C val){
        return new Paire<>(val, snd);
    }
    public <C> Paire<A, C> changeSnd( C val){
        return new Paire<>(fst, val);
    }
}
