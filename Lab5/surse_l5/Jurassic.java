//: Jurassic.java

class CreierMic {}

final class Dinozaur {
  int i = 7;
  int j = 1;
  CreierMic x = new CreierMic();
  void f() {}
}

//! class VelocyRaptor extends Dinozaur {}
// eroare: NU pot extinde clasa finala 'Dinozaur'

public class Jurassic {
  public static void main(String[] args) {
    Dinozaur n = new Dinozaur();
    n.f();
    n.i = 40;
    n.j++;
  }
} ///:~
