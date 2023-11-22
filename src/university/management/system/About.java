package university.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {

    About() {
        setSize(700, 500);
        setLocation(400, 150);
        getContentPane().setBackground(Color.orange);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/about.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(374, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 20, 400, 200);
        add(image);
        
        JLabel heading = new JLabel("BGCTRUST UNIVERSITY BANGALDESH");
        heading.setForeground(Color.black);
        heading.setBounds(30, 250, 640, 130);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(heading);
        
        JLabel contact = new JLabel("www.bgc-tub.bd.net");
         contact.setForeground(Color.black);
        contact.setBounds(230, 400, 550, 40);
        contact.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(contact);
        
        setLayout(null);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new About();
    }
}
