package asep.cahyana.biseksi;

import java.util.List;

public class App {

    private static final double NILAI_AWAL_1 = 2;
    private static final double NILAI_AWAL_2 = 3;

    public static void main(String[] args) {
        Biseksi biseksi = new Biseksi();
        List<Item> items = biseksi.biseksi(NILAI_AWAL_1, NILAI_AWAL_2);

        StringBuilder sb = new StringBuilder();
        for (Item it : items) {
            sb.append(it).append("\n");
        }

        String harapan = "2.00\t-2.00\t3.00\t1.00\t2.50\t-0.75\n" +
                "2.50\t-0.75\t3.00\t1.00\t2.75\t0.06\n" +
                "2.50\t-0.75\t2.75\t0.06\t2.62\t-0.37\n" +
                "2.62\t-0.37\t2.75\t0.06\t2.68\t-0.18\n" +
                "2.68\t-0.18\t2.75\t0.06\t2.71\t-0.07\n" +
                "2.71\t-0.07\t2.75\t0.06\t2.73\t-0.01\n" +
                "2.73\t-0.01\t2.75\t0.06\t2.74\t0.03\n" +
                "2.73\t-0.01\t2.74\t0.03\t2.73\t-0.01\n" +
                "2.73\t-0.01\t2.74\t0.03\t2.73\t-0.01\n";

        for (int i=0; i<items.size(); i++) {
            System.out.println(i + "\t" + items.get(i));
        }

        System.out.println("======");
        System.out.println(sb.toString().length() + " " + harapan.length());
        System.out.println(harapan.equals(sb.toString()));
    }
}
