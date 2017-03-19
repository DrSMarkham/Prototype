
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
public class GraphModel2 extends JFrame 
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
	public GraphModel2() //constructor
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
    " The \"Navigation\" menu contains operations for performing actions on the node selection, such as selecting relatives and neighbours of a node, and to search for nodes with a particular text. \n" +
"Note: menu operations can also be invoked without the mouse by using keyboard commands. \n" +
"Node Selection Operations\n" +
"•	Select Parents \n" +
"This menu entry is used to highlight the parent nodes of the current selection which can be one or more nodes or an edge. After using this operation, the selection will change to all parents. The parents of a node are the predecessor nodes that are connected by edges. \n" +
"•	Select Siblings \n" +
"This menu entry is used to highlight the sibling nodes of the current selection which can be one or more nodes. After using this operation, the selection will change to all siblings. The siblings of a node are all children of all parents of that node. \n" +
"•	Select Children \n" +
"This menu entry is used to highlight the child nodes of the current selection which can be one or more nodes or an edge. After using this operation, the selection will change to all children. The children of a node are the successor nodes that are connected by edges. \n" +
"•	Navigator... \n" +
"Used to move the focus in a graph. Starting at a selected node, both neighbour and relative nodes can be reached in all four directions. After selecting this menu entry, a navigator dialog window will appear. Note: navigation is also available by using the cursor keys of the keyboard. \n" +
" The \"Layout Menu\" menu contains operations for controlling the Layout Orientation\n" +
"•	Orientation \n" +
"The operations in this cascade menu are used to set the general orientation of a graph layout. By default, a hierarchical visualization of a graph is drawn in top-down direction so the first level (with the root nodes) is at the upper side of the graph layout and all edges point downwards. Use any of these menus to draw the graph in one of the four orientations. Details about the graph layout can be found in the concept chapter. \n" +
"o	Top Down \n" +
"To draw the graph with a top-down layout where the first level is at the upper side and all edges point downwards. This is the default direction. \n" +
"o	Bottom Up \n" +
"To draw the graph with a bottom-up layout where the first level is at the lower side and all edges point upwards. \n" +
"o	Left to Right \n" +
"To draw the graph with a left-to-right layout where the first level is at the left side and all edges point to the right. \n" +
"o	Right to Left \n" +
"To draw the graph with a right-to-left layout where the first level is at the right side and all edges point to the left. \n" 
    );
                
                
                
                
                //JScrollPane scrollPane = new JScrollPane(textArea);
                JFrame frame = new JFrame("Graph-Theoretic Model of Plan");
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
				new PlanToolG();
//call the object of NewWindow and set visible true
				//PlanToolG frame = new PlanToolG();
				//frame.setVisible(true);
				//set default close operation
				//setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
                
                btnNewFrame1.setBounds(150, 650, 108, 25);
                
                btnNewFrame1.setBounds(150, 650, 108, 25);
                
                JButton btnNewFramea = new JButton("Deploy Tool");
		//add actionListener
		btnNewFramea.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				//call the object of NewWindow and set visible true
				PlanTooluDraw frame = new PlanTooluDraw();
				frame.setVisible(true);
				//set default close operation
				
                                
                                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            //new PlanTooluDraw();
			}
		});
                btnNewFramea.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
		//set bounds of the Button
		btnNewFramea.setBounds(280, 650, 178, 25);
                
                
                
                
                frame.getContentPane().add(textArea);
    //add Button into contentPane
		textArea.add(btnNewFrame1);
                textArea.add(btnNewFramea);
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


