package vista.nivelesIngles;

import modelo.NumberAnswers;
import modelo.Pregunta;
import modelo.Preguntas;
import vista.PanelNivel;

public class NivelIngles6 extends PanelNivel{

    public NivelIngles6() throws NumberAnswers {
        
        Preguntas listaPreguntas = new Preguntas(3);
        Pregunta pregunta;
        
        pregunta = new Pregunta("I was in my house");
        
        pregunta.getListaRespuestas().add("Estaba en mi casa");
        pregunta.getListaRespuestas().add("Estaba en la casa");
        pregunta.getListaRespuestas().add("Estaba caminando");
        pregunta.setRespuestaCorrecta("Estaba en mi casa");
        listaPreguntas.add(pregunta);
        
        pregunta = new Pregunta("She was running");
        
        pregunta.getListaRespuestas().add("Ella estaba corriendo");
        pregunta.getListaRespuestas().add("El estaba caminando");
        pregunta.getListaRespuestas().add("Tu estabas dibujando");
        pregunta.setRespuestaCorrecta("Ella estaba corriendo");
        listaPreguntas.add(pregunta);
        
        pregunta = new Pregunta("Were you drawing a car?");
        
        pregunta.getListaRespuestas().add("¿Tu estabas dibujando un carro?");
        pregunta.getListaRespuestas().add("¿El staba manejando un carro?");
        pregunta.getListaRespuestas().add("¿Yo estaba mirando un carro?");
        pregunta.setRespuestaCorrecta("¿Tu estabas dibujando un carro?");
        listaPreguntas.add(pregunta);
        
        pregunta = new Pregunta("Why was he playing Xbox");
        
        pregunta.getListaRespuestas().add("¿Por qué el estaba jugando Xbox?");
        pregunta.getListaRespuestas().add("¿Donde tu estabas moviendo el Xbox");
        pregunta.getListaRespuestas().add("¿Donde tu estabas jugando Xbox?");
        pregunta.setRespuestaCorrecta("Por qué estabas jugando Xbox");
        listaPreguntas.add(pregunta);
        
        crearCartas(listaPreguntas);
        
    }
    
}
