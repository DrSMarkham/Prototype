import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DrSMarkham
 */
public class PlanToolKeyListener {
    
    JTextArea inputText;
    JTextArea feedbackText; 
    
    public static void main(String[] args) { 
        
        EventQueue.invokeLater(new Runnable() {
            
           @Override public void run() { 
               new PlanToolKeyListener();
           }
        });
        
        } 
    
    public PlanToolKeyListener() {
        JFrame guiFrame = new JFrame(); 
        
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setTitle("Creating an Input Table");
        guiFrame.setSize(700,200); 
        
        guiFrame.setLocationRelativeTo(null); 
        
        feedbackText = new JTextArea();
        JScrollPane scrollText = new JScrollPane(feedbackText); 
        
        inputText = new JTextArea(); 
        
        inputText.addKeyListener(new KeyListener() { 
            
            @Override 
            public void keyPressed(KeyEvent e) {
                feedbackText.append("Key Pressed: " + e.getKeyChar() + "\n");
            } 
            
            @Override
            public void keyReleased(KeyEvent e) { 
                feedbackText.append("Key Released: " + e.getKeyChar() + "\n");
            } 
            
            @Override 
            public void keyTyped(KeyEvent e) {
                feedbackText.append("Key Typed: " + e.getKeyChar() + " " 
                        + KeyEvent.getKeyModifiersText(e.getModifiers())
                        + "\n");
            }
        }); 
        
        guiFrame.add(inputText, BorderLayout.NORTH);
        guiFrame.add(scrollText, BorderLayout.CENTER);
        guiFrame.setVisible(true);
    } 
}
        
        