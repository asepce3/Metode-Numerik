package asep.cahyana.secant;

import asep.cahyana.Utils;

import java.util.ArrayList;
import java.util.List;

public class Secant {

    public List<Item> secant(double x0, double x1, double xtol) {
        List<Item> items = new ArrayList<>();
        Item item0 = init(x0);
        Item item1 = second(x1, item0);
        items.add(item0);
        items.add(item1);

        int z = 1;
        do {
            Item nextItem = next(items.get(z-1), items.get(z));
            items.add(nextItem);
            z++;
        } while (items.get(z).getfX() != 0 &&
                items.get(z).getX() != items.get(z-1).getX());

        return items;
    }

    private Item init(double x0) {
        double x0Two = Utils.inRoundTwoDigits(x0);

        return new Item(
                x0Two,
                fX(x0Two),
                0.0,
                0.0
        );
    }

    private Item second(double x1, Item item) {
        double x1Two = Utils.inRoundTwoDigits(x1);
        double fX1 = fX(x1Two);

        return new Item(
                x1Two,
                fX1,
                xMinX(item.getX(), x1Two),
                fXMinFX(item.getfX(), fX1)
        );
    }

    private Item next(Item item0, Item item1) {
        double xn = nextX(item0.getX(), item0.getfX(), item1.getX(), item1.getfX());
        double fXn = fX(xn);
        return new Item(
                xn,
                fXn,
                xMinX(item1.getX(), xn),
                fXMinFX(item1.getfX(), fXn)
        );
    }

    /**
     * xk+1 = xk - ( f(xk)(xk - xk-1) / (f(xk) - f(xk-1)) )
     */
    private double nextX(double x0, double fX0, double x1, double fX1) {
        double x0Two = Utils.inRoundTwoDigits(x0);
        double fX0Two = Utils.inRoundTwoDigits(fX0);
        double x1Two = Utils.inRoundTwoDigits(x1);
        double fX1Two = Utils.inRoundTwoDigits(fX1);
        double result = x1Two - (fX1Two * (x1Two-x0Two)) / (fX1Two - fX0Two);

        return Utils.inRoundTwoDigits(result);
    }

    /**
     * xk - xk-1 = x1 - x0
     */
    private double xMinX(double x0, double x1) {
        double x0Two = Utils.inRoundTwoDigits(x0);
        double x1Two = Utils.inRoundTwoDigits(x1);
        double result = x1Two - x0Two;

        return Utils.inRoundTwoDigits(result);
    }

    /**
     * f(xk) - f(xk-1) = f(x1) - f(x0)
     */
    private double fXMinFX(double fX0, double fX1) {
        double fX0Two = Utils.inRoundTwoDigits(fX0);
        double fX1Two = Utils.inRoundTwoDigits(fX1);
        double result = fX1Two - fX0Two;

        return Utils.inRoundTwoDigits(result);
    }

    /**
     * f(x) = x^2 - 5x + 6
     */
    private double fX(double x) {
        double xTwo = Utils.inRoundTwoDigits(x);
        double result = Math.pow(xTwo, 2) - 5 * xTwo + 6;

        return Utils.inRoundTwoDigits(result);
    }
}
