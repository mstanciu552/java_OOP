
//: muzica:Muzica.java
package muzica;

public class Muzica {
  public static void regleaza(Instrument i) {
    // ...
    i.canta(NotaMuzicala.DO);
  }
  public static void main(String[] args) {
    Chitara ch = new Chitara();
    regleaza(ch); // Upcasting – tipul este aflat la EXECUTIE
  }
} ///:~
