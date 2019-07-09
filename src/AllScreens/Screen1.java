
/*
DISCIPLINE: PROGRAMMING TECHNIQUES
Name: SAMUEL HERICLES SOUZA SILVEIRA
e-mail: samuel.hericles@outlook.com
*/

package AllScreens;

import java.awt.Color;
import java.awt.Container;  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Screen1 extends JFrame implements ActionListener{

  
    JButton bt1,bt2,bt3;

public Screen1(){
        
//====window formatting====  

        JFrame Screen1 = new JFrame();
        Container c = getContentPane();
        c.setLayout(null);
        JLabel label = new JLabel("Escohla o tipo de conversão abaixo:");
        label.setBounds(5,-30, 250, 100);
        c.add(label);
        
         
        
//====buttons formatiing====         
        
        bt1 = new JButton("Moedas");
        bt1.addActionListener(this);
        bt1.setSize(130,25);
        bt1.setLocation(10,40);
        bt1.setBackground(Color.gray);
        bt1.setForeground(Color.blue);
        bt1.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.black));
        bt1.setEnabled(true);
        c.add(bt1);
        
        bt2 = new JButton("Comprimentos");
        bt2.addActionListener(this);
        bt2.setSize(130,25);
        bt2.setLocation(150,40);
        bt2.setBackground(Color.gray);
        bt2.setForeground(Color.blue);
        bt2.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.black));
        bt2.setEnabled(true);
        c.add(bt2);
        
        bt3 = new JButton("Sair");
        bt3.addActionListener(this);
        bt3.setSize(130,25);
        bt3.setLocation(80,80);
        bt3.setBackground(Color.gray);
        bt3.setForeground(Color.blue);
        bt3.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.black));
        bt3.setEnabled(true);
        c.add(bt3);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setTitle("TRABALHO_2");
        setSize(305,150);
        setVisible(true); 
        
    }//====end formatting====
    
//====actions====    

@Override
public void actionPerformed(ActionEvent e) {
        
//====coins===        
        if(e.getSource() == bt1){
            new Screen2();
            setVisible(false);
        }
        
//====meters====
        if(e.getSource() == bt2){
                new Screen3();
                setVisible(false);
        }
        
//====exit====
        if(e.getSource() == bt3){
            setVisible(false);
            dispose();
            System.exit(0);
        }
        
    }//====end the actions====
    
public static void main(String[] args)throws IOException{
        new Screen1();    
    }
}//====end the main screen====
