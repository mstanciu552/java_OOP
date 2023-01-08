
//: FormeGrafice.java
import java.util.*;

class FormaGrafica {
  void deseneaza() {
  }

  void sterge() {
  }

  void mareste(double factor) {
    System.out.println("Dimensiunile marimii au fost multiplicate de " + factor + " ori");
  }
}

class Cerc extends FormaGrafica {
  void deseneaza() {
    System.out.println("Cerc.deseneaza()");
  }

  void sterge() {
    System.out.println("Cerc.sterge()");
  }
}

class Patrat extends FormaGrafica {
  void deseneaza() {
    System.out.println("Patrat.deseneaza()");
  }

  void sterge() {
    System.out.println("Patrat.sterge()");
  }

  @Override
  void mareste(double factor) {
    System.out.println("Laturile patratului sunt inmultite cu " + factor);
  }
}

class Triunghi extends FormaGrafica {
  void deseneaza() {
    System.out.println("Triunghi.deseneaza()");
  }

  void sterge() {
    System.out.println("Triunghi.sterge()");
  }
}

class Dreptunghi extends FormaGrafica {
  void deseneaza() {
    System.out.println("Dreptunghi.deseneaza()");
  }

  void sterge() {
    System.out.println("Dreptunghi.sterge()");
  }
}

// "fabrica" de forme grafice generate aleator
class GeneratorAleatorDeFormeGrafice {
  private Random alt = new Random();

  public FormaGrafica genereazaForma() {
    switch (alt.nextInt(3)) {
      default:
      case 0:
        return new Cerc();
      case 1:
        return new Patrat();
      case 2:
        return new Triunghi();
    }
  }
}

public class FormeGrafice {
  private static GeneratorAleatorDeFormeGrafice g = new GeneratorAleatorDeFormeGrafice();

  public static void main(String[] args) {
    FormaGrafica[] s = new FormaGrafica[9];
    for (int i = 0; i < s.length; i++)
      s[i] = g.genereazaForma(); // Umplere vector de forme grafice
    for (int i = 0; i < s.length; i++)
      s[i].deseneaza(); // Polimorfism � apelare metode
  }
} /// :~
