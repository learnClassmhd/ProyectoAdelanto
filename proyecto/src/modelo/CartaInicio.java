/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import vista.PanelNivel;

/**
 *
 * @author acer
 */
public class CartaInicio extends Carta implements ActionListener{
    
    protected Pregunta pregunta;
    protected PanelNivel panelNivel;
    
    public CartaInicio(Pregunta pregunta){
      
        this.pregunta = pregunta;
        addActionListener(this);
        sprite = new ImageIcon("recursos//carta start.png").getImage();
        setText("Start");
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        panelNivel = (PanelNivel) getParent().getParent();

        panelNivel.getPreguntas().remove(pregunta);

        for(int i=0; i<panelNivel.getPanelCartas().getComponentCount(); i++){

            if(panelNivel.getPanelCartas().getComponent(i) != this && panelNivel.getPanelCartas().getComponent(i) instanceof Carta){

                panelNivel.getPanelCartas().add(new CartaRespuesta(panelNivel.getPreguntas().generarPregunta(),pregunta), i);

                panelNivel.getPanelCartas().remove(i+1);

            }

        }

        for(int i=0; i<panelNivel.getPanelCartas().getComponentCount(); i++){

            if(panelNivel.getPanelCartas().getComponent(i) == this){

                CartaPregunta cartaGenerada = new CartaPregunta(pregunta.getPregunta());

                panelNivel.getPanelCartas().add(cartaGenerada, i);
                panelNivel.getPanelCartas().remove(i+1);

                break;

            }

        }

        panelNivel.getPanelCartas().revalidate();
        panelNivel.getPanelCartas().repaint();
         
    }
    
    
}
