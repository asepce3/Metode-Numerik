package asep.cahyana.interpolasi;

import java.util.List;

public class App {

    private static double NILAI_AWAL_X = 25;
    private static double XTOL = 0.0;

    public static void main(String[] args) {

        NewtonInterpolasi interpolasi = new NewtonInterpolasi();
        List<Item> items = interpolasi.interpolasi(NILAI_AWAL_X, XTOL);

        for (int i=0; i<items.size(); i++) {
            System.out.println(i + "\t" + items.get(i));
        }
    }
}
