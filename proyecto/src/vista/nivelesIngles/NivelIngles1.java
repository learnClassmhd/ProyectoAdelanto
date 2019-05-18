package vista.nivelesIngles;

import java.io.File;
import modelo.NumberAnswers;
import modelo.Pregunta;

import modelo.Preguntas;
import modelo.Reproductor;
import vista.PanelNivel;

public class NivelIngles1 extends PanelNivel{
    
    public NivelIngles1() throws NumberAnswers{    
        
        Reproductor.reproducir(new File("recursos\\ost.wav"));
        
        Preguntas listaPreguntas = new Preguntas(3);
        Pregunta pregunta;
        
        pregunta = new Pregunta("Run");
        pregunta.getListaRespuestas().add("Caminar");
        pregunta.getListaRespuestas().add("Nadar");
        pregunta.getListaRespuestas().add("Correr");
        pregunta.setRespuestaCorrecta("Correr");
        listaPreguntas.add(pregunta);        

        pregunta = new Pregunta("Walk");
        pregunta.getListaRespuestas().add("Trabajar");
        pregunta.getListaRespuestas().add("Escribir");
        pregunta.getListaRespuestas().add("Caminar");
        pregunta.setRespuestaCorrecta("Caminar");
        listaPreguntas.add(pregunta);    

        pregunta = new Pregunta("Write");
        pregunta.getListaRespuestas().add("Correr");
        pregunta.getListaRespuestas().add("Dibujar");
        pregunta.getListaRespuestas().add("Escribir");
        pregunta.setRespuestaCorrecta("Escribir");
        listaPreguntas.add(pregunta);  

        pregunta = new Pregunta("Sing");
        pregunta.getListaRespuestas().add("Correr");
        pregunta.getListaRespuestas().add("Cantar");
        pregunta.getListaRespuestas().add("Saltar");
        pregunta.setRespuestaCorrecta("Cantar");
        listaPreguntas.add(pregunta);  
        
        crearCartas(listaPreguntas);
        
    }
    
}
