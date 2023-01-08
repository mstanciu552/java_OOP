package tema1.poo.test1;

import java.util.Random;

public class Comparabil {
    public int comparaCu(Comparabil c) {
        System.out.println("\t\t[#] Comparare Random");
        return new Random().nextInt(3) - 1;
    }
}
