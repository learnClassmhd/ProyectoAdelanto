package vista.nivelesIngles;

import modelo.NumberAnswers;
import modelo.Pregunta;
import modelo.Preguntas;
import vista.PanelNivel;

public class NivelIngles10 extends PanelNivel{

    public NivelIngles10() throws NumberAnswers{
        Preguntas listaPreguntas = new Preguntas(3);
        
        Pregunta pregunta;
        
        pregunta = new Pregunta("Watch");
        
        pregunta.getListaRespuestas().add("Reloj de mano");
        pregunta.getListaRespuestas().add("Televisor");
        pregunta.getListaRespuestas().add("Computador");
        pregunta.setRespuestaCorrecta("Reloj de mano");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("Ring");
        
        pregunta.getListaRespuestas().add("Aretes");
        pregunta.getListaRespuestas().add("Anillo");
        pregunta.getListaRespuestas().add("Manilla");
        pregunta.setRespuestaCorrecta("Anillo");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("earrings");
        
        pregunta.getListaRespuestas().add("Artetes");
        pregunta.getListaRespuestas().add("Camisa");
        pregunta.getListaRespuestas().add("Medias");
        pregunta.setRespuestaCorrecta("Aretes");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("Necklaces");
        
        pregunta.getListaRespuestas().add("Collares");
        pregunta.getListaRespuestas().add("Corbata");
        pregunta.getListaRespuestas().add("Billetera");
        listaPreguntas.add(pregunta); 
        
        crearCartas(listaPreguntas);
        
        
    }
    
}
