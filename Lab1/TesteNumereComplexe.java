public class TesteNumereComplexe {
    public static void main(String[] args) {
        NumarComplex n1 = new NumarComplex();
        n1.real = 3;
        n1.imaginar = 12;

        NumarComplex n2 = new NumarComplex();
        n2.real = 12;
        n2.imaginar = 2;

        n1.afisare();
        n2.afisare();

        n1.aduna(n2);
        n1.afisare();
        n2.afisare();
    }
}
