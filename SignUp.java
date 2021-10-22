
package student.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignUp extends JFrame implements ActionListener {
    
     JButton b1,b2;
     JTextField t1,t2,t3,t5;
     Choice c1;
   
    SignUp(){
        
         super("Sign Up Form");
         setBounds(400,250,800,400);
         setLayout(null);
         setResizable(false);
         getContentPane().setBackground(Color.WHITE);
         
          ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("student/management/system/Icons/Logo.png"));
          this.setIconImage(i.getImage());
         
         JPanel p1=new JPanel();
         p1.setBounds(20,20,450,320);
         p1.setBackground(new Color(131,193,233));
         p1.setLayout(null);
         add(p1); 
         
         
         
         JLabel l1= new JLabel("Username");
         l1.setBounds(20,20,100,20);   
         l1.setFont(new Font("Tahoma",Font.BOLD,16));
         p1.add(l1);
         
         t1= new JTextField();
         t1.setBounds(220, 20,200,30);
         t1.setBorder(BorderFactory.createEmptyBorder());
         p1.add(t1);
         
         JLabel l2= new JLabel("Name");
         l2.setBounds(20,60,100,20);   
         l2.setFont(new Font("Tahoma",Font.BOLD,16));
         p1.add(l2);
         
         t2= new JTextField();
         t2.setBounds(220, 60,200,30);
         t2.setBorder(BorderFactory.createEmptyBorder());
         p1.add(t2);
         
         JLabel l3= new JLabel("Password");
         l3.setBounds(20,100,100,20);   
         l3.setFont(new Font("Tahoma",Font.BOLD,16));
         p1.add(l3);
         
         t3= new JTextField();
         t3.setBounds(220, 100,200,30);
         t3.setBorder(BorderFactory.createEmptyBorder());
         p1.add(t3);
      
         JLabel l4= new JLabel("Your Security Question");
         l4.setBounds(20,140,190,30);   
         l4.setFont(new Font("Tahoma",Font.BOLD,16));
         p1.add(l4);
         
         c1=new Choice();
         c1.add("Your favourite game?");
         c1.add("Your Role Model");
         c1.add("Your Nickname ?");
         c1.add("Your Best Book ?");
         c1.add("Your Lucky Number ?");
         c1.setBounds(220,140,200,30);
         p1.add(c1);
         
         JLabel l5= new JLabel("Answer");
         l5.setBounds(20,190,100,20);   
         l5.setFont(new Font("Tahoma",Font.BOLD,16));
         p1.add(l5);
         
         t5= new JTextField();
         t5.setBounds(220, 180,200,30);
         t5.setBorder(BorderFactory.createEmptyBorder());
         p1.add(t5);
      
         b1= new JButton("Create");
         b1.setBounds(40,250,90,30);
         b1.setBackground(Color.BLUE);
         b1.setForeground(Color.white);
         b1.setFont(new Font("Tahoma",Font.BOLD,16));
         b1.addActionListener(this);
         p1.add(b1);
         
         b2= new JButton("Back");
         b2.setBounds(190,250,90,30);
         b2.setBackground(Color.BLUE);
         b2.setForeground(Color.white);
         b2.setFont(new Font("Tahoma",Font.BOLD,16));
         b2.addActionListener(this);
         p1.add(b2);
         
          ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("student/management/system/Icons/SignUp.png"));
          Image i2=i1.getImage().getScaledInstance(260, 320,Image.SCALE_DEFAULT);
          ImageIcon i3=new ImageIcon(i2);
          JLabel l=new JLabel(i3);
          l.setBounds(490,20,275,320);
          add(l);
         
//         ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("main/java/com/mycompany/studentmanagementsystem/Icons/SignUp.png"));
//         JLabel l6=new JLabel(i1);
//         l6.setBounds(490,30,100,100);
//         add(l6);
    }
    
    public void actionPerformed(ActionEvent ae){
     if(ae.getSource()== b1){
         
        String username= t1.getText();
        String name= t2.getText();
        String password= t3.getText();
        String security=c1.getSelectedItem();
        String answer=t5.getText();
        
        String query="insert into account values('"+username+"','"+name+"','"+password+"','"+security+"','"+answer+"')";
        
        try{
        
           conne c=new conne();
           c.s.executeUpdate(query);
           
        JOptionPane.showMessageDialog(null,"Account created Succesfully ");
           
         this.setVisible(false);
         new Login().setVisible(true);
           
        }catch(Exception e){
            
        
        }
         
        // JOptionPane.showMessageDialog(null,"Sign UP Succesfully ");
        // setVisible(false);
        // new Login().setVisible(true);
         
         
     }else if(ae.getSource()==b2){
         new Login().setVisible(true);
         this.setVisible(false);
         
     }else{
         
     }
     
     }
    
    public static void main(String[] args){
        new SignUp().setVisible(true);
    }
    
}