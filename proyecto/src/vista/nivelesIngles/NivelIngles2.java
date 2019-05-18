package vista.nivelesIngles;

import modelo.NumberAnswers;
import modelo.Pregunta;
import modelo.Preguntas;
import vista.PanelNivel;

public class NivelIngles2 extends PanelNivel{

    public NivelIngles2() throws NumberAnswers {
        
        Preguntas listaPreguntas = new Preguntas(3);
        Pregunta pregunta;
        
        pregunta = new Pregunta("How are you?");
        
        pregunta.getListaRespuestas().add("¿Comó estás?");
        pregunta.getListaRespuestas().add("¿Qué haces?");
        pregunta.getListaRespuestas().add("¿Como te llamas?");
        pregunta.setRespuestaCorrecta("¿Comó estás?");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("What is your name?");
        
        pregunta.getListaRespuestas().add("¿Cual es tu nombre?");
        pregunta.getListaRespuestas().add("¿Qué estas haciendo?");
        pregunta.getListaRespuestas().add("¿Qué estas comiendo?");
        pregunta.setRespuestaCorrecta("¿Cual es tu nombre?");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("What are you doing?");
        
        pregunta.getListaRespuestas().add("¿Qué estas haciendo?");
        pregunta.getListaRespuestas().add("¿Qué estas comiendo?");
        pregunta.getListaRespuestas().add("¿Comó estas?");
        pregunta.setRespuestaCorrecta("Qué estas haciendo");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("What are you eating?");
        
        pregunta.getListaRespuestas().add("¿Comó esta tu mamá?");
        pregunta.getListaRespuestas().add("¿Comó te llamas?");
        pregunta.getListaRespuestas().add("¿Qué estas comiendo?");
        pregunta.setRespuestaCorrecta("Qué estas comiedo");
        listaPreguntas.add(pregunta); 

        crearCartas(listaPreguntas);
    }
    
    
}
