
package student.management.system;


 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class View_Student extends JFrame implements ActionListener{
    
    JButton b1,b2;
    JTextField t1;
    
    View_Student(){
        
        super("View Student Details");
        setBounds(500,200,610,390);
        setLayout(null);
        setResizable(false);
        getContentPane().setBackground(Color.WHITE);
        
        
       ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("student/management/system/Icons/Logo.png"));
       this.setIconImage(i.getImage());
        
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("student/management/system/Icons/viewStudent.png"));
        Image i2=i1.getImage().getScaledInstance(600, 350,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l=new JLabel(i3);
        l.setBounds(0,0,600,350);
        add(l);
        
//        JPanel p=new JPanel();
//        p.setLayout(null);
//        p.setBounds(20,20,380,170);
//        p.setBackground(new Color(131,193,233));
//        add(p);
        
        JLabel l1=new JLabel("Student ID");
        l1.setBounds(100,80,220,30);
        l1.setFont(new Font("Arial",Font.BOLD,28));
        l1.setForeground(Color.ORANGE);
        l.add(l1);
        
        t1=new JTextField();
        t1.setBounds(260,80,220,30);
        t1.setFont(new Font("Tohoma",Font.PLAIN,26));
        t1.setBorder(BorderFactory.createEmptyBorder());
        l.add(t1);
        
        b1=new JButton("Search");
        b1.setBounds(140,180,100,40);
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Arial",Font.BOLD,18));
        b1.setBorder(BorderFactory.createEmptyBorder());
        b1.addActionListener(this);
        l.add(b1);
        
        b2=new JButton("Back");
        b2.setBounds(290,180,100,40);
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("Arial",Font.BOLD,18));
        b2.setBorder(BorderFactory.createEmptyBorder());
        b2.addActionListener(this);
        l.add(b2);
        
        
    
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==b1){
            this.setVisible(false);
            new PrintData(t1.getText()).setVisible(true);
        
        }else if(ae.getSource()==b2){
            
            this.setVisible(false);
            new Student_Details().setVisible(true);
        
        }
        
    }
    public static void main(String[] args){
      new View_Student().setVisible(true);
    }
    
}
