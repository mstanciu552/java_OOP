package Lab6.ex6;

abstract class Ex6 {
    Ex6() {
        System.out.println("Ex6 creat");
    }

    public void test() {
        System.out.println("Metoda din clasa abstracta");
    }

    public static void main(String[] args) {
        Derivata d = new Derivata();
    }
}

class Derivata extends Ex6 {
    Derivata() {
        System.out.println("Derivata creata");
    }

}
