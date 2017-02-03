
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
public class NewWindow2 extends JFrame 
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
	public NewWindow2() //constructor
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
    textArea.setText( " Here we propose a design for an ‘analogous search’ tool to deploy experiential learning\n" +
"in solving military planning problems. A schematic description of our tentative design is:\n" +
"\n" +
"Specific Planning Query/Problem\n" +
"                    |\n" +
"                    |    Transform\n" +
"                    V\n" +
"{Generalised Planning Query/Problem}\n" +
"                    |\n" +
"                    |    Search Military Campaign Ontology\n" +
"                    V\n" +
"{Possible Answers to Generalised Planning Query/Problem}\n" +
"                    |\n" +
"                    |    Filter Solution Set according to Select Semantic Criteria\n" +
"                    V\n" +
"{Possible Answers to Specific Planning Query/Problem}\n" +
"\n" +
" In terms of the Military Campaign Ontology, the methodology is as follows:\n" +

"i)Input Planning Query/Problem as a tasking expression (or set of tasking expressions).\n" +
"(Verb, -, -, Affected, Action, X, P, -, -, Why, Target, Mod)\n" +
"The tasker, taskee, StartWhen, EndWhen fields are by default empty Strings.\n" +

"ii)Transform input tasking expression into a generalised set of tasking \n" +
"expressions by removing non-verb and non-gerund terms from the individual \n" +
"fields. Replace empty Strings with a wildcard* entry i.e. '0'.\n" +
"(Verb, -*, -*, Affected’, Action’, -*, -*, -*, -*, Why’, -*, Mod’)\n" +
"Affected’ = Affected entry stripped of all non-verbs and non-gerunds.\n" +
"Similarly for Action’, Why’ and Mod’.\n" +

"iii)Search the Military Campaign Ontology (Plan Knowledge Base) for plans with\n" +
"tasking expressions that belong to the set of generalised (analogous) query \n" +
"tasking expressions.\n" +

"iv)Filter the resulting set of plans according to additional semantic criteria\n" + 
"e.g. non-verbs and non-gerunds, to add query-related, purposeful specificity to\n" +
"the search and examine the experiential learning attached to the corresponding plans.\n");
               // "Semantic Plan Representation Tool\n" + "\n" +
    
                
                
                
                
                //JScrollPane scrollPane = new JScrollPane(textArea);
                JFrame frame = new JFrame("Analogous Plan Search Tool");
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
                //inputpanel.setLayout(new FlowLayout());
                //JTextField input = new JTextField(20);
                //JButton button = new JButton("Continue");
                //DefaultCaret caret = (DefaultCaret) textArea.getCaret();
                //caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
                //inputpanel.add(scroller);
                //inputpanel.add(input);
                //inputpanel.add(button);
                //contentPane.add(inputpanel);
                //frame.getContentPane().add(BorderLayout.CENTER, contentPane);
                //frame.pack();
                //frame.setLocationByPlatform(true);
                //frame.setVisible(true);
                //frame.setResizable(false);
                //input.requestFocus();
                
                JButton btnNewFrame2 = new JButton("Continue");
		//add actionListener
		btnNewFrame2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				//call the object of NewWindow and set visible true
				NewWindow3 frame = new NewWindow3();
				frame.setVisible(true);
				//set default close operation
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
                
                btnNewFrame2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
		//set bounds of the Button
		btnNewFrame2.setBounds(280, 650, 178, 25);
                
                
                frame.getContentPane().add(textArea);
    //add Button into contentPane
		textArea.add(btnNewFrame2);
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






//public TestScrollPane03() {