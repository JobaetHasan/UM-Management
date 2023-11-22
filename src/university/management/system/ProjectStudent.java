package university.management.system;
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProjectStudent extends JFrame implements ActionListener {
    
    

    ProjectStudent() {


        setSize(1540, 850);



         ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("icons/download.png"));
        Image ii = i.getImage().getScaledInstance(600, 63, Image.SCALE_DEFAULT);
        ImageIcon iii = new ImageIcon(ii);
        JLabel iv = new JLabel(iii);
        iv.setBounds(0, 0, 600, 63);
    
        iv.setLayout(null);
        iv.setVisible(true);
           add(iv);
        

        

        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/prostu.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        JMenuBar mb = new JMenuBar();
        mb.setBackground(Color.white);
        
    

        // icon in jmenu

         JMenu jim=new JMenu();
        mb.add(iv);

         JMenu jimn=new JMenu("                                   ");
        mb.add(jimn);

        
        // Details
        JMenu details = new JMenu("View Details");
        details.setForeground(Color.darkGray);
        details.setFont(new Font("Arial", Font.BOLD, 18));
        mb.add(details);
        
        JMenuItem facultydetails = new JMenuItem("View Faculty Details");
        facultydetails.setBackground(Color.WHITE);
        facultydetails.addActionListener(this);
        details.add(facultydetails);
        
        JMenuItem studentdetails = new JMenuItem("View Student Details");
        studentdetails.setBackground(Color.WHITE);
        studentdetails.addActionListener(this);
        details.add(studentdetails);
       
        
        // Exams
        JMenu exam = new JMenu("Examination");
        exam.setForeground(Color.darkGray);
       
        
        exam.setFont(new Font("Arial", Font.BOLD, 18));
        mb.add(exam);
        
        JMenuItem examinationdetails = new JMenuItem("Examination Results");
        examinationdetails.setBackground(Color.WHITE);
        examinationdetails.addActionListener(this);
        exam.add(examinationdetails);

        
        // fee
        JMenu fee = new JMenu("Fee Details");
        fee.setForeground(Color.darkGray);
        fee.setFont(new Font("Arial", Font.BOLD, 18));
        mb.add(fee);
        
        JMenuItem feestructure = new JMenuItem("Fee Structure");
        feestructure.setBackground(Color.WHITE);
        feestructure.addActionListener(this);
        fee.add(feestructure);
        
        JMenuItem feeform = new JMenuItem("Student Fee Form");
        feeform.setBackground(Color.WHITE);
        feeform.addActionListener(this);
        fee.add(feeform);

        // Notice
        JMenu Notice = new JMenu("Notice");
        Notice.setForeground(Color.darkGray);
        Notice.setFont(new Font("Arial", Font.BOLD, 18));
        mb.add(Notice);
        
        
        
        // about
        JMenu about = new JMenu("About");
        about.setForeground(Color.darkGray);
        about.setFont(new Font("Arial", Font.BOLD, 18));
        mb.add(about);
       
        
        JMenuItem ab = new JMenuItem("About");
        ab.setBackground(Color.WHITE);
        ab.addActionListener(this);
        about.add(ab);

        // Utility
        JMenu utility = new JMenu("Home");
        utility.setForeground(Color.darkGray);
        utility.setFont(new Font("Arial",Font.BOLD,18));
        mb.add(utility);
        
        JMenuItem notepad = new JMenuItem("Home");
        notepad.setBackground(Color.WHITE);
        notepad.addActionListener(this);
        utility.add(notepad);
        
       
        // exit
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.RED);
        exit.setFont(new Font("Arial", Font.BOLD, 18));
        mb.add(exit);
        
        JMenuItem ex = new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        exit.add(ex);
        
        setJMenuBar(mb);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();
        
        if (msg.equals("Exit")) {
            setVisible(false);
        } 
        else if (msg.equals("Home")) {
            try {
                
                new University();
                
            } catch (Exception e) {
                 
            }
        } 
       
        else if (msg.equals("View Faculty Details")) {
            new FacultyView();
        } else if (msg.equals("View Student Details")) {
            new StudentView();
        }
        else if (msg.equals("Examination Results")) {
            new StudentResult();
        } else if (msg.equals("Fee Structure")) {
            new FeeStructure();
        } else if (msg.equals("About")) {
            new About();
        } else if (msg.equals("Student Fee Form")) {
            new StudentFeeForm();
        }
    }

    public static void main(String[] args) {
        new ProjectStudent();
    }
}





