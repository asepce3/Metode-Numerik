package asep.cahyana.falsi;

import static asep.cahyana.Utils.inRoundTwoDigits;

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
        this.a = inRoundTwoDigits(a);
        this.fa = inRoundTwoDigits(fa);
        this.b = inRoundTwoDigits(b);
        this.fb = inRoundTwoDigits(fb);
        this.w = inRoundTwoDigits(w);
        this.c = inRoundTwoDigits(c);
        this.fc = inRoundTwoDigits(fc);
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
        this.a = inRoundTwoDigits(a);
    }

    public double getFa() {
        return fa;
    }

    public void setFa(double fa) {
        this.fa = inRoundTwoDigits(fa);
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = inRoundTwoDigits(b);
    }

    public double getFb() {
        return fb;
    }

    public void setFb(double fb) {
        this.fb = inRoundTwoDigits(fb);
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = inRoundTwoDigits(w);
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = inRoundTwoDigits(c);
    }

    public double getFc() {
        return fc;
    }

    public void setFc(double fc) {
        this.fc = inRoundTwoDigits(fc);
    }

    @Override
    public String toString() {
        return String.format("%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f", a, fa, b, fb, w, c, fc);
    }
}
