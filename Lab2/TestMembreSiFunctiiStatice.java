import java.util.Random;

public class TestMembreSiFunctiiStatice {
    static boolean compare(String str1, String str2) {
        return str1.compareTo(str2) == 0;
    }

    public static void main(String[] args) {
        System.out.println("Exercitiul 1:");
        String str1 = new String("true");
        String str2 = new String("true");
        System.out.println(compare(str1, str2));

        Random rand = new Random();

        System.out.println("Exercitiul 2:");
        for (int i = 1; i <= 25; i++) {
            int rand1 = rand.nextInt(i);
            int rand2 = rand.nextInt(i);

            if (rand1 < rand2) {
                System.out.println(rand1 + " este mai mic decat " + rand2);
            } else if (rand1 == rand2) {
                System.out.println(rand1 + " este egal cu " + rand2);
            } else {
                System.out.println(rand1 + " este mai mare decat " + rand2);
            }
        }

        System.out.println("Exercitiul 3:");
        int i = 1;
        while (i <= 25) {
            int rand1 = rand.nextInt(i);
            int rand2 = rand.nextInt(i);

            if (rand1 < rand2) {
                System.out.println(rand1 + " este mai mic decat " + rand2);
            } else if (rand1 == rand2) {
                System.out.println(rand1 + " este egal cu " + rand2);
            } else {
                System.out.println(rand1 + " este mai mare decat " + rand2);
            }
            i++;
        }

        System.out.println("Exercitiul 4:");
        boolean prim;
        for (i = 1; i <= 100; i++) {
            prim = true;
            for (int j = 2; j <= i / 2; j++)
                if (i % j == 0)
                    prim = false;
            if (prim)
                System.out.println(i);
        }

        System.out.println("Exercitiul 5:");
        for (i = 0; i <= 4; i++) {
            switch (i) {
                case 0:
                    System.out.println("Cazul i == 0");
                    break;
                case 1:
                    System.out.println("Cazul i == 1");
                    break;
                case 2:
                    System.out.println("Cazul i == 2");
                    break;
                case 3:
                    System.out.println("Cazul i == 3");
                    break;
                default:
                    System.out.println("Numarul nu este 0, 1, 2 sau 3");
                    break;
            }
        }

    }
}