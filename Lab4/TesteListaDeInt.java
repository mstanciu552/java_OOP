import java.util.Random;

import poo.util.ListaDeInt;

public class TesteListaDeInt {
    public static void main(String[] args) {
        int maxLen = Integer.parseInt(args[0]);
        Random rand = new Random();
        ListaDeInt lista = new ListaDeInt(maxLen);
        lista.afisareElemente();
        lista.adaugareElement(0);
        for (int i = 0; i < 7; i++) {
            lista.adaugareElement(rand.nextInt(200));
        }
        lista.afisareElemente();
        for (int i = 0; i < 3; i++) {
            lista.adaugareElement(rand.nextInt(200));
        }
        lista.afisareElemente();

        for (int i = 0; i < 3; i++)
            lista.stergereElement();
        lista.afisareElemente();

        for (int i = 0; i < 8; i++)
            lista.stergereElement();
        lista.afisareElemente();

        for (int i = 0; i < 7; i++) {
            lista.adaugareElement(rand.nextInt(200));
        }
        lista.afisareElemente();

        lista.sortare();
        lista.afisareElemente();
    }
}
