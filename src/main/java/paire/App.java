package paire;

public class App {
    public static void main(String[] args){
        Paire<Integer, String> p1 = new Paire<>(1, "un");
        System.out.println(p1);
        Paire<Double, String> p2 = p1.changeFst(1.0);
        System.out.println(p2);
        Paire<Double, Paire<Integer, String>> p3 = p2.changeSnd(p1);
        System.out.println(p3);
    }
}
