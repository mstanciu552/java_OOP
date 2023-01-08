//: muzica5:Muzica5.java
package muzica5;

import java.util.*;
import muzica.NotaMuzicala;

interface Instrument {
  int i = 5; // automat public static final

  String info(); // automat publica
}

interface ICantabil {
  public void canta(NotaMuzicala n);
}

class Chitara implements Instrument, ICantabil {
  public void canta(NotaMuzicala n) {
    System.out.println("Chitara.canta() " + n);
  }

  public String info() {
    return "Chitara";
  }
}

class Vioara implements Instrument, ICantabil {
  public void canta(NotaMuzicala n) {
    System.out.println("Vioara.canta() " + n);
  }

  public String info() {
    return "Vioara";
  }
}

class Saxofon implements Instrument, ICantabil {
  public void canta(NotaMuzicala n) {
    System.out.println("Saxofon.canta() " + n);
  }

  public String info() {
    return "Saxofon";
  }
}

class ChitaraBas extends Chitara {
  public void canta(NotaMuzicala n) {
    System.out.println("ChitaraBas.canta() " + n);
  }
}

class ChitaraAcustica extends Chitara {
  public void canta(NotaMuzicala n) {
    System.out.println("ChitaraAcustica.canta() " + n);
  }

  public String info() {
    return "ChitaraAcustica";
  }
}

public class Muzica5 {
  // metoda ramane la fel chiar daca acum Instrument este interfata
  static void regleaza(ICantabil i) {
    i.canta(NotaMuzicala.DO);
  }

  static void regleazaToateInstrumentele(ICantabil[] e) {
    for (int i = 0; i < e.length; i++)
      regleaza(e[i]);
  }

  public static void main(String[] args) {
    ICantabil[] orchestra = { new Chitara(), new Vioara(), new Saxofon(),
        new ChitaraBas(), new ChitaraAcustica() };
    regleazaToateInstrumentele(orchestra);
  }
} /// :~
