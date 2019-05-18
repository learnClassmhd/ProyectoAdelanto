package vista;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Puntuacion extends JPanel{
    
    private int score,well=0,bad=0;
    private JPanel total,answers;
    private JLabel etiquetaTotal, answersWell,answersBad;
    
    public Puntuacion() {
        setLayout(new GridLayout(1,2));
        //Labels
        etiquetaTotal = new JLabel();
        etiquetaTotal.setText("Score: "+score);
        answersWell = new JLabel();
        answersWell.setText("Well:");
        answersBad = new JLabel();
        answersBad.setText("Bad:");
        //Paneles anidados
        total = new JPanel();
        total.add(etiquetaTotal);
        //
        answers = new JPanel();
        answers.setLayout(new GridLayout(2,1));
        answers.add(answersWell);
        answers.add(answersBad);
        //Panel principal
        add(total);
        add(answers);
    }

    /**
     * @return the score
     */
    public int getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * @return the etiquetaTotal
     */
    public JLabel getEtiquetaTotal() {
        return etiquetaTotal;
    }

    /**
     * @param etiquetaTotal the etiquetaTotal to set
     */
    public void setEtiquetaTotal(JLabel etiquetaTotal) {
        this.etiquetaTotal = etiquetaTotal;
    }

    /**
     * @return the well
     */
    public int getWell() {
        return well;
    }

    /**
     * @param well the well to set
     */
    public void setWell(int well) {
        this.well = well;
    }

    /**
     * @return the bad
     */
    public int getBad() {
        return bad;
    }

    /**
     * @param bad the bad to set
     */
    public void setBad(int bad) {
        this.bad = bad;
    }

    /**
     * @return the answersWell
     */
    public JLabel getAnswersWell() {
        return answersWell;
    }

    /**
     * @param answersWell the answersWell to set
     */
    public void setAnswersWell(JLabel answersWell) {
        this.answersWell = answersWell;
    }

    /**
     * @return the answersBad
     */
    public JLabel getAnswersBad() {
        return answersBad;
    }

    /**
     * @param answersBad the answersBad to set
     */
    public void setAnswersBad(JLabel answersBad) {
        this.answersBad = answersBad;
    }
    
}
