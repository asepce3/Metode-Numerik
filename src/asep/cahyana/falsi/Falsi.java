package asep.cahyana.falsi;

import static asep.cahyana.Utils.inRoundTwoDigits;

public class Falsi {

    public Item init(double a, double b) {
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

    public Item next(Item item) {
        if (item.getFc() > 0) {
            double b = item.getC();
            double fb = item.getFc();
            double w = w(item.getFa(), inRoundTwoDigits(fb));
            double c = c(item.getA(), inRoundTwoDigits(b), inRoundTwoDigits(w));
            return new Item(
                    0,
                    item.getA(),
                    item.getFa(),
                    b,
                    fb,
                    w,
                    c,
                    falsi(inRoundTwoDigits(c))
            );
        } else {
            double a = item.getC();
            double fa = item.getFc();
            double w = w(inRoundTwoDigits(fa), item.getFb());
            double c = c(inRoundTwoDigits(a), item.getB(), inRoundTwoDigits(w));
            return new Item(
                    0,
                    a,
                    fa,
                    item.getB(),
                    item.getFb(),
                    w,
                    c,
                    falsi(inRoundTwoDigits(c))
            );
        }
    }

    /**
     * Diubah sesuai fungsi
     * 2x^2 + x - 1
     */
    private double falsi(double bil) {
        return 2 * Math.pow(bil, 2) + bil - 1;
    }

    /**
     * c = a + w (b-a)
     */
    private double c(double a, double b, double w) {
        return a + w * (b-a);
    }

    /**
     * w = f(b) / (f(b) - f(a))
     */
    private double w(double fA, double fB) {
        return fB / (fB - fA);
    }
}
