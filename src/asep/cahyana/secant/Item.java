package asep.cahyana.secant;

public class Item {

    private double x;
    private double fX;
    private double xMinX;
    private double fXMinFX;

    public Item(double x, double fX, double xMinX, double fXMinFX) {
        this.x = x;
        this.fX = fX;
        this.xMinX = xMinX;
        this.fXMinFX = fXMinFX;
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

    public double getxMinX() {
        return xMinX;
    }

    public void setxMinX(double xMinX) {
        this.xMinX = xMinX;
    }

    public double getfXMinFX() {
        return fXMinFX;
    }

    public void setfXMinFX(double fXMinFX) {
        this.fXMinFX = fXMinFX;
    }

    @Override
    public String toString() {
        return String.format("%.2f\t%.2f\t%.2f\t%.2f",
                getX(), getfX(), getxMinX(), getfXMinFX());
    }
}
