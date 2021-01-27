package asep.cahyana.interpolasi;

import java.util.List;

public class App {

    private static double NILAI_AWAL_X = 25;
    private static double XTOL = 0.0;

    public static void main(String[] args) {

        NewtonInterpolasi interpolasi = new NewtonInterpolasi();
        List<Item> items = interpolasi.interpolasi(NILAI_AWAL_X, XTOL);

        StringBuilder sb = new StringBuilder();
        for (Item it : items) {
            sb.append(it).append("\n");
        }

        String harapan = "25.00\t30624.00\t3700.00\t0.00\n" +
                "16.72\t9067.87\t1643.91\t0.47\n" +
                "11.20\t2683.41\t730.24\t0.45\n" +
                "7.52\t792.97\t324.26\t0.43\n" +
                "5.07\t233.94\t144.09\t0.40\n" +
                "3.45\t69.22\t64.51\t0.36\n" +
                "2.38\t20.30\t29.23\t0.32\n" +
                "1.68\t5.66\t13.57\t0.26\n" +
                "1.26\t1.41\t7.00\t0.18\n" +
                "1.06\t0.26\t4.62\t0.10\n" +
                "1.00\t0.00\t4.00\t0.03\n" +
                "1.00\t0.00\t4.00\t0.00\n";

        for (int i=0; i<items.size(); i++) {
            System.out.println(i + "\t" + items.get(i));
        }

        System.out.println("======");
        System.out.println(harapan.equals(sb.toString()));
    }
}
