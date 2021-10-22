
package student.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Search_Student extends JFrame implements ActionListener {
    
    JTextField t;
    JButton b1,b2;
    
    Search_Student(){
          
        
        super("Search");
        setResizable(false);
        setLayout(null);
        setBounds(500,300,600,300);
        getContentPane().setBackground(Color.WHITE);
        
//        JLabel l2=new JLabel();
//        l2.setBounds(0,0,600,350);
//        l2.setLayout(null);
//        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("student/management/system/Icons/Search.jpg"));
//        JLabel l3=new JLabel();
//        l3.setBounds(0,0,600,350);
        
         ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("student/management/system/Icons/Logo.png"));
         this.setIconImage(i.getImage());
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("student/management/system/Icons/Search.jpg"));
        Image i2=i1.getImage().getScaledInstance(600, 300,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l=new JLabel(i3);
        l.setBounds(0,0,600,300);
        add(l);
         
         JLabel l1=new JLabel("Search");
         l1.setBounds(90,50,140,40);
         l1.setFont(new Font("Arial",Font.BOLD,35));
         l1.setForeground(Color.RED);
         l.add(l1);
         
         t=new JTextField();
         t.setBounds(270,50,190,35);
         t.setBorder(BorderFactory.createEmptyBorder());
         t.setFont(new Font("Arial",Font.PLAIN,25));
         l.add(t);
         
         b1=new JButton("Submit");
         b1.setFont(new Font("Arial",Font.BOLD,18));
         b1.setBounds(150,150,120,35);
         b1.setBackground(Color.BLUE);
         b1.setForeground(Color.WHITE);
         b1.addActionListener(this);
         l.add(b1);
         
         b2=new JButton("Back");
         b2.setFont(new Font("Arial",Font.BOLD,18));
         b2.setBounds(310,150,120,35);
         b2.setBackground(Color.BLUE);
         b2.setForeground(Color.WHITE);
         b2.addActionListener(this);
         l.add(b2);
        
    
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==b1){
            this.setVisible(false);
            new Update_Student(t.getText());       
        }else if (ae.getSource()==b2){
            
            this.setVisible(false);
            new Student_Details().setVisible(true);
            
    }
    
    
    }
    
    public static void main(String[] args){
       new Search_Student().setVisible(true);
       
    }
    
}
