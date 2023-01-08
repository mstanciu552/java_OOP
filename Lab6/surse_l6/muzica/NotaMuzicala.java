//: muzica:NotaMuzicala.java
package muzica;

public class NotaMuzicala {
  private String denumire;
  private NotaMuzicala(String denumire) {
    this.denumire = denumire;
  }
  public String toString() { return denumire; }
  public static final NotaMuzicala
    DO = new NotaMuzicala("Nota DO"),
    RE = new NotaMuzicala("Nota RE");
    // Etc.
} ///:~
