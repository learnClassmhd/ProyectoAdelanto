package vista;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Menu extends JPanel implements ActionListener{
    
    private Image fondo = new ImageIcon("recursos\\fondo.jpg").getImage();
    private JButton ingles, matematicas;
    public Menu(){
       setLayout(null);
       ingles = new JButton();
       ingles.setBounds(350, 350, 300, 100);
       ingles.setText("INGLÉS");
       
       matematicas = new JButton();
       matematicas.setBounds(350, 460, 300, 100);
       matematicas.setText("MATEMÁTICAS");
       
        //Reproductor.reproducir(new File("C:\\Users\\acer\\Desktop\\Koibumi.wav"));
       add(matematicas);
       add(ingles);
       setFocusable(false);
       ingles.addActionListener(this);
       matematicas.addActionListener(this);
       //addKeyListener(this);
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
        if(ae.getSource().equals(ingles)){
            ventana.remove(this);
            ventana.add(new PanelNiveles());

            ventana.validate();
            ventana.repaint();
        }
     
    }
    
}
