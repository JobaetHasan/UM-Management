package university.management.system;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class Profile extends JFrame implements ActionListener {
    
    String id;
    JButton cancel;
    
    Profile(String id) {
      
        
        setSize(500, 700);
        setLocation(500, 100);
        setLayout(null);
        
        getContentPane().setBackground(Color.orange);
        
        JLabel heading = new JLabel(" BGCTRUST Univeristy");
        heading.setBounds(100, 10, 500, 25);
        heading.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(heading);
        
        JLabel subheading = new JLabel("Student Profile");
        subheading.setBounds(150, 50, 500, 20);
        subheading.setFont(new Font("Tahoma", Font.BOLD, 18));
        add(subheading);
        
        JLabel lblrollno = new JLabel("ID: " + id);
        lblrollno.setBounds(60, 100, 500, 20);
        lblrollno.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(lblrollno);
        
        JLabel lblsemester = new JLabel("Semester");
        lblsemester.setBounds(60, 130, 500, 20);
        lblsemester.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(lblsemester);
        
        JLabel sub1 = new JLabel("Name : ");
        sub1.setBounds(100, 200, 500, 20);
        sub1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub1);
        
        JLabel sub2 = new JLabel("Father Name : ");
        sub2.setBounds(100, 230, 500, 20);
        sub2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub2);
        
        JLabel sub3 = new JLabel("Date Of Birth : ");
        sub3.setBounds(100, 260, 500, 20);
        sub3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub3);
        
        JLabel sub4 = new JLabel("Department : ");
        sub4.setBounds(100, 290, 500, 20);
        sub4.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub4);
        
        JLabel sub5 = new JLabel("Phone : ");
        sub5.setBounds(100, 320, 500, 20);
        sub5.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub5);

        JLabel sub6 = new JLabel("E-mail : ");
        sub6.setBounds(100, 350, 500, 20);
        sub6.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub6);

        JLabel sub7 = new JLabel("Address : ");
        sub7.setBounds(100, 380, 500, 20);
        sub7.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub7);

        try {
            Conn c = new Conn();
            
            ResultSet rs2 = c.s.executeQuery("select * from student where id= '"+id+"'");
            while(rs2.next()) {
                sub1.setText(sub1.getText() + "         " + rs2.getString("name"));
                sub2.setText(sub2.getText() + " " + rs2.getString("father_name"));
                sub3.setText(sub3.getText() + " " + rs2.getString("date_of_birth"));
                sub4.setText(sub4.getText() + " " + rs2.getString("department"));
                sub5.setText(sub5.getText() + "         " + rs2.getString("phone"));
                sub6.setText(sub6.getText() + "         " + rs2.getString("email"));
               
                sub7.setText(sub7.getText() + "         " + rs2.getString("Address"));
                lblsemester.setText("Semester " + rs2.getString("semester"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        cancel = new JButton("Back");
        cancel.setBounds(250, 500, 120, 25);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
    }
    
    public static void main(String[] args) {
        new Profile("");
    }
}
