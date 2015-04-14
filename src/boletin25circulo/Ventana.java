/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin25circulo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Ventana implements ActionListener {

    JButton bDibujar = new JButton("Dibujar");
    JButton bLimpiar = new JButton("Limpiar");
    JPanel panel = new JPanel();
    JTextArea cont = new JTextArea();
   
    JFrame marco = new JFrame();
    
    public void crearVentana(){
        panel.add(bDibujar);
        panel.add(cont);
        panel.add(bLimpiar);
        marco.add(panel);
        marco.setVisible(true);
        marco.setSize(800,600);
        panel.setSize(marco.getSize());
        bDibujar.addActionListener(this);
        bLimpiar.addActionListener(this);
        cont.setFocusable(true);
        cont.setEnabled(true);
        cont.setSize(100,25);
        cont.setPreferredSize(cont.getSize());
        cont.setText("");
        
       
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (bDibujar == e.getSource()){
            int x = 0, y= 100;
            int nCirculos = Integer.parseInt(cont.getText());
            Graphics g = panel.getGraphics();
            for (int i=0;i<nCirculos;i++){
                g.setColor(Color.MAGENTA);
                g.drawOval(x, y, 80, 80);
                y+=80;
                x+=80;
            }
        }
        if(bLimpiar == e.getSource())
            panel.repaint();
    }

}
