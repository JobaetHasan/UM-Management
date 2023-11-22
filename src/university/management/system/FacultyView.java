package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;


public class FacultyView extends JFrame  {

    
    
    FacultyView() {
        
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel heading = new JLabel("Teachers Information");
        heading.setBounds(310, 30, 500, 50);
        heading.setFont(new Font("serif", Font.BOLD, 30));
        add(heading);
        
        


        
        JTable table = new JTable();
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from teacher");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 160, 900, 600);
        add(jsp);
        
     
        
        
        setSize(900, 700);
        setLocation(300, 100);
        setVisible(true);
    }
    
  

    public static void main(String[] args) {
        new FacultyView();
    }
}
