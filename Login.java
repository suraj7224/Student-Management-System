
package student.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    
     JButton b1,b2,b3;

     
     JTextField t1;
     JPasswordField t2;
     
        
     Login(){
                
         
                super("Login Page");
//        	new JFrame("Login Page ");
		setBounds(500,250,680,400);
		setLayout(null);
		setVisible(true);
               // setIconImage(creatImage("student/management/system/Icons/Logo.png").getImage());
                setResizable(false);
		getContentPane().setBackground(Color.WHITE);
                
		
		JPanel p1= new JPanel();
		p1.setLayout(null);
		p1.setBounds(20, 20,345 ,320);
     	        p1.setBackground(new Color(131,193,233));
		add(p1);
                
                
                ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("student/management/system/Icons/Logo.png"));
                this.setIconImage(i.getImage());
                

                ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("student/management/system/Icons/login.png"));
                Image i2=i1.getImage().getScaledInstance(260, 320,Image.SCALE_DEFAULT);
                ImageIcon i3=new ImageIcon(i2);
                JLabel l=new JLabel(i3);
                l.setBounds(380,20,275,320);
                add(l);
                

                JLabel l1=new JLabel("Username");
                l1.setBounds(50,20,200,20);
                l1.setFont(new Font("seria",Font.BOLD,18));
                l1.setForeground(Color.BLUE);
                p1.add(l1);
                
                t1= new JTextField();
                t1.setBounds(50, 60,250,30);
                t1.setBorder(BorderFactory.createEmptyBorder());
                t1.setFont(new Font("seria",Font.BOLD,18));
                p1.add(t1);
                
                JLabel l2=new JLabel("Password");
                l2.setBounds(50,110,200,20);
                l2.setFont(new Font("seria",Font.BOLD,18));
                l2.setForeground(Color.BLUE);
                p1.add(l2);
                
                t2= new JPasswordField();
                t2.setBounds(50, 150,250,30);
                t2.setFont(new Font("seria",Font.BOLD,18));
                t2.setBorder(BorderFactory.createEmptyBorder());
                p1.add(t2);
                
                b1= new JButton("Log In");
                b1.setBounds(50,200,100,30);
                b1.setBackground(Color.BLUE);
                b1.setBorder(BorderFactory.createEmptyBorder());
                b1.setForeground(Color.WHITE);
                b1.addActionListener(this);
                p1.add(b1);
                
                b2= new JButton("Sign Up");
                b2.setBounds(160,200,100,30);
                b2.setBackground(Color.BLUE);
                b2.setForeground(Color.WHITE);
                b2.setBorder(BorderFactory.createEmptyBorder());
                b2.addActionListener(this);
                p1.add(b2);
                
                b3= new JButton("Forgot Password");
                b3.setBounds(80,250,150,30);
                b3.setBackground(Color.BLUE);
                b3.setForeground(Color.WHITE);
                b3.addActionListener(this);
                b3.setBorder(BorderFactory.createEmptyBorder());
                p1.add(b3);
                
                
                

     }
     
     public void actionPerformed(ActionEvent ae){
     if(ae.getSource()==b1){
         
         try{
             
             conne c=new conne();
             String u=t1.getText();
             String p=t2.getText();
             
             String q="select * from account where username='"+u+"'and password='"+p+"'";
             
             ResultSet rs=c.s.executeQuery(q);
             
             if(rs.next()){
                 
                 JOptionPane.showMessageDialog(null,"Login Succesfully ");
                 new Loading(u).setVisible(true);
                 this.setVisible(false);
               
             }else{
                
                 JOptionPane.showMessageDialog(null,"Invalid Login ");
                 this.setVisible(false);
             
             }
         
         }catch(Exception e){
             
             e.printStackTrace();
     }  
       
//         JOptionPane.showMessageDialog(null,"Login Succesfully ");
//         this.setVisible(false);
//         new Student_Details().setVisible(true);
         
     }else if(ae.getSource()==b2){
         this.setVisible(false);
         new SignUp().setVisible(true);
        
         
     }else if(ae.getSource()==b3){
         this.setVisible(false);
         new ForgotPassword().setVisible(true);
     }
//     else{
//         
//         JOptionPane.showMessageDialog(null,"Invalid Login ");
//         setVisible(false);
//     }
//        
     }
    public static void main(String[] args){
        Login l=new Login();
    }
    
}

