
package student.management.system;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class PrintData extends JFrame implements ActionListener{
    /*JFrame f;
    JLabel id8,id,aid,id1,aid1,id2,aid2,id3,aid3,id4,aid4,id5,aid5,id6,aid6,id7,aid7,id9,id10,id11,id12,id13,id14,id15,id16,id17,lab;
    String std_id,name,father,address,phone,email,gender,year,age,dob,aadhar,mobile;
    JButton b1,b2;
    ImageIcon icon;*/
    JButton b1,b2;
     String stu_id,name,father,address,phone,email,gender,year,age,dob,aadhar,mobile_no;

    PrintData(String s_id){
         
        super("Print Data");
        
         
         try{
            conne con = new conne();
            String str = "select * from student where stu_id = '"+s_id+"'";
            ResultSet rs= con.s.executeQuery(str);

            while(rs.next()){

               
                name = rs.getString("name");
                father = rs.getString("father_name");
                age = rs.getString("age");
                dob = rs.getString("DOB");
                gender = rs.getString("gender");
                address = rs.getString("address");
                phone = rs.getString("phone_no");
                mobile_no =rs.getString("mobile_no");
                email = rs.getString("email_id");
                year = rs.getString("year");
                aadhar = rs.getString("aadhar_no");
                stu_id = rs.getString("stu_id");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
// 
//        new JFrame("Print Data");

       
        setVisible(true);
        setSize(595,700);
        setLocation(600,160);
        getContentPane().setBackground(Color.white);
        setResizable(false);
        setLayout(null);
        
         
//
//        JLabel id9=new JLabel();
//        id9.setBounds(0,0,595,642);
//        id9.setLayout(null);
//        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("student/management/system/icons/PrintData.jpg"));
//        id9.setIcon(img);
        
        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("student/management/system/Icons/Logo.png"));
        this.setIconImage(i.getImage());
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("student/management/system/Icons/PrintData.png"));
        Image i2=i1.getImage().getScaledInstance(595, 700,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l=new JLabel(i3);
        l.setBounds(0,0,595,700);
        add(l);
        
        JLabel la = new JLabel("Student Details");
        la.setBounds(50,10,340,30);
        add(la);
        la.setFont(new Font("serif",Font.BOLD,35));
        la.setForeground(Color.MAGENTA);
        l.add(la);

        JLabel l1= new JLabel("Student Id : ");
        l1.setBounds(50,70,120,30);
        l1.setFont(new Font("serif",Font.BOLD,20));
        l.add(l1);

        JLabel l2= new JLabel(stu_id);
        l2.setBounds(200,70,200,30);
        l2.setFont(new Font("serif",Font.BOLD,20));
        l.add(l2);

        JLabel l3 = new JLabel("Name : ");
        l3.setBounds(50,120,100,30);
        l3.setFont(new Font("serif",Font.BOLD,20));
        l.add(l3);

        JLabel l4 = new JLabel(name);
        l4.setBounds(200,120,300,30);
        l4.setFont(new Font("serif",Font.BOLD,20));
        l.add(l4);

  
        JLabel  l5 = new JLabel("Father's Name : "); 
        l5.setBounds(50,170,200,30);
        l5.setFont(new Font("serif",Font.BOLD,20));
        l.add(l5);

        JLabel l6 = new JLabel(father);
        l6.setBounds(200,170,300,30);
        l6.setFont(new Font("serif",Font.BOLD,20));
        l.add(l6);

        JLabel l7= new JLabel("Address : ");
        l7.setBounds(50,220,100,30);
        l7.setFont(new Font("serif",Font.BOLD,20));
        l.add(l7);

        JLabel l8= new JLabel(address);
        l8.setBounds(200,220,300,30);
        l8.setFont(new Font("serif",Font.BOLD,20));
        l.add(l8);


        JLabel l9= new JLabel("Phone No :");  
        l9.setBounds(50,270,100,30);
        l9.setFont(new Font("serif",Font.BOLD,20));
        l.add(l9);

        JLabel l10= new JLabel(phone);
        l10.setBounds(200,270,300,30); 
        l10.setFont(new Font("serif",Font.BOLD,20));
        l.add(l10);

        
        JLabel l11= new JLabel("Email Id :");
        l11.setBounds(50,320,100,30);
        l11.setFont(new Font("serif",Font.BOLD,20));
        l.add(l11);

        JLabel l12= new JLabel(email);
        l12.setBounds(200,320,400,30);
        l12.setFont(new Font("serif",Font.BOLD,20));
        l.add(l12);

        
        JLabel l13= new JLabel("Gender : ");
        l13.setBounds(50,370,100,30);
        l13.setFont(new Font("serif",Font.BOLD,20));
        l.add(l13);

        JLabel l14= new JLabel(gender);
        l14.setBounds(200,370,300,30); 
        l14.setFont(new Font("serif",Font.BOLD,20));
        l.add(l14);


        JLabel l15= new JLabel("Year : ");
        l15.setBounds(50,420,100,30);
        l15.setFont(new Font("serif",Font.BOLD,20));
        l.add(l15);

        JLabel l16= new JLabel(year);
        l16.setBounds(200,420,300,30);
        l16.setFont(new Font("serif",Font.BOLD,20));
        l.add(l16);
        
        JLabel l17= new JLabel("Age : ");
        l17.setBounds(50,470,100,30);
        l17.setFont(new Font("serif",Font.BOLD,20));
        l.add(l17);

        JLabel l18= new JLabel(age);
        l18.setBounds(200,470,300,30);
        l18.setFont(new Font("serif",Font.BOLD,20));
        l.add(l18);
        
        b1=new JButton("Print");
        b1.setBackground(Color.blue);
        b1.setForeground(Color.WHITE);
        b1.setBounds(100,620,100,30);
        b1.addActionListener(this);
        l.add(b1);

        b2=new JButton("cancel");
        b2.setBackground(Color.blue);
        b2.setForeground(Color.WHITE);
        b2.setBounds(250,620,100,30);
        b2.addActionListener(this);
        l.add(b2);

        JLabel l19= new JLabel("Mobile No : ");
        l19.setBounds(50,520,140,30);
        l19.setFont(new Font("serif",Font.BOLD,20));
        l.add(l19);

        JLabel l20= new JLabel(mobile_no);
        l20.setBounds(200,520,300,30);
        l20.setFont(new Font("serif",Font.BOLD,20));
        l.add(l20);
        
        JLabel l21= new JLabel("DOB : ");
        l21.setBounds(50,570,100,30);
        l21.setFont(new Font("serif",Font.BOLD,20));
        l.add(l21);

        JLabel l22= new JLabel(dob);
        l22.setBounds(200,570,300,30);
        l22.setFont(new Font("serif",Font.BOLD,20));
        l.add(l22);
    }

 

    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b1){
            JOptionPane.showMessageDialog(null,"printed successfully");
            this.setVisible(false);
           Student_Details d=new Student_Details();
        }
        if(ae.getSource()==b2){
            this.setVisible(false);
            new View_Student().setVisible(true);
        }
    }
    public static void main(String[] args){
        new PrintData(" ");
    }

}
