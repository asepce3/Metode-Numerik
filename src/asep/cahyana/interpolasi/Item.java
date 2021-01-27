package asep.cahyana.interpolasi;

public class Item {
    private double x;
    private double fX;
    private double ffX;
    private double erX;

    public Item(double x, double fX, double ffX, double erX) {
        this.x = x;
        this.fX = fX;
        this.ffX = ffX;
        this.erX = erX;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getfX() {
        return fX;
    }

    public void setfX(double fX) {
        this.fX = fX;
    }

    public double getFfX() {
        return ffX;
    }

    public void setFfX(double ffX) {
        this.ffX = ffX;
    }

    public double getErX() {
        return erX;
    }

    public void setErX(double erX) {
        this.erX = erX;
    }

    @Override
    public String toString() {
        return String.format("%.2f\t%.2f\t%.2f\t%.2f", getX(), getfX(), getFfX(), getErX());
    }
}
