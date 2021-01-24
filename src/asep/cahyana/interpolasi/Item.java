package asep.cahyana.interpolasi;

import asep.cahyana.Utils;

public class Item {
    private double x;
    private double fX;
    private double ffX;
    private double erX;

    public Item(double x, double fX, double ffX, double erX) {
        this.x = Utils.inRoundTwoDigits(x);
        this.fX = Utils.inRoundTwoDigits(fX);
        this.ffX = Utils.inRoundTwoDigits(ffX);
        this.erX = Utils.inRoundTwoDigits(erX);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = Utils.inRoundTwoDigits(x);
    }

    public double getfX() {
        return fX;
    }

    public void setfX(double fX) {
        this.fX = Utils.inRoundTwoDigits(fX);
    }

    public double getFfX() {
        return ffX;
    }

    public void setFfX(double ffX) {
        this.ffX = Utils.inRoundTwoDigits(ffX);
    }

    public double getErX() {
        return erX;
    }

    public void setErX(double erX) {
        this.erX = Utils.inRoundTwoDigits(erX);
    }

    @Override
    public String toString() {
        return String.format("%.2f\t%.2f\t%.2f\t%.2f", getX(), getfX(), getFfX(), getErX());
    }
}
