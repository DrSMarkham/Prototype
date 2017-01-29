/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.applet.Applet;
import javax.swing.*;

/*
<applet code="PlanTable" width = 800 height=200>
</applet>
 *
 *
 * @author DrSMarkham
 */
public class PlanTable extends Applet{
    
    public void init() {
        try {
            SwingUtilities.invokeAndWait(
            new Runnable() {
                public void run() {
                    makeGUI();
                }
            }
            );
        } catch (Exception exc) {
            System.out.println("Can't create because of " + exc);
                
            }
        }
    
    private void makeGUI() {
        //initialise column headings
        String[] colHeads = {"Verb", "Tasker", "Taskee", "Affect", "Action",
            "At-Where", "Route-Where", "Start-When", "End-When", "Why", "Label",
            "Mod"};
        
        //Initialise Data
        Object[][] data = {
            {"advance", "A", "B", "Enemy", "Divert", "X", "P", "0", "12", 
                "Deceive", "1", "Rescue"},
            {"defend", "C", "D", "Brigade", "Support", "Y", "Q", "6", "18", 
                "Rescue", "2", "Peace Conference"}
            
        };
        
            
            
            
            //Create the table
            JTable table = new JTable(data, colHeads);
            
            JScrollPane jsp = new JScrollPane(table);
            
            //add scroll pane to content pane
            add(jsp);
        
        }
    }
    

