
package student.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


 
public class ForgotPassword extends JFrame implements ActionListener {
    
    JTextField t1,t2,t3,t4,t5;
    JButton b1,b2,b3;
    
    ForgotPassword(){
        
      super("Forgot Password ");  
     
      setBounds(550,250,600,400);
      getContentPane().setBackground(Color.WHITE);
      setVisible(true);
      setResizable(false);
      setLayout(null);
      
       ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("student/management/system/Icons/Logo.png"));
       this.setIconImage(i.getImage());
      
      JPanel p=new JPanel();
      p.setLayout(null);
      p.setBounds(20,20,500,320);
      p.setBackground(new Color(131,193,233));
      add(p);
      
      JLabel l1=new JLabel("Username");
      l1.setBounds(20,10,100,20);
      l1.setFont(new Font("Tahoma",Font.BOLD,15));
      p.add(l1);
      
      t1=new JTextField();
      t1.setBounds(220, 10, 140,20);
      t1.setBorder(BorderFactory.createEmptyBorder());
      p.add(t1);
      
      b1=new JButton("Search");
      b1.setBackground(Color.BLUE);
      b1.setBounds(370,10,90, 20);
      b1.setForeground(Color.WHITE);
      b1.setBorder(BorderFactory.createEmptyBorder());
      b1.addActionListener(this);
      p.add(b1);
      
      
      JLabel l2=new JLabel("Name");
      l2.setBounds(20,50,100,20);
      l2.setFont(new Font("Tahoma",Font.BOLD,15));
      p.add(l2);
      
      t2=new JTextField();
      t2.setBounds(220, 50, 140,20);
      t2.setBorder(BorderFactory.createEmptyBorder());
      p.add(t2);
      
      JLabel l3=new JLabel("Your Security Question");
      l3.setBounds(20,90,200,20);
      l3.setForeground(Color.red);
      l3.setFont(new Font("Tahoma",Font.BOLD,15));
      p.add(l3);
      
      t3=new JTextField();
      t3.setBounds(220, 90, 140,20);
      t3.setBorder(BorderFactory.createEmptyBorder());
      p.add(t3);
      
      JLabel l4=new JLabel("Answer");
      l4.setBounds(20,130,100,20);
      l4.setFont(new Font("Tahoma",Font.BOLD,16));
      p.add(l4);
      
      t4=new JTextField();
      t4.setBounds(220, 130, 140,20);
      t4.setBorder(BorderFactory.createEmptyBorder());
      p.add(t4);
      
      b2=new JButton("Retrive");
      b2.setBackground(Color.BLUE);
      b2.setBounds(370,130,90, 20);
      b2.setForeground(Color.WHITE);
      b2.setBorder(BorderFactory.createEmptyBorder());
      b2.addActionListener(this);
      p.add(b2);
      
      JLabel l5=new JLabel("Password");
      l5.setBounds(20,170,100,20);
      l5.setFont(new Font("Tahoma",Font.BOLD,16));
      p.add(l5);
      
      t5=new JTextField();
      t5.setBounds(220, 170, 140,20);
      t5.setBorder(BorderFactory.createEmptyBorder());
      p.add(t5);
      
      b3=new JButton("Back");
      b3.setBackground(Color.BLUE);
      b3.setBounds(160,220,120,30);
      b3.setForeground(Color.WHITE);
      b3.setBorder(BorderFactory.createEmptyBorder());
      b3.addActionListener(this);
      p.add(b3);
      
      }
      
      public void actionPerformed(ActionEvent ae){
          
          conne c=new conne();
          
          if(ae.getSource()==b1){
             try{ 
              String sql="select * from account where username= '"+t1.getText()+"'";
              ResultSet rs=c.s.executeQuery(sql);
              
              while(rs.next()){
              
                  t2.setText(rs.getString("name"));
                  t3.setText(rs.getString("security"));       
              }
             
             }catch(Exception e){
             
             }
             
          }else if(ae.getSource()==b2){
              
              
              
               try{ 
              String sql="select * from account where answer= '"+t4.getText()+"'";
              ResultSet rs=c.s.executeQuery(sql);
              
              while(rs.next()){
              
                  
                  t5.setText(rs.getString("password"));       
              }
             
             }catch(Exception e){
             
             }
          
          }else if(ae.getSource()==b3){
           this.setVisible(false);
           new Login().setVisible(true);
          }
      }
      
      
      
      
              
              
      
     
     public static void main(String[] args){
           new ForgotPassword().setVisible(true);
     }
}

