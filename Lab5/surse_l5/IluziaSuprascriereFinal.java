//: IluziaSuprascriereFinal.java
// Suprascrierea unei metode private (final private) e aparenta
class CuFinal {
  // private este IDENTIC cu private final
  private final void f() {
    System.out.println("CuFinal.f()");
  }
  // private inseamna automat si final
  private void g() {
    System.out.println("CuFinal.g()");
  }
}

class SuprascriereFinal extends CuFinal {
  private final void f() {
    System.out.println("SuprascriereFinal.f()");
  }
  private void g() {
    System.out.println("SuprascriereFinal.g()");
  }
}

class SuprascriereFinal2 extends SuprascriereFinal {
  public final void f() {
    System.out.println("SuprascriereFinal2.f()");
  }
  public void g() {
    System.out.println("SuprascriereFinal2.g()");
  }
}

public class IluziaSuprascriereFinal {
  public static void main(String[] args) {
    SuprascriereFinal2 op2 = new SuprascriereFinal2();
    op2.f();
    op2.g();
    // upcast posibil
    SuprascriereFinal op = op2;
    // Metodele nu pot fi apelate – sunt private
    //! op.f();
    //! op.g();
    CuFinal wf = op2;    // La fel si aici (ca mai sus)
    //! wf.f();
    //! wf.g();
  }
} ///:~
