/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador.escola;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author laboratorio
 */
public class AulaJOptionPane extends JFrame{
    private Container c1;
    private JPanel p1, p2;
    private JLabel lbl1;
    private JTextField txt1;
    private JButton btn1;
    public AulaJOptionPane(String titulo) {
        super(titulo);
        Container c1 = getContentPane();
        c1.setLayout(new BorderLayout());
        p1 = new JPanel(new FlowLayout(0));
        lbl1 = new JLabel("Nome");
        txt1 = new JTextField(30);
        p2 = new JPanel(new FlowLayout(1));
        btn1 = new JButton("OK");
        p1.add(lbl1); 
        p1.add(txt1);
        p2.add(btn1);
        c1.add(p1, BorderLayout.NORTH);
        c1.add(p2, BorderLayout.SOUTH);
        Tratador trata = new Tratador();
        btn1.addActionListener(trata);
        setSize(500, 300);
        setLocation(500, 300);
        setVisible(true);
    }
    private class Tratador implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            if (evt.getSource() == btn1) {
                JOptionPane.showMessageDialog(null,
                 "O nome digitado foi "  + txt1.getText());
            }
        }
    }
    public static void main(String[] args) {
        AulaJOptionPane tela = new AulaJOptionPane(
                "Tratamento de Eventos");
        tela.setDefaultCloseOperation(AulaJOptionPane.EXIT_ON_CLOSE);
    }
}
