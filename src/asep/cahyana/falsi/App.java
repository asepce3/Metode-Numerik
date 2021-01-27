package asep.cahyana.falsi;

import java.util.List;

public class App {

    private static final double NILAI_AWAL_1 = 0;
    private static final double NILAI_AWAL_2 = 1;

    public static void main(String[] args) {
        Falsi falsi = new Falsi();
        List<Item> items = falsi.falsi(NILAI_AWAL_1, NILAI_AWAL_2);

        StringBuilder sb = new StringBuilder(items.size()*2);
        for (Item item : items) {
            sb.append(item).append("\n");
        }

        // ini hasil dari perhitungan manual
        String harusnya = "0.00\t-1.00\t1.00\t2.00\t0.67\t0.67\t0.57\n" +
                "0.00\t-1.00\t0.67\t0.57\t0.36\t0.24\t-0.64\n" +
                "0.24\t-0.64\t0.67\t0.57\t0.47\t0.44\t-0.17\n" +
                "0.44\t-0.17\t0.67\t0.57\t0.77\t0.62\t0.39\n" +
                "0.44\t-0.17\t0.62\t0.39\t0.70\t0.57\t0.22\n" +
                "0.44\t-0.17\t0.57\t0.22\t0.56\t0.51\t0.03\n" +
                "0.44\t-0.17\t0.51\t0.03\t0.15\t0.45\t-0.14\n" +
                "0.45\t-0.14\t0.51\t0.03\t0.18\t0.46\t-0.12\n" +
                "0.46\t-0.12\t0.51\t0.03\t0.20\t0.47\t-0.09\n" +
                "0.47\t-0.09\t0.51\t0.03\t0.25\t0.48\t-0.06\n" +
                "0.48\t-0.06\t0.51\t0.03\t0.33\t0.49\t-0.03\n" +
                "0.49\t-0.03\t0.51\t0.03\t0.50\t0.50\t0.00\n";

        for (int i=0; i<items.size(); i++) {
            System.out.println(i + "\t" + items.get(i));
        }
        System.out.println("=====");
        System.out.println(sb.toString().equals(harusnya));
    }
}
