package tema1.poo.test1.util;

import tema1.poo.test1.Comparabil;

public class StivaDeComparabile {
    private Comparabil[] stiva;
    private int max_len;
    private int curent;

    public StivaDeComparabile(int max_len) {
        this.max_len = max_len;
        this.stiva = new Comparabil[max_len];
        this.curent = 0;
    }

    private boolean stivaGoala() {
        for (int i = 0; i < this.stiva.length; i++)
            if (this.stiva[i] != null)
                return false;
        return true;
    }

    public void afisareElemente() {
        if (this.stivaGoala()) {
            System.out.println("[!] Stiva este goala. [" + curent + "]");
        } else {
            System.out.println("[*] Stiva: ");
            for (int i = curent - 1; i >= 0; i--) {
                System.out.println("\t[" + i + "]  " + stiva[i]);
            }
            System.out.println();
        }
    }

    public void adaugaElemente(Comparabil c) {
        if (curent >= this.max_len) {
            System.out.println("[!] Stiva este plina.");
            System.out.println("[*] Dimensiunea stivei creste.");
            Comparabil[] temp = new Comparabil[curent + 1];
            System.arraycopy(stiva, 0, temp, 0, this.max_len); // copiem stiva initiala in stiva noua(goala)
            stiva = temp;
        }
        stiva[curent++] = c;
        System.out.println("[*] Elementul " + c + " a fost adaugat la stiva pe pozitia " + (curent - 1));
    }

    public Comparabil eliminareElement() {
        if (this.stivaGoala()) {
            System.out.println("[!] Stiva este deja goala");
            return null;
        }
        Comparabil varf = stiva[curent - 1];

        stiva[curent - 1] = null;
        System.out.println("[*] Elementul de pe pozitia " + curent + " a fost eliminat");
        curent--;

        return varf;
    }

    public void sortareElemente() {
        if (this.stivaGoala()) {
            System.out.println("[!] Stiva nu poate fi sortata, pentru ca este goala.");
            return;
        }
        for (int i = 0; i < curent - 1; i++) {
            for (int j = 0; j < curent - i - 1; j++) {
                int rezultat_comparare = this.stiva[j].comparaCu(this.stiva[j + 1]);
                System.out.println(
                        "\t[!] Comparare " + this.stiva[j] + " cu " + this.stiva[j + 1] + " [" + rezultat_comparare
                                + "]");
                if (rezultat_comparare == 1) {
                    System.out.println("\t[*] Elementul de pe pozitia " + j + " -> " + this.stiva[j]
                            + " a fost interschimbat cu elementul de pe pozitia " + (j + 1) + " -> "
                            + this.stiva[j + 1] + " [" + rezultat_comparare + "]");
                    Comparabil temp = this.stiva[j];
                    this.stiva[j] = this.stiva[j + 1];
                    this.stiva[j + 1] = temp;
                }
            }
        }
        System.out.println("[*] Stiva a fost sortata.");
    }

}
