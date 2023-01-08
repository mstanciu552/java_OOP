package lab9;

public class ListaDeNumere<T extends Number> {
    private T[] elemente;
    public int curent;

    public ListaDeNumere(Class<T> _classType, int len) {
        elemente = (T[]) java.lang.reflect.Array.newInstance(_classType, len);
        curent = 0;
    }

    @Override
    public String toString() {
        String res = "";
        if (elemente.length > 0)
            for (T el : elemente) {
                if (el != null)
                    res += " " + el;
            }
        else
            res = "Lista este goala";

        return res;
    }

    public void adauga(T element) {
        if (curent + 1 >= elemente.length)
            throw new RuntimeException("Lista este plina");
        System.out.println("Elementul de pe pozitia " + curent + " este " + element);
        elemente[curent++] = element;
    }

    public void sterge() {
        if (curent == 0)
            throw new RuntimeException("Lista este goala");
        System.out.println("Element " + elemente[curent - 1] + " sters");
        elemente[curent - 1] = null;
        curent--;
    }

}