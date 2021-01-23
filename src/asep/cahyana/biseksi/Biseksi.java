package asep.cahyana.biseksi;

import asep.cahyana.Utils;

public class Biseksi {

    public Item init(double a, double b) {
        Item item = new Item();
        item.setA(a);
        item.setFa(biseksi(Utils.inRoundTwoDigits(a)));
        item.setB(b);
        item.setFb(biseksi(Utils.inRoundTwoDigits(b)));
        item.setC(c(Utils.inRoundTwoDigits(a), Utils.inRoundTwoDigits(b)));
        item.setFc(biseksi(item.getC()));

        return item;
    }

    public Item next(Item item) {
        if (item.getFc() > 0) {
            double b = item.getC();
            double fb = item.getFc();
            double c = c(item.getA(), Utils.inRoundTwoDigits(b));
            return new Item(
                    0,
                    item.getA(),
                    item.getFa(),
                    b,
                    fb,
                    c,
                    biseksi(Utils.inRoundTwoDigits(c))
            );
        } else {
            double a = item.getC();
            double fa = item.getFc();
            double c = c(Utils.inRoundTwoDigits(a), item.getB());
            return new Item(
                    0,
                    a,
                    fa,
                    item.getB(),
                    item.getFb(),
                    c,
                    biseksi(Utils.inRoundTwoDigits(c))
            );
        }
    }

    /**
     * Diubah sesuai fungsi
     * f(x) = x^2 - 2x - 2
     */
    private double biseksi(double bil) {
        return Math.pow(bil, 2) - 2 * bil - 2;
    }

    /**
     * c = (a+b) / 2
     */
    private double c(double a, double b) {
        return (a+b) / 2;
    }
}
