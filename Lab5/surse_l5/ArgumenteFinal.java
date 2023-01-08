//: ArgumenteFinal.java
// argumentele final nu pot fi modificate in cadrul functiei respective

class Elice {
  public void roteste() {}
}

public class ArgumenteFinal {
  void cu(final Elice g) {
    //! g = new Elice(); // Ilegal -- g este final
  }
  void fara(Elice g) {
    g = new Elice(); // OK -- g nu e final
    g.roteste();
  }
  // void f(final int i) { i++; } // Nu poate fi modificat; poate fi doar citit 
  int g(final int i) { return i + 1; } // se modifica in noua variabila returnata nu in i
  public static void main(String[] args) {
    ArgumenteFinal bf = new ArgumenteFinal();
    bf.fara(null);
    bf.cu(null);
  }
} ///:~
