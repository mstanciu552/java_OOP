//: TestFinal.java
import java.util.*;

class Numar {
  int i; // acces package
  public Numar(int i) { this.i = i; }
}

public class TestFinal {
  private static Random rand = new Random();
  private String id;
  public TestFinal(String id) {this.id = id;}
  // constante compile-time
  private final int VAL_UNU = 9;
  private static final int VAL_DOI = 99;
  // constante tipice – public 
  public static final int VAL_TREI = 39;
  // nu constante compile-time
  private final int i4 = rand.nextInt(20);
  static final int i5 = rand.nextInt(20);
  private Numar v1 = new Numar(11);
  private final Numar v2 = new Numar(22);
  private static final Numar v3 = new Numar(33);
  // vectori
  private final int[] a = { 1, 2, 3, 4};
  public String toString() {
    return id + ": " + "i4 = " + i4 + ", i5 = " + i5;
  }
  public static void main(String[] args) {
    TestFinal fd1 = new TestFinal("fd1");
    //! fd1.VAL_UNU++; // Eroare
    fd1.v2.i++; // i nu e constant (final)!
    fd1.v1 = new Numar(9); // OK – nu e final
    for(int i = 0; i < fd1.a.length; i++)
      fd1.a[i]++; // adresa e final – nu si valoarea
    //! fd1.v2 = new Numar(0); // Eroare
    //! fd1.v3 = new Numar(1); // cnu pot realoca (sunt final)
    //! fd1.a = new int[3];
    System.out.println(fd1);
    System.out.println("Creare new TestFinal");
    TestFinal fd2 = new TestFinal("fd2");
    System.out.println(fd1);
    System.out.println(fd2);
  }
} ///:~
