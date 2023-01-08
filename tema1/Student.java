package tema1;

import tema1.poo.test1.Comparabil;

public class Student extends Comparabil {
    private String nume;
    private int prezente;

    public Student(String nume, int prezente) {
        this.nume = nume;
        this.prezente = prezente;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getPrezente() {
        return prezente;
    }

    public void setPrezente(int prezente) {
        this.prezente = prezente;
    }

    @Override
    public int comparaCu(Comparabil c) {
        Student s = (Student) c;
        if (this.getPrezente() < s.getPrezente())
            return -1;
        else if (this.getPrezente() == s.getPrezente())
            return 0;
        else
            return 1;
    }

    @Override
    public String toString() {
        return "Student{nume: " + this.nume + ", prezente: " + this.prezente + "}";
    }

}
