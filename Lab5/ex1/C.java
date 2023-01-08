package Lab5.ex1;

public class C extends A {
    B b;

    public C(String str, int i) {
        super(str);
        b = new B(i);
    }
}
