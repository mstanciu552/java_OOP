//: DaciaLogan.java
class MijlocDeDeplasare {
  MijlocDeDeplasare () {
    System.out.println("MijlocDeDeplasare - constructor");
  }
}

class Masina extends MijlocDeDeplasare {
  Masina() {
    System.out.println("Masina - constructor");
  }
}

class DaciaLogan extends Masina {
  DaciaLogan(int viteza) {
    System.out.println("DaciaLogan - constructor - viteza " + viteza);
  }
  public static void main(String[] args) {
    DaciaLogan x = new DaciaLogan (160);
  }
} ///:~
 
