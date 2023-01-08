//: BlankFinal.java
// Datele membre Blank final TREBUIE initializate pe constructor
class Marioneta {
  private int i;
  Marioneta(int ii) { i = ii; }
}

public class BlankFinal {
  private final int i = 0; // final initializat
  private final int j; // Primitiva blank final
  private static final Marioneta p; // Obiect blank final -- static nu poate fi blank
  public BlankFinal() {
    j = 1; // Initializare primitiva blank final
    //p = new Marioneta(1); // Initializare obiect blank final (alocare)
  }
  public BlankFinal(int x) {
    j = x; // Initializare primitiva blank final
    //p = new Marioneta(x); // // Initializare obiect blank final (alocare)
  }
  public static void main(String[] args) {
    new BlankFinal();
    new BlankFinal(47);
  }
} ///:~
