
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;
 
//create class and extend with JFrame
public class PlanToolSea extends JFrame 
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
	public PlanToolSea() //constructor
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
    //textArea.setText( "");
               // "Semantic Plan Representation Tool\n" + "\n" +
    
                
                
                
                
                //JScrollPane scrollPane = new JScrollPane(textArea);
                JFrame frame = new JFrame("Analogous Search Tool");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //frame.setLayout(new BorderLayout());
                //frame.add(scrollPane);
                frame.setSize(500, 500);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                
                
                
       
        //JPanel panel = new JPanel();

        JButton button1 = new JButton("Find Similar Cases(Plans)");

        JTextField answer = new JTextField();
        answer.setBounds(100, 200, 300, 25);
        //frame.getContentPane().add(answer); 
        
        //frame.add(panel);
        //panel.add(button1);
        //panel.add(label);
        //frame.setVisible(true);

        button1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                //JOptionPane.showMessageDialog(frame.getComponent(0), "Hello World");
                
                answer.setText("Most Similar Case is: ");
                //answer.setVisible(true);
                // ADD RESULT OF SEARCH HERE
            }
        });
     button1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
		//set bounds of the Button
		button1.setBounds(100, 100, 300, 25);
                
                JButton clear = new JButton("Clear");
         clear.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
         answer.setText("");
         
    }
});
                clear.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
		//set bounds of the Button
		clear.setBounds(100, 300, 350, 25);
        
     JButton btnNewFrame8 = new JButton("Continue");
		//add actionListener
		btnNewFrame8.addActionListener(new ActionListener()
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
                btnNewFrame8.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
		//set bounds of the Button
		btnNewFrame8.setBounds(280, 500, 178, 25);
                
                JLabel repeat = new JLabel("To find next most similar case press the top button again");
                repeat.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
		//set bounds of the Button
		repeat.setBounds(100, 400, 450, 25);
                
                
                frame.getContentPane().add(textArea);
                //frame.getContentPane().add(textArea);
    //add Button into contentPane
                textArea.add(button1);
                textArea.add(answer);
                textArea.add(clear);
                textArea.add(repeat);
		textArea.add(btnNewFrame8);
                
                frame.pack();
                frame.setVisible(true);
                //answer.setVisible(true);
		((AbstractDocument)textArea.getDocument()).dump(System.out);
                //Document()).dump(System.out);
    
    
                
                
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

    //((AbstractDocument)ta.get   
        
    }
 

           
                
	}







//public TestScrollPane03() {
        //EventQueue.invokeLater(new Runnable() {
            //@Override
            //public void run() {
                
          //  }
        //});
    //} 