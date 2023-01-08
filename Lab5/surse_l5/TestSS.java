//: TestSS.java
// suprascrierea unei metode in clasa derivata nu ascunde versiunile din clasa de baza
class ClasaDeBaza {
  void doh(char c) {
    System.out.println("doh(char)" + c);
  }
  float doh(float f) {
    System.out.println("doh(float)");
    return 1.0f;
  }
}
class ClasaDerivata extends ClasaDeBaza {
  void doh(Integer i) {
    System.out.println("doh(Integer) " + i);
  }
}
public class TestSS {
  public static void main(String[] args) {
    ClasaDerivata b = new ClasaDerivata();
    b.doh(1);
    b.doh('x');
    b.doh(new Integer (10));
  }
} ///:~
