package AllScreens;

//import com.sun.xml.internal.ws.util.StringUtils;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
    
public class Screen2 extends JFrame implements ActionListener{

    JButton bt4,bt5,bt6,bt7,bt8,bt9,bt10;
    double num;
   
public Screen2(){
       
 //====window formatting====   
 
        JFrame Screen2 = new JFrame();
        Container d = getContentPane();
        d.setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setTitle("TRABALHO_2");
        setSize(305,200);
        setVisible(true); 
        JLabel label = new JLabel("Escohla o tipo de cambio abaixo:");
        label.setBounds(5,-30, 250, 100);
        d.add(label);
   
 //====buttons formatting====      
 
        bt4 = new JButton("Real->Dolar");
        bt4.addActionListener(this);
        bt4.setSize(130,25);
        bt4.setLocation(10,40);
        bt4.setBackground(Color.gray);
        bt4.setForeground(Color.blue);
        bt4.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.black));
        bt4.setEnabled(true);
        d.add(bt4);
        
        bt5 = new JButton("Real->Euro");
        bt5.addActionListener(this);
        bt5.setSize(130,25);
        bt5.setLocation(150,40);
        bt5.setBackground(Color.gray);
        bt5.setForeground(Color.blue);
        bt5.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.black));
        bt5.setEnabled(true);
        d.add(bt5);
        
        bt6 = new JButton("Dolar->Real");
        bt6.addActionListener(this);
        bt6.setSize(130,25);
        bt6.setLocation(10,70);
        bt6.setBackground(Color.gray);
        bt6.setForeground(Color.blue);
        bt6.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.black));
        bt6.setEnabled(true);
        d.add(bt6);
        
        bt7 = new JButton("Dolar->Euro");
        bt7.addActionListener(this);
        bt7.setSize(130,25);
        bt7.setLocation(150,70);
        bt7.setBackground(Color.gray);
        bt7.setForeground(Color.blue);
        bt7.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.black));
        bt7.setEnabled(true);
        d.add(bt7);
        
        bt8 = new JButton("Euro->Real");
        bt8.addActionListener(this);
        bt8.setSize(130,25);
        bt8.setLocation(10,100);
        bt8.setBackground(Color.gray);
        bt8.setForeground(Color.blue);
        bt8.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.black));
        bt8.setEnabled(true);
        d.add(bt8);
        
        bt9 = new JButton("Euro->Dolar");
        bt9.addActionListener(this);
        bt9.setSize(130,25);
        bt9.setLocation(150,100);
        bt9.setBackground(Color.gray);
        bt9.setForeground(Color.blue);
        bt9.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.black));
        bt9.setEnabled(true);
        d.add(bt9);
            
        bt10 = new JButton("Voltar");
        bt10.addActionListener(this);
        bt10.setSize(130,25);
        bt10.setLocation(80,130);
        bt10.setBackground(Color.gray);
        bt10.setForeground(Color.blue);
        bt10.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.black));
        bt10.setEnabled(true);
        d.add(bt10);

    }
   
//====actions====
   
@Override
public void actionPerformed(ActionEvent e){

//REAL
//====REAL to DOLAR====
        if(e.getSource() == bt4){
            try{
            num = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em reais R$"));
            }
            catch(NumberFormatException ex){
            num = Double.parseDouble(JOptionPane.showInputDialog("Digite novamente:"));
            }
            JOptionPane.showMessageDialog(null, "$" + num*0.305385);
            setVisible(false);
            new Screen2();
        }
//====REAL to EURO===
        if(e.getSource() == bt5){
            try{
            num = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em reais R$"));
            }
            catch(NumberFormatException nfe){
            num = Double.parseDouble(JOptionPane.showInputDialog("Digite novamente:"));
            }
            JOptionPane.showMessageDialog(null, "€" + num*0.273752857 );
            setVisible(false);
            new Screen2();
        }
        
//DOLAR
//====DOLAR to REAL====
        if(e.getSource() == bt6){
            try{
            num = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em Dolares $"));
            }
            catch(NumberFormatException nfe){     
            num = Double.parseDouble(JOptionPane.showInputDialog("Digite novamente:"));
            }
            JOptionPane.showMessageDialog(null, "R$" + num*3.27455507);
            setVisible(false);
            new Screen2();
        }
//====DOLAR to EURO====
        if(e.getSource() == bt7){
            try{
            num = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em dolar $"));
            }
            catch(NumberFormatException nfe){
            num = Double.parseDouble(JOptionPane.showInputDialog("Digite novamente:"));
            }
            JOptionPane.showMessageDialog(null, "€" + num*0.896418807);
            setVisible(false);
            new Screen2();   
        }

//EURO
//====EURO to REAL====
        if(e.getSource() == bt8){
            try{
            num = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em euro €"));
            }
            catch(NumberFormatException nfe){
            num = Double.parseDouble(JOptionPane.showInputDialog("Digite novamente:"));
            }
            JOptionPane.showMessageDialog(null, "R$" + num*3.6642435);
            setVisible(false);
            new Screen2();
        }

//====EURO to DOLAR====
        if(e.getSource() == bt9){
            try{
            num = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em euro €:"));
            }
            catch(NumberFormatException nfe){
            num = Double.parseDouble(JOptionPane.showInputDialog("Digite novamente:"));
            }
            JOptionPane.showMessageDialog(null, "$" + num*1.11745);
            setVisible(false);
            new Screen2();
        }
        
//====to back====
        if(e.getSource() == bt10){
            setVisible(false);
            new Screen1();
        }//==FIM DAS AÇÕES====
    } 
}//====end the currency conversions screen ====