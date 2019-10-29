
package Ventana;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Ventana extends JFrame {
        
    JPanel pa = new JPanel();
    JPasswordField pass = new JPasswordField();

     
    public Ventana (){
        
        this.setSize(400,200); // tamaño de la ventana
        this.setLocationRelativeTo(this); // para dejar la ventana centrada
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);// cuando de clic en cerrar finalice el proceso
        this.setTitle("Programa realizado desde comandos");// para colocar el titulo de la ventana
        componentes();
        
    }
    
    private void componentes(){
        Panel();
        etiquetas();
        Botones();
        cajastexto();
    }
    
   
    public void Panel(){
        pa.setLayout(null);// Se desactiva el Layout por defecto
        this.getContentPane().add(pa); // Se agrega un panel encima de la ventana 
        pa.setBackground(Color.WHITE);// Se coloca un color al panel
        
    }
    
 private void etiquetas (){
                  
        // ETIQUETA 1
        JLabel la = new JLabel();
        la.setText("LOGIN");
        la.setBounds(150,0,80,50); // Acho,Alto // Ancho, Alto 
        la.setHorizontalAlignment(SwingConstants.CENTER);// Se establece la alineación horizontal del texto
        la.setForeground(Color.red);// Se cambia el color de la letra
        la.setBackground(Color.blue);
        la.setFont(new Font("chiller",3,30));// Tipo de fuente de la letra. 0-normal 1-negrita -2 cursiva - 3 cursiva negrita  
        
        //IMAGEN 
        ImageIcon imagen = new ImageIcon("dulces.jpg");
        
        //ETIQUETA 2
        JLabel la2 = new JLabel(); // Se agrega una imagen en el label constructor.
        la2.setBounds(270,35, 90,90);
        la2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(la2.getWidth(),la2.getHeight(),Image.SCALE_SMOOTH)));//Cambiar el tamaño de la imagen en este caso se coloco el ancho y largo de la etiqueta 2
        //ETIQUETA 3
        JLabel la3 = new JLabel();
        la3.setText("User");
        la3.setBounds(20,40,70,50);
        la3.setHorizontalAlignment(SwingConstants.RIGHT);
        //ETIQUETA 4
        JLabel la4 = new JLabel();
        la4.setBounds(20,70,70,50);
        la4.setHorizontalAlignment(SwingConstants.RIGHT);
        la4.setText("Password");
        
        //la.setOpaque(true); habilitar el fondo de la etiqueta 
        pa.add(la);
        pa.add(la2);
        pa.add(la3);
        pa.add(la4);
    }
    
    
 private void Botones(){
        
    /* JButton boton1 = new JButton();
        boton1.setText("INGRESAR");
        boton1.setBounds(125,125,110,25);
        boton1.setEnabled(true);//Se deja en false por si se desea inhabilita el boton
        boton1.setMnemonic('x');// Tener un atajo hacia el boton
        boton1.setForeground(Color.red);
        //boton1.setBackground(Color.black); color de fondo del boton
        boton1.setFont(new Font("chiller",3,15));
        
        pa.add(boton1);
      */  
       ImageIcon imagen2 = new ImageIcon("ingreso.png");
       JButton boton2 = new JButton();
       boton2.setBounds(160,115,40,40);
       boton2.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(boton2.getWidth(),boton2.getHeight(),Image.SCALE_SMOOTH)));
       pa.add(boton2);
        
       
       ActionListener accion = new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent e) {
            
              Acceso as = new Acceso();
              as.setVisible(true);
              
              
               
           }   
           
       };
      boton2.addActionListener(accion);
 
 }
  
 
 private void cajastexto (){

         JTextField cajausuario = new JTextField();
         cajausuario.setBounds(120,55,120,20);
         pa.add(cajausuario);
         
         pass.setBounds(120,85,120,20);
         pa.add(pass);
         
}
 
 
 
 
 
 
 
}
 

