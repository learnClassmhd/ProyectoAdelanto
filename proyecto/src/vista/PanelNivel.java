package vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JPanel;
import modelo.Carta;
import modelo.CartaInicio;
import modelo.Pregunta;
import modelo.Preguntas;

public abstract class PanelNivel extends JPanel{
    
    private Preguntas preguntas;
    private JPanel questions = new JPanel();
    private Puntuacion conteo = new Puntuacion();
           
    public PanelNivel() {
        
        setLayout(new BorderLayout());
        questions.setLayout(new GridLayout(2,2));
        add(questions, BorderLayout.CENTER);
        add(conteo, BorderLayout.SOUTH);
        
    }

    public Preguntas getPreguntas(){

        return preguntas;

    }

    public void crearCartas(Preguntas preguntas){

        this.preguntas = preguntas;

        Pregunta pGenerada = preguntas.generarPregunta();

        getPanelCartas().add(new CartaInicio(pGenerada));

        preguntas.remove(pGenerada);

        for(int i=0; i<preguntas.getNumRespuestas(); i++){

            getPanelCartas().add(new Carta());

        }

    }

    /**
     * @return the questions
     */
    public JPanel getPanelCartas() {
        return questions;
    }

    /**
     * @param questions the questions to set
     */

    /**
     * @return the conteo
     */
    public Puntuacion getConteo() {
        return conteo;
    }

}