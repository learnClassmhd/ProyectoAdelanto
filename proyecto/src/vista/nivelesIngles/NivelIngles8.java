package vista.nivelesIngles;

import modelo.NumberAnswers;
import modelo.Pregunta;
import modelo.Preguntas;
import vista.PanelNivel;

public class NivelIngles8 extends PanelNivel{

    public NivelIngles8() throws NumberAnswers {
        Preguntas listaPreguntas = new Preguntas(3);
        Pregunta pregunta;
        
        pregunta = new Pregunta("I going to do my homework");
        
        pregunta.getListaRespuestas().add("Voy a hacer mi casa");
        pregunta.getListaRespuestas().add("Vamos a hacer la tareas");
        pregunta.getListaRespuestas().add("Voy a hacer mi tarea");
        pregunta.setRespuestaCorrecta("Voy a hacer mi tarea");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("What are you going to do tomorrow?");
        
        pregunta.getListaRespuestas().add("¿Qué vas a hacer mañana?");
        pregunta.getListaRespuestas().add("¿Comó vas a hacer mañana?");
        pregunta.getListaRespuestas().add("¿Donde vas a a ir mañana?");
        pregunta.setRespuestaCorrecta("¿Qué vas a hacer mañana?");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("We are going to pay the food");
        
        pregunta.getListaRespuestas().add("Vamos a pagar la comida");
        pregunta.getListaRespuestas().add("Ellos iran a comprar la comida");
        pregunta.getListaRespuestas().add("El ira a vender la comida");
        pregunta.setRespuestaCorrecta("Vamos a pagar la comida");
        listaPreguntas.add(pregunta); 
        
        pregunta = new Pregunta("Where is he going to go after of class");
        
        pregunta.getListaRespuestas().add("¿Donde el va a ir despues de clases?");
        pregunta.getListaRespuestas().add("¿Qué el va a hacer despues de clases?");
        pregunta.getListaRespuestas().add("¿Por qué he va a ir despues de clases?");
        pregunta.setRespuestaCorrecta("¿Donde el va a ir despues de clases?");
        listaPreguntas.add(pregunta); 
        
        crearCartas(listaPreguntas);
        
    }
}
