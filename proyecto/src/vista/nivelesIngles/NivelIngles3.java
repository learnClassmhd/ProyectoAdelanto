package vista.nivelesIngles;

import javax.swing.JPanel;
import modelo.NumberAnswers;
import modelo.Pregunta;
import modelo.Preguntas;
import vista.PanelNivel;

public class NivelIngles3 extends PanelNivel{

    public NivelIngles3() throws NumberAnswers {
        Preguntas listaPreguntas = new Preguntas(3);
        Pregunta pregunta;
        
        pregunta = new Pregunta("What do you do?");
        
        pregunta.getListaRespuestas().add("¿Qué haces?");
        pregunta.getListaRespuestas().add("¿Qué dices?");
        pregunta.getListaRespuestas().add("¿Por qué lo haces?");
        pregunta.setRespuestaCorrecta("¿Qué haces");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("Why do you say?");
        
        pregunta.getListaRespuestas().add("¿Por qué lo dices?");
        pregunta.getListaRespuestas().add("¿Como haces la tarea?");
        pregunta.getListaRespuestas().add("¿Donde juegas?");
        pregunta.setRespuestaCorrecta("¿Por qué lo dices?");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("I play soccer");
        
        pregunta.getListaRespuestas().add("Juego futbol");
        pregunta.getListaRespuestas().add("Camino rapido");
        pregunta.getListaRespuestas().add("Juegas futbol");
        pregunta.setRespuestaCorrecta("Juego futbol");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("He draws");
        
        pregunta.getListaRespuestas().add("El dibuja");
        pregunta.getListaRespuestas().add("Ella corre");
        pregunta.getListaRespuestas().add("Yo camino");
        pregunta.setRespuestaCorrecta("El dibuja");
        listaPreguntas.add(pregunta); 
        
        crearCartas(listaPreguntas);
        
    }
    
}
