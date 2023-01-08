//: muzica:Muzica2.java
// Supraincarcare in loc de upcasting.
package muzica;

class Vioara extends Instrument {
  public void canta(NotaMuzicala n) { System.out.println("Vioara.canta() " + n); }
}
class Saxofon extends Instrument {
  public void canta(NotaMuzicala n) { System.out.println("Saxofon.canta() " + n); }
}

public class Muzica2 {
  public static void regleaza(Chitara i) { i.canta(NotaMuzicala.DO); }
  public static void regleaza(Vioara i) { i.canta(NotaMuzicala.DO); }
  public static void regleaza(Saxofon i) { i.canta(NotaMuzicala.DO); }
  public static void main(String[] args) {
    Chitara ch = new Chitara();
    Vioara vi = new Vioara();
    Saxofon sx = new Saxofon();
    regleaza(ch); // NU se face upcasting
    regleaza(vi);
    regleaza(sx);
  }
} ///:~
