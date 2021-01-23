package asep.cahyana.biseksi;

import asep.cahyana.Utils;

public class Item {
    private int iterasi;
    private double a;
    private double fa;
    private double b;
    private double fb;
    private double c;
    private double fc;

    public Item() {
    }

    public Item(int iterasi, double a, double fa, double b, double fb, double c, double fc) {
        this.iterasi = iterasi;
        this.a = Utils.inRoundTwoDigits(a);
        this.fa = Utils.inRoundTwoDigits(fa);
        this.b = Utils.inRoundTwoDigits(b);
        this.fb = Utils.inRoundTwoDigits(fb);
        this.c = Utils.inRoundTwoDigits(c);
        this.fc = Utils.inRoundTwoDigits(fc);
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
        this.a = Utils.inRoundTwoDigits(a);
    }

    public double getFa() {
        return fa;
    }

    public void setFa(double fa) {
        this.fa = Utils.inRoundTwoDigits(fa);
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = Utils.inRoundTwoDigits(b);
    }

    public double getFb() {
        return fb;
    }

    public void setFb(double fb) {
        this.fb = Utils.inRoundTwoDigits(fb);
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = Utils.inRoundTwoDigits(c);
    }

    public double getFc() {
        return fc;
    }

    public void setFc(double fc) {
        this.fc = Utils.inRoundTwoDigits(fc);;
    }

    @Override
    public String toString() {
        return String.format("%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f", a, fa, b, fb, c, fc);
    }
}