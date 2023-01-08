package Lab5.ex9;

public class FinalClass {
    static final int f1 = 10;
    final int f2 = 12;

    public static void main(String[] args) {
        FinalClass fc = new FinalClass();
        fc.f1 = 11;
        fc.f2 = 12;
    }
}
