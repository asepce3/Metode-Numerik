package asep.cahyana.siedel;

import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Determinan> items = Arrays.asList(
                new Determinan(4, 1, 2, 15),
                new Determinan(2, 1, 1, 10),
                new Determinan(2, 1, 3, 16)
        );

        boolean isTunggal = CekDeterminan.cek(items);

        if (!isTunggal) {
            GaussSiedel gaussSiedel = new GaussSiedel();
            List<Item> siedels = gaussSiedel.siedel(2, 2, 2);

            for(int i=0; i<siedels.size(); i++) {
                System.out.println(i + "\t" + siedels.get(i));
            }
        }
    }
}
