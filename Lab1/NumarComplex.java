public class NumarComplex {
    int real;
    int imaginar;

    void afisare() {
        System.out.println("(" + real + ") + j * (" + imaginar + ")");
    }

    void aduna(NumarComplex nr_complex) {
        real += nr_complex.real;
        imaginar += nr_complex.imaginar;
    }
}
