
    package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentView extends JFrame implements ActionListener {

   
    JTable table;
    JButton submit;
     JTextField search;
    
    StudentView() {
        
        getContentPane().setBackground(Color.cyan);
        setLayout(null);

        JLabel heading = new JLabel("Student Information");
        heading.setBounds(310, 30, 500, 50);
        heading.setFont(new Font("serif", Font.BOLD, 30));
        add(heading);
        
        JLabel heaading = new JLabel("ID :");
        heaading.setBounds(20, 100, 50, 20);
         heaading.setFont(new Font("serif", Font.BOLD, 20));
        add(heaading);


        search = new JTextField();
        search.setBounds(70, 90, 200, 30);
        search.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(search);
        
         submit = new JButton("Go to profile");
        submit.setBounds(70, 130, 180, 30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(submit);
            
        
        
        
        
        
        setSize(900, 700);
        setLocation(300, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            setVisible(false);    
            new Profile(search.getText());
        } else {
            setVisible(false);
        }
    }

       
        
    

    public static void main(String[] args) {
        new StudentView();
    }
}

    

