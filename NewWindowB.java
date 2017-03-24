
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
 
//create class and extend with JFrame
public class NewWindowB extends JFrame 
{
	//declare variable
	//private JPanel contentPane;
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
        //JButton b1;
        //JLabel l1;
        
	public NewWindowB() //constructor
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
                
                //JTextArea textArea = new JTextArea(100, 10);
                
                //JTextArea ta = new JTextArea(100, 100);
    //textArea.setText( 
//" Structural Plan Representation Tool\n" );
               // "Semantic Plan Representation Tool\n" + "\n" +
                                          
                //JTextArea textArea = new JTextArea(100, 100);
                
                //JTextArea ta = new JTextArea(100, 100);
    //textArea.setText(
              //  " "
 //);
               // "Semantic Plan Representation Tool\n" + "\n" +
                
        BasicPanel1 panel = new BasicPanel1();
        add(panel);
        GridLayout gridLayout = new GridLayout(6,2);
        setLayout(gridLayout);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,700);

               
               
                //JScrollPane scrollPane = new JScrollPane(textArea);
                //JFrame frame = new JFrame("Structural Plan Representation");
                //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //frame.setLayout(new BorderLayout());
                //frame.add(scrollPane);
                //frame.setSize(600, 400);
                //rame.setLocationRelativeTo(null);
                //f//rame.setVisible(true);
		
		
                //setLayout(new BorderLayout());

        //JLabel background=new JLabel(new ImageIcon("C:\\Users\\DrSMarkham\\Desktop\\rectangle.jpg"));

        //add(background);

        //background.setLayout(new FlowLayout());

                
          //JLabel l1=new JLabel("Structural Representation Tool");
        //b1=new JButton("Continue");
        //JButton btnNewFrame6 = new JButton("Continue");
		//add actionListener
		//btnNewFrame6.addActionListener(new ActionListener()
		//{
			//public void actionPerformed(ActionEvent arg0)
			//{
				//call the object of NewWindow and set visible true
				//PlanTool1 frame = new PlanTool1();
				//frame.setVisible(true);
				//set default close operation
				//setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			//}
		//});
                
                //btnNewFrame6.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
		//set bounds of the Button
		//btnNewFrame6.setBounds(280, 650, 178, 25);

        
                
                
                //class InputPanel1 extends JPanel {
    //JTextField labelField;
     JTextField verbField;
     //JTextField taskerField;
     //JTextField taskeeField;
     JTextField affectField;
     JTextField actionField;
     //JTextField atwhereField;
     //JTextField routewhereField;
     //JTextField startwhenField;
     //JTextField endwhenField;
     JTextField whyField;
     //JTextField labelField;
     JTextField modField;
     
    //public InputPanel1() {
        
         
         verbField = new JTextField(20);
         //taskerField = new JTextField(20);
         //taskeeField = new JTextField(20);
         affectField = new JTextField(20);
         actionField = new JTextField(20);
         //atwhereField = new JTextField(20);
         //routewhereField = new JTextField(20);
         //startwhenField = new JTextField(20);
         //endwhenField = new JTextField(20);
         whyField = new JTextField(20);
         modField = new JTextField(20);
         //labelField = new JTextField(20);
         
         
         JLabel firstNameLabel = new JLabel("Verb: ");
         //JLabel secondNameLabel = new JLabel("Tasker: ");
         //JLabel phoneNumberLabel = new JLabel("Taskee: ");
         JLabel thirdNameLabel = new JLabel("Affect: ");
         JLabel fourthNumberLabel = new JLabel("Action: "); 
         //JLabel fifthNameLabel = new JLabel("At-Where: ");
         //JLabel sixthNumberLabel = new JLabel("Route-Where: ");
         //JLabel seventhNameLabel = new JLabel("Start-When: ");
         //JLabel eighthNumberLabel = new JLabel("End-When: "); 
         JLabel ninthNameLabel = new JLabel("Why: ");
         JLabel tenthNumberLabel = new JLabel("Label: ");
         JLabel eleventhNameLabel = new JLabel("Mod: ");
         
         
         
         
         JButton cont = new JButton("Continue");
         cont.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				//call the object of NewWindow and set visible true
				PlanToolSea frame = new PlanToolSea();
				frame.setVisible(true);
				//set default close operation
				//setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
         
         JButton saveToFileButton = new JButton("Save to file"); 
         saveToFileButton.addActionListener(new ActionListener() {
             
            @Override
            public void actionPerformed(ActionEvent e) {
                BufferedWriter writer;
                try {
                    //File file = new File("contacts.txt");
                    //writer = new BufferedWriter(new FileWriter("entitytuples.txt",true));
                    writer = new BufferedWriter(new FileWriter("C:\\Users\\DrSMarkham\\Desktop\\anasea.txt",true));
                    writer.write(verbField.getText() + "\t" + actionField.getText() + "\t" +
                             actionField.getText() + "\t" 
                    +  whyField.getText() + "\t" +  modField.getText()
                    );
                    writer.newLine();
                    writer.close();
                } catch(FileNotFoundException ex) {
                    ex.printStackTrace();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                 
            }
        });
         
         JButton clear = new JButton("Clear");
         clear.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
         verbField.setText("");
         affectField.setText("");
         actionField.setText("");
         whyField.setText("");
         modField.setText(null); //or use this
    }
});
         
         
         
         //add(secondNameLabel);
         //add(taskerField);
         ////add(phoneNumberLabel);
         //add(taskeeField);
         
         //add(fifthNameLabel);
         //add(atwhereField);
         //add(sixthNumberLabel);
         //add(routewhereField);
         //add(seventhNameLabel);
         //add(startwhenField);
         //add(eighthNumberLabel);
         //add(endwhenField);
         
        //frame.getContentPane().add(l1);
        //frame.getContentPane().add(btnNewFrame6);
         //frame.getContentPane().add(textArea);
                //frame.getContentPane().add(background);
		//panel.add(firstNameLabel);
                ////panel.add(verbField);
                //panel.add(thirdNameLabel);
         ////panel.add(affectField);
         //panel.add(fourthNumberLabel);
         //panel.add(actionField);
         //panel.add(ninthNameLabel);
         //panel.add(whyField);
         //add(tenthNumberLabel);
         //add(labelField);
         //panel.add(eleventhNameLabel);
         //panel.add(modField);
         
         //panel.add(saveToFileButton);
         panel.add(cont);
         //panel.add(clear);
                //frame.getContentPane().        
                        
                        
                        
                        
//textArea.add(bframe.getContentPane().tnNewFrame6);
                //panel.pack();
                panel.setVisible(true);
		//((AbstractDocument)textArea.getDocument()).dump(System.out);
    
    }                   
}
        
        
        
        
        
                
                
                //frame.getContentPane().add(textArea);
    //add Button into contentPane
		//textArea.add(btnNewFrame6);
                //frame.pack();
                //frame.setVisible(true);
		//((AbstractDocument)textArea.getDocument()).dump(System.out);
    
    
           
	






//public TestScrollPane03() {
        //EventQueue.invokeLater(new Runnable() {
            //@Override
            //public void run() {
                
          //  }
        //});
    //} 





