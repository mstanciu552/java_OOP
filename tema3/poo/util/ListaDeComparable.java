package tema3.poo.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import poo.util.exceptions.ListaGoalaException;
import poo.util.exceptions.ListaPlinaException;

public class ListaDeComparable<T extends Comparable> {
    private T[] elemente;
    private int curent;

    public ListaDeComparable(int len, Class<T> _classType) {
        elemente = (T[]) java.lang.reflect.Array.newInstance(_classType, len);
        curent = 0;
    }

    public void afisareElemente() throws ExceptieListaGoala {
        if (curent == 0)
            throw new ExceptieListaGoala("Lista este goala");
        for (T el : elemente)
            System.out.println(el);
    }

    @Override
    public String toString() {
        String res = "[\n";

        for (T el : elemente)
            if (el != null)
                res += "  " + el.toString() + ", \n";

        return res + "]";
    }

    public void adaugareElement(T t) throws ExceptieListaPlina {
        if (curent + 1 >= elemente.length)
            throw new ExceptieListaPlina("Lista este plina");
        System.out.println("Elementul " + t + "adaugat la pozitia " + curent);
        elemente[curent++] = t;
    }

    public T eliminareElement() throws ExceptieListaGoala {
        if (curent == 0)
            throw new ExceptieListaGoala("Lista este goala");
        T res = elemente[curent - 1];

        elemente[curent - 1] = null;
        curent--;

        return res;
    }

    public void sortareElemente() throws ExceptieListaGoala {
        if (curent == 0)
            throw new ExceptieListaGoala("Lista este goala");
        for (int i = 0; i < curent - 1; i++)
            for (int j = 0; j < curent - i - 1; j++)
                if (elemente[j].compareTo(elemente[j + 1]) > 0) {
                    // swap elemente[j+1] and elemente[j]
                    T temp = elemente[j];
                    elemente[j] = elemente[j + 1];
                    elemente[j + 1] = temp;
                }
    }

    public void salvareLista(String filepath) throws ExceptieListaGoala {
        if (curent == 0)
            throw new ExceptieListaGoala("Lista este goala");
        try {
            FileWriter file = new FileWriter(filepath);
            file.write(this.toString());
            file.close();
        } catch (IOException e) {
            System.out.println("Error writing to file " + filepath);
        }
    }
}
