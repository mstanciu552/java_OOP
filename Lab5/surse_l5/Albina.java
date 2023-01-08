//: c06:Albina.java
class Insecta {
  private int i = 9;
  protected int j;
  Insecta() {
    System.out.println("i = " + i + ", j = " + j);
    j = 39;
  }
  private static int x1 = print("static Insecta.x1 initializat");
  static int print(String s) {
    System.out.println(s);
    return 47;
  }
}

public class Albina extends Insecta {
  private int k = print("Albina.k initializat");
  public Albina() { System.out.println("k = " + k + " j = " + j); }
  private static int x2 = print("static Albina.x2 initializat");
  public static void main(String[] args) {
    System.out.println("Prima instructiune din main() inainte de Albina constructor");
    Albina b = new Albina();
  }
} ///:~
 
