public class Exercitiul6 {
    String str;
    int init;

    Exercitiul6() {
        init = 0;
        str = null;
    }

    Exercitiul6(String str) {
        this();
        this.str = str;
    }

    void prima() {
        System.out.println("Prima metoda a fost apelata.");
        // a_doua();
        this.a_doua();
    }

    void a_doua() {
        System.out.println("A doua metoda a fost apelata.");
    }
}
