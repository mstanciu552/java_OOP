import analitic.NumarComplex;

public class TesteNumereComplexe {
    public static void main(String[] args) {
        NumarComplex n1 = new NumarComplex(11, 42);
        NumarComplex n2 = new NumarComplex(44, 12);

        NumarComplex.imparte(n1, n2).afisareNumar();

        System.out.println(n1.getFaza());
        System.out.println(n1.getModul());

    }
}
