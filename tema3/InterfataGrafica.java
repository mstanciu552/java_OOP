package tema3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import tema3.poo.tema3.Student;
import tema3.poo.util.ExceptieListaGoala;
import tema3.poo.util.ExceptieListaPlina;
import tema3.poo.util.ListaDeComparable;

public class InterfataGrafica extends JFrame {
    private JTextField textFieldNume = new JTextField("", 10);
    private JTextField textFieldPrenume = new JTextField("", 10);
    private JTextField textFieldPrezenta = new JTextField("", 10);

    private JButton bAdaugareElement = new JButton("Adauga Element");
    private JButton bStergereElemente = new JButton("Sterge Element");
    private JButton bSortareElemente = new JButton("Sortare Elemente");
    private JButton bSalvareLista = new JButton("Salvare");

    private JLabel lElemente = new JLabel("Elemente lista: ");
    private JLabel lErori = new JLabel("");

    private ListaDeComparable<Student> elemente;

    class AscultatorEvenimente implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String id = ((JButton) e.getSource()).getText();
            if (id.equals("Adauga Element")) {
                String nume = textFieldNume.getText();
                String prenume = textFieldPrenume.getText();
                int prezenta = Integer.parseInt(textFieldPrezenta.getText());

                Student element = new Student(nume, prenume, prezenta);

                try {
                    elemente.adaugareElement(element);
                    lElemente.setText(elemente.toString());
                } catch (ExceptieListaPlina ex) {
                    JOptionPane.showMessageDialog(InterfataGrafica.this, ex.getMessage(), "ListaPlinaException",
                            JOptionPane.INFORMATION_MESSAGE);
                    lErori.setText("ExceptieListaPlina");
                }
            } else if (id.equals("Sterge Element")) {
                try {
                    elemente.eliminareElement();
                    lElemente.setText(elemente.toString());
                } catch (ExceptieListaGoala ex) {
                    lErori.setText("ExceptieListaGoala");
                }
            } else if (id.equals("Sortare Elemente")) {
                try {
                    elemente.sortareElemente();
                    lElemente.setText(elemente.toString());
                } catch (ExceptieListaGoala ex) {
                    lErori.setText("ExceptieListaGoala");
                }
            } else if (id.equals("Salvare")) {
                try {
                    elemente.salvareLista("Studenti.txt");
                } catch (ExceptieListaGoala ex) {
                    lErori.setText("ExceptieListaGoala");
                }
            }
        }

    }

    AscultatorEvenimente aeb = new AscultatorEvenimente();

    public InterfataGrafica() {
        elemente = new ListaDeComparable<>(6, Student.class);
        lElemente.setText(lElemente.getText() + elemente.toString());

        bAdaugareElement.addActionListener(aeb);
        bStergereElemente.addActionListener(aeb);
        bSortareElemente.addActionListener(aeb);
        bSalvareLista.addActionListener(aeb);

    }
}

// import javax.swing.*;
// import java.awt.*;

// public class InterfataGrafica extends JFrame {
//     private JPanel panelPrincipal;
//     private JButton adaugareButton;
//     private JButton eliminareButton;
//     private JButton afisareButton;
//     private JButton sortareButton;
//     private JTextField numeField;
//     private JTextField prenumeField;
//     private JTextField prezentaField;
//     private JTextArea listaTextArea;

//     public InterfataGrafica() {
//         setContentPane(panelPrincipal);
//         setPreferredSize(new Dimension(500, 500));
//         pack();
//         setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//         setVisible(true);

//         adaugareButton.addActionListener(e -> adaugare());
//         eliminareButton.addActionListener(e -> eliminare());
//         afisareButton.addActionListener(e -> afisare());
//         sortareButton.addActionListener(e -> sortare());
//     }

//     private void adaugare() {
//         String nume = numeField.getText();
//         String prenume = prenumeField.getText();
//         int prezenta = Integer.parseInt(prezentaField.getText());

//         Student student = new Student();
//         student.setNume(nume);
//         student.setPrenume(prenume);
//         student.setPrezenta(prezenta);

//         try {
//             ListaDeComparable.adaugareElement(student);
//         } catch (ExceptieListaPlina exceptieListaPlina) {
//             JOptionPane.showMessageDialog(this, exceptieListaPlina.getMessage());
//         }
//     }

//     private void eliminare() {
//         try {
//             Student student = ListaDeComparable.eliminareElement();
//             numeField.setText(student.getNume());
//             prenumeField.setText(student.getPrenume());
//             prezentaField.setText(Integer.toString(student.getPrezenta()));
//         } catch (ExceptieListaGoala exceptieListaGoala) {
//             JOptionPane.showMessageDialog(this, exceptieListaGoala.getMessage());
//         }
//     }

//     private void afisare() {
//         StringBuilder stringBuilder = new StringBuilder();
//         for (Student student : ListaDeComparable.getLista()) {
//             stringBuilder.append(student.getNume())
//                     .append(" ")
//                     .append(student.getPrenume())
//                     .append(" ")
//                     .append(student.getPrezenta())
//                     .append("\n");
//         }
//         listaTextArea.setText(stringBuilder.toString());
//     }

//     private void sortare() {
//         ListaDeComparable.sortareElemente();
//     }
// }
