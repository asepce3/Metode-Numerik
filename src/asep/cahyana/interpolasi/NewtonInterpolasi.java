package asep.cahyana.interpolasi;

import asep.cahyana.Utils;

import java.util.ArrayList;
import java.util.List;

public class NewtonInterpolasi {

    public List<Item> interpolasi(double x, double xtol) {
        List<Item> items = new ArrayList<>();
        Item item = init(x);
        items.add(item);
        if (item.getFfX() != 0) {
            int index = 0;
            Item nextItem;
            if (xtol != 0) {
                do {
                    nextItem = next(items.get(index));
                    items.add(nextItem);
                    index++;
                } while (nextItem.getErX() != 0 && nextItem.getErX() > xtol);
            } else {
                do {
                    nextItem = next(items.get(index));
                    items.add(nextItem);
                    index++;
                } while (nextItem.getFfX() != 0 && items.get(index-1).getFfX() != nextItem.getFfX());
            }
        }

        return items;
    }

    private Item init(double x) {
        return new Item(
                x,
                fX(x),
                ffX(x),
                0
        );
    }

    private Item next(Item item) {
        double x = nextX(item.getX(), item.getfX(), item.getFfX());
        return new Item(
                x,
                fX(x),
                ffX(x),
                erX(item.getX(), x)
        );
    }

    /**
     * Menghitung nilai x selanjutnya
     * x1 = x0 - f(x1) / f'(x1)
     */
    private double nextX(double x0, double fX, double ffX) {
        double x0InRound = Utils.inRoundTwoDigits(x0);
        double fXInRound = Utils.inRoundTwoDigits(fX);
        double ffXInRound = Utils.inRoundTwoDigits(ffX);

        double x1 = x0InRound - fXInRound / ffXInRound;
        return Utils.inRoundTwoDigits(x1);
    }

    /**
     * Fungsi interpolasi
     * f(x) = 2x^3 - x^2 - 1
     */
    private double fX(double x) {
        double xTwoDigits = Utils.inRoundTwoDigits(x);
        double interpolasi =  2 * Math.pow(xTwoDigits, 3) -
                Math.pow(xTwoDigits, 2) - 1;

        //double interpolasi = Math.pow(xTwoDigits, 2) - 4 * xTwoDigits - 5;
        return Utils.inRoundTwoDigits(interpolasi);
    }

    /**
     * Fungsi turunan
     * f'(x) = 6x^2 - 2x
     */
    private double ffX(double x) {
        double xTwoDigits = Utils.inRoundTwoDigits(x);
        double turunan = 6 * Math.pow(xTwoDigits, 2) -
                2 * xTwoDigits;
        //double turunan = 2 * xTwoDigits - 4;
        return Utils.inRoundTwoDigits(turunan);
    }

    /**
     * Fungsi Erx
     * Erx = |x1 - x0| / (1 + |x1|)
     */
    private double erX(double x0, double x1) {
        double x0TwoDigits = Utils.inRoundTwoDigits(x0);
        double x1TwoDigits = Utils.inRoundTwoDigits(x1);
        double erX = Math.abs(x1TwoDigits - x0TwoDigits) / (1 + Math.abs(x1TwoDigits));

        return Utils.inRoundTwoDigits(erX);
    }
}
