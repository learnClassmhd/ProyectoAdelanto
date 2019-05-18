package vista;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelNiveles extends JPanel implements ActionListener{
    
    private Image fondo = new ImageIcon("recursos\\fondo.jpg").getImage();;
    private JButton nivel ,atras;
    private final ArrayList<JButton> botones = new ArrayList();
    
    public PanelNiveles() {
        int aliniacion1=140,aliniacion11=30;
        int aliniacion2=380,aliniacion22=30;
        setLayout(null);
        
       atras = new JButton();
       atras.setBounds(0, 0, 150, 25);
       atras.setText("atras");
       
        for (int j = 1; j <= 10; j++) {
            nivel = new JButton();
            nivel.setBounds(aliniacion11, aliniacion1, 150, 150);
            nivel.setText("LEVEL"+j);
            nivel.addActionListener(this);
            botones.add(nivel);
            add(nivel);
            if(j>5){
                nivel = new JButton();
                nivel.setBounds(aliniacion22, aliniacion2, 150, 150);
                nivel.setText("LEVEL"+j);
                botones.add(nivel);
                add(nivel);
                aliniacion22 +=200;
            }
            aliniacion11 +=200;
            nivel.addActionListener(this);
        }
       
        //Reproductor.reproducir(new File("C:\\Users\\acer\\Desktop\\Koibumi.wav"));
       add(atras);
       atras.addActionListener(this);
       setFocusable(true);
       
    }

     public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D)g;
        
        g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2.drawImage(fondo,  0, 0, getWidth(), getHeight(), this);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        JFrame ventana = (JFrame)(getParent().getParent().getParent().getParent());
        if(ae.getSource().equals(atras)){
            ventana.remove(this);
            ventana.add(new Menu());
            
            ventana.validate();
            ventana.repaint();
        }
        if(ae.getSource().equals(botones.listIterator())){
            System.out.println("yeah");
         }   
    }
}

    