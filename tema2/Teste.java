package tema2;

import java.util.Random;

import tema2.poo.test2.Brad;
import tema2.poo.test2.formal.Copac;

public class Teste {
    public static void main(String[] args) {
        final Random rand = new Random();
        Copac[] vectorDeCopaci = new Copac[6];
        System.out.println("Test");

        int i = 0;
        while (i < 6) {
            vectorDeCopaci[i] = new Brad(rand.nextInt(8) + 2, rand.nextInt(199) + 1);
            System.out.println(i + " -> " + vectorDeCopaci[i]);
            i++;
        }

        // Maxim de frunze
        Copac max = vectorDeCopaci[0];
        Copac max2 = vectorDeCopaci[0];
        int max_index = 0;
        for (i = 1; i < vectorDeCopaci.length; i++)
            if (vectorDeCopaci[i].comparaCu(max) > 0) {
                max2 = max;
                max = vectorDeCopaci[i];
                max_index = i;
            } else if (vectorDeCopaci[i].comparaCu(max2) > 0)
                max2 = vectorDeCopaci[i];
        max.afiseaza();

        System.out.println("Diferenta dintre cei mai bogati copaci: " + max.comparaCu(max2));

        System.out.println(max_index + " -> " + max);

    }
}
