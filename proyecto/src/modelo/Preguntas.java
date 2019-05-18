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
public class Preguntas {
    
    private ArrayList<Pregunta> preguntas = new ArrayList<>();
    private int numRespuestas;

    public Preguntas(int numRespuestas){
        
        this.numRespuestas = numRespuestas;
        
    }
    
    public void add(Pregunta pregunta) throws NumberAnswers{
        
        if(pregunta.getListaRespuestas().size() != numRespuestas) throw new NumberAnswers();
        
        preguntas.add(pregunta);
        
    }
    
    public void remove(Pregunta pregunta){
        
        preguntas.remove(pregunta);
        
    }
    
    public int getNumRespuestas(){
        
        return numRespuestas;
        
    }
          
    
    public Pregunta generarPregunta(){
        
        Pregunta pregunta = null;
        int numAleatorio;
        
        if(preguntas.size()!= 0) {
            
            numAleatorio = (int)(Math.random()*preguntas.size());
            pregunta = preguntas.get(numAleatorio);
            
        }
        
        return pregunta;
        
    }
    
}
