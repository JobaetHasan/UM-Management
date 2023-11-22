

package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Whologin extends JFrame implements ActionListener {
    
JButton admin,student;

Whologin(){
    getContentPane().setBackground(Color.cyan);
    setLayout(null);


    admin = new JButton("Admin Login");
    admin.setBounds(110, 20, 210, 50);
    admin.setBackground(Color.black);
    admin.setForeground(Color.white);
    admin.addActionListener(this);
    admin.setFont(new Font("Tahoma", Font.BOLD, 16));
    add(admin);
    
    student = new JButton(" student Login");
    student.setBounds(110, 100, 210, 50);
    student.setBackground(Color.BLACK);
    student.setForeground(Color.WHITE);
    student.addActionListener(this);
    student.setFont(new Font("Tahoma", Font.BOLD, 16));
    add(student);
    



    setSize(450, 200);
    setLocation(500, 500);
    setVisible(true);


 }

 public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == admin) {
           
           new Login();
            
        } else if (ae.getSource() == student) {
           new StudentLogin();
      
        }
    }


  

    public static void main(String[] args) {
        new Whologin();
    }
}


