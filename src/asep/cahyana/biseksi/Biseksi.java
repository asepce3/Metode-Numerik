package asep.cahyana.biseksi;

import asep.cahyana.Utils;

import java.util.ArrayList;
import java.util.List;

public class Biseksi {

    public List<Item> biseksi(double a, double b) {
        List<Item> items = new ArrayList<>();
        Item item = init(a, b);
        items.add(item);
        int z = 0;
        while(item.getFc() != 0) {
            item = next(items.get(z));
            items.add(item);

            // cek apakah nilai c sama berturut-turut
            if (item.getC() == items.get(z).getC())
                break;
            z++;
        }

        return items;
    }

    private Item init(double a, double b) {
        Item item = new Item();
        item.setA(a);
        item.setFa(biseksi(a));
        item.setB(b);
        item.setFb(biseksi(b));
        item.setC(c(a, b));
        item.setFc(biseksi(item.getC()));

        return item;
    }

    private Item next(Item item) {
        if (item.getFc() > 0) {
            double b = item.getC();
            double fb = item.getFc();
            double c = c(item.getA(), b);
            return new Item(
                    0,
                    item.getA(),
                    item.getFa(),
                    b,
                    fb,
                    c,
                    biseksi(c)
            );
        } else {
            double a = item.getC();
            double fa = item.getFc();
            double c = c(a, item.getB());
            return new Item(
                    0,
                    a,
                    fa,
                    item.getB(),
                    item.getFb(),
                    c,
                    biseksi(c)
            );
        }
    }

    /**
     * Diubah sesuai fungsi
     * f(x) = x^2 - 2x - 2
     */
    private double biseksi(double bil) {
        double bilTwo = Utils.inRoundTwoDigits(bil);
        double result = Math.pow(bilTwo, 2) - 2 * bilTwo- 2;

        return Utils.inRoundTwoDigits(result);
    }

    /**
     * c = (a+b) / 2
     */
    private double c(double a, double b) {
        double aTwo = Utils.inRoundTwoDigits(a);
        double bTwo = Utils.inRoundTwoDigits(b);
        double result = (aTwo+bTwo) / 2;

        return Utils.inRoundTwoDigits(result);
    }
}
