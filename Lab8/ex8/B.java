package Lab8.ex8;

public class B extends A {

    public B() {
        try {
            super();
        } catch (ED1 e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void metoda() throws ED1 {
        throw new ED2();
    }

}
