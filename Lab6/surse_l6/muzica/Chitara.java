
//: muzica:Chitara.java
package muzica;

// Obiectele de tip Chitara subt instrumente
public class Chitara extends Instrument {
  public void canta(NotaMuzicala n) {  // suprascrie metoda
    System.out.println("Chitara.canta() " + n);
  }
} ///:~
