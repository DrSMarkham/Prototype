import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.text.*;
//Follow PlanAbsArg.java and before PlanJavaDON.java
public class PlanOntology1 {
  public static void main(String[] args) {
    try {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    } catch (Exception evt) {}
  
    JFrame f = new JFrame("Semantic Plan Representation Tool");
    
		
    JTextArea ta = new JTextArea(100, 100);
    ta.setText(
                "Semantic Plan Representation Tool\n" + "\n" +
    " An ontology is an attempt to formulate an exhaustive and rigorous\n" +
    "conceptual scheme within a given domain. Although this is typically a \n" + 
    "hierarchical data containing all the relevant entries, it is not \n" +
    "necessarily a tree. In addition to the entities, the ontology contains \n" +
    "relationships and rules (such as theorems and regulations) within that \n" +
    "domain. Therefore a taxonomy is a subset of an ontology.\n" +
"\n" + " The Semantic Plan Representation Tool deploys a frame-based military \n" +
"campaign ontology to capture experiential learning gained during the execution\n" +
"of military plans, in an organized and accessible form. We will use the\n" +
"following frames:\n" + "\n" +
"Military Campaign\n" +
"Operation\n" +
"ActionsAnticipated\n" +
"ActionsExecuted\n" +
"\n" +
"Each frame will have associated attributes:\n" + "\n" +
"Military Campaign\n" +
"i)	objectives\n" +
"ii)	area of operations\n" +
"iii)	mission type\n" +
"\n" +
"Operation\n" +
"i)	objectives\n" +
"ii)	area of operations \n" +
"iii)	operation type\n" +
"iv)	operational environment\n" +
"v)	commander’s intent\n" + "\n" +
" The ActionsAnticipated/ActionsExecuted frame will occur as pairs and describe\n" +
"an action planned and the actualised action. \n"

    );
    

    
    
    JButton btnNewFrame = new JButton("Continue");
		//add actionListener
		btnNewFrame.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				//call the object of NewWindow and set visible true
				NewWindow1 frame = new NewWindow1();
				frame.setVisible(true);
				//set default close operation
				//setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
                
                btnNewFrame.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
		//set bounds of the Button
		btnNewFrame.setBounds(280, 650, 178, 25);
                
                
                f.getContentPane().add(ta);
    //add Button into contentPane
		ta.add(btnNewFrame);
                f.pack();
                f.setVisible(true);
		((AbstractDocument)ta.getDocument()).dump(System.out);
    
    
  }
}

