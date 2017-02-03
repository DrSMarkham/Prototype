
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
public class NewWindow1 extends JFrame 
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
	public NewWindow1() //constructor
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
               // "Semantic Plan Representation Tool\n" + "\n" +
    " To create a new ontology, use CreateNewProject and enter the relevant\n" +
    "domain knowledge into the knowledge base. This process may require a \n" +
    "number of iterations. To create a frame, go to the Frames tab and right\n" +
    "click on new. To add attributes to that frame, right click on add slot.\n" +
    "At this point the user can attach a question to each slot or a \n" +
    "description/media. Use the rules tab to create rules. (See the provided\n" +
    "example in the prototype software.) When the \"question form\" is closed\n" +
    "you are left with the knowledge base builder form containing all frames\n" +
    "and rules that make the example. It is here that you create/edit the\n" +
    "knowledge base.\n" +
    " To start the expert system click on the run button (a new window \n" +
    "containing questions should appear - the question form). This will invoke\n" +
    "the inference process, so enter problem data and interact with the system.\n" +
    "OpenExistingProject can be used to modify and extend existing knowledge\n" +
    "bases.\n" +
    "In JavaDON, a frame can have slots, sub-frames and parent frames. Each slot\n" +
    "is represented as a sub-tree with the root node ‘SLOTS’. A slot is a\n" +
    "connection between a frame and an attribute, so this information is shown\n" +
    "in the node ‘ATTRIBUTE’. A slot can have a description (‘DESCRIPTION’), \n" + 
    "one or more media files  (‘MEDIA’) and a question and answers (‘QUESTION’)\n" +
    "associated with it. This description and/or media files can be shown to\n" +
    "the end user to better explain the solution the ES has produced. The \n" +
    "question is used to gather information about the value of the slot, if the\n" +
    "value is to be supplied by the end user. It can have two or more\n" +
    "predefined answers (with the choice of single or multiple selection), or\n" +
    "it can be left to the user to supply one or more answers. Media files can\n" +
    "be presented to the end user together with the question, in order to \n" +
    "describe it better.\n" +
" In JavaDON, a rule consists of four elements: type, importance, IF and THEN \n" +
"clauses. The type of a rule determines whether the rule’s IF clauses are \n" +
"related with each other using the logical “and” or the logical “or” operation.\n"+
"Priority determines which rule will be executed in case there are more rules\n" +
"that can be executed.  The IF and THEN clauses are the meeting point between\n" +
"frames and rules. Each clause uses one or more frame slots in order to build a\n" +
"logic expression.  Actions can only be performed through rules.\n" + "\n" 
    );
                
                
                
                
                //JScrollPane scrollPane = new JScrollPane(textArea);
                JFrame frame = new JFrame("Semantic Representation Plan");
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
                
                JButton btnNewFrame1 = new JButton("Continue");
		//add actionListener
		btnNewFrame1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				//call the object of NewWindow and set visible true
				NewWindow2 frame2 = new NewWindow2();
				frame2.setVisible(true);
				//set default close operation
				//setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
                
                btnNewFrame1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
		//set bounds of the Button
		btnNewFrame1.setBounds(280, 650, 178, 25);
                
                
                frame.getContentPane().add(textArea);
    //add Button into contentPane
		textArea.add(btnNewFrame1);
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
        //EventQueue.invokeLater(new Runnable() {
            //@Override
            //public void run() {
                
          //  }
        //});
    //} 