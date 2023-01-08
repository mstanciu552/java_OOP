package tema2.poo.test2;

import java.util.Random;

import tema2.poo.test2.formal.Copac;
import tema2.poo.test2.formal.Frunza;

public class Brad extends Copac {
    private static final Random rand = new Random();
    private String tulpina;
    private int inaltimeCoroana;
    private Frunza[] coroana;

    public Frunza[] getCoroana() {
        return coroana;
    }

    public Brad(int inaltimeCoroana, int varsta) {
        super(varsta);
        this.inaltimeCoroana = inaltimeCoroana;

        tulpina = "\n";
        for (int i = 0; i < inaltimeCoroana - 1; i++)
            tulpina += " ";
        tulpina += "X";

        tulpina = tulpina + tulpina + tulpina;

        int numarFrunze = 0;
        for (int i = inaltimeCoroana * 2 - 1; i >= 0; i -= 2)
            numarFrunze += i;

        coroana = new Frunza[numarFrunze];
        for (int i = 0; i < coroana.length; i++)
            coroana[i] = genereazaFrunza();
    }

    private Frunza genereazaFrunza() {
        switch (rand.nextInt(4)) {
            default:
                return new Frunza('@');
            case 0:
                return new Frunza('*');
            case 1:
                return new Frunza('$');
            case 2:
                return new Frunza('#');
        }
    }

    @Override
    public void afiseaza() {
        int c = 0;
        for (int i = 0; i < inaltimeCoroana + 1; i++) {
            for (int j = inaltimeCoroana; j > i; j--)
                System.out.print(" ");
            for (int k = 0; k < (2 * i - 1); k++)
                System.out.print(coroana[c++].getForma());
            if (i != inaltimeCoroana)
                System.out.println();
        }
        System.out.println(tulpina);
    }

    @Override
    public int comparaCu(Copac c) {
        Brad b = (Brad) c;
        return coroana.length - b.getCoroana().length;
    }

    @Override
    public String toString() {
        return "Brad{\n\tinaltimeCoroana: " + inaltimeCoroana + ",\n\tvarsta: " + getVarsta() + "\n\tnumarFrunze: "
                + coroana.length + "\n}";
    }

}
