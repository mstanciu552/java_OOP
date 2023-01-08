//: muzica4:Muzica4.java
package muzica4;
import java.util.*;
import muzica.NotaMuzicala;

abstract class Instrument {
  private int i; 
  public abstract void canta(NotaMuzicala n);
  public String info() { return "Instrument"; }
}
class Chitara extends Instrument {
  public void canta(NotaMuzicala n) { System.out.println("Chitara.canta() " + n); }
  public String info() { return "Chitara"; }
}
class Vioara extends Instrument {
  public void canta(NotaMuzicala n) { System.out.println("Vioara.canta() " + n); }
  public String info() { return "Vioara"; }
}
class Saxofon extends Instrument {
  public void canta(NotaMuzicala n) { System.out.println("Saxofon.canta() " + n); }
  public String info() { return "Saxofon"; }
}

class ChitaraBas extends Chitara {
  public void canta(NotaMuzicala n) { System.out.println("ChitaraBas.canta() " + n); }
}

class ChitaraAcustica extends Chitara {
  public void canta(NotaMuzicala n) { System.out.println("ChitaraAcustica.canta() " + n); }
  public String info() { return "ChitaraAcustica"; }
}

public class Muzica4 {
  // metoda ramane la fel chiar daca acum Instrument este clasa abstracta
  static void regleaza(Instrument i) { i.canta(NotaMuzicala.DO); }

  static void regleazaToateInstrumentele(Instrument[] e) {
    for(int i = 0; i < e.length; i++)
      regleaza(e[i]);
  }

  public static void main(String[] args) {
    Instrument[] orchestra = { new Chitara(), new Vioara(), new Saxofon(),
      new ChitaraBas(), new ChitaraAcustica() };
    regleazaToateInstrumentele(orchestra);
  }
} ///:~
