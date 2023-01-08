package Lab7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import poo.util.ListaDeInt;
import poo.util.exceptions.ListaGoalaException;
import poo.util.exceptions.ListaPlinaException;

public class GUI4ListaDeInt extends JFrame {
    private JButton bAdaugareElement = new JButton("Adauga Element");
    private JButton bStergereElemente = new JButton("Sterge Element");
    private JButton bSortareElemente = new JButton("Sortare Elemente");
    private JLabel lNume = new JLabel("Element");
    private JTextField tElement = new JTextField("", 10);
    private JLabel lListaDeInt = new JLabel("Elemente lista:");
    private JLabel lValori = new JLabel("");
    private ListaDeInt elemente;

    class AscultatorEvenimente implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String id = ((JButton) e.getSource()).getText();
            if (id.equals("Adauga Element")) {
                int element = Integer.parseInt(tElement.getText());
                try {
                    elemente.adaugareElement(element);
                    lValori.setText(elemente.toString());
                } catch (ListaPlinaException ex) {
                    JOptionPane.showMessageDialog(GUI4ListaDeInt.this, ex.getMessage(), "ListaPlinaException",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            } else if (id.equals("Sterge Element")) {
                try {
                    elemente.stergereElement();
                    lValori.setText(elemente.toString());
                } catch (ListaGoalaException ex) {
                    JOptionPane.showMessageDialog(GUI4ListaDeInt.this, ex.getMessage(), "ListaGoalaException",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            } else if (id.equals("Sortare Elemente")) {
                elemente.sortare();
                lValori.setText(elemente.toString());
            }
        }
    }

    AscultatorEvenimente aeb = new AscultatorEvenimente();

    public GUI4ListaDeInt() {
        elemente = new ListaDeInt(6);
        lValori.setText(elemente.toString());
        bAdaugareElement.addActionListener(aeb);
        bStergereElemente.addActionListener(aeb);
        bSortareElemente.addActionListener(aeb);

        Box bh1 = Box.createHorizontalBox();
        bh1.add(lNume);
        bh1.add(Box.createHorizontalStrut(10));
        bh1.add(tElement);
        bh1.add(Box.createHorizontalStrut(10));
        bh1.add(Box.createHorizontalGlue());
        Box bh2 = Box.createHorizontalBox();
        bh2.add(lListaDeInt);
        bh2.add(Box.createHorizontalStrut(10));
        bh2.add(lValori);
        bh1.add(Box.createHorizontalStrut(10));
        bh2.add(Box.createHorizontalGlue());
        Box bv1 = Box.createVerticalBox();
        bv1.add(Box.createVerticalStrut(10));
        bv1.add(bh1);
        bv1.add(Box.createVerticalStrut(10));
        bv1.add(bh2);
        bv1.add(Box.createVerticalStrut(10));
        bv1.add(Box.createVerticalGlue());
        Box bv2 = Box.createVerticalBox();
        bv2.add(Box.createVerticalStrut(10));
        bv2.add(bAdaugareElement);
        bv2.add(Box.createVerticalStrut(10));
        bv2.add(bStergereElemente);
        bv2.add(Box.createVerticalStrut(10));
        bv2.add(bSortareElemente);
        bv2.add(Box.createVerticalGlue());
        Box bh3 = Box.createHorizontalBox();
        bh3.add(Box.createHorizontalStrut(10));
        bh3.add(bv1);
        bh3.add(Box.createHorizontalStrut(10));
        bh3.add(bv2);
        bh3.add(Box.createHorizontalStrut(10));
        bh3.add(Box.createHorizontalGlue());

        Container cp = getContentPane();
        cp.add(BorderLayout.CENTER, bh3);
    }

}
