package asep.cahyana.siedel;

public class Determinan {

    private double x;
    private double y;
    private double z;
    private double nilai;

    public Determinan(double x, double y, double z, double nilai) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.nilai = nilai;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }
}
