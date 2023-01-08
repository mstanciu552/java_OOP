public class Main {
    public static void main(String[] args) {
        // Ex 1
        System.out.println("Exercitiul 1: ");
        Exercitiul1 ex1 = new Exercitiul1();
        System.out.println();
        // Ex 2
        System.out.println("Exercitiul 2: ");
        Exercitiul1 ex2 = new Exercitiul1("Mesaj dat ca parametru.");
        System.out.println();
        // Ex 3
        System.out.println("Exercitiul 3: ");
        Exercitiul1[] arr = new Exercitiul1[10];
        for (Exercitiul1 ex : arr) {
            System.out.println(ex); // Afisat null
        }
        System.out.println();
        // Ex4
        System.out.println("Exercitiul 4: ");
        for (Exercitiul1 ex : arr) {
            ex = new Exercitiul1();
            System.out.println(ex);
        }
        System.out.println();

        // Ex 5
        System.out.println("Exercitiul 5: ");
        String[] str_arr = { "Testing", "String", "Vector" };
        int i = 0;
        while (i < str_arr.length) {
            System.out.println(str_arr[i++]);
        }
        System.out.println();

        // Ex 6
        Exercitiul6 ex6 = new Exercitiul6("string1");
        ex6.prima();

        // Ex 8
        Exercitiul8 ex8 = new Exercitiul8();
        System.out.println("Integer: " + ex8.init_int);
        System.out.println("Char: " + ex8.init_char);
        System.out.println("String: " + ex8.init_str);

        // Ex 9

    }
}
