package vista;

import javax.swing.JFrame;

public class Ventana extends JFrame {
   public Ventana(){
       
       setTitle("Juego");
       setSize(1000, 700);
       setLocationRelativeTo(null);
      
       add(new Menu());
       
       setResizable(false);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}