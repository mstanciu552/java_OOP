package tema3.poo.tema3;

public class Student implements Comparable {
    private String nume, prenume;
    private int prezenta;

    public Student(String nume, String prenume, int prezenta) {
        this.nume = nume;
        this.prenume = prenume;
        this.prezenta = prezenta;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrezenta(int prezenta) {
        this.prezenta = prezenta;
    }

    public int getPrezenta() {
        return prezenta;
    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;
        if (s.getPrezenta() == prezenta)
            return 0;
        else if (s.getPrezenta() < prezenta)
            return 1;
        else
            return -1;
    }

    @Override
    public String toString() {
        return "Student{nume: " + nume + ", prenume: " + prenume + ", prezenta: " + prezenta + "}";
    }

}
