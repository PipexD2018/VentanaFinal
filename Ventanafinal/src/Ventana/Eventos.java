
package Ventana;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Eventos extends JFrame{
    
  private  JPanel panel = new JPanel();        
  private  JLabel saludo = new JLabel();
  private  JButton boton1 = new JButton();
  private  JTextField texto1 = new JTextField();
  private  JTextArea area = new JTextArea();
  private  JButton boton2 = new JButton();
  
  
  
    public Eventos(){
       
        this.setSize(500,650);
        this.setLocationRelativeTo(this);
        this.setTitle("Eventos");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel1();
        texto();
        eventomouseclick();
    }
    
    
    private void panel1 (){
        
        panel.setLayout(null);
        this.getContentPane().add(panel);
        panel.setBackground(Color.white);
        
        
    }
    
    private void texto(){
        
        JLabel caja1 = new JLabel();
        caja1.setText("Prueba envio de texto");
        caja1.setBounds(160,10,200,10);
        caja1.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(caja1);
        
        JLabel caja2 = new JLabel();
        caja2.setText("Hola ingresa tu nombre");
        caja2.setHorizontalAlignment(SwingConstants.CENTER);
        caja2.setBounds(160, 50, 200, 20);
        panel.add(caja2);
        
        
        texto1.setBounds(140,90, 240,20);
        panel.add(texto1);
        
   
        boton1.setText("CONTINUAR");
        boton1.setBounds(160, 130, 200,20);
        boton1.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(boton1);
        
        
        saludo.setBounds(160,180, 200, 20);
        saludo.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(saludo);
        
      /*   
        ActionListener evento1 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
             saludo.setText("Hola "+ texto1.getText());
            }
        
        };
        
        boton1.addActionListener(evento1);
        */
        
        
        
        
    }
    
    private void eventomouseclick(){
    
        /// Agregamos el area
        area.setBounds(160,220, 200,200);
        area.setBackground(Color.black);
        area.setForeground(Color.white);
        panel.add(area);
        
        
        /// Agregamos el boton
        boton2.setBounds(160,500, 200, 20);
        boton2.setText("Oprima el boton");
        panel.add(boton2);
        
        MouseListener oyenteraton = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
            area.append("mouseClicked\n");
            }

            @Override
            public void mousePressed(MouseEvent e) {
            area.append("mousePressed\n");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            area.append("mouseReleased\n");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            area.append("mouseEntered\n");
            }

            @Override
            public void mouseExited(MouseEvent e) {
            area.append("mouseExited\n");
            }
        
    };
    boton2.addMouseListener(oyenteraton);
}
    


}