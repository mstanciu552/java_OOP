import java.util.Random;

import poo.util.ListaDeInteger;

public class TesteListaDeInteger {
    static int retRandInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min) + min;
    }

    public static void main(String[] args) {

        int maxLen = Integer.parseInt(args[0]);
        int minVal = Integer.parseInt(args[1]);
        int maxVal = Integer.parseInt(args[2]);
        ListaDeInteger lista = new ListaDeInteger(maxLen);
        lista.afisareElemente();
        lista.adaugareElement(0);
        for (int i = 0; i < 7; i++) {
            lista.adaugareElement(retRandInt(minVal, maxVal));
        }
        lista.afisareElemente();
        for (int i = 0; i < 3; i++) {
            lista.adaugareElement(retRandInt(minVal, maxVal));
        }
        lista.afisareElemente();

        for (int i = 0; i < 3; i++)
            lista.stergereElement();
        lista.afisareElemente();

        for (int i = 0; i < 8; i++)
            lista.stergereElement();
        lista.afisareElemente();

        for (int i = 0; i < 7; i++) {
            lista.adaugareElement(retRandInt(minVal, maxVal));
        }
        lista.afisareElemente();

        lista.sortare();
        lista.afisareElemente();
    }
}
