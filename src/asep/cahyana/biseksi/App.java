package asep.cahyana.biseksi;

import java.util.ArrayList;
import java.util.List;

public class App {

    private static final double NILAI_AWAL_1 = 2;
    private static final double NILAI_AWAL_2 = 3;

    public static void main(String[] args) {
        Biseksi biseksi = new Biseksi();
        List<Item> items = new ArrayList<>();

        Item item = biseksi.init(NILAI_AWAL_1, NILAI_AWAL_2);
        items.add(item);
        int z = 0;
        while(item.getFc() != 0 && z < 10) {
            System.out.println(item);
            item = biseksi.next(items.get(z));
            items.add(item);
            z++;
        }
    }
}
