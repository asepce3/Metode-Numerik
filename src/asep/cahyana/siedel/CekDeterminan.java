package asep.cahyana.siedel;

import java.util.List;

public class CekDeterminan {

    public static boolean cek(List<Determinan> deters) {
        Determinan d1 = deters.get(0);
        Determinan d2 = deters.get(1);
        Determinan d3 = deters.get(2);

        double deterD1 = d1.getX() * d2.getY() * d3.getZ();
        double deterD2 = d1.getZ() * d2.getX() * d3.getY();
        double deterD3 = d1.getY() * d2.getZ() * d3.getX();

        double dterD1m = d1.getZ() * d2.getY() * d3.getX();
        double dterD2m = d1.getX() * d2.getZ() * d3.getY();
        double dterD3m = d1.getY() * d2.getX() * d3.getZ();

        double result = deterD1 + deterD2 + deterD3 - dterD1m - dterD2m - dterD3m;

        System.out.println("Determinan = " + result);
        System.out.println(result == 0 ? "Solusi tidak tunggal" : "Solusi tidak tunggal");

        return result == 0;
    }
}
