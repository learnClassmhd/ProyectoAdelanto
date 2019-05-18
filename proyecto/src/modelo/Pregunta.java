/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author acer
 */
public class Pregunta {
    
    private String pregunta;

    private ArrayList<String> respuestas;

    private String respuestaCorrecta;

    public Pregunta(String pregunta){

        this.pregunta = pregunta;
        respuestas = new ArrayList<String>();

    }

    public String getRespuestaCorrecta(){

        return respuestaCorrecta;

    }

    public void setRespuestaCorrecta(String respuestaCorrecta){

        this.respuestaCorrecta = respuestaCorrecta;

    }

    public String getPregunta(){

        return pregunta;

    }

    public ArrayList<String> getListaRespuestas(){

        return respuestas;

    }

    public String generarRespuesta(){

        String respuesta;

        int numAleatorio = (int)(Math.random()*respuestas.size());

        respuesta = respuestas.get(numAleatorio);
        respuestas.remove(respuesta);

        return respuesta;

    }
    
}
