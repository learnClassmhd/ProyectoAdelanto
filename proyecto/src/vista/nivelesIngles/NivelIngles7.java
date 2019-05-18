package vista.nivelesIngles;

import modelo.NumberAnswers;
import modelo.Pregunta;
import modelo.Preguntas;
import vista.PanelNivel;

public class NivelIngles7 extends PanelNivel{

    public NivelIngles7() throws NumberAnswers{
        
        Preguntas listaPreguntas = new Preguntas(3);
        Pregunta pregunta;
        
        pregunta = new Pregunta("I will play soccer");
        
        pregunta.getListaRespuestas().add("Yo jugare futbol");
        pregunta.getListaRespuestas().add("Tu jugaras tenis");
        pregunta.getListaRespuestas().add("Nosotros jugares patinaje");
        pregunta.setRespuestaCorrecta("Yo jugare futbol");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("We will buy a horse");
        
        pregunta.getListaRespuestas().add("Nosotros compraremos un caballo");
        pregunta.getListaRespuestas().add("Yo comprare una casa");
        pregunta.getListaRespuestas().add("El compara una casa");
        pregunta.setRespuestaCorrecta("Nosotros compraremos un caballo");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("They will run in the park");
        
        pregunta.getListaRespuestas().add("Ellos correran en el parque");
        pregunta.getListaRespuestas().add("Nosotros correremo en la casa");
        pregunta.getListaRespuestas().add("Ella caminara en el parque");
        pregunta.setRespuestaCorrecta("Ellos correran en el parque");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("Will you go tomorrow to class?");
        
        pregunta.getListaRespuestas().add("¿Hiras mañana a clase?");
        pregunta.getListaRespuestas().add("¿Hiras a clase mañana?");
        pregunta.getListaRespuestas().add("¿Haras la tarea mañana?");
        pregunta.setRespuestaCorrecta("¿Hiras mañana a clase?");
        listaPreguntas.add(pregunta); 
        
        
        crearCartas(listaPreguntas);
        
    }
    
    
    
}
