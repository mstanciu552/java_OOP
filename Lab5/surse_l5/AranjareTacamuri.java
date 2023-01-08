//: AranjareTacamuri.java
class Farfurie {
  Farfurie(int i) {System.out.println("Farfurie constructor");}
}

class FarfuriePentruCina extends Farfurie {
  FarfuriePentruCina (int i) {
    super(i);
    System.out.println("FarfuriePentruCinaconstructor");
  }
}
class Ustensil {
  Ustensil(int i) {System.out.println("Ustensil constructor");}
}
class Furculita extends Ustensil {
  Furculita(int i) {
    super(i);
    System.out.println("Furculita constructor");
  }
}
class Cutit extends Ustensil {
  Cutit(int i) {
    super(i);
    System.out.println("Cutit constructor");
  }
}
class Client {
  Client(int i) { System.out.println("Client constructor"); }
}
public class AranjareTacamuri extends Client {
  private Furculita frc;
  private Cutit ct;
  private FarfuriePentruCina fpc;
  public AranjareTacamuri (int i) {
    super(i + 1);
    frc = new Furculita(i + 2);
    ct = new Cutit(i + 3);
    fpc = new FarfuriePentruCina (i + 4);
    System.out.println("AranjareTacamuriconstructor");
  }
  public static void main(String[] args) {
    AranjareTacamuri x = new AranjareTacamuri (9);
  }
} ///:~
