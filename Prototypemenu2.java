import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.text.*;
//Follow PlanAbsArg.java and before PlanJavaDON.java
public class PrototypeMenu2 extends JFrame {
    private JPanel contentPane;

    public static void main(String[] args) 
	{
		/* It posts an event (Runnable)at the end of Swings event list and is
		processed after all other GUI events are processed.*/
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				//try - catch block
				//
                            
                            try 
				                             
                                
                            {
					//Create object of NewWindow
				//	NewWindow1 frame = new NewWindow1();
					//set frame visible true
				//	frame.setVisible(false);					
				}
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}
 public PrototypeMenu2() //constructor
	{
		//set frame title
		//setTitle("Semantic Plan Representation");
		//set default close operation
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  //public static void main(String[] args) {
    //try {
        //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    //} catch (Exception evt) {}
  
    JFrame f = new JFrame("Prototype Planning Tool");
    
		
    JTextArea ta = new JTextArea(100, 100);
    ta.setText(
            " The function of the prototype is to record pre-execution operation\n" +
        "plans and post execution actuality using the SePRS (Structural Plan \n" +
        "Representation System) and StPRS (Semantic Plan Representation System),\n" +
        "with a view to capturing, identifying and saving Experiential Learning \n" +
        "gained during the course of action, in a format automatically accessible\n" +
        "to future planners.\n" + "\n" +
        " The prototype design incorporates a GUI with links to a:\n" +
        "•	Structural/Graph-Theoretic Plan Representation System (StPRS) – \n" +
        "       based on a graph theoretic plan model, with associated metrics. This \n" +
        "       will allow planners to build temporal representations of their plans \n" +
        "       in node and edge format with nodes representing states and edges \n" +
        "       representing actions. The StPRS will feature a drag and drop facility\n" +
        "       to create the graph-theoretic plan representations. (Nodes \n" +
        "       corresponding to states and edges to actions.)\n" +
"\n" +
"•	Semantic Plan Representation System (SePRS) -based on JavaDON , an open\n" +
"       source expert system shell) and associated plan similarity metrics\n" +
"       (entity-based or ‘bag of words’). This will also function as a script\n" +
"       tool to structure and represent experiential learning gleaned from the \n" +
"       AARs. The JavaDON reasoner will be deployed to identify, extract and \n" +
"       apply additional experiential learning.\n" + "\n" +
"•	Analogous Search Tool (AnaSch) - to aid the retrieval of analogous plans\n" +
"       from the knowledge base (ontology).\n" + "\n" +
"•	Toulmin Model Abstract Argumentation/Reasoning Tool to aid users in\n" +
"        applying captured experiential learning to future planning.\n" + "\n"
             

    );
    

    
    JButton btnNewFrame = new JButton("Continue");
		//add actionListener
		btnNewFrame.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				//call the object of NewWindow and set visible true
				NewWindow9 frame = new NewWindow9();
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
                //ta.add(btnNewFramea);
		ta.add(btnNewFrame);
                
                f.pack();
                f.setVisible(true);
		((AbstractDocument)ta.getDocument()).dump(System.out);
    
    
                
                
  }
}


 
//create class and extend with JFrame


	//declare variable
	//private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	//main method
	
	/**
	 * Create the frame.
	 */
	
		//set bounds of the frame
		//setBounds(200, 200, 450, 300);
		
		//create object of JPanel
		//contentPane = new JPanel();
		//set border
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//set ContentPane
		//setContentPane(contentPane);
		//set null
		//contentPane.setLayout(null);
                
                