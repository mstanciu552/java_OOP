//:Baie.java
class Sapun {
  private String s;
  Sapun() {
    System.out.println("Sapun()");
    s = new String("Sapun construit!");
  }
  public String toString() { return s; }
}

public class Baie {
  // Initializare la definire
  private String 
    s1 = new String("Happy"),
    s2 = "Happy";
  private String s3, s4;
  private Sapun sapun;
  private int i;
  public Baie() {
    System.out.println("In Baie()");
    s3 = new String("Bucurie");
    i = 47;
    sapun = new Sapun(); //pe constructor
  }
  public String toString() {
    //initializare inainte de utilizare
    if(s4 == null) 
      s4 = new String("Joy");
    return
      "s1 = " + s1 + "\n" +
      "s2 = " + s2 + "\n" +
      "s3 = " + s3 + "\n" +
      "s4 = " + s4 + "\n" +
      "i = " + i + "\n" +
      "sapun = " + sapun;
  }
  public static void main(String[] args) {
    Baie b = new Baie();
    System.out.println(b);
  }
} ///:~
