
package student.management.system;



import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.ImageIcon.*;



public class Student_Details extends JFrame implements ActionListener {
     
    JButton b1,b2,b3,b4;
    
    Student_Details(){
        
        super("Student Details");
      
        setBounds(550,250,680,500);
        setVisible(true);
        setResizable(false);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("student/management/system/Icons/Logo.png"));
        this.setIconImage(i.getImage());
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("student/management/system/Icons/Student.png"));   
        Image i2=i1.getImage().getScaledInstance(680,500,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l=new JLabel(i3);
        l.setLayout(null);
        l.setBounds(0,0,680,500);
        add(l);
        
//        JPanel p=new JPanel();
//        p.setLayout(null);
//        p.setBackground(new Color(131,193,233));
//        p.setBounds(20,20,540,320);
//        add(p);
        
         b1= new JButton("Add Student");
         b1.setBounds(100,80,180,40);
         b1.setBackground(Color.BLUE);
         b1.setForeground(Color.white);
         b1.setFont(new Font("seria",Font.BOLD,18));
         b1.addActionListener(this);
         l.add(b1);
         
//         JButton jb=new JButton();
//         jb.setIcon(new ImageIcon("c:\\users\\"));
       
         b2= new JButton("View Student");
         b2.setBounds(320,80,180,40);
         b2.setBackground(Color.BLUE);
         b2.setForeground(Color.white);
         b2.setFont(new Font("seria",Font.BOLD,16));
         b2.addActionListener(this);
         l.add(b2);
        
         
        b3= new JButton("Remove Student");
         b3.setBounds(100,140,180,40);
         b3.setBackground(Color.BLUE);
         b3.setForeground(Color.white);
         b3.setFont(new Font("seria",Font.BOLD,16));
         b3.addActionListener(this);
         l.add(b3);
        
         b4= new JButton("Update Student");
         b4.setBounds(320,140,180,40);
         b4.setBackground(Color.BLUE);
         b4.setForeground(Color.white);
         b4.setFont(new Font("seria",Font.BOLD,16));
         b4.addActionListener(this);
         l.add(b4);
        
        
    
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
        this.setVisible(false);
        new Add_Student().setVisible(true);
        
        
        }else if (ae.getSource()==b2){
          this.setVisible(false);
          new View_Student().setVisible(true);
          
        
        }else if (ae.getSource()== b3){
        this.setVisible(false);
        new Remove_Student().setVisible(true);
        
        
        }else if(ae.getSource()== b4){
        this.setVisible(false);
        new Search_Student().setVisible(true);
        
        
        }
    
    }
    public static void main(String[] args){
      new Student_Details().setVisible(true);
     }
    
}
