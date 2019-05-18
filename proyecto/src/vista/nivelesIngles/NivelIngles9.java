package vista.nivelesIngles;

import modelo.NumberAnswers;
import modelo.Pregunta;
import modelo.Preguntas;
import vista.PanelNivel;

public class NivelIngles9 extends PanelNivel{

    public NivelIngles9() throws NumberAnswers {
        Preguntas listaPreguntas = new Preguntas(3);
        Pregunta pregunta;
        
        pregunta = new Pregunta("What?");
        
        pregunta.getListaRespuestas().add("¿Qué?");
        pregunta.getListaRespuestas().add("¿Donde?");
        pregunta.getListaRespuestas().add("¿Comó?");
        pregunta.setRespuestaCorrecta("¿Qué?");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("When?");
        
        pregunta.getListaRespuestas().add("¿Cuando?");
        pregunta.getListaRespuestas().add("¿Por qué?");
        pregunta.getListaRespuestas().add("¿Quien?");
        pregunta.setRespuestaCorrecta("¿Cuando?");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("How?");
        
        pregunta.getListaRespuestas().add("¿Como?");
        pregunta.getListaRespuestas().add("¿Que?");
        pregunta.getListaRespuestas().add("¿Aquien?");
        pregunta.setRespuestaCorrecta("¿Como?");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("Why?");
        
        pregunta.getListaRespuestas().add("¿Por qué?");
        pregunta.getListaRespuestas().add("¿Cual?");
        pregunta.getListaRespuestas().add("¿Cuando?");
        pregunta.setRespuestaCorrecta("¿Por qué?");
        listaPreguntas.add(pregunta); 
        
        crearCartas(listaPreguntas);
    }
    
}
