public class NumarComplex {
    double real;
    double imaginar;

    NumarComplex(double real, double imaginar) {
        this.real = real;
        this.imaginar = imaginar;
    }

    NumarComplex(double modul, int faza_in_grade) {
        modul = modul * modul;
    }
}
