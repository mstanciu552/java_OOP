package lab9;

public class TesteListaDeNumere {
    public static void main(String[] args) {
        ListaDeNumere<Integer> lista = new ListaDeNumere<>(Integer.class, 10);

        lista.adauga(1);
        lista.adauga(2);
        lista.adauga(3);
        lista.adauga(4);

        System.out.println(lista);

        lista.sterge();
        System.out.println(lista);

    }
}
