package vista.nivelesIngles;

import modelo.NumberAnswers;
import modelo.Pregunta;
import modelo.Preguntas;
import vista.PanelNivel;

public class NivelIngles5 extends PanelNivel{

    public NivelIngles5() throws NumberAnswers {
        
        Preguntas listaPreguntas = new Preguntas(3);
        Pregunta pregunta;
        
        pregunta = new Pregunta("Did you do the homework?");
        pregunta.getListaRespuestas().add("¿Hiciste la tarea?");
        pregunta.getListaRespuestas().add("¿Comprate la casa?");
        pregunta.getListaRespuestas().add("¿Corriste a casa?");
        pregunta.setRespuestaCorrecta("¿Hiciste la tarea?");
        
        pregunta = new Pregunta("I ate rice");
        
        pregunta.getListaRespuestas().add("Comí arroz");
        pregunta.getListaRespuestas().add("Corte pasta");
        pregunta.getListaRespuestas().add("Camine a casa");
        pregunta.setRespuestaCorrecta("Comí arroz");
        listaPreguntas.add(pregunta);
        
        pregunta = new Pregunta("When did you clean your house");
        
        pregunta.getListaRespuestas().add("¿Por qué fuiste  la casa?");
        pregunta.getListaRespuestas().add("¿Cuando limpiasté tu casa?");
        pregunta.getListaRespuestas().add("¿Donde caminaste a casa?");
        pregunta.setRespuestaCorrecta("¿Cuando limpiasté tu casa?");
        listaPreguntas.add(pregunta);
        
        pregunta = new Pregunta("She didn't clean her house");
        
        pregunta.getListaRespuestas().add("Ella no limpió su casa");
        pregunta.getListaRespuestas().add("El no hizó la tarea");
        pregunta.getListaRespuestas().add("Tu no dibujaste la casa");
        pregunta.setRespuestaCorrecta("Ella no limpió su casa");
        listaPreguntas.add(pregunta);
        
        crearCartas(listaPreguntas);
    }
    
}
