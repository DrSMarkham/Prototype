
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.text.AbstractDocument;
 
//create class and extend with JFrame
public class NewWindow3 extends JFrame 
{
	//declare variable
	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	//main method
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
 
	/**
	 * Create the frame.
	 */
	public NewWindow3() //constructor
	{
		//set frame title
		//setTitle("Semantic Plan Representation");
		//set default close operation
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
                
                
                JTextArea textArea = new JTextArea(100, 100);
                
                //JTextArea ta = new JTextArea(100, 100);
    textArea.setText(
                "Toulmin Diagram\n" + "\n" +
    "Claim: the position or claim being argued for; the conclusion of the argument.\n" +
"Grounds: reasons or supporting evidence that bolster the claim.\n" +
"Warrant: the principle, provision or chain of reasoning that connects the\n" +
"grounds/reason to the claim.\n" +
"Backing: support, justification, reasons to back up the warrant.\n" +
"Rebuttal/Reservation: exceptions to the claim; description and rebuttal of\n" +
"counter-examples and counter-arguments.\n" +
"Qualification: specification of limits to claim, warrant and backing.  The \n" +
"degree of conditionality asserted.\n" +
"\n" +
" The claim will represent the desired objective (mission, operation event)\n" + 
"together with the proposed means of actualisation (tasks, roles, resources,\n" +
"etc.)\n" +
" Instances of experiential learning can be represented as grounds, backing,\n" +
"rebuttal, qualifier as appropriate together with data relating to other\n" +
"(contextual) features of the new plan.\n" 
                        + "\n" + 
"The Araucaria system provides an interface which supports the diagramming\n" +
"process, and then saves the result using AML, an open standard, designed in\n" +
"XML, for describing argument structure.\n" +
" Araucaria allows you to build argument diagrams by selecting phrases of text\n" +
"to represent the premises and conclusion of an argument and building a tree\n" +
"diagram interactively using the mouse. The argument text may be loaded from a\n" +
"disk file, and is displayed in the blue panel on the left. Use the mouse to\n" +
"select a portion of this text and then click on the grey panel on the right to\n" +
"create a node corresponding to this text. When you have selected the nodes you\n" +
"require, join them up by selecting one node (the premise) with the mouse and \n" +
"dragging the mouse (holding down the left button while moving the mouse) to\n" +
"the other node (the conclusion supported by the premise). Nodes and edges with\n" +
"a tree can be selected with the mouse. Selected objects can be deleted by\n" +
"pressing the 'Delete' key. Information on selected objects also appears in\n" +
"the yellow panel at the bottom. Araucaria supports different diagramming\n" +
"styles, currently the Standard 'box-and-arrow' approach, and the Toulmin\n" +
"approach."
 );
               // "Semantic Plan Representation Tool\n" + "\n" +
    
                
                
                
                
                //JScrollPane scrollPane = new JScrollPane(textArea);
                JFrame frame = new JFrame("Abstract Argumentation Tool");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //frame.setLayout(new BorderLayout());
                //frame.add(scrollPane);
                frame.setSize(100, 100);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
		
		//label in the frame
		//JLabel lblWelcome = new JLabel("Welcome this is New Frame");
		//set fore ground color to the label
		//lblWelcome.setForeground(Color.RED);
		//set font to the label
	//lblWelcome.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
		//set bounds of the label
		//lblWelcome.setBounds(75, 100, 294, 32);
		//add label to the contentPane 
		//contentPane.add(lblWelcome
                
                //JPanel inputpanel = new JPanel();
                
                
                JButton btnNewFrame3 = new JButton("Continue");
		//add actionListener
		btnNewFrame3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				//call the object of NewWindow and set visible true
				NewWindow4 frame = new NewWindow4();
				//frame.setVisible(true);
				//set default close operation
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
                
                btnNewFrame3.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
		//set bounds of the Button
		btnNewFrame3.setBounds(280, 650, 178, 25);
                
                
                frame.getContentPane().add(textArea);
    //add Button into contentPane
		textArea.add(btnNewFrame3);
                frame.pack();
                frame.setVisible(true);
		((AbstractDocument)textArea.getDocument()).dump(System.out);
    
    
                
                
//public class PlanJavaDON {
  //public static void main(String[] args) {
    //try {
    //    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    //} catch (Exception evt) {}
  
    //JFrame f = new JFrame("Smantic Plan Representation Tool");
    //JTextArea ta = new JTextArea(100, 100);
    //ta.setText(
    //            "Semantic Plan Representation Tool\n" + "\n" +
    
//"logic expression.  Actions can only be performed through rules.\n" + "\n" 
//    );
    //frame.getContentPane().add(ta);
    //contentPane.add(ta);
    //contentPane.pack();
    //contentPane.setVisible(true);

    //((AbstractDocument)ta.getDocument()).dump(System.out);
	}
}



