//: Chitara.java
// Mostenire & upcasting.

class Instrument {
  public void canta() {}
  static void regleaza(Instrument i) {
    // realizeaza modificari ...
    // incearca sa canti
    i.canta();
  }
}

// Chitara este un instrument
public class Chitara extends Instrument {
  public static void main(String[] args) {
    Chitara ch = new Chitara();
    Instrument.regleaza(ch); // Upcasting
  }
} ///:~
