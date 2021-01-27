package asep.cahyana.falsi;

public class Item {
    private int iterasi;
    private double a;
    private double fa;
    private double b;
    private double fb;
    private double w;
    private double c;
    private double fc;

    public Item() {
    }

    public Item(int iterasi, double a, double fa, double b, double fb, double w, double c, double fc) {
        this.iterasi = iterasi;
        this.a = a;
        this.fa = fa;
        this.b = b;
        this.fb = fb;
        this.w = w;
        this.c = c;
        this.fc = fc;
    }

    public int getIterasi() {
        return iterasi;
    }

    public void setIterasi(int iterasi) {
        this.iterasi = iterasi;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getFa() {
        return fa;
    }

    public void setFa(double fa) {
        this.fa = fa;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getFb() {
        return fb;
    }

    public void setFb(double fb) {
        this.fb = fb;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getFc() {
        return fc;
    }

    public void setFc(double fc) {
        this.fc = fc;
    }

    @Override
    public String toString() {
        return String.format("%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f", a, fa, b, fb, w, c, fc);
    }
}
