//: Aventura.java

interface ILuptator {
  void lupta();
}

interface IAlergator {
  void alearga();
}

interface IZburator {
  void zboara();
}

interface ICatarator {
  void escaladeaza();
}

class PersonajDeActiune {
  public void lupta() {
  }
}

class Erou extends PersonajDeActiune implements ILuptator, IAlergator, IZburator, ICatarator, PersonajCuSarm {

  public void alearga() {
  }

  public void zboara() {
  }

  public void escaladeaza() {

  }
}

class PersonajCuSarm {
  public void comunica() {
  }
}

public class Aventura {
  public static void t(ILuptator x) {
    x.lupta();
  }

  public static void u(IAlergator x) {
    x.alearga();
  }

  public static void v(IZburator x) {
    x.zboara();
  }

  public static void w(PersonajDeActiune x) {
    x.lupta();
  }

  public static void x(ICatarator x) {
    x.escaladeaza();
  }

  public static void main(String[] args) {
    Erou e = new Erou();
    t(e); // e tratat ca ILuptator
    u(e); // e tratat ca IAlergator
    v(e); // e tratat ca IZburator
    w(e); // e tratat ca PersonajDeActiune
    x(e); // e tratat ca ICatarator
  }
} /// :~
