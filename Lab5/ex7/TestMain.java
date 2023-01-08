package Lab5.ex7;

public class TestMain {
    public static void main(String[] args) {
        Tigru tigru = new Tigru();
        Impala impala = new Impala();
        MamiferIerbivor ierbivor = impala;

        tigru.ataca(impala);
        tigru.ataca(ierbivor);
    }
}
