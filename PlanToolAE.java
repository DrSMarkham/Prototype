/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author DrSMarkham
 */
public class PlanToolAE {
    JLabel jlab;
    
    PlanToolAE() {
        
        //Create a JFrame Container
        JFrame jfrm = new JFrame("Prototype");
        
        //Specify FlowLayout for the layout manager
        
        jfrm.setLayout(new FlowLayout());
        
        //Give frame an inital size
        jfrm.setSize(220, 90);
        //terminate programe when user closes application
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton jbtnAlpha = new JButton("Apply Tool");  
        JButton jbtnBeta = new JButton("Continue");
        
        //Add action listener for Alpha
        jbtnAlpha.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlab.setText("Apply Tool was selected");
            }
            
            });
        
        jbtnBeta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlab.setText("Continue was selected");
            }
            
            });
        
        
    
    //Add buttons to content pane
    jfrm.add(jbtnAlpha);
    jfrm.add(jbtnBeta);
    
    //Create a text-based Label
    jlab = new JLabel("Select Option");
    jfrm.add(jlab);
    
    //Display frame
    
    jfrm.setVisible(true);
    }
    public static void main(String args[]) {
        //Create frame on the event dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new PlanToolAE();
            }
        });
            }
        }
   
    

