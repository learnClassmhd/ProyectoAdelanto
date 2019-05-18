/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.nivelesMate;

import java.awt.GridLayout;
import java.io.File;
import modelo.NumberAnswers;
import modelo.Pregunta;
import modelo.Reproductor;
import modelo.Preguntas;
import vista.PanelNivel;

/**
 *
 * @author acer
 */
public class NivelMatematicas1 extends PanelNivel{
    

    public NivelMatematicas1() throws NumberAnswers{
        
        Reproductor.reproducir(new File("recursos\\ost.wav"));
        
        Preguntas listaPreguntas = new Preguntas(3);
        Pregunta pregunta;
       
        pregunta = new Pregunta("2x3");
        
        pregunta.getListaRespuestas().add("3");
        pregunta.getListaRespuestas().add("6");
        pregunta.getListaRespuestas().add("10");
        pregunta.setRespuestaCorrecta("6");
        listaPreguntas.add(pregunta);   
        
        pregunta = new Pregunta("2x1");
        
        pregunta.getListaRespuestas().add("2");
        pregunta.getListaRespuestas().add("4");
        pregunta.getListaRespuestas().add("10");
        pregunta.setRespuestaCorrecta("2");
        listaPreguntas.add(pregunta);   
        
        pregunta = new Pregunta("2x5");
        
        pregunta.getListaRespuestas().add("6");
        pregunta.getListaRespuestas().add("10");
        pregunta.getListaRespuestas().add("16");
        pregunta.setRespuestaCorrecta("10");
        listaPreguntas.add(pregunta);   
        
        pregunta = new Pregunta("2x2");
        
        pregunta.getListaRespuestas().add("4");
        pregunta.getListaRespuestas().add("6");
        pregunta.getListaRespuestas().add("20");
        pregunta.setRespuestaCorrecta("4");
        listaPreguntas.add(pregunta);   
        
        pregunta = new Pregunta("2x7");
        
        pregunta.getListaRespuestas().add("12");
        pregunta.getListaRespuestas().add("2");
        pregunta.getListaRespuestas().add("14");
        pregunta.setRespuestaCorrecta("14");
        listaPreguntas.add(pregunta);   

        crearCartas(listaPreguntas);
       
    }
    
}
