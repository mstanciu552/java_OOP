package poo.util;

public class ListaDeInt {
    int[] elemente;
    int numarCurentDeElemente;
    int maxLength;

    public ListaDeInt(int len) {
        elemente = new int[len];
        numarCurentDeElemente = 0;
        maxLength = len;
    }

    public void afisareElemente() {
        if (elemente.length > 0) {
            for (int i = 0; i < numarCurentDeElemente; i++) {
                System.out.printf("%d ", elemente[i]);
            }
        } else {
            System.out.println("Lista este goala");
        }
    }

    public void adaugareElement(int element) {
        if (numarCurentDeElemente + 1 >= elemente.length) {
            System.out.println("Lista nu mai are spatiu");
        } else {
            System.out.println("Elementul " + element + " a fost adaugat pe pozitia " + numarCurentDeElemente);
            elemente[numarCurentDeElemente++] = element;
        }
    }

    public void stergereElement() {
        if (numarCurentDeElemente == 0) {
            System.out.println("Nu sunt elemente in lista.");
        } else {
            System.out.println("Elementul de pe pozitia " + numarCurentDeElemente + " a fost sters.");
            elemente[numarCurentDeElemente--] = 0;
        }
    }

    public void sortare() {
        for (int i = 0; i < numarCurentDeElemente - 1; i++)
            for (int j = 0; j < numarCurentDeElemente - i - 1; j++)
                if (elemente[j] > elemente[j + 1]) {
                    // swap elemente[j+1] and elemente[j]
                    int temp = elemente[j];
                    elemente[j] = elemente[j + 1];
                    elemente[j + 1] = temp;
                }
    }
}