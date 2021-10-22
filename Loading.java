
package student.management.system;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;


public class Loading extends JFrame implements Runnable  {
    
    JProgressBar p;
    Thread t;
    
    public void run(){
     
        try{
            
            for(int i=1;i<=101;i++){
            
                int m=p.getMaximum();
                int n=p.getValue();
                
                if(n<m){
                    
                    p.setValue(p.getValue()+1);
//                    if(n<=m){
//                   this.setVisible(false);
//                   new Student_Details().setVisible(true);
//                    }
                    
                }else{
                     i=101;
                   this.setVisible(false);
                   new Student_Details().setVisible(true);
            }
                Thread.sleep(50);
            }
            
        
        }catch(Exception e){}
    
    }
    
    
    Loading(String user){
        
        super("Loading");
        String Username=user;
        
        t=new Thread(this);
        
   
    
     setVisible(true);
     setBounds(650,250,800,500);
     getContentPane().setBackground(Color.WHITE);
     setResizable(false);
     setLayout(null);
     
      ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("student/management/system/Icons/Logo.png"));
      this.setIconImage(i.getImage());
     
     
     
     JLabel l=new JLabel("Student Management System");
     l.setBounds(140,20,600,40);
     l.setFont(new Font("Raleway",Font.BOLD,35));
     l.setForeground(Color.BLUE);
     add(l);
     
    p=new JProgressBar();
    p.setStringPainted(true);
    p.setBounds(210,100,350,25);
    add(p);
    
     JLabel l1=new JLabel("Please Wait...");
     l1.setBounds(310,140,150,20);
     l1.setFont(new Font("Tahoma",Font.BOLD,18));
     l1.setForeground(Color.RED);
     add(l1);
     
     JLabel l2=new JLabel("Welcome"+" "+Username);
     l2.setBounds(20,420,150,20);
     l2.setFont(new Font("Tahoma",Font.BOLD,18));
     l2.setForeground(Color.RED);
     add(l2);
     t.start();
    
    }


//    public void actionPerformed(ActionEvent ae){
//
//}
    public static void main(String[] args){
      new Loading("").setVisible(true);
    
    }
    
    
}
