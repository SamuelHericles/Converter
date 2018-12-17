package AllScreens;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
        
public class Screen3 extends JFrame implements ActionListener{
    
    JButton bt11,bt12,bt13,bt14,bt15,bt16,bt17,bt18,bt19,bt20,bt21,bt22,bt23,bt24,bt25;   
    double n1;
    Container g = getContentPane();
    JFrame tela2  = new JFrame();
    JLabel label = new JLabel();
    
public Screen3(){
        
//====FOMATACAO DA JANELA====  

        g.setLayout(null);
        setTitle("Escolha o tipo de conversão:");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setSize(325,375);
        setVisible(true); 
        JLabel label1 = new JLabel("-Escohla a medida (teclas cinzas)");
        JLabel label2 = new JLabel("-conversão (teclas azuis)");
        label1.setBounds(5,-30, 250, 100);
        label2.setBounds(5,-15,250,100);
        g.add(label2);
        g.add(label1);
        
//====FOMATACAO DO LABEL====

        label.setBounds(75,225,190,100);  
        g.add(label);
        
//====FOMATACAO DOS BOTOES====

        bt11 = new JButton("Quilômetro(Km)");
        bt11.addActionListener(this);
        bt11.setSize(130,25);
        bt11.setLocation(10,55);
        bt11.setBackground(Color.gray);
        bt11.setForeground(Color.blue);
        bt11.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.black));
        bt11.setEnabled(true);
        g.add(bt11);
        
        bt12 = new JButton("Metros(m)");
        bt12.addActionListener(this);
        bt12.setSize(130,25);
        bt12.setLocation(10,85);
        bt12.setBackground(Color.gray);
        bt12.setForeground(Color.blue);
        bt12.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.black));
        bt12.setEnabled(true);
        g.add(bt12);
        
        bt13 = new JButton("Centrímetros(cm)");
        bt13.addActionListener(this);
        bt13.setSize(130,25);
        bt13.setLocation(10,115);
        bt13.setBackground(Color.gray);
        bt13.setForeground(Color.blue);
        bt13.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.black));
        bt13.setEnabled(true);        
        g.add(bt13);

        bt14 = new JButton("Milímetro(mm)");
        bt14.addActionListener(this);
        bt14.setSize(130,25);
        bt14.setLocation(10,145);
        bt14.setBackground(Color.gray);
        bt14.setForeground(Color.blue);
        bt14.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.black));
        bt14.setEnabled(true);
        g.add(bt14);
        
        bt15 = new JButton("Milha(mh)");
        bt15.addActionListener(this);
        bt15.setSize(130,25);
        bt15.setLocation(10,175);
        bt15.setBackground(Color.gray);
        bt15.setForeground(Color.blue);
        bt15.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.black));
        bt15.setEnabled(true);
        g.add(bt15);
        
        bt16 = new JButton("pé");
        bt16.addActionListener(this);
        bt16.setSize(130,25);
        bt16.setLocation(10,205);
        bt16.setBackground(Color.gray);
        bt16.setForeground(Color.blue);
        bt16.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.black));
        bt16.setEnabled(true);
        g.add(bt16);
        
        bt17 = new JButton("polegadas(inches)");
        bt17.addActionListener(this);
        bt17.setEnabled(true);
        bt17.setSize(130,25);
        bt17.setLocation(10,235);
        bt17.setBackground(Color.gray);
        bt17.setForeground(Color.blue);
        bt17.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.black));
        bt17.setEnabled(true);
        g.add(bt17);
        
//====PARA====
        bt19 = new JButton("Para quilômetro(Km)");
        bt19.addActionListener(this);
        bt19.setSize(150,25);
        bt19.setLocation(150,55);
        bt19.setBackground(Color.cyan);
        bt19.setForeground(Color.blue);
        bt19.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.black));
        bt19.setEnabled(true);
        g.add(bt19);
 
        bt20 = new JButton("Para metros(m)");
        bt20.addActionListener(this);
        bt20.setSize(150,25);
        bt20.setLocation(150,85);
        bt20.setBackground(Color.cyan);
        bt20.setForeground(Color.blue);
        bt20.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.black));
        bt20.setEnabled(true);
        g.add(bt20);
        
        bt21 = new JButton("Para centrímetros(cm)");
        bt21.addActionListener(this);
        bt21.setSize(150,25);
        bt21.setLocation(150,115);
        bt21.setBackground(Color.cyan);
        bt21.setForeground(Color.blue);
        bt21.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.black));
        bt21.setEnabled(true);        
        g.add(bt21);
        
        bt22 = new JButton("Para milímetro(mm)");       
        bt22.addActionListener(this);
        bt22.setSize(150,25);
        bt22.setLocation(150,145);
        bt22.setBackground(Color.cyan);
        bt22.setForeground(Color.blue);
        bt22.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.black));
        bt22.setEnabled(true);
        g.add(bt22);
        
        bt23 = new JButton("Para milha(mh)");
        bt23.addActionListener(this);
        bt23.setSize(150,25);
        bt23.setLocation(150,175);
        bt23.setBackground(Color.cyan);
        bt23.setForeground(Color.blue);
        bt23.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.black));
        bt23.setEnabled(true);
        g.add(bt23);
        
        bt24 = new JButton("Para pés");
        bt24.addActionListener(this);
        bt24.setSize(150,25);
        bt24.setLocation(150,205);
        bt24.setBackground(Color.cyan);
        bt24.setForeground(Color.blue);
        bt24.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.black));
        bt24.setEnabled(true);        
        g.add(bt24);
        
        bt25 = new JButton("Para polegadas(inches)");
        bt25.addActionListener(this);
        bt25.setSize(150,25);
        bt25.setLocation(150,235);
        bt25.setBackground(Color.cyan);
        bt25.setForeground(Color.blue);
        bt25.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.black));
        bt25.setEnabled(true);        
        g.add(bt25);

        bt18 = new JButton("Voltar");
        bt18.addActionListener(this);
        bt18.setSize(150,25);
        bt18.setLocation(75,295);
        bt18.setBackground(Color.gray);
        bt18.setForeground(Color.blue);
        bt18.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.black));
        bt18.setEnabled(true);
        g.add(bt18);

    }//====FIM DA FOMATACAO
    
//====ACOES====

@Override
public void actionPerformed(ActionEvent e) {
        
//===ENTRADA====
    if(e.getSource() == bt11){
        try{
        n1=Double.parseDouble(JOptionPane.showInputDialog("Digite o compirmento em quilômetros(km): "));
        }
        catch(NumberFormatException ex){
        n1=Double.parseDouble(JOptionPane.showInputDialog("Digite novamente: "));
        }
        label.setText("O que foi digitado: "+String.valueOf(n1)+" km");        
        n1*=1000;   
    }
    if(e.getSource() == bt12){
        try{
        n1=Double.parseDouble(JOptionPane.showInputDialog("Digite o compirmento em metros(m): "));
        }
        catch(NumberFormatException ex){
        n1=Double.parseDouble(JOptionPane.showInputDialog("Digite novamente: "));
        }        
        label.setText("O que foi digitado: "+String.valueOf(n1)+" m"); 
    }
    if(e.getSource() == bt13){
        try{
        n1=Double.parseDouble(JOptionPane.showInputDialog("Digite o compirmento em centimetros(cm): "));
        }
        catch(NumberFormatException ex){
        n1=Double.parseDouble(JOptionPane.showInputDialog("Digite novamente: "));
        }        
        label.setText("O que foi digitado: "+String.valueOf(n1)+" cm"); 
        n1/=100;  
    }
    if(e.getSource() == bt14){
        try{
        n1=Double.parseDouble(JOptionPane.showInputDialog("Digite o compirmento em milimetros(mm): "));
        }
        catch(NumberFormatException ex){
        n1=Double.parseDouble(JOptionPane.showInputDialog("Digite novamente: "));
        }
        label.setText("O que foi digitado: "+String.valueOf(n1)+" mm"); 
        n1/=1000;  
    }  
    if(e.getSource() == bt15){
        try{
        n1=Double.parseDouble(JOptionPane.showInputDialog("Digite o compirmento em milha(mh): "));
        }
        catch(NumberFormatException ex){
        n1=Double.parseDouble(JOptionPane.showInputDialog("Digite novamente: "));
        }
        label.setText("O que foi digitado: "+String.valueOf(n1)+" mh"); 
        n1*=1609.34;  
    }  
    if(e.getSource() == bt16){
        try{
        n1=Double.parseDouble(JOptionPane.showInputDialog("Digite o compirmento em pé: "));
        }
        catch(NumberFormatException ex){
        n1=Double.parseDouble(JOptionPane.showInputDialog("Digite novamente: "));
        }
        if(n1==1.0)
            label.setText("O que foi digitado: "+String.valueOf(n1)+" pé"); 
        else
            label.setText("O que foi digitado: "+String.valueOf(n1)+" pés"); 
        n1/=3.28084;
    }  
    if(e.getSource() == bt17){
        try{
        n1=Double.parseDouble(JOptionPane.showInputDialog("Digite o compirmento em polegadas: "));
        }
        catch(NumberFormatException ex){
        n1=Double.parseDouble(JOptionPane.showInputDialog("Digite novamente: "));
        }
        if(n1==1.0)
            label.setText("O que foi digitado: "+String.valueOf(n1)+" polegada"); 
        else
            label.setText("O que foi digitado: "+String.valueOf(n1)+" polegadas"); 
        n1/=39.3701;
    }
//====CONVERSOES====
    if(e.getSource() == bt19){
        JOptionPane.showMessageDialog(null," "+n1/1000+" Km");        
    }
    if(e.getSource() == bt20){
        JOptionPane.showMessageDialog(null," "+n1+" m");
    }
    if(e.getSource() == bt21){
        JOptionPane.showMessageDialog(null," "+n1*100+" cm");
    }
    if(e.getSource() == bt22){
        JOptionPane.showMessageDialog(null," "+n1*1000+" mm");
    }  
    if(e.getSource() == bt23){
        JOptionPane.showMessageDialog(null," "+n1/1609.34+" mh");
    }  
    if(e.getSource() == bt24){
        JOptionPane.showMessageDialog(null," "+n1*3.28084+" pés");
    }  
    if(e.getSource() == bt25){
        JOptionPane.showMessageDialog(null," "+n1*39.371+" in");
    }
//====VOLTAR====
    if(e.getSource() == bt18){
        setVisible(false);
        new Screen1();
    }
    
  }//====FIM DAS ACOES====
    
}//====FIM DA TELA DE CONVERSOES DE MEDIDAS====