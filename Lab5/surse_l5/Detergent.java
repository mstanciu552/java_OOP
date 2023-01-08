//: Detergent.java
class Curatator {
  protected String s = new String("Curatator");

  public void lipStr(String a) {
    s += a;
  }

  public void dilueaza() {
    lipStr(" dilueaza()");
  }

  public void aplica() {
    lipStr(" aplica()");
  }

  public String toString() {
    return s;
  }

  public static void main(String[] args) {
    Curatator x = new Curatator();
    x.dilueaza();
    x.aplica();
    System.out.println(x);
  }
}

public class Detergent extends Curatator {
  public void aplica() { // suprascriere
    lipStr(" Detergent.aplica ()");
    // Apelare aplica() al clasei de baza
    super.aplica();
    s = new String();
  }

  // Metoda noua:
  public void spuma() {
    lipStr(" spuma()");
  }

  public void dilueaza() {
    super.dilueaza();
    System.out.println("Metoda dilueaza suprascrisa");
  }

  // Test clasa derivata:
  public static void main(String[] args) {
    Detergent x = new Detergent();
    x.dilueaza();
    x.aplica();
    x.spuma();
    System.out.println(x);
    System.out.println("Test CRTT baza:");
    Curatator.main(args);
  }
} /// :~
