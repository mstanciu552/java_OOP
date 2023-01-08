//:Sah.java
class Joc {
  Joc(int i) {
    System.out.println("Joc constructor");
  }
  /*Joc() {
    System.out.println("Joc constructor fara parametru");
  }*/
}

class JocCuTabla extends Joc {
  JocCuTabla(int i) {
    //super(i);
    System.out.println("JocCuTabla constructor");
  }
}

public class Sah extends JocCuTabla {
  Sah() {
    super(11);
    System.out.println("Sah constructor");
  }
  public static void main(String[] args) {
    Sah x = new Sah();
  }
} ///:~
 
