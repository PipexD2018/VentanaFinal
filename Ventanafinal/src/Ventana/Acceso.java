
package Ventana;

import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;


public class Acceso extends JFrame {
    
    JPanel pe = new JPanel();
    
    public Acceso (){
         
        ventana1();           
              
        }
    
    public void ventana1(){
        
        this.setSize(900,650);
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Bienvenido");
        panel();
        radiobotones();
        etiqueta();
        cajadetexto();
        combobox();
    }
               
    private void panel(){
      pe.setLayout(null);
      this.getContentPane().add(pe);
      pe.setBackground(Color.white);
      
        
    } 
    private void radiobotones(){
        JRadioButton radio1 = new JRadioButton("Opción 1",true);
        radio1.setBounds(10,40, 200,50);
        pe.add(radio1);
        
        JRadioButton radio2 = new JRadioButton("Opción 2",false);
        radio2.setBounds(10,80, 200,50);
        pe.add(radio2);
        
        JRadioButton radio3 = new JRadioButton("Opción 3",false);
        radio3.setBounds(10,120, 200, 50);
        pe.add(radio3);
        
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(radio1);
        grupo.add(radio2);
        grupo.add(radio3);
    }
    
    public void etiqueta (){
        JLabel etiqueta1 = new JLabel();
        etiqueta1.setText("Grupo de botones");
        etiqueta1.setBounds(20,5, 100, 20);
        pe.add(etiqueta1);
    }
    
        
    private void cajadetexto(){
        
        JTextArea area = new JTextArea();
        area.setBounds(10,180,300, 100);
        area.setBackground(Color.black);
        area.setForeground(Color.white);
       /// area.setEditable(false);// no se pueda editar el area del texto. 
        pe.add(area);
        
    } 
    
    
    private void combobox(){
        String [] paises = {"Peru","Colombia","Argentina","Paraguay"};
        JComboBox combo = new JComboBox(paises);
        combo.setBounds(10,300,100,20);
        combo.addItem("Brasil");// Es para agregar un objeto despues de haber inicializado anteriormente
        pe.add(combo);
        
    }
        
    
}
