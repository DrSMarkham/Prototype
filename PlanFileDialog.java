/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author DrSMarkham
 */

class SampleFrame extends Frame {
    SampleFrame(String title) {
        super(title);
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}


class PlanFileDialog {
    public static void main(String args[]) {
        //create a frame that owns the dialog
        Frame f = new SampleFrame("Planning Tool");
        f.setVisible(true);
        f.setSize(100, 100);
        
        FileDialog fd = new FileDialog(f, "Planning Tool");
        
        fd.setVisible(true);
    }
    
}
