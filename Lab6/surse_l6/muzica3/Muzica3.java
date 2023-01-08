//: muzica3:Muzica3.java
package muzica3;

import java.util.Random;

import muzica.*;

class ChitaraBas extends Chitara {
  public void canta(NotaMuzicala n) {
    System.out.println("ChitaraBas.canta() " + n);
  }

  @Override
  public String toString() {
    return "Instrument: ChitaraBas";
  }
}

class ChitaraAcustica extends Chitara {
  public void canta(NotaMuzicala n) {
    System.out.println("ChitaraAcustica.canta() " + n);
  }

  @Override
  public String toString() {
    return "Instrument: ChitaraAcustica";
  }
}

class Toba extends Instrument {
  public void canta(NotaMuzicala n) {
    System.out.println("Toba.canta() " + n);
  }
}

class GeneratorAleatorDeInstrumente {
  private Random alt = new Random();

  public Instrument genereazaInstrument() {
    switch (alt.nextInt(3)) {
      default:
      case 0:
        return new Toba();
      case 1:
        return new Chitara();
      case 2:
        return new ChitaraBas();
    }
  }
}

public class Muzica3 {

  private static final GeneratorAleatorDeInstrumente gen = new GeneratorAleatorDeInstrumente();

  // metoda identica cu cea veche -- nemodificata
  public static void regleaza(Instrument i) {
    i.canta(NotaMuzicala.DO);
  }

  public static void regleazaToateInstrumentele(Instrument[] e) {
    for (int i = 0; i < e.length; i++)
      regleaza(e[i]);
  }

  @Override
  public String toString() {
    return "Muzica3";
  }

  public static void main(String[] args) {

    // Upcasting during addition to the array:
    Instrument[] orchestra = new Instrument[3];
    for (int i = 0; i < 3; i++) {
      orchestra[i] = gen.genereazaInstrument();
    }
    regleazaToateInstrumentele(orchestra);
    for (Instrument instrument : orchestra) {
      System.out.println(instrument);
    }
  }
} /// :~
