//: SistemDeCurgere.java
class SursaDeApa {
  private String s;
  SursaDeApa() {
    s = new String("Construit sursa de apa!");
  }
  public String toString() { return s; }
}
public class SistemDeCurgere {
  private String valva1, valva2;
  private SursaDeApa sursa;
  private int i;
  public String toString() {
    return  "valva1 = " + valva1 + "\n" + "valva2 = " + valva2 + "\n" +
      "i = " + i + "\n" + "sursa = " + sursa;
  }
  public static void main(String[] args) {
    SistemDeCurgere sistem = new SistemDeCurgere();
    System.out.println(sistem);
  }
} ///:~
