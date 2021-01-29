package asep.cahyana.secant;

import java.util.List;

public class App {

    private static final double X0 = 0;
    private static final double X1 = 2.5;
    private static final double XTOL = 0;

    public static void main(String[] args) {
        Secant secant = new Secant();
        List<Item> items = secant.secant(X0, X1, XTOL);

        for (int i=0; i<items.size(); i++) {
            System.out.println(i + "\t" + items.get(i));
        }
    }
}
