package asep.cahyana;

public class Utils {

    /**
     * Melakukan pembulatan 2 angka dibalakang koma dengan metode in round
     */
    public static double inRoundTwoDigits(double num) {
        String textOrigin = String.valueOf(num);
        String textNum = String.format("%.2f", num);
        double numTwoDigit = Double.parseDouble(textNum);

        String[] temp = textOrigin.split("\\.");
        if (temp.length == 2 && temp[1].length() > 2) {
            char charAkhir = temp[1].charAt(2);
            if (Integer.parseInt(String.valueOf(charAkhir)) == 5) {
                if (numTwoDigit > 0.0) {
                    return numTwoDigit - 0.01;
                } else {
                    return numTwoDigit + 0.01;
                }
            }
        }

        return numTwoDigit;
    }
}
