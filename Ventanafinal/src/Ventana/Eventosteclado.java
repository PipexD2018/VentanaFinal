
package Ventana;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class Eventosteclado extends JFrame {
    
    private JPanel panel = new JPanel();
    private JTextField texto = new JTextField();
    private JLabel label1 = new JLabel();
    private JLabel label2 = new JLabel();
    private JTextArea area = new JTextArea();
    
    public Eventosteclado()  {
    
    this.getContentPane().add(panel);
    this.setSize(500, 700);
    this.setLocationRelativeTo(this);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    panel();
    componentes();
    
    }
    
    private void panel(){
        panel.setLayout(null);
        panel.setBackground(Color.white);
        
    }
    
    private void componentes (){
        label1.setBounds(100, 40, 400, 20);
        label1.setText("Hola bienvenido a los eventos del teclado");
        label2.setText("Por favor ingrese cualquier cantidad de letras");
        label2.setBounds(100, 80, 400, 20);
               
        
        texto.setBounds(100, 120, 280, 20);
        
        area.setBounds(100,160, 300, 450);
        area.setBackground(Color.black);
        area.setForeground(Color.white);
        
        
        KeyListener teclado = new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                }

            @Override
            public void keyPressed(KeyEvent e) {
                }

            @Override
            public void keyReleased(KeyEvent e) {
           
                if(e.getKeyChar() == 'p'){
                    area.append("has ingresado la P\n");
                }
                if (e.getKeyChar() == '\n'){
                    area.append("Has ingresado un Enter\n");
                }
                if(e.getKeyChar() == ' '){
                    area.append("Has ingresado un espacio\n");
                }
            }
        };
        
        texto.addKeyListener(teclado);
        
        
        panel.add(label1);
        panel.add(label2);
        panel.add(texto);
        panel.add(area);
        
        
        
    }
    
    
         
    
 
            
}
    