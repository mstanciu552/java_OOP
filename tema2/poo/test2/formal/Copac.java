package tema2.poo.test2.formal;

public abstract class Copac {
    private int varsta;

    public Copac(int varsta) {
        this.varsta = varsta;
    }

    public abstract int comparaCu(Copac c);

    public abstract void afiseaza();

    public int getVarsta() {
        return varsta;
    }
}
