package analitic;

public class NumarComplex {
    private double real;
    private double imaginar;

    public NumarComplex(int real, int imaginar) {
        this.real = real;
        this.imaginar = imaginar;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginar() {
        return imaginar;
    }

    public void setImaginar(double imaginar) {
        this.imaginar = imaginar;
    }

    public void afisareNumar() {
        System.out.println(real + " + " + imaginar + "j");
    }

    public double getModul() {
        return Math.sqrt(this.real * this.real + this.imaginar * this.imaginar);
    }

    public double getFaza() {
        return Math.atan(this.imaginar / this.real);
    }

    public static NumarComplex imparte(NumarComplex n1, NumarComplex n2) {
        NumarComplex res = new NumarComplex(0, 0);

        res.real = n1.real / n2.real;
        res.imaginar = n1.imaginar / n2.imaginar;

        return res;
    }
}
