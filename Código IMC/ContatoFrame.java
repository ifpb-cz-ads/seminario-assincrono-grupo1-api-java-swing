import javax.swing.*;
import javax.swing.plaf.TextUI;
import javax.swing.text.TextAction;
import javax.swing.text.AbstractDocument.DefaultDocumentEvent;

import java.awt.event.*;  

public class ContatoFrame implements ActionListener{  
    JTextField tf1,tf2,tf3;  
    JButton b1; 
    
    public void Janela(){  
        JFrame f= new JFrame("Calculo de IMC");
        
        //JLabel pesoLabel = new JLabel("Peso");
        //Referente ao peso
        tf1=new JTextField("Peso");
        tf1.setBounds(70,50,150,20);
        //JLabel alturaLabel = new JLabel("Altura");
        //Referente a altura
        tf2=new JTextField("Altura");  
        tf2.setBounds(70,100,150,20);
        //JLabel resultadoLabel = new JLabel("Resultado");
        //Resultado
        tf3=new JTextField("Resultado");  
        tf3.setBounds(50,150,180,20);  
        tf3.setEditable(false);   
        b1=new JButton("TESTE");  
        b1.setBounds(100,200,100,50);    
        b1.addActionListener(this);   
        f.add(tf1);f.add(tf2);f.add(tf3);f.add(b1);  
        f.setSize(300,300);  
        f.setLayout(null);  
        f.setVisible(true);  
    }