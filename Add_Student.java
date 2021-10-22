
package student.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;



public class Add_Student extends JFrame implements ActionListener{
    
    /*
    JLabel l to l19
    JTextField t1 tot181
    JButton b,b1,b2,b3;
    */
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t10,t11;
    Choice c1,c2;
    JButton b1,b2;
    
  
    
    Add_Student(){
        
        super("New Student");
            
        
        setBounds(380,160,800,600);
        setLayout(null);
        setVisible(true);
        setResizable(false);
        
         ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("student/management/system/Icons/Logo.png"));
         this.setIconImage(i.getImage());
        
        JPanel p=new JPanel();
        p.setLayout(null);
        p.setBackground(new Color(131,193,233));
        p.setBounds(20,20,750,520);
        add(p);
        
        JLabel l=new JLabel(" New Student Details "); 
        l.setBounds(230,10,400,40);
        l.setFont(new Font("seria",Font.BOLD,32));
        l.setForeground(Color.orange);
        p.add(l);
        
        JLabel l1=new JLabel("Name");
        l1.setBounds(20,60,100,20);
        l1.setFont(new Font("Tahoma",Font.BOLD,18));
        l1.setForeground(Color.BLACK);
        p.add(l1);
        
        t1=new JTextField();
        t1.setBounds(130,60,160,20);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p.add(t1);
        
        JLabel l2=new JLabel("Father name");
        l2.setBounds(380,60,120,20);
        l2.setFont(new Font("Tahoma",Font.BOLD,18));
        l2.setForeground(Color.BLACK);
        p.add(l2);
        
        t2=new JTextField();
        t2.setBounds(510,60,160,20);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p.add(t2);
        
        JLabel l3=new JLabel("Age");
        l3.setBounds(20,110,100,20);
        l3.setFont(new Font("Tahoma",Font.BOLD,18));
        l3.setForeground(Color.BLACK);
        p.add(l3);
        
        t3=new JTextField();
        t3.setBounds(130,110,160,20);
        t3.setBorder(BorderFactory.createEmptyBorder());
        p.add(t3);
        
        JLabel l4=new JLabel("DOB");
        l4.setBounds(380,110,100,20);
        l4.setFont(new Font("Tahoma",Font.BOLD,18));
        l4.setForeground(Color.BLACK);
        p.add(l4);
        
        t4=new JTextField();
        t4.setBounds(510,110,160,20);
        t4.setBorder(BorderFactory.createEmptyBorder());
        p.add(t4);
        
        JLabel l5=new JLabel("Address");
        l5.setBounds(20,160,100,20);
        l5.setFont(new Font("Tahoma",Font.BOLD,18));
        l5.setForeground(Color.BLACK);
        p.add(l5);
        
        t5=new JTextField();
        t5.setBounds(130,160,160,20);
        t5.setBorder(BorderFactory.createEmptyBorder());
        p.add(t5);
        
        JLabel l6=new JLabel("Phone No");
        l6.setBounds(380,160,100,20);
        l6.setFont(new Font("Tahoma",Font.BOLD,18));
        l6.setForeground(Color.BLACK);
        p.add(l6);
        
        t6=new JTextField();
        t6.setBounds(510,160,160,20);
        t6.setBorder(BorderFactory.createEmptyBorder());
        p.add(t6);
        
        JLabel l7=new JLabel("Email ID");
        l7.setBounds(20,210,100,20);
        l7.setFont(new Font("Tahoma",Font.BOLD,18));
        l7.setForeground(Color.BLACK);
        p.add(l7);
        
        t7=new JTextField();
        t7.setBounds(130,210,160,20);
        t7.setBorder(BorderFactory.createEmptyBorder());
        p.add(t7);
        
        JLabel l8=new JLabel("Mobile No");
        l8.setBounds(380,210,100,20);
        l8.setFont(new Font("Tahoma",Font.BOLD,18));
        l8.setForeground(Color.BLACK);
        p.add(l8);
        
        t8=new JTextField();
        t8.setBounds(510,210,160,20);
        t8.setBorder(BorderFactory.createEmptyBorder());
        p.add(t8);
        
        JLabel l9=new JLabel("Year");
        l9.setBounds(20,260,100,20);
        l9.setFont(new Font("Tahoma",Font.BOLD,18));
        l9.setForeground(Color.BLACK);
        p.add(l9);
        
        c1=new Choice();
        c1.add("FE");
        c1.add("SE");
        c1.add("TE");
        c1.add("BE");
        c1.setBounds(130,260,160,30);
        p.add(c1);
        
        JLabel l10=new JLabel("Aadhar No");
        l10.setBounds(380,260,100,20);
        l10.setFont(new Font("Tahoma",Font.BOLD,18));
        l10.setForeground(Color.BLACK);
        p.add(l10);
        
        t10=new JTextField();
        t10.setBounds(510,260,160,20);
        t10.setBorder(BorderFactory.createEmptyBorder());
        p.add(t10);
        
        JLabel l11=new JLabel("Student ID");
        l11.setBounds(380,310,160,20);
        l11.setFont(new Font("Tahoma",Font.BOLD,18));
        l11.setForeground(Color.BLACK);
        p.add(l11);
        
        t11=new JTextField();
        t11.setBounds(510,310,160,20);
        t11.setBorder(BorderFactory.createEmptyBorder());
        p.add(t11);
        
        JLabel l12=new JLabel("Gender");
        l12.setBounds(20,310,100,20);
        l12.setFont(new Font("Tahoma",Font.BOLD,18));
        l12.setForeground(Color.BLACK);
        p.add(l12);
        
        c2=new Choice();
        c2.add("Male");
        c2.add("Female");
        c2.setBounds(130,310,160,30);
        p.add(c2);
        
        
      b1=new JButton("Submit");
      b1.setBackground(Color.BLUE);
      b1.setBounds(180,420,100, 25);
      b1.setForeground(Color.WHITE);
      b1.setBorder(BorderFactory.createEmptyBorder());
      b1.addActionListener(this);
      p.add(b1);
      
      b2=new JButton("Back");
      b2.setBackground(Color.BLUE);
      b2.setBounds(350,420,100, 25);
      b2.setForeground(Color.WHITE);
      b2.setBorder(BorderFactory.createEmptyBorder());
      b2.addActionListener(this);
      p.add(b2);
        
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
       
        String a=t1.getText();
        String b=t2.getText();
        String cc=t3.getText();
        String d=t4.getText();
        String e=t5.getText();
        String f=t6.getText();
        String g=t7.getText();
        String h=t8.getText();
        String j=c1.getSelectedItem();
        String k=t10.getText();
        String n=c2.getSelectedItem();
        String m=t11.getText();
        
        
        
        
        
        if(ae.getSource()==b1){
         
           try{ 
            conne c=new conne();
            String q="insert into student values('"+a+"' ,'"+b+"' ,'"+cc+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+j+"','"+k+"','"+n+"','"+m+"')";
            c.s.executeUpdate(q);
            
            JOptionPane.showMessageDialog(null,"Details Added Succesfully ");
            this.setVisible(false);
            new Student_Details().setVisible(true);   
          
           }catch(Exception ee){
            
              ee.printStackTrace();
           }             
          }else if(ae.getSource()==b2){
           
              this.setVisible(false);
              new Student_Details().setVisible(true);
          
          }
    
    }
    public static void main(String[] args){
          new Add_Student().setVisible(true);
    
    }
    
}
