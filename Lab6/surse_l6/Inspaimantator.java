//: Inspaimantator.java
interface IMonstru {
  void distruge();
}
interface IMonstruPericulos extends IMonstru{
  void ucide();
}
class Godzilla implements IMonstruPericulos{
  public void ucide() {}
  public void distruge() {}
}

public class Inspaimantator {
  static void u(IMonstru b) { b.distruge(); }
  static void v(IMonstruPericulos d) {
    d.ucide();
    d.distruge();
  }
  public static void main(String[] args) {
    IMonstruPericulos gz = new Godzilla();
    u(gz);
    v(gz);
  }
} ///:~
