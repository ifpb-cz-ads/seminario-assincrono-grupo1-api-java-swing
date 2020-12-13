import javax.swing.*;
import javax.swing.plaf.TextUI;
import javax.swing.text.TextAction;
import javax.swing.text.AbstractDocument.DefaultDocumentEvent;

import java.awt.event.*;  

public class ContatoFrame implements ActionListener{  
    JTextField tf1,tf2,tf3;  
    JButton b1; 
    
    public void Janela(){  
      //Container responsável por todas as informações
        JFrame f= new JFrame("Calculo de IMC");
      
        //Referente ao peso em kg
        tf1=new JTextField("Peso");
        tf1.setBounds(70,50,150,20);

        //Referente a altura do usuário em metros
        tf2=new JTextField("Altura");  
        tf2.setBounds(70,100,150,20);

        //Resultado 
        tf3=new JTextField("Resultado");  
        tf3.setBounds(50,150,180,20);  
        tf3.setEditable(false);

        //botão que realiza a ação de calcular o IMC  
        b1=new JButton("TESTE");  
        b1.setBounds(100,200,100,50);    
        b1.addActionListener(this);

        //adiciona todas as variáveis ao container 
        f.add(tf1);f.add(tf2);f.add(tf3);f.add(b1);  
        f.setSize(300,300);  
        f.setLayout(null);
        f.setVisible(true);  
    }
}