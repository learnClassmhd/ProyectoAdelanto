/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import vista.PanelNivel;
import vista.Puntuacion;


/**
 *
 * @author acer
 */
public class CartaRespuesta extends CartaInicio{
   
    private boolean respuestaCorrecta = false;
    private Puntuacion conteoPuntuacion;
    
    public CartaRespuesta(Pregunta pregunta, Pregunta preguntaResponder){
       
        super(pregunta);
        
        sprite = new ImageIcon("recursos//carta matematicas.png").getImage();
        setText(preguntaResponder.generarRespuesta());
        if(getText().equals(preguntaResponder.getRespuestaCorrecta())) respuestaCorrecta = true;
        
    }
    
    public void actionPerformed(ActionEvent e) {

        panelNivel = (PanelNivel)getParent().getParent();
        conteoPuntuacion = panelNivel.getConteo();
        
        if(respuestaCorrecta){
            JOptionPane.showMessageDialog(getParent(), "Correcto");
            conteoPuntuacion.setWell(conteoPuntuacion.getWell()+1);
            conteoPuntuacion.getAnswersWell().setText("Well: " + conteoPuntuacion.getWell());
        }else {
            JOptionPane.showMessageDialog(getParent(), "Incorrecto");
            conteoPuntuacion.setBad(conteoPuntuacion.getBad()+1);
            conteoPuntuacion.getAnswersBad().setText("Bad: " + conteoPuntuacion.getBad());
        }
        
        conteoPuntuacion.setScore(conteoPuntuacion.getScore()+(conteoPuntuacion.getWell()-conteoPuntuacion.getBad()));
        conteoPuntuacion.getEtiquetaTotal().setText("Score: " + (conteoPuntuacion.getWell()-conteoPuntuacion.getBad()));
                    
        super.actionPerformed(e);
                
    }
    
}
