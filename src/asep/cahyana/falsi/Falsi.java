package asep.cahyana.falsi;

import asep.cahyana.Utils;

import java.util.ArrayList;
import java.util.List;

public class Falsi {

    public List<Item> falsi(double a, double b) {
        List<Item> items = new ArrayList<>();
        Item item = init(a, b);
        items.add(item);
        int z = 0;
        while (item.getFc() != 0.00) {
            item = next(items.get(z));
            items.add(item);

            // cek jika nilai c sama dua kali berurutan
            if (item.getC() == items.get(z).getC())
                break;
            z++;
        }

        return items;
    }

    private Item init(double a, double b) {
        Item item = new Item();
        item.setA(a);
        item.setFa(falsi(a));
        item.setB(b);
        item.setFb(falsi(b));
        item.setW(w(item.getFa(), item.getFb()));
        item.setC(c(a, b, item.getW()));
        item.setFc(falsi(item.getC()));

        return item;
    }

    private Item next(Item item) {
        if (item.getFc() > 0) {
            double b = item.getC();
            double fb = item.getFc();
            double w = w(item.getFa(), fb);
            double c = c(item.getA(), b, w);
            return new Item(
                    0,
                    item.getA(),
                    item.getFa(),
                    b,
                    fb,
                    w,
                    c,
                    falsi(c)
            );
        } else {
            double a = item.getC();
            double fa = item.getFc();
            double w = w(fa, item.getFb());
            double c = c(a, item.getB(), w);
            return new Item(
                    0,
                    a,
                    fa,
                    item.getB(),
                    item.getFb(),
                    w,
                    c,
                    falsi(c)
            );
        }
    }

    /**
     * Diubah sesuai fungsi
     * 2x^2 + x - 1
     */
    private double falsi(double bil) {
        double xTwoDigits = Utils.inRoundTwoDigits(bil);
        double result = 2 * Math.pow(xTwoDigits, 2) + xTwoDigits - 1;

        return Utils.inRoundTwoDigits(result);
    }

    /**
     * c = a + w (b-a)
     */
    private double c(double a, double b, double w) {
        double aTwo = Utils.inRoundTwoDigits(a);
        double bTwo = Utils.inRoundTwoDigits(b);
        double wTwo = Utils.inRoundTwoDigits(w);
        double result = aTwo + wTwo * (bTwo-aTwo);

        return Utils.inRoundTwoDigits(result);
    }

    /**
     * w = f(b) / (f(b) - f(a))
     */
    private double w(double fA, double fB) {
        double fATwo = Utils.inRoundTwoDigits(fA);
        double fBTwo = Utils.inRoundTwoDigits(fB);
        double result = fBTwo / (fBTwo - fATwo);

        return Utils.inRoundTwoDigits(result);
    }
}
