/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelo.NumberAnswers;
import vista.nivelesIngles.NivelIngles1;
import vista.nivelesIngles.NivelIngles10;

/**
 *
 * @author acer
 */
public class PanelNivelesIngles extends JPanel implements ActionListener{
    private Image fondo = new ImageIcon("recursos\\fondo.jpg").getImage();
    private JButton nivel1 = new JButton("Nivel 1");
    private Ventana ventanaJuego;
    
    public PanelNivelesIngles() {
        
        nivel1.addActionListener(this);
        add(nivel1);
        
    }
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D)g;
        
        g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2.drawImage(fondo,  0, 0, getWidth(), getHeight(), this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        ventanaJuego = (Ventana)getParent().getParent().getParent().getParent();
        ventanaJuego.remove(this);
        try {
            ventanaJuego.add(new NivelIngles1());
        } catch (NumberAnswers ex) {
            JOptionPane.showMessageDialog(ventanaJuego, "Número de respuestas incorrecto");
        }
        ventanaJuego.revalidate();
        ventanaJuego.repaint();
        
    }

}

