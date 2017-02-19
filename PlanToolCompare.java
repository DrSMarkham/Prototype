/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
/**
 *
 * @author DrSMarkham
 */
public class PlanToolCompare implements ActionListener{
    
    JTextField jtfFirst;
    JTextField jtfSecond;
    
    JButton jbtnComp;
    JLabel jlabFirst;
    JLabel jlabSecond;
    JLabel jlabResult;
    
    PlanToolCompare() {
        
        JFrame jfrm = new JFrame("Compare Files");
        
        jfrm.setLayout(new FlowLayout());
        
        jfrm.setSize(200, 190);
        
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jtfFirst = new JTextField(14);
        jtfSecond = new JTextField(14);
        
        jtfFirst.setActionCommand("fileA");
        jtfSecond.setActionCommand("fileB");
        
        JButton jbtnComp = new JButton("Compare");
        
        jbtnComp.addActionListener(this);
        
        jlabFirst = new JLabel("First file: ");
        jlabSecond = new JLabel("Second file: ");
        jlabResult = new JLabel("");
        
        jfrm.add(jlabFirst);
        jfrm.add(jtfFirst);
        jfrm.add(jlabSecond);
        jfrm.add(jtfSecond);
        jfrm.add(jbtnComp);
        jfrm.add(jlabResult);
        
        jfrm.setVisible(true);
                
    }
    //Compare the files when Compare button is pressed
    public void actionPerformed(ActionEvent ae) {
        int i=0;
        int j=0;
        
        if(jtfFirst.getText().equals("")) {
            jlabResult.setText("First file name missing.");
            return;
        }
         if(jtfSecond.getText().equals("")) {
            jlabResult.setText("Second file name missing.");
            return;
        }
        
         
         try (FileInputStream f1 = new FileInputStream(jtfFirst.getText());
              FileInputStream f2 = new FileInputStream(jtfSecond.getText())   
                 )
             {
                     do {
                         i = f1.read();
                         j = f2.read();
                         if(i != j) break;
                     }while(i != -1 && j != -1);
                     
                     if(i != j)
                         jlabResult.setText("Files not equal.");
                     else
                         jlabResult.setText("Files compare equal.");
                                 } catch(IOException exc) {
                                     jlabResult.setText("File Error");
                     
                     }
                 }
         public static void main(String args[]) {
             //Create the frame on the event dispatching thread
             SwingUtilities.invokeLater(new Runnable() {
                 public void run() {
                     new PlanToolCompare();
                 }
             });
        }
}
