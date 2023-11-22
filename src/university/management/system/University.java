

package university.management.system;

import javax.swing.*;
import java.awt.*;

public class University extends JFrame   {
   
    
    University () {
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/unsplash.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        
        add(image);
        
      
        
        setBounds(50,50,1450,700);
        setVisible(true);

        new Whologin();
        
    }
    
    public static void main(String[] args) {
        new University();
        
    }
}
