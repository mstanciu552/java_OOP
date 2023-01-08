package Lab8;

import Lab8.ex8.A;
import Lab8.ex8.B;
import Lab8.ex8.ED1;

public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception("Exceptie aruncata");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Block finally apelat.");
        }

        try {
            throw new Ex2Exception("Exceptie Ex2 aruncata.");
        } catch (Ex2Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            Ex3.metoda();
        } catch (Ex2Exception e) {
            System.out.println(e.getMessage());
        }

        Ex5 ex5 = new Ex5();
        try {
            ex5.f();
        } catch (E2 e) {
            System.out.println("Exceptie E2");
        }

        try {
            throw new RuntimeException();
            ex5.h();
        } catch (Exception e) {
            System.out.println("Orice exceptie prinsa.");
        } finally {
            System.out.println("Executat finally ex5");
        }

        int[] ex7 = new int[10];
        try {
            ex7[11] = 7;
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }

        A a = new B();
        try {
            a.metoda();
        } catch (ED1 e) {
            System.out.println(e.getMessage());
        }
    }
}
