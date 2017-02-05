
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
public class NewWindow6 extends JFrame 
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
	public NewWindow6() //constructor
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
    textArea.setText( " When Araucaria loads, the program displays its main \n" +
    "window which can be used to load text files and create argument diagrams \n" +
    "from the text. When a text file is loaded, the text appears in the \n" +
    "left-hand panel. A portion of this text may be selected with the mouse. If\n" +
    "the mouse is then clicked in the large panel on the right, a node\n" +
    "corresponding to that portion of the text is created and drawn at the \n" +
    "bottom of the panel. When two or more nodes have been defined in this way,\n" +
    "they can be connected in pairs by selecting one node with the mouse and\n" +
    "dragging the mouse to the other node. The first node selected is the\n" +
    "premise of an argument, and the second node is the conclusion.\n" +
    " Araucaria supports both convergent and linked arguments, missing premises \n" +
    "(enthymemes) and refutations. The procedures for inserting each of these\n" +
    "features into a diagram is simple. Although the text in the left panel \n" +
    "cannot be edited after it has been loaded into Araucaria, the reconstructed\n" +
    "text of a missing premise can be edited within the diagram.\n" +
    "  Although the main editable diagram displays each premise or conclusion \n" +
    "as a simple circular node with a one- or two-letter label, Araucaria can \n" +
    "also produce a non-editable ‘full-text’ diagram in which each node is \n" +
    "expanded to contain the full text of the corresponding premise or \n" +
    "conclusion.  Each node and support arrow in a diagram can also have an \n" +
    "associated evaluation, which can be used to represent the confidence placed\n" +  
    "in a premise or support. To attach an evaluation to one or more parts of \n" +
    "the diagram, the nodes and/or support arrows are selected and the\n" +
    "evaluation editor is used to define the associated evaluation. Evaluations\n" +
    "are displayed as labels next to the node or arrow on the main diagram.");
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
                
                JButton btnNewFrame6 = new JButton("Continue");
		//add actionListener
		btnNewFrame6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				//call the object of NewWindow and set visible true
				//NewWindow7 frame = new NewWindow7();
				frame.setVisible(true);
				//set default close operation
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
                
                btnNewFrame6.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
		//set bounds of the Button
		btnNewFrame6.setBounds(280, 650, 178, 25);
                
                
                frame.getContentPane().add(textArea);
    //add Button into contentPane
		textArea.add(btnNewFrame6);
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