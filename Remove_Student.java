
package student.management.system;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class Remove_Student extends JFrame implements ActionListener  {
    
    JTextField t;
    JLabel l2,l3,l4,l5,l6,l7;
    JButton b,b1,b2,b3;
    Remove_Student(){
     
        super("Remove Student");
        
        setBounds(600,200,550,550);
        setVisible(true);
        setResizable(false);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
         ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("student/management/system/Icons/Logo.png"));
         this.setIconImage(i.getImage());
         
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("student/management/system/Icons/remove.jpg"));
        Image i2=i1.getImage().getScaledInstance(550, 550,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l=new JLabel(i3);
        l.setBounds(0,0,550,550);
        add(l);
        
        JLabel l1=new JLabel("Student ID");
        l1.setBounds(120,50,200,35);
        l1.setBackground(Color.MAGENTA);
        l1.setFont(new Font("serial",Font.BOLD,25));
        l.add(l1);
        
        t=new JTextField();
        t.setBounds(280,50,180,35);
        t.setFont(new Font("serial",Font.PLAIN,30));
        t.setBorder(BorderFactory.createEmptyBorder());
        l.add(t);
        
        b=new JButton("search");
        b.setBounds(180,120,110,35);
        b.setBackground(Color.BLUE);
        b.setForeground(Color.WHITE);
        b.addActionListener(this);
        l.add(b);
        
        b1=new JButton("Back");
        b1.setBounds(340,120,110,35);
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l.add(b1);
        
        l2=new JLabel("Name :");
        l2.setBounds(50,200,150,25);
        l2.setBackground(Color.MAGENTA);
        l2.setFont(new Font("Tahoma",Font.BOLD,20));
        l.add(l2);
        
        l3=new JLabel();
        l3.setBounds(180,200,200,25);
        l3.setBackground(Color.WHITE);
        l3.setFont(new Font("Tahoma",Font.BOLD,20));
        l.add(l3);
        
        l4=new JLabel("Email id :");
        l4.setBounds(50,250,150,25);
        l4.setBackground(Color.MAGENTA);
        l4.setFont(new Font("Tahoma",Font.BOLD,20));
        l.add(l4);
        
        l5=new JLabel();
        l5.setBounds(180,250,350,25);
        l5.setBackground(Color.WHITE);
        l5.setFont(new Font("Tahoma",Font.BOLD,20));
        l.add(l5);
        
        l6=new JLabel("Mobile No : ");
        l6.setBounds(50,300,200,25);
        l6.setBackground(Color.MAGENTA);
        l6.setFont(new Font("Tahoma",Font.BOLD,20));
        l.add(l6);
        
        l7=new JLabel();
        l7.setBounds(180,300,200,25);
        l7.setBackground(Color.WHITE);
        l7.setFont(new Font("Tahoma",Font.BOLD,20));
        l.add(l7);
        
        b2=new JButton("Remove");
        b2.setBounds(160,370,110,35);
        b2.setBackground(Color.BLUE);
        b2.addActionListener(this);
        b2.setForeground(Color.WHITE);
        l.add(b2);
        
        b3=new JButton("Cancel");
        b3.setBounds(310,370,110,35);
        b3.setBackground(Color.BLUE);
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        l.add(b3);
        
        l2.setVisible(false);
        l4.setVisible(false);
        l6.setVisible(false);
        b2.setVisible(false);
        b3.setVisible(false);
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
    
        
        if(ae.getSource()==b){
        try{
             conne c=new conne();
             String str="select name,mobile_no,email_id from student where stu_id ='"+t.getText()+"' ";
             ResultSet rs =c.s.executeQuery(str);
             
             int i=0;
             if(rs.next()){
             
             String name=rs.getString("name");
             String Email=rs.getString("email_id");
             String Mobile=rs.getString("mobile_no");
             
             l2.setVisible(true);
             l4.setVisible(true);
             l6.setVisible(true);
             b2.setVisible(true);
             b3.setVisible(true);
             
             i=1;
             l3.setText(name);
             l5.setText(Email);
             l7.setText(Mobile);
             
             }
             
             if(i==0)
                 JOptionPane.showMessageDialog(null,"ID not found");
             
        
        }catch(Exception ex){}
        
        }
        
        if(ae.getSource()==b2){
        
            try{
                
                conne cc=new conne();
                String SQL="delete from student where stu_id='"+t.getText()+"'";
                cc.s.executeUpdate(SQL);
                JOptionPane.showMessageDialog(null,"Deleted successfully");
                
                l2.setVisible(false);
                l3.setVisible(false);
                l4.setVisible(false);
                l5.setVisible(false);
                l6.setVisible(false);
                l7.setVisible(false);
                
                
                
            
            }catch(Exception ex){
            
            JOptionPane.showMessageDialog(null,"Execution occured while deleting data"+ex);
            }
        }
            if(ae.getSource()==b1){
                
               this.setVisible(false);
               new Student_Details().setVisible(true);
            
            }
            
             if(ae.getSource()==b3){
             
               this.setVisible(false);
               new Student_Details().setVisible(true);
             }
        
    }   
          
        
        


public static void main(String[] args){
   new Remove_Student().setVisible(true);
   
}
    
}
