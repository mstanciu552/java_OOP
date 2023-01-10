package tema3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import tema3.poo.tema3.Student;
import tema3.poo.util.ExceptieListaGoala;
import tema3.poo.util.ExceptieListaPlina;
import tema3.poo.util.ListaDeComparable;

public class InterfataGrafica extends JFrame {
    private JLabel lNume = new JLabel("Nume: ");
    private JLabel lPrenume = new JLabel("Prenume: ");
    private JLabel lPrezenta = new JLabel("Prezenta: ");
    private JLabel lCurent = new JLabel("Curent: ");

    private JTextField textFieldNume = new JTextField("", 10);
    private JTextField textFieldPrenume = new JTextField("", 10);
    private JTextField textFieldPrezenta = new JTextField("", 10);

    private JButton bAdaugareElement = new JButton("Adauga Element");
    private JButton bStergereElemente = new JButton("Sterge Element");
    private JButton bSortareElemente = new JButton("Sortare Elemente");
    private JButton bSalvareLista = new JButton("Salvare");

    private JTextArea lElemente = new JTextArea("");
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
                    elemente.salvareLista("tema3/Studenti.txt");
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
        lErori.setForeground(Color.red);

        bAdaugareElement.addActionListener(aeb);
        bStergereElemente.addActionListener(aeb);
        bSortareElemente.addActionListener(aeb);
        bSalvareLista.addActionListener(aeb);

        Box labels = Box.createVerticalBox();
        labels.add(lNume);
        labels.add(Box.createVerticalStrut(100));
        labels.add(lPrenume);
        labels.add(Box.createVerticalStrut(100));
        labels.add(lPrezenta);
        labels.add(Box.createVerticalStrut(100));
        labels.add(Box.createVerticalGlue());

        Box textBoxes = Box.createVerticalBox();
        textBoxes.add(textFieldNume);
        textBoxes.add(Box.createVerticalStrut(10));
        textBoxes.add(textFieldPrenume);
        textBoxes.add(Box.createVerticalStrut(10));
        textBoxes.add(textFieldPrezenta);
        textBoxes.add(Box.createVerticalStrut(10));
        textBoxes.add(Box.createVerticalGlue());

        Box buttons1 = Box.createVerticalBox();
        buttons1.add(bAdaugareElement);
        buttons1.add(Box.createVerticalStrut(10));
        buttons1.add(bStergereElemente);
        buttons1.add(Box.createVerticalStrut(10));
        buttons1.add(bSortareElemente);
        buttons1.add(Box.createVerticalStrut(10));
        buttons1.add(Box.createVerticalGlue());

        Box firstRow = Box.createHorizontalBox();
        firstRow.add(labels);
        firstRow.add(Box.createHorizontalStrut(10));
        firstRow.add(textBoxes);
        firstRow.add(Box.createHorizontalStrut(10));
        firstRow.add(buttons1);
        firstRow.add(Box.createHorizontalStrut(10));
        firstRow.add(Box.createHorizontalGlue());

        Box secondRow = Box.createHorizontalBox();
        secondRow.add(lCurent);
        secondRow.add(Box.createHorizontalStrut(10));
        secondRow.add(lElemente);
        secondRow.add(Box.createHorizontalStrut(10));
        secondRow.add(Box.createHorizontalGlue());

        Box thirdRow = Box.createHorizontalBox();
        thirdRow.add(Box.createHorizontalStrut(10));
        thirdRow.add(bSalvareLista);
        thirdRow.add(Box.createHorizontalStrut(10));
        thirdRow.add(lErori);
        thirdRow.add(Box.createHorizontalStrut(10));
        thirdRow.add(Box.createHorizontalGlue());

        Box mainBox = Box.createVerticalBox();
        mainBox.add(firstRow);
        buttons1.add(Box.createVerticalStrut(10));
        mainBox.add(secondRow);
        buttons1.add(Box.createVerticalStrut(10));
        mainBox.add(thirdRow);
        buttons1.add(Box.createVerticalStrut(10));
        buttons1.add(Box.createVerticalGlue());

        Container cp = getContentPane();
        cp.add(BorderLayout.CENTER, mainBox);
    }

    public static void main(String[] args) {
        InterfataGrafica gui = new InterfataGrafica();

        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(500, 500);

        gui.setVisible(true);
    }
}
