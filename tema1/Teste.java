package tema1;

import java.util.Random;

import tema1.poo.test1.util.StivaDeComparabile;

public class Teste {
    public static void main(String[] args) {
        Random rand = new Random();
        int len;
        try {
            len = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("[!] Inputul de la consola trebuie sa fie de tip int.");
            return;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("[!] Input de la consola este necesar.");
            return;
        }
        StivaDeComparabile stiva = new StivaDeComparabile(len);
        stiva.afisareElemente();

        int i = 0;
        while (i < 1) {
            stiva.adaugaElemente(new Student("Stud_ELTH_" + i, rand.nextInt(200)));
            i++;
        }
        stiva.afisareElemente();

        i = 0;
        while (i < 2) {
            stiva.eliminareElement();
            i++;
        }
        stiva.afisareElemente();

        i = 0;
        while (i < 4) {
            stiva.eliminareElement();
            i++;
        }
        stiva.afisareElemente();

        i = 0;
        while (i < 5) {
            stiva.adaugaElemente(new Student("Stud_ELTH_" + i, rand.nextInt(200)));
            i++;
        }
        stiva.afisareElemente();

        stiva.sortareElemente();
        stiva.afisareElemente();
    }
}
